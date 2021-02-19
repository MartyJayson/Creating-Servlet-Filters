package com.example.LoginRegistration;

import java.io.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;

@WebServlet(name = "home", value = "/home")
public class home extends HttpServlet {
    public void init(){

        System.out.println("-init-");
    }
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {

        System.out.println("-doGet-");
    }

    public void destroy() {

        System.out.println("-destroy-");
    }
}