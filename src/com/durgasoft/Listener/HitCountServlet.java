package com.durgasoft.Listener;

import javax.servlet.ServletContext;
import javax.servlet.ServletRequestEvent;
import javax.servlet.ServletRequestListener;
import javax.servlet.annotation.WebListener;

/**
 * Application Lifecycle Listener implementation class HitCountServlet
 *
 */
@WebListener
public class HitCountServlet implements ServletRequestListener {

	int count=0;
	public void requestInitialized(ServletRequestEvent e) {
	 System.out.println("Request Object Created");
	}

  
    	public void requestDestroyed(ServletRequestEvent e) {
    		 count=count+1;
    		 ServletContext context=e.getServletContext();
    		 context.setAttribute("count", count);
    		 System.out.println("Request Object Destroyed");
    		 }
    	
  

	
	
}
