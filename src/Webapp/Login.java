package Webapp;

import Webapp.NormalJavaClass.Validateinformation;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Created by Kenedid on 14-04-2017.
 */
@WebServlet(name = "Login")
public class Login extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        PrintWriter out = response.getWriter();
        out.print("Post");
        out.print("loginname: " + request.getParameter("loginname") + "Password: " +request.getParameter("password"));

        request.setAttribute("name" , request.getParameter("loginname"));
        request.setAttribute("password", request.getParameter("password"));



        if(validateinformation.validateInfo(request.getParameter("loginname"),request.getParameter("password"))){
            request.getRequestDispatcher("/Welcome.jsp").forward(request,response);
        }else {
            request.getRequestDispatcher("/Login.jsp").forward(request,response);
            request.setAttribute("YOUR INFORMATION IS WRONG","TRY AGAIN");

        }



    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        PrintWriter out = response.getWriter();
        out.print("Get");
        out.print("loginname" + request.getParameter("loginname") + "Password" +request.getParameter("password"));

    }
}
