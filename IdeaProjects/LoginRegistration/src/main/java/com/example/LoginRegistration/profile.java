package com.example.LoginRegistration;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name = "profile", value = "/profile")
public class profile extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html");
        PrintWriter out=response.getWriter();

        request.getRequestDispatcher("link.jsp").include(request, response);

        Cookie ck[]=request.getCookies();
        for(int i=0;i<ck.length;i++){
            System.out.println("<br>"+ck[i].getName()+" "+ck[i].getValue());//printing name and value of cookie
        }

        if(ck!=null){
            String userName=ck[0].getValue();
            if(!userName.equals("")||userName!=null){
                out.print("<b>Welcome to Profile</b>");
                out.print("<br>Welcome, "+userName);

                System.out.println("Your are in profile!");
            }
        }else{
            out.print("Please login first");
            request.getRequestDispatcher("login.jsp").include(request, response);
        }
        out.close();
    }
    @Override
    public void destroy() {
    }
}
