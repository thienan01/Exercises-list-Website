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
@WebServlet(name = "Control", urlPatterns = {"/Control"})
public class ExerciseControl extends HttpServlet {

    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        String exercise = request.getParameter("name");
        
        if(exercise.equals("Exercise4")){
            request.getRequestDispatcher("/Chapter4/index.html").forward(request, response);
        }
        if(exercise.equals("Exercise5")){
            request.getRequestDispatcher("/Chapter5_1/Index.html").forward(request, response);
        }
        if(exercise.equals("Exercise5_2")){
            request.getRequestDispatcher("/Chapter5_2/index.jsp").forward(request, response);
        }
        if(exercise.equals("Exercise6")){
            request.getRequestDispatcher("/Chapter6/Index.html").forward(request, response);
        }
        if(exercise.equals("Exercise6-2")){
            request.getRequestDispatcher("/Chapter6-2/index.html").forward(request, response);
        }
        if(exercise.equals("Exercise7-0102")){
            request.getRequestDispatcher("/Chapter7-0102/index.jsp").forward(request, response);
        }
        if(exercise.equals("Exercise7-03")){
            request.getRequestDispatcher("/Chapter7-03/index.jsp").forward(request, response);
        }
        if(exercise.equals("Exercise8")){
            request.getRequestDispatcher("/Chapter8/index.jsp").forward(request, response);
        }
        if(exercise.equals("Exercise9-01")){
            request.getRequestDispatcher("/Chapter9_1/index.jsp").forward(request, response);
        }
        if(exercise.equals("Exercise9-02")){
            request.getRequestDispatcher("productsLoad").forward(request, response);
        }
        if(exercise.equals("Exercise12-1")){
            request.getRequestDispatcher("/Chapter12_1/index.jsp").forward(request, response);
        }
        if(exercise.equals("Exercise12-2")){
            request.getRequestDispatcher("userAdmin").forward(request, response);
        }
    }

}
