package med.app.controllerMVC;

import java.text.DateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import javax.transaction.Transaction;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.json.JSONObject;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.context.request.WebRequest;


import med.app.ApplicationService.DocteurService;
import med.app.ApplicationService.PatientService;
import med.app.Model.Docteurs;
import med.app.Model.Patients;


@Controller
public class HomeController {
	
	private static final Logger logger = LoggerFactory.getLogger(HomeController.class);
	
	private DocteurService docteurService;
	private PatientService patientService;
	
	@Autowired(required=true)
	@Qualifier(value="docteurService")
	public void setPersonService(DocteurService ps){
		this.docteurService = ps;
	}
	@Autowired(required=true)
	@Qualifier(value="patientService")
	public void setPatientService(PatientService ps){
		this.patientService = ps;
	}
	@RequestMapping(value ="/", method = RequestMethod.GET)
	public String home(Locale locale, Model model) {
		logger.info("Welcome home! The client locale is {}.", locale);
		
		Date date = new Date();
		DateFormat dateFormat = DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.LONG, locale);
		String formattedDate = dateFormat.format(date);
		model.addAttribute("serverTime", formattedDate );
		return "index";
	}
	
	@RequestMapping(value = "/signup", method = RequestMethod.GET)
	public String signupForm(Locale locale, Model model) {
		logger.info("signup form ", locale);
		return "signup";
	}
	
	
	@RequestMapping(value = "/signin", method = RequestMethod.GET)
	public String signinForm(Locale locale, Model model) {
		logger.info("signin form ", locale);
		return "signin";
	}
	@RequestMapping(value = "/signup", method = RequestMethod.POST)
	public String signup(HttpServletRequest req ,Model model) {
		String nom = req.getParameter("nom");
		String prenom = req.getParameter("prenom");
		String sexe = req.getParameter("sexe");
		String age = req.getParameter("age");
		String civil = req.getParameter("civil");
		Patients p  = new Patients();
		p.setNomPatient(nom);
		p.setPrenomPatient(prenom);
		p.setSexePatient(sexe);
		p.setAgePatient(Integer.parseInt(age));
		p.setEtatCivilPatient(civil);
		HttpSession session = req.getSession();
		session.setAttribute("p", p);
		List<Docteurs> list =this.docteurService.listDocs();
		List<String> specs = this.docteurService.allSpec();
		logger.info("signin form "+nom);
		model.addAttribute("specs", specs);
		Map<String, List<Docteurs>> map = new HashMap();
		for(String ch : specs)
		{
			map.put(ch, new ArrayList<Docteurs>());
		}
		for(Docteurs d : list)
		{
			map.get(d.getSpecialiteDoc()).add(d);
		}
		JSONObject json = new JSONObject();
		json.put("res",map);
		model.addAttribute("map",json);
		return "signup_rest";
		
	}
	
	@RequestMapping(value = "/register", method = RequestMethod.POST)
	public String register(HttpServletRequest req ,Model model) {
		String spec = req.getParameter("spec");
		String med = req.getParameter("med");
		Patients p = (Patients) req.getSession().getAttribute("p");
		Docteurs doc = docteurService.findById(Integer.parseInt(med));
		p.setDocteurs(doc);
		patientService.ajouterPat(p);
		return "signin";
	}

}
