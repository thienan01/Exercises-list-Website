
package Chapter5_1;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name = "emailList", urlPatterns = {"/emailList"})
public class emailList extends HttpServlet {

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        String  url = "/Chapter5_1/Index.html";
        
        //get current action
        String action = request.getParameter("action");
        if (action.equals("returnDashboard")) {
            request.getRequestDispatcher("/Interface/Exercises-List.jsp").forward(request, response);
        }
        if(action == null){
            action = "join";
        }
        if (action == "join") {
            url = "/Chapter5_1/Index.html";      
        }
        
        else if (action.equals("add")) {
            String firstName = request.getParameter("firstName");
            String lastName = request.getParameter("lastName");
            String  email = request.getParameter("email");
            
            User user = new User(firstName,lastName,email);
            
            request.setAttribute("user", user);
            url = "/Chapter5_1/thanks.jsp";
        }
        getServletContext().getRequestDispatcher(url).forward(request, response);
    }
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        doPost(request, response);
    }
}
