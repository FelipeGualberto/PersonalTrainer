package com.gualberto.personaltrainer;

import java.util.Locale;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.gualberto.models.Aluno;
import com.gualberto.models.AlunoDAO;

@Controller
public class ListClientsController {
	private static final Logger logger = LoggerFactory.getLogger(HomeController.class);

	@RequestMapping(value = "/listusers", method = RequestMethod.GET)
	public String home(Locale locale, Model model, HttpServletRequest request) throws Throwable {
		HttpSession session = request.getSession();
		AlunoDAO alunoDAO = new AlunoDAO();
		int id = (Integer) session.getAttribute("ID");
		model.addAttribute("list_users", alunoDAO.GETALL(id));
		return "list";
	}
	
	@RequestMapping(value = "/listusers", method = RequestMethod.POST)
	public String homePOST(Locale locale, Model model, HttpServletRequest request) throws Throwable {
				
		return "redirect:/";
	}
	
	@RequestMapping(value = "/logout", method = RequestMethod.GET)
	public String logout(Locale locale, Model model, HttpServletRequest request) {
		request.getSession().invalidate();
		return "redirect:/";
	}
	
	@RequestMapping(value = "/perfilaluno", method = RequestMethod.POST)
	public String perfilaluno(Locale locale, Model model, HttpServletRequest request) {
		return "profile";
	}
	@RequestMapping(value = "/profile", method = RequestMethod.GET)
	public String perfilprof(Locale locale, Model model, HttpServletRequest request) {
		return "profile";
	}
}
