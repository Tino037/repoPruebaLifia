package controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import daos.MuñecoDao;
import daos.PlateDao;
import daos.PlateDaoHibernate;
import model.Muñeco;
import model.Plate;
import services.PlateService;

@Controller
public class MainController {
	@Autowired 
	PlateService plateService;
	@Autowired
	PlateDao plateDao;
	@Autowired
	MuñecoDao muñecoDao;
	
	/*@RequestMapping (value= {"index","/"},produces="text/plain;charset=UTF-8")
	public ModelAndView index() {
		return new ModelAndView("index");
	}*/
	
	@RequestMapping(value= {"index","/","/resto/index"},produces="text/plain;charset=UTF-8")
		public ModelAndView method() {
		System.out.println("holaaaaaaaaaaa");
		muñecoDao.createMuñeco(new Muñeco("peluche",120.00,"osito"));
		return new ModelAndView("index");
	}
//	
//	@RequestMapping(value= {"plateDetails","/","/resto/plateDetails"},produces="text/plain;charset=UTF-8")
//	public ModelAndView methodVer() {
//	System.out.println("asado");
//	Plate p=new Plate("Ensalada de Atun", 90.00, "lechuga,tomate,Atun y aderezo");
//	plateDao.createPlate(p);
//	return new ModelAndView("plateDetails","plate","p");
//}


}
