/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import static com.sun.corba.se.spi.presentation.rmi.StubAdapter.*;
import java.util.Arrays;
import java.util.List;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;
import javax.servlet.*;
import javax.servlet.http.*;

/**
 *
 * @author Poozer
 */
public class InformationForm extends HttpServlet {
    //Maybe change with doPost (call from here)
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet MyServlet</title>");
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet MyServlet at " + request.getContextPath() + "</h1>");
            out.println("</body>");
            out.println("</html>");
            out.println(request.getParameter("first_name"));
            out.println(request.getParameter("last_name"));
            out.println(request.getParameter("age"));
            String inputs[] = request.getParameterValues("input");
            for(String input : inputs)
            {
                out.println(Arrays.toString(inputs));
            }
//            List list = Arrays.asList(names);
//            request.setAttribute("names", list);
//            RequestDispatcher rd = request.getRequestDispatcher("index.jsp");
//            rd.forward(request, response);
        }
    } 

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
//    protected void doGet(HttpServletRequest request, HttpServletResponse response)
//            throws ServletException, IOException {
//        response.setContentType("text/html;charset=UTF-8");
//        PrintWriter out = response.getWriter();
//        try{
//            out.println("<h2>Welcome to my first... well, 5th, servlet application in Netbeans, hopefully this one works!</h2>");
//        } finally {
//            out.close();
//        }
//        processRequest(request, response);
//    }
    public void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        response.setContentType("text/html");

        PrintWriter out = response.getWriter();
        String title = "using Get Method to Read Form Data";
        String docType
                = "<!doctype html public \"-//w3c//dtd html 4.0"
                + "transitional//en\">\n";

        out.println(docType +
                "<html>\n" +
                "<head><title>" + title + "</title></head>\n"
                + "<body bgcolor = \"#f0f0f0\">\n"
                + "<h1 align = \"center\">" + title + "</h1>\n" +
               "<ul>\n" +
                  "  <li><b>First Name</b>: "
                  + request.getParameter("first_name") + "\n"
                + "  <li><b>Last Name</b>: "
                + request.getParameter("last_name") + "\n"
                + "  <li><b>Age</b>: "
                + request.getParameter("age") + "\n"
                + "</ul>\n"
                + "<table width = \"100%\" border = \"1\" align = \"center\">\n"
                + "<tr bgcolor = \"#949494\">\n"

    "<th>Male, Female, Private</th>\n"+
            "</body>"
         "</html>"
      );
    
    Enumeration paramNames = request.getParameterNames();

    while(paramNames.hasMoreElements () 
        ) {
         String paramName = (String)paramNames.nextElement();
        out.print("<tr><td>" + paramName + "</td>\n<td>");
        String[] paramValues = request.getParameterValues(paramName);

        // Read single valued data
        if (paramValues.length == 1) {
            String paramValue = paramValues[0];
            if (paramValue.length() == 0) {
                out.println("<i>No Value</i>");
            } else {
                out.println(paramValue);
            }
        } else {
            // Read multiple valued data
            out.println("<ul>");

            for (int i = 0; i < paramValues.length; i++) {
                out.println("<li>" + paramValues[i]);
            }
            out.println("</ul>");
        }
    }

    out.println ("</tr>\n</table>\n</body></html>");
    }
//    public void doPost(HttpServletRequest request, HttpServletResponse response)
//      throws ServletException, IOException {
//
//      doGet(request, response);
//   }
    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    public void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
        try (PrintWriter out = response.getWriter()) {
            out.println(request.getParameter("first_name"));
            out.println(request.getParameter("last_name"));
            out.println(request.getParameter("age"));
        }
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
        public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
