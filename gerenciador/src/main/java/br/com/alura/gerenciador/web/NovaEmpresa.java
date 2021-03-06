package br.com.alura.gerenciador.web;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.alura.gerenciador.Empresa;
import br.com.alura.gerenciador.dao.EmpresaDAO;


public class NovaEmpresa implements Tarefa {
	@Override
	public String executa(HttpServletRequest req, HttpServletResponse res) {
		String nome = req.getParameter("nome");
        Empresa empresa = new Empresa(nome);
        new EmpresaDAO().adiciona(empresa);
        req.setAttribute("nome", nome);
        return "/WEB-INF/paginas/NovaEmpresa.jsp";
//        req.getRequestDispatcher("/WEB-INF/paginas/NovaEmpresa.jsp").forward(req, resp);
//        PrintWriter writer = resp.getWriter();
//        writer.println("<html><body>Empresa " + nome + " adicionada!</body></html>");	
//        System.out.println("teste saída!");	}
	}
}
