package com.gualberto.personaltrainer;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.gualberto.models.EducadorFisicoDAO;

@Controller
public class HomeController {
	static String isLogged = "session";
	private static final Logger logger = LoggerFactory.getLogger(HomeController.class);

	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String homeGET(Locale locale, Model model, HttpServletRequest request) {
		HttpSession session = request.getSession();
		if (session.getAttribute(isLogged) != null) {
			return "redirect:/listusers";
		} else {
			return "home";
		}

	}

	@RequestMapping(value = "/", method = RequestMethod.POST)
	public String homePOST(Locale locale, Model model, HttpServletRequest request) throws Exception {
		HttpSession session = request.getSession();
		String login = request.getParameter("login");
		String password = request.getParameter("senha");

		EducadorFisicoDAO educadorFisicoDAO = new EducadorFisicoDAO();
		if (educadorFisicoDAO.verificaLogin(login, password)) {
			session.setAttribute(isLogged, true);
			session.setAttribute("ID", educadorFisicoDAO.GET(login).getID());
			return "redirect:/listusers";
		} else {
			return "home";
		}

	}

}
