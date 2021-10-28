/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Control;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author An Le
 */
@WebServlet(name = "Category", urlPatterns = {"/Category"})
public class Category extends HttpServlet {

    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
           String category = request.getParameter("cate");
           if (category.equals("Member")) {
               request.getRequestDispatcher("/Interface/Members.jsp").forward(request, response);           
        }
           if (category.equals("Exercise-List") || category.equals("returnDashboard")) {
               request.getRequestDispatcher("/Interface/Exercises-List.jsp").forward(request, response);           
        }
           if (category.equals("finalProject")) {
               request.getRequestDispatcher("/Interface/FinalProject.jsp").forward(request, response);           
        }
        
    }


}
