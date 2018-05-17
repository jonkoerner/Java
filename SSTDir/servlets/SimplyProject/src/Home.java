

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Home
 */
@WebServlet("/Home")
public class Home extends HttpServlet {
    private static final long serialVersionUID = 1L;
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // get the value for the query parameter
        String userName = request.getParameter("name");
        String lang = request.getParameter("lang");
        String homeTown = request.getParameter("homeTown");
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        out.write("<h1>Welcome " + userName + "</h1>");
        out.write("<h2>Your favorite lanauage is: " + lang + "</h2>");
        out.write("<h2>Your hometown is: " + homeTown + "</h2>");
        
    }
    }
//...
