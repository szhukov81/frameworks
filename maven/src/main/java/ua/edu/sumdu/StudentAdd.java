/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package ua.edu.sumdu;

import java.io.IOException;
import java.util.LinkedList;
import java.util.List;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author Serhii Zhukov
 */
@WebServlet(name = "StudentAdd", urlPatterns = {"/StudentAdd"})
public class StudentAdd extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        HttpSession session = request.getSession();
        List<Student> students = (List<Student>)session.getAttribute("students");
        
        if (students == null) {
            students = new LinkedList<Student>(); 
            session.setAttribute("students", students);
        }
        
        if (request.getParameter("name") != "" || request.getParameter("surname") != "") {
            Student student = new Student(request.getParameter("name"),
                                        request.getParameter("surname"),
                                          request.getParameter("age"),
                                          request.getParameter("email"),
                                          request.getParameter("group"),
                                         request.getParameter("faculty")
                                           );
            students.add(student);
        }
        
        response.sendRedirect("index.jsp");
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
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
