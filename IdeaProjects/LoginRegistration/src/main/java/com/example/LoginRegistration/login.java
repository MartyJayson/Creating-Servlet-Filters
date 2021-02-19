package com.example.LoginRegistration;

import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
import java.io.IOException;
import java.io.PrintWriter;


@WebServlet(name = "login", value = "/login")
public class login extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html");
        PrintWriter out=response.getWriter();

        request.getRequestDispatcher("link.jsp").include(request, response);

        String userName=request.getParameter("userName");
        String password=request.getParameter("password");

        if(password.equals("admin123") && !userName.equals("")){
            out.print("You are successfully logged in!");
            System.out.println("Successfully logged in!");
            out.print("<br>Welcome, "+userName);

            Cookie ck=new Cookie("userName",userName);
            ck.setMaxAge(30*60);
            response.addCookie(ck);
        }else{
            out.print("sorry, username or password error!");
            System.out.println("Error!");
            request.getRequestDispatcher("login.jsp").include(request, response);
        }

        out.close();
    }
    @Override
    public void destroy() {
    }
}
