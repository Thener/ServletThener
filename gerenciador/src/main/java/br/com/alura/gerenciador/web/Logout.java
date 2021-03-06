package br.com.alura.gerenciador.web;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebFilter;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class Logout implements Tarefa {
	@Override
	public String executa(HttpServletRequest req, HttpServletResponse res) {
		HttpSession session = req.getSession();
        session.removeAttribute("usuarioLogado");
//        RequestDispatcher dispatcher = req.getRequestDispatcher("/WEB-INF/paginas/logout.html");
//        dispatcher.forward(req, resp);
//        resp.sendRedirect("logout.html");
//        PrintWriter writer = resp.getWriter();
//        writer.println("<html><body>Logout efetuado</body></html>");
		return "/WEB-INF/paginas/logout.html";
	}
}
