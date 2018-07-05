package Servlet;

import java.io.IOException;
import java.util.Set;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.Mobile.Mobile;


import Services.Services;
import Services.ServicesImpl;


public class ControlServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	Services services=new ServicesImpl();
       
   
    public ControlServlet() {
        super();
     
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
RequestDispatcher view = null;
		
		String action = request.getParameter("do");
		if(action.equals("selectmobile")) {
			view = request.getRequestDispatcher("Welcome.jsp");
			view.forward(request,response);
			}
		else if(action.equals("printset")) {
			Set<Mobile> mobiles=services.readAllItemsFromDb();
			System.out.println(mobiles);
			request.setAttribute("MobileSet", mobiles);
			view = request.getRequestDispatcher("Mobile.jsp");
			view.forward(request,response);
			
		}
		else if(action.equals("gotocart")) {
			//int id = Integer.parseInt(request.getParameter("id"));
			//int cost = Integer.parseInt(request.getParameter("cost"));
			String id1=request.getParameter("id");
			int i=Integer.parseInt(id1);
			String cost1=request.getParameter("cost");
			int cost=Integer.parseInt(cost1);
			String OS = request.getParameter("OS");
			String Brand = request.getParameter("Brand");
			String style = request.getParameter("style");
			String display = request.getParameter("display");
			//int Quantity = Integer.parseInt(request.getParameter("Quantity"));
			String Quantity1=request.getParameter("Quantity");
			int Quantity=Integer.parseInt(Quantity1);
			
			
			
			Mobile m=new Mobile(i,cost,OS,Brand,style,display,Quantity);
			Set<Mobile> newset=services.registerMobile(m);
			request.setAttribute("mobilelist", newset);
			view = request.getRequestDispatcher("Cart.jsp");
			view.forward(request,response);
		}
		
		
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
