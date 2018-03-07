package com.icexxx.iceforward;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class IceForwardServlet
 */
@WebServlet(value = { "/main.jsp", "/first.jsp", "/jsp.jsp", "/WEB-INF/jsp/*" })
public class IceForwardServlet extends HttpServlet {
    private static final long serialVersionUID = -1407474118672435995L;

    /**
     * @see HttpServlet#HttpServlet()
     */
    public IceForwardServlet() {
        super();
    }

    /**
     * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
     *      response)
     */
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String requestURI = request.getRequestURI();
        String path = requestURI.substring(requestURI.lastIndexOf("/"));
        if (path != null && path.startsWith("/text_")) {
            String message = path.substring("/text_".length());
            if (message.contains(".")) {
                message = message.substring(0, message.lastIndexOf("."));
            }
            response.setContentType("text/html;charset=UTF-8");
            response.setCharacterEncoding("UTF-8");
            response.getWriter().append(message);
        } else {
            request.getRequestDispatcher("/jsp" + path).forward(request, response);
        }
    }

    /**
     * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
     *      response)
     */
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        doGet(request, response);
    }

}
