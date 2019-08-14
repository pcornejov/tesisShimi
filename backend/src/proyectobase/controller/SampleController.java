package proyectobase.controller;

import org.json.JSONObject;

import earlgrey.annotations.CORS;
import earlgrey.annotations.Controller;
import earlgrey.annotations.ControllerAction;
import earlgrey.annotations.POST;
import earlgrey.annotations.Route;
import earlgrey.core.ControllerCore;
import earlgrey.core.HttpRequest;
import earlgrey.core.HttpResponse;
import earlgrey.core.Logging;
import proyectobase.model.Prueba1;
import proyectobase.model.Prueba2;
import proyectobase.model.Prueba3;
import proyectobase.model.Prueba4;
import proyectobase.model.Prueba5;
import proyectobase.model.rutperfil;

@Controller(description = "Sample API controller", name = "SampleController", version = 1)
@Route(route = "/tesis")
@CORS
public class SampleController extends ControllerCore {

	private static Logging log = new Logging(SampleController.class.getName());

	@ControllerAction(description = "Method to get data", name = "getSample", version = 1)
	@Route(route = "verificaRut")
	@POST
	public static void insertaPerfil(HttpRequest req, HttpResponse res) {
		log.Info(req.getParams().toString());
		rutperfil rp = new rutperfil();
		rp.rut = req.getParam("rut");
 		JSONObject jsonRut = rp.find().getOneJSON();
		if(jsonRut.length() > 0) {
			JSONObject resultado = new JSONObject();
			resultado.put("rut", jsonRut.getString("rut"));
			resultado.put("id", "0");
			res.json(resultado);
			return;
		} else {
			rp.insert();
			JSONObject jsonRut2 = rp.find().getOneJSON();
			JSONObject resultado = new JSONObject();
			resultado.put("rut", jsonRut2.getString("rut"));
			resultado.put("id", jsonRut2.getInt("id"));
			res.json(resultado);
		}
	}
	@ControllerAction(description = "qwe", name = "lalala", version = 1)
	@Route(route = "agregaPerfil")
	@POST
	public static void agregaPerfil(HttpRequest req, HttpResponse res) {
		log.Info(req.getParams().toString());
		rutperfil rp = new rutperfil();
		JSONObject parametros = req.getParams();
		rp.id = parametros.getInt("id");
		rp.genero = parametros.getString("genero");
		rp.condicion = parametros.getString("condicion");
		rp.lugarEstudios = parametros.getString("lugarEstudios");
		rp.ocupacion = parametros.getString("ocupacion");
 		rp.update(rp.id);
		JSONObject resultado = new JSONObject();
		resultado.put("SUCCESS", 200);	
	}
	@ControllerAction(description = "Method to get data", name = "getSample", version = 1)
	@Route(route = "buscaPruebas")
	@POST
	public static void buscaPruebas(HttpRequest req, HttpResponse res) {
		log.Info(("llegue a buscar las pruebas"));
		log.Info(req.getParams().toString());
		String rut = req.getParam("rut");
		JSONObject resultado = new JSONObject();
		Prueba1 prueba1 = new Prueba1();
		Prueba2 prueba2 = new Prueba2();
		Prueba3 prueba3 = new Prueba3();
		Prueba4 prueba4 = new Prueba4();
		Prueba5 prueba5 = new Prueba5();
		prueba1.rut = rut;
		prueba2.rut = rut;
		prueba3.rut = rut;
		prueba4.rut = rut;
		prueba5.rut = rut;
		if(prueba1.find().getOneJSON().length() > 0) {
			log.Info("obtuve prueba 1");
			log.Info(prueba1.toString());
			resultado.put("prueba1", prueba1.find().getOneJSON());
		}
		if(prueba2.find().getOneJSON().length() > 0) {
			resultado.put("prueba2", prueba2.find().getOneJSON());
		}
		if(prueba3.find().getOneJSON().length() > 0) {
			log.Info("obtuve prueba 3");
			log.Info(prueba3.toString());
			resultado.put("prueba3", prueba3.find().getOneJSON());
		}
		if(prueba4.find().getOneJSON().length() > 0) {
			log.Info("obtuve prueba 4");
			log.Info(prueba4.toString());
			resultado.put("prueba4", prueba4.find().getOneJSON());
		}
		if(prueba5.find().getOneJSON().length() > 0) {
			log.Info("obtuve prueba 5");
			log.Info(prueba5.toString());
			resultado.put("prueba5", prueba5.find().getOneJSON());
		}
		log.Info(resultado.toString());
		res.json(resultado);
	}
	
	
	@ControllerAction(description = "Method to set data", name = "setSample", version = 1)
	@Route(route = "insertaPrueba1")
	@POST
	public static void insertaPrueba1(HttpRequest req, HttpResponse res) {
		log.Info(req.getParams().toString());
		JSONObject parametros = req.getParams();
		Prueba1 prueba1 = new Prueba1();
		prueba1.clasificacion1 = parametros.getString("clasificacion1");
		prueba1.clasificacion2 = parametros.getString("clasificacion2");
		prueba1.clasificacion3 = parametros.getString("clasificacion3");
		prueba1.clasificacion4 = parametros.getString("clasificacion4");
		prueba1.clasificacion5= parametros.getString("clasificacion5");
		prueba1.clasificacion6 = parametros.getString("clasificacion6");
		prueba1.clasificacion7 = parametros.getString("clasificacion7");
		prueba1.clasificacion8 = parametros.getString("clasificacion8");
		prueba1.concepto1 = parametros.getString("concepto1");
		prueba1.concepto2 = parametros.getString("concepto2");
		prueba1.concepto3 = parametros.getString("concepto3");
		prueba1.concepto4 = parametros.getString("concepto4");
		prueba1.concepto5 = parametros.getString("concepto5");
		prueba1.concepto6 = parametros.getString("concepto6");
		prueba1.concepto7 = parametros.getString("concepto7");
		prueba1.concepto8 = parametros.getString("concepto8");
		prueba1.concepto9 = parametros.getString("concepto9");
		prueba1.concepto10 = parametros.getString("concepto10");
		prueba1.concepto11 = parametros.getString("concepto11");
		prueba1.pregunta1 = parametros.getString("pregunta1");
		prueba1.pregunta2 = parametros.getString("pregunta2");
		prueba1.pregunta3 = parametros.getString("pregunta3");
		prueba1.pregunta4 = parametros.getString("pregunta4");
		prueba1.pregunta5 = parametros.getString("pregunta5");
		prueba1.pregunta6 = parametros.getString("pregunta6");
		prueba1.pregunta9 = parametros.getString("pregunta9");
		prueba1.pregunta10 = parametros.getString("pregunta10");
		prueba1.pregunta11 = parametros.getString("pregunta11");
		prueba1.pregunta12 = parametros.getString("pregunta12");
		prueba1.pregunta14 = parametros.getString("pregunta14");
		prueba1.pregunta15 = parametros.getString("pregunta15");
		prueba1.pregunta16 = parametros.getString("pregunta16");
		prueba1.pregunta17 = parametros.getString("pregunta17");
		prueba1.pregunta19 = parametros.getString("pregunta19");
		prueba1.riesgo1 = parametros.getString("riesgo1");
		prueba1.riesgo2 = parametros.getString("riesgo2");
		prueba1.riesgo3 = parametros.getString("riesgo3");
		prueba1.riesgo4 = parametros.getString("riesgo4");
		prueba1.riesgo5 = parametros.getString("riesgo5");
		prueba1.riesgo6 = parametros.getString("riesgo6");
		prueba1.riesgo7 = parametros.getString("riesgo7");
		prueba1.riesgo8 = parametros.getString("riesgo8");
		prueba1.vyf1 = parametros.getString("vyf1");
		prueba1.vyf2 = parametros.getString("vyf2");
		prueba1.vyf3 = parametros.getString("vyf3");
		prueba1.vyf4 = parametros.getString("vyf4");
		prueba1.vyf5 = parametros.getString("vyf5");
		prueba1.vyf6 = parametros.getString("vyf6");
		prueba1.vyf7 = parametros.getString("vyf7");
		prueba1.vyf8 = parametros.getString("vyf8");
		prueba1.vyf9 = parametros.getString("vyf9");
		prueba1.vyf10 = parametros.getString("vyf10");
		prueba1.finanzasSelect1 = parametros.getString("finanzasSelect1");
		prueba1.finanzasSelect2 = parametros.getString("finanzasSelect2");
		prueba1.finanzasSelect3 = parametros.getString("finanzasSelect3");
		prueba1.finanzasSelect4 = parametros.getString("finanzasSelect4");
		prueba1.finanzasSelect5 = parametros.getString("finanzasSelect5");
		prueba1.finanzasSelect6 = parametros.getString("finanzasSelect6");
		prueba1.finanzasPregunta2 = parametros.getString("finanzasPregunta2");
		prueba1.finanzasPregunta3 = parametros.getString("finanzasPregunta3");
		prueba1.finanzasPregunta4 = parametros.getString("finanzasPregunta4");
		prueba1.finanzasPregunta5 = parametros.getString("finanzasPregunta5");
		prueba1.finanzasPregunta6 = parametros.getString("finanzasPregunta6");
		prueba1.finanzasPregunta7 = parametros.getString("finanzasPregunta7");
		prueba1.finanzasPregunta8 = parametros.getString("finanzasPregunta8");
		prueba1.finanzasPregunta9 = parametros.getString("finanzasPregunta9");
		prueba1.finanzasPregunta10 = parametros.getString("finanzasPregunta10");
		prueba1.finanzasPregunta11 = parametros.getString("finanzasPregunta11");
		prueba1.finanzasPregunta12 = parametros.getString("finanzasPregunta12");
		prueba1.finanzasPregunta13 = parametros.getString("finanzasPregunta13");
		prueba1.finanzasPregunta14 = parametros.getString("finanzasPregunta14");
		prueba1.finanzasPregunta15 = parametros.getString("finanzasPregunta15");
		prueba1.finanzasPregunta17 = parametros.getString("finanzasPregunta17");
		prueba1.buenas = revisaPrueba1(prueba1);
		prueba1.rut = parametros.getString("rut");
		prueba1.tiempo = parametros.getInt("tiempo");
		prueba1.insert();
		return;
	}
	@ControllerAction(description = "Method to set data", name = "setSample", version = 1)
	@Route(route = "insertaPrueba2")
	@POST
	public static void insertaPrueba2(HttpRequest req, HttpResponse res) {
		log.Info(req.getParams().toString());
		JSONObject parametros = req.getParams();
		Prueba2 prueba2 = new Prueba2();
		prueba2.rut = parametros.getString("rut");
		prueba2.primeraPartePregunta1 = parametros.getString("primeraPartePregunta1");
		prueba2.primeraPartePregunta2 = parametros.getString("primeraPartePregunta2");
		prueba2.primeraPartePregunta3 = parametros.getString("primeraPartePregunta3");
		prueba2.primeraPartePregunta4 = parametros.getString("primeraPartePregunta4");
		prueba2.primeraPartePregunta5 = parametros.getString("primeraPartePregunta5");
		prueba2.primeraPartePregunta6 = parametros.getString("primeraPartePregunta6");
		prueba2.primeraPartePregunta7 = parametros.getString("primeraPartePregunta7");
		prueba2.primeraPartePregunta8 = parametros.getString("primeraPartePregunta8");
		prueba2.primeraPartePregunta9 = parametros.getString("primeraPartePregunta9");
		prueba2.primeraPartePregunta10 = parametros.getString("primeraPartePregunta10");
		prueba2.primeraPartePregunta11 = parametros.getString("primeraPartePregunta11");
		prueba2.primeraPartePregunta12 = parametros.getString("primeraPartePregunta12");
		prueba2.primeraPartePregunta13 = parametros.getString("primeraPartePregunta13");
		prueba2.primeraPartePregunta14 = parametros.getString("primeraPartePregunta14");
		prueba2.primeraPartePregunta15 = parametros.getString("primeraPartePregunta15");
		prueba2.primeraPartePregunta16 = parametros.getString("primeraPartePregunta16");
		prueba2.primeraPartePregunta17 = parametros.getString("primeraPartePregunta17");
		prueba2.primeraPartePregunta18 = parametros.getString("primeraPartePregunta18");
		prueba2.primeraPartePregunta19 = parametros.getString("primeraPartePregunta19");
		prueba2.primeraPartePregunta20 = parametros.getString("primeraPartePregunta20");
		prueba2.primeraPartePregunta21 = parametros.getString("primeraPartePregunta21");
		prueba2.primeraPartePregunta22 = parametros.getString("primeraPartePregunta22");
		prueba2.primeraPartePregunta23 = parametros.getString("primeraPartePregunta23");
		prueba2.vyf1 = parametros.getString("vyf1");
		prueba2.vyf2 = parametros.getString("vyf2");
		prueba2.vyf3 = parametros.getString("vyf3");
		prueba2.vyf4 = parametros.getString("vyf4");
		prueba2.vyf5 = parametros.getString("vyf5");
		prueba2.vyf6 = parametros.getString("vyf6");
		prueba2.vyf7 = parametros.getString("vyf7");
		prueba2.vyf8 = parametros.getString("vyf8");
		prueba2.vyf11 = parametros.getString("vyf11");
		prueba2.vyf12 = parametros.getString("vyf12");
		prueba2.vyf13 = parametros.getString("vyf13");
		prueba2.vyf14 = parametros.getString("vyf14");
		prueba2.vyf15 = parametros.getString("vyf15");
		prueba2.selector1 = parametros.getString("selector1");
		prueba2.selector2 = parametros.getString("selector2");
		prueba2.selector3 = parametros.getString("selector3");
		prueba2.selector4 = parametros.getString("selector4");
		prueba2.selector5 = parametros.getString("selector5");
		prueba2.selector6 = parametros.getString("selector6");
		prueba2.selector7 = parametros.getString("selector7");
		prueba2.selector8 = parametros.getString("selector8");
		prueba2.selector9 = parametros.getString("selector9");
		prueba2.selector10 = parametros.getString("selector10");
		prueba2.selector11 = parametros.getString("selector11");
		prueba2.selector12 = parametros.getString("selector12");
		prueba2.selector13 = parametros.getString("selector13");
		prueba2.selector14 = parametros.getString("selector14");
		prueba2.selector15 = parametros.getString("selector15");
		prueba2.selector16 = parametros.getString("selector16");
		prueba2.selector17 = parametros.getString("selector17");
		prueba2.selector18 = parametros.getString("selector18");
		prueba2.selector19 = parametros.getString("selector19");
		prueba2.selector20 = parametros.getString("selector20");
		prueba2.selector21 = parametros.getString("selector21");
		prueba2.selector22 = parametros.getString("selector22");
		prueba2.selector23 = parametros.getString("selector23");
		prueba2.selector24 = parametros.getString("selector24");
		prueba2.selector25 = parametros.getString("selector25");
		prueba2.selector26 = parametros.getString("selector26");
		prueba2.selector27 = parametros.getString("selector27");
		prueba2.selector28 = parametros.getString("selector28");
		prueba2.selector29 = parametros.getString("selector29");
		prueba2.selector30 = parametros.getString("selector30");
		prueba2.selector31 = parametros.getString("selector31");
		prueba2.selector32 = parametros.getString("selector32");
		prueba2.selector33 = parametros.getString("selector33");
		prueba2.selector34 = parametros.getString("selector34");
		prueba2.selector35 = parametros.getString("selector35");
		prueba2.segundaPartePregunta1 = parametros.getString("segundaPartePregunta1");
		prueba2.segundaPartePregunta2 = parametros.getString("segundaPartePregunta2");
		prueba2.segundaPartePregunta3 = parametros.getString("segundaPartePregunta3");
		prueba2.segundaPartePregunta4 = parametros.getString("segundaPartePregunta4");
		prueba2.segundaPartePregunta5 = parametros.getString("segundaPartePregunta5");
		prueba2.segundaPartePregunta6 = parametros.getString("segundaPartePregunta6");
		prueba2.segundaPartePregunta7 = parametros.getString("segundaPartePregunta7");
		prueba2.segundaPartePregunta8 = parametros.getString("segundaPartePregunta8");
		prueba2.segundaPartePregunta9 = parametros.getString("segundaPartePregunta9");
		prueba2.segundaPartePregunta10 = parametros.getString("segundaPartePregunta10");
		prueba2.segundaPartePregunta12 = parametros.getString("segundaPartePregunta12");
		prueba2.segundaPartePregunta13 = parametros.getString("segundaPartePregunta13");
		prueba2.segundaPartePregunta14 = parametros.getString("segundaPartePregunta14");
		prueba2.segundaPartePregunta15 = parametros.getString("segundaPartePregunta15");
		prueba2.segundaPartePregunta16 = parametros.getString("segundaPartePregunta16");
		prueba2.segundaPartePregunta17 = parametros.getString("segundaPartePregunta17");
		prueba2.segundaPartePregunta18 = parametros.getString("segundaPartePregunta18");
		prueba2.segundaPartePregunta19 = parametros.getString("segundaPartePregunta19");
		prueba2.segundaPartePregunta20 = parametros.getString("segundaPartePregunta20");
		prueba2.segundaPartePregunta21 = parametros.getString("segundaPartePregunta21");
		prueba2.segundaPartePregunta22 = parametros.getString("segundaPartePregunta22");
		prueba2.segundaParteSelector1 = parametros.getString("segundaParteSelector1");
		prueba2.segundaParteSelector2 = parametros.getString("segundaParteSelector2");
		prueba2.segundaParteSelector3 = parametros.getString("segundaParteSelector3");
		prueba2.segundaParteSelector4 = parametros.getString("segundaParteSelector4");
		prueba2.tiempo = parametros.getInt("tiempo");
		prueba2.buenas = revisaPrueba2(prueba2);
		prueba2.insert();
		return;
	}

	@ControllerAction(description = "Method to set data", name = "setSample", version = 1)
	@Route(route = "insertaPrueba3")
	@POST
	public static void insertaPrueba3(HttpRequest req, HttpResponse res) {
		log.Info(req.getParams().toString());
		JSONObject parametros = req.getParams();
		Prueba3 prueba3 = new Prueba3();
		prueba3.rut = parametros.getString("rut");
		prueba3.pregunta1 = parametros.getString("pregunta1");
		prueba3.pregunta2 = parametros.getString("pregunta2");
		prueba3.pregunta3 = parametros.getString("pregunta3");
		prueba3.pregunta4 = parametros.getString("pregunta4");
		prueba3.pregunta5 = parametros.getString("pregunta5");
		prueba3.pregunta6 = parametros.getString("pregunta6");
		prueba3.pregunta7 = parametros.getString("pregunta7");
		prueba3.pregunta8 = parametros.getString("pregunta8");
		prueba3.pregunta9 = parametros.getString("pregunta9");
		prueba3.pregunta10 = parametros.getString("pregunta10");
		prueba3.pregunta11 = parametros.getString("pregunta11");
		prueba3.pregunta12 = parametros.getString("pregunta12");
		prueba3.pregunta13 = parametros.getString("pregunta13");
		prueba3.pregunta14 = parametros.getString("pregunta14");
		prueba3.pregunta15 = parametros.getString("pregunta15");
		prueba3.pregunta16 = parametros.getString("pregunta16");
		prueba3.pregunta17 = parametros.getString("pregunta17");
		prueba3.pregunta18 = parametros.getString("pregunta18");
		prueba3.pregunta19 = parametros.getString("pregunta19");
		prueba3.pregunta20 = parametros.getString("pregunta20");
		prueba3.pregunta21 = parametros.getString("pregunta21");
		prueba3.pregunta22 = parametros.getString("pregunta22");
		prueba3.pregunta23 = parametros.getString("pregunta23");
		prueba3.pregunta24 = parametros.getString("pregunta24");
		prueba3.pregunta25 = parametros.getString("pregunta25");
		prueba3.pregunta26 = parametros.getString("pregunta26");
		prueba3.vyf1 = parametros.getString("vyf1");
		prueba3.vyf2 = parametros.getString("vyf2");
		prueba3.vyf3 = parametros.getString("vyf3");
		prueba3.vyf4 = parametros.getString("vyf4");
		prueba3.vyf5 = parametros.getString("vyf5");
		prueba3.vyf6 = parametros.getString("vyf6");
		prueba3.vyf7 = parametros.getString("vyf7");
		prueba3.vyf8 = parametros.getString("vyf8");
		prueba3.vyf9 = parametros.getString("vyf9");
		prueba3.vyf10 = parametros.getString("vyf10");
		prueba3.vyf11 = parametros.getString("vyf11");
		prueba3.vyf12 = parametros.getString("vyf12");
		prueba3.vyf13 = parametros.getString("vyf13");
		prueba3.vyf14 = parametros.getString("vyf14");
		prueba3.vyf15 = parametros.getString("vyf15");
		prueba3.vyf16 = parametros.getString("vyf16");
		prueba3.vyf17 = parametros.getString("vyf17");
		prueba3.vyf18 = parametros.getString("vyf18");
		prueba3.vyf19 = parametros.getString("vyf19");
		prueba3.vyf20 = parametros.getString("vyf20");
		prueba3.vyf21 = parametros.getString("vyf21");
		prueba3.vyf22 = parametros.getString("vyf22");
		prueba3.vyf23 = parametros.getString("vyf23");
		prueba3.vyf24 = parametros.getString("vyf24");
		prueba3.selector1 = parametros.getString("selector1");
		prueba3.selector2 = parametros.getString("selector2");
		prueba3.selector3 = parametros.getString("selector3");
		prueba3.selector4 = parametros.getString("selector4");
		prueba3.selector5 = parametros.getString("selector5");
		prueba3.selector6 = parametros.getString("selector6");
		prueba3.selector7 = parametros.getString("selector7");
		prueba3.selector8 = parametros.getString("selector8");
		prueba3.buenas = revisaPrueba3(prueba3);
		prueba3.tiempo = parametros.getInt("tiempo");
		prueba3.insert();
		return;
	}

	@ControllerAction(description = "Method to set data", name = "setSample", version = 1)
	@Route(route = "insertaPrueba4")
	@POST
	public static void insertaPrueba4(HttpRequest req, HttpResponse res) {
		log.Info(req.getParams().toString());
		JSONObject parametros = req.getParams();
		Prueba4 prueba4 = new Prueba4();
		prueba4.rut = parametros.getString("rut");
		prueba4.pregunta2 = parametros.getString("pregunta2");
		prueba4.pregunta3 = parametros.getString("pregunta3");
		prueba4.pregunta4 = parametros.getString("pregunta4");
		prueba4.pregunta5 = parametros.getString("pregunta5");
		prueba4.pregunta6 = parametros.getString("pregunta6");
		prueba4.pregunta7 = parametros.getString("pregunta7");
		prueba4.pregunta9 = parametros.getString("pregunta9");
		prueba4.pregunta10 = parametros.getString("pregunta10");
		prueba4.pregunta11 = parametros.getString("pregunta11");
		prueba4.pregunta12 = parametros.getString("pregunta12");
		prueba4.pregunta13 = parametros.getString("pregunta13");
		prueba4.pregunta14 = parametros.getString("pregunta14");
		prueba4.pregunta15 = parametros.getString("pregunta15");
		prueba4.pregunta16 = parametros.getString("pregunta16");
		prueba4.pregunta17 = parametros.getString("pregunta17");
		prueba4.pregunta18 = parametros.getString("pregunta18");
		prueba4.pregunta20 = parametros.getString("pregunta20");
		prueba4.pregunta21 = parametros.getString("pregunta21");
		prueba4.pregunta22 = parametros.getString("pregunta22");
		prueba4.pregunta23 = parametros.getString("pregunta23");
		prueba4.pregunta24 = parametros.getString("pregunta24");
		prueba4.pregunta26 = parametros.getString("pregunta26");
		prueba4.pregunta27 = parametros.getString("pregunta27");
		prueba4.pregunta28 = parametros.getString("pregunta28");
		prueba4.pregunta29 = parametros.getString("pregunta29");
		prueba4.riesgo1 = parametros.getString("riesgo1");
		prueba4.riesgo2 = parametros.getString("riesgo2");
		prueba4.riesgo3 = parametros.getString("riesgo3");
		prueba4.etica1 = parametros.getString("etica1");
		prueba4.etica2 = parametros.getString("etica2");
		prueba4.etica3 = parametros.getString("etica3");
		prueba4.etica4 = parametros.getString("etica4");
		prueba4.etica5 = parametros.getString("etica5");
		prueba4.vyf1 = parametros.getString("vyf1");
		prueba4.vyf2 = parametros.getString("vyf2");
		prueba4.vyf3 = parametros.getString("vyf3");
		prueba4.vyf4 = parametros.getString("vyf4");
		prueba4.vyf5 = parametros.getString("vyf5");
		prueba4.vyf6 = parametros.getString("vyf6");
		prueba4.buenas = revisaPrueba4(prueba4);
		prueba4.tiempo = parametros.getInt("tiempo");
		prueba4.insert();
		return;
	}

	@ControllerAction(description = "Method to set data", name = "setSample", version = 1)
	@Route(route = "insertaPrueba5")
	@POST
	public static void insertaPrueba5(HttpRequest req, HttpResponse res) {
		log.Info(req.getParams().toString());
		JSONObject parametros = req.getParams();
		Prueba5 prueba5 = new Prueba5();
		prueba5.rut = parametros.getString("rut");
		prueba5.selector1 = parametros.getString("selector1");
		prueba5.selector2 = parametros.getString("selector2");
		prueba5.selector3 = parametros.getString("selector3");
		prueba5.selector4 = parametros.getString("selector4");
		prueba5.selector5 = parametros.getString("selector5");
		prueba5.selector6 = parametros.getString("selector6");
		prueba5.selector7 = parametros.getString("selector7");
		prueba5.selector8 = parametros.getString("selector8");
		prueba5.selector9 = parametros.getString("selector9");
		prueba5.selector10 = parametros.getString("selector10");
		prueba5.selector11 = parametros.getString("selector11");
		prueba5.selector12 = parametros.getString("selector12");
		prueba5.selector13 = parametros.getString("selector13");
		prueba5.selector14 = parametros.getString("selector14");
		prueba5.selector15 = parametros.getString("selector15");
		prueba5.selector16 = parametros.getString("selector16");
		prueba5.selector17 = parametros.getString("selector17");
		prueba5.selector18 = parametros.getString("selector18");
		prueba5.selector19 = parametros.getString("selector19");
		prueba5.selector20= parametros.getString("selector20");
		prueba5.selector21 = parametros.getString("selector21");
		prueba5.selector22 = parametros.getString("selector22");
		prueba5.selector23 = parametros.getString("selector23");
		prueba5.selector24 = parametros.getString("selector24");
		prueba5.selector25 = parametros.getString("selector25");
		prueba5.selector26 = parametros.getString("selector26");
		prueba5.selector27 = parametros.getString("selector27");
		prueba5.selector28 = parametros.getString("selector28");
		prueba5.selector29 = parametros.getString("selector29");
		prueba5.selector30 = parametros.getString("selector30");
		prueba5.selector31 = parametros.getString("selector31");
		prueba5.selector32 = parametros.getString("selector32");
		prueba5.selector33 = parametros.getString("selector33");
		prueba5.selector34 = parametros.getString("selector34");
		prueba5.selector35 = parametros.getString("selector35");
		prueba5.selector36 = parametros.getString("selector36");
		prueba5.selector37 = parametros.getString("selector37");
		prueba5.selector38 = parametros.getString("selector38");
		prueba5.selector39 = parametros.getString("selector39");
		prueba5.selector40 = parametros.getString("selector40");
		prueba5.selector41 = parametros.getString("selector41");
		prueba5.selector42 = parametros.getString("selector42");
		prueba5.selector43 = parametros.getString("selector43");
		prueba5.selector44 = parametros.getString("selector44");
		prueba5.selector45 = parametros.getString("selector45");
		prueba5.selector46 = parametros.getString("selector46");
		prueba5.selector47 = parametros.getString("selector47");
		prueba5.selector48 = parametros.getString("selector48");
		prueba5.vyf1 = parametros.getString("vyf1");
		prueba5.vyf2 = parametros.getString("vyf2");
		prueba5.vyf3 = parametros.getString("vyf3");
		prueba5.vyf4 = parametros.getString("vyf4");
		prueba5.vyf5 = parametros.getString("vyf5");
		prueba5.vyf6 = parametros.getString("vyf6");
		prueba5.vyf7 = parametros.getString("vyf7");
		prueba5.vyf8 = parametros.getString("vyf8");
		prueba5.vyf9 = parametros.getString("vyf9");
		prueba5.vyf10 = parametros.getString("vyf10");
		prueba5.pregunta2 = parametros.getString("pregunta2");
		prueba5.pregunta3 = parametros.getString("pregunta3");
		prueba5.pregunta5 = parametros.getString("pregunta5");
		prueba5.pregunta6 = parametros.getString("pregunta6");
		prueba5.pregunta7 = parametros.getString("pregunta7");
		prueba5.pregunta8 = parametros.getString("pregunta8");
		prueba5.pregunta9 = parametros.getString("pregunta9");
		prueba5.pregunta10 = parametros.getString("pregunta10");
		prueba5.pregunta11 = parametros.getString("pregunta11");
		prueba5.pregunta12 = parametros.getString("pregunta12");
		prueba5.pregunta13 = parametros.getString("pregunta13");
		prueba5.pregunta14 = parametros.getString("pregunta14");
		prueba5.pregunta15 = parametros.getString("pregunta15");
		prueba5.pregunta16 = parametros.getString("pregunta16");
		prueba5.pregunta17 = parametros.getString("pregunta17");
		prueba5.pregunta18 = parametros.getString("pregunta18");
		prueba5.pregunta19 = parametros.getString("pregunta19");
		prueba5.pregunta20 = parametros.getString("pregunta20");
		prueba5.pregunta21 = parametros.getString("pregunta21");
		prueba5.pregunta22 = parametros.getString("pregunta22");
		prueba5.pregunta23 = parametros.getString("pregunta23");
		prueba5.pregunta24 = parametros.getString("pregunta24");
		prueba5.pregunta25 = parametros.getString("pregunta25");
		prueba5.pregunta26 = parametros.getString("pregunta26");
		prueba5.pregunta27 = parametros.getString("pregunta27");
		prueba5.pregunta28 = parametros.getString("pregunta28");
		prueba5.pregunta29 = parametros.getString("pregunta29");
		prueba5.pregunta30 = parametros.getString("pregunta30");
		prueba5.pregunta31 = parametros.getString("pregunta31");
		prueba5.buenas = revisaPrueba5(prueba5);
		prueba5.tiempo = parametros.getInt("tiempo");
		prueba5.insert();
		return;
	}

	private static Integer revisaPrueba1(Prueba1 prueba1) {
		int buenas = 0;
		if(prueba1.pregunta1.equalsIgnoreCase("c")) {
			buenas++;
		}
		if(prueba1.pregunta2.equalsIgnoreCase("d")) {
			buenas++;
		}
		if(prueba1.pregunta3.equalsIgnoreCase("d")) {
			buenas++;
		}
		if(prueba1.pregunta4.equalsIgnoreCase("e")) {
			buenas++;
		}
		if(prueba1.pregunta5.equalsIgnoreCase("c")) {
			buenas++;
		}
		if(prueba1.pregunta6.equalsIgnoreCase("e")) {
			buenas++;
		}
		if(prueba1.clasificacion1.equalsIgnoreCase("MRV")) {
			buenas++;
		}
		if(prueba1.clasificacion2.equalsIgnoreCase("MDV")) {
			buenas++;
		}
		if(prueba1.clasificacion3.equalsIgnoreCase("MRV")) {
			buenas++;
		}
		if(prueba1.clasificacion4.equalsIgnoreCase("MD")) {
			buenas++;
		}
		if(prueba1.clasificacion5.equalsIgnoreCase("MRV")) {
			buenas++;
		}
		if(prueba1.clasificacion6.equalsIgnoreCase("MRV")) {
			buenas++;
		}
		if(prueba1.clasificacion7.equalsIgnoreCase("MD")) {
			buenas++;
		}
		if(prueba1.clasificacion8.equalsIgnoreCase("MDV")) {
			buenas++;
		}
		if(prueba1.vyf1.equalsIgnoreCase("v")) {
			buenas++;
		}
		if(prueba1.vyf2.equalsIgnoreCase("v")) {
			buenas++;
		}
		if(prueba1.vyf3.equalsIgnoreCase("f")) {
			buenas++;
		}
		if(prueba1.vyf4.equalsIgnoreCase("f")) {
			buenas++;
		}
		if(prueba1.vyf5.equalsIgnoreCase("v")) {
			buenas++;
		}
		if(prueba1.vyf6.equalsIgnoreCase("f")) {
			buenas++;
		}
		if(prueba1.vyf7.equalsIgnoreCase("v")) {
			buenas++;
		}
		if(prueba1.vyf8.equalsIgnoreCase("v")) {
			buenas++;
		}
		if(prueba1.vyf9.equalsIgnoreCase("v")) {
			buenas++;
		}
		if(prueba1.vyf10.equalsIgnoreCase("f")) {
			buenas++;
		}
		if(prueba1.pregunta9.equalsIgnoreCase("c")) {
			buenas++;
		}
		if(prueba1.pregunta10.equalsIgnoreCase("a")) {
			buenas++;
		}
		if(prueba1.pregunta11.equalsIgnoreCase("d")) {
			buenas++;
		}
		if(prueba1.pregunta12.equalsIgnoreCase("e")) {
			buenas++;
		}
		if(prueba1.concepto1.equalsIgnoreCase("Razón Corriente")) {
			buenas++;
		}
		if(prueba1.concepto2.equalsIgnoreCase("Margen Bruto de Utilidad")) {
			buenas++;
		}
		if(prueba1.concepto3.equalsIgnoreCase("Endeudamiento")) {
			buenas++;
		}
		if(prueba1.concepto4.equalsIgnoreCase("Índice Dupont")) {
			buenas++;
		}
		if(prueba1.concepto5.equalsIgnoreCase("Rotación de Cuentas por Cobrar")) {
			buenas++;
		}
		if(prueba1.concepto6.equalsIgnoreCase("Rotación de Cuentas por Pagar")) {
			buenas++;
		}
		if(prueba1.concepto7.equalsIgnoreCase("Rentabilidad sobre Patrimonio")) {
			buenas++;
		}
		if(prueba1.concepto8.equalsIgnoreCase("Índice de Participación en el Mercado")) {
			buenas++;
		}
		if(prueba1.concepto9.equalsIgnoreCase("Prueba Ácida")) {
			buenas++;
		}
		if(prueba1.concepto10.equalsIgnoreCase("KTNO")) {
			buenas++;
		}
		if(prueba1.concepto11.equalsIgnoreCase("WACC")) {
			buenas++;
		}
		if(prueba1.pregunta14.equalsIgnoreCase("d")) {
			buenas++;
		}
		if(prueba1.pregunta15.equalsIgnoreCase("b")) {
			buenas++;
		}
		if(prueba1.pregunta16.equalsIgnoreCase("b")) {
			buenas++;
		}
		if(prueba1.pregunta17.equalsIgnoreCase("c")) {
			buenas++;
		}
		if(prueba1.riesgo1.equalsIgnoreCase("Riesgo de Crédito")) {
			buenas++;
		}
		if(prueba1.riesgo2.equalsIgnoreCase("Riesgo de Mercado")) {
			buenas++;
		}
		if(prueba1.riesgo3.equalsIgnoreCase("Riesgo Legal")) {
			buenas++;
		}
		if(prueba1.riesgo4.equalsIgnoreCase("Riesgo Económico")) {
			buenas++;
		}
		if(prueba1.riesgo5.equalsIgnoreCase("Riesgo de Liquidez")) {
			buenas++;
		}
		if(prueba1.riesgo6.equalsIgnoreCase("Riesgo de Traducción")) {
			buenas++;
		}
		if(prueba1.riesgo7.equalsIgnoreCase("Riesgo de Transacción")) {
			buenas++;
		}
		if(prueba1.riesgo8.equalsIgnoreCase("Riesgo Operacional")) {
			buenas++;
		}
		if(prueba1.pregunta19.equalsIgnoreCase("d")) {
			buenas++;
		}
		if(prueba1.finanzasSelect1.equalsIgnoreCase("PIB")) {
			buenas++;
		}
		if(prueba1.finanzasSelect2.equalsIgnoreCase("Tasa de Desempleo")) {
			buenas++;
		}
		if(prueba1.finanzasSelect3.equalsIgnoreCase("Inflación")) {
			buenas++;
		}
		if(prueba1.finanzasSelect4.equalsIgnoreCase("Gasto Público")) {
			buenas++;
		}
		if(prueba1.finanzasSelect5.equalsIgnoreCase("Tipo de Cambio")) {
			buenas++;
		}
		if(prueba1.finanzasSelect6.equalsIgnoreCase("IPC")) {
			buenas++;
		}
		if(prueba1.finanzasPregunta2.equalsIgnoreCase("e")) {
			buenas++;
		}
		if(prueba1.finanzasPregunta3.equalsIgnoreCase("d")) {
			buenas++;
		}
		if(prueba1.finanzasPregunta4.equalsIgnoreCase("d")) {
			buenas++;
		}
		if(prueba1.finanzasPregunta5.equalsIgnoreCase("d")) {
			buenas++;
		}
		if(prueba1.finanzasPregunta6.equalsIgnoreCase("b")) {
			buenas++;
		}
		if(prueba1.finanzasPregunta7.equalsIgnoreCase("b")) {
			buenas++;
		}
		if(prueba1.finanzasPregunta8.equalsIgnoreCase("a")) {
			buenas++;
		}
		if(prueba1.finanzasPregunta9.equalsIgnoreCase("a")) {
			buenas++;
		}
		if(prueba1.finanzasPregunta10.equalsIgnoreCase("c")) {
			buenas++;
		}
		if(prueba1.finanzasPregunta11.equalsIgnoreCase("a")) {
			buenas++;
		}
		if(prueba1.finanzasPregunta12.equalsIgnoreCase("e")) {
			buenas++;
		}
		if(prueba1.finanzasPregunta13.equalsIgnoreCase("e")) {
			buenas++;
		}
		if(prueba1.finanzasPregunta14.equalsIgnoreCase("d")) {
			buenas++;
		}
		if(prueba1.finanzasPregunta15.equalsIgnoreCase("a")) {
			buenas++;
		}
		if(prueba1.finanzasPregunta17.equalsIgnoreCase("e")) {
			buenas++;
		}
		return buenas;
	}

	private static Integer revisaPrueba2(Prueba2 prueba2) {
		int buenas = 0;
		if(prueba2.vyf1.equalsIgnoreCase("v")) {
			buenas++;
		}
		if(prueba2.vyf2.equalsIgnoreCase("v")) {
			buenas++;
		}
		if(prueba2.vyf3.equalsIgnoreCase("f")) {
			buenas++;
		}
		if(prueba2.vyf4.equalsIgnoreCase("v")) {
			buenas++;
		}
		if(prueba2.vyf5.equalsIgnoreCase("f")) {
			buenas++;
		}
		if(prueba2.vyf6.equalsIgnoreCase("f")) {
			buenas++;
		}
		if(prueba2.vyf7.equalsIgnoreCase("v")) {
			buenas++;
		}
		if(prueba2.vyf8.equalsIgnoreCase("v")) {
			buenas++;
		}
		if(prueba2.vyf11.equalsIgnoreCase("v")) {
			buenas++;
		}
		if(prueba2.vyf12.equalsIgnoreCase("v")) {
			buenas++;
		}
		if(prueba2.vyf13.equalsIgnoreCase("f")) {
			buenas++;
		}
		if(prueba2.vyf14.equalsIgnoreCase("f")) {
			buenas++;
		}
		if(prueba2.vyf15.equalsIgnoreCase("v")) {
			buenas++;
		}
		if(prueba2.primeraPartePregunta1.equalsIgnoreCase("e")) {
			buenas++;
		}
		if(prueba2.primeraPartePregunta2.equalsIgnoreCase("e")) {
			buenas++;
		}
		if(prueba2.primeraPartePregunta3.equalsIgnoreCase("c")) {
			buenas++;
		}
		if(prueba2.primeraPartePregunta4.equalsIgnoreCase("e")) {
			buenas++;
		}
		if(prueba2.primeraPartePregunta5.equalsIgnoreCase("b")) {
			buenas++;
		}
		if(prueba2.primeraPartePregunta6.equalsIgnoreCase("e")) {
			buenas++;
		}
		if(prueba2.primeraPartePregunta7.equalsIgnoreCase("a")) {
			buenas++;
		}
		if(prueba2.primeraPartePregunta8.equalsIgnoreCase("c")) {
			buenas++;
		}
		if(prueba2.primeraPartePregunta9.equalsIgnoreCase("e")) {
			buenas++;
		}
		if(prueba2.primeraPartePregunta10.equalsIgnoreCase("d")) {
			buenas++;
		}
		if(prueba2.primeraPartePregunta11.equalsIgnoreCase("b")) {
			buenas++;
		}
		if(prueba2.primeraPartePregunta12.equalsIgnoreCase("b")) {
			buenas++;
		}
		if(prueba2.primeraPartePregunta13.equalsIgnoreCase("d")) {
			buenas++;
		}
		if(prueba2.primeraPartePregunta14.equalsIgnoreCase("e")) {
			buenas++;
		}
		if(prueba2.primeraPartePregunta15.equalsIgnoreCase("a")) {
			buenas++;
		}
		if(prueba2.primeraPartePregunta16.equalsIgnoreCase("d")) {
			buenas++;
		}
		if(prueba2.primeraPartePregunta17.equalsIgnoreCase("e")) {
			buenas++;
		}
		if(prueba2.primeraPartePregunta18.equalsIgnoreCase("e")) {
			buenas++;
		}
		if(prueba2.primeraPartePregunta19.equalsIgnoreCase("b")) {
			buenas++;
		}
		if(prueba2.primeraPartePregunta20.equalsIgnoreCase("d")) {
			buenas++;
		}
		if(prueba2.primeraPartePregunta21.equalsIgnoreCase("d")) {
			buenas++;
		}
		if(prueba2.primeraPartePregunta22.equalsIgnoreCase("e")) {
			buenas++;
		}
		if(prueba2.primeraPartePregunta23.equalsIgnoreCase("a")) {
			buenas++;
		}
		if(prueba2.selector1.equalsIgnoreCase("Etapa 1: Tareas Preparatorias")) {
			buenas++;
		}
		if(prueba2.selector2.equalsIgnoreCase("Etapa 3: Análisis de Situación")) {
			buenas++;
		}
		if(prueba2.selector3.equalsIgnoreCase("Etapa 4: Etapa Propositiva")) {
			buenas++;
		}
		if(prueba2.selector4.equalsIgnoreCase("Etapa 1: Tareas Preparatorias")) {
			buenas++;
		}
		if(prueba2.selector5.equalsIgnoreCase("Etapa 4: Etapa Propositiva")) {
			buenas++;
		}
		if(prueba2.selector6.equalsIgnoreCase("Etapa 5: Etapa Ejecutiva")) {
			buenas++;
		}
		if(prueba2.selector7.equalsIgnoreCase("Etapa 2: Etapa Fundacional")) {
			buenas++;
		}
		if(prueba2.selector8.equalsIgnoreCase("Etapa 2: Etapa Fundacional")) {
			buenas++;
		}
		if(prueba2.selector9.equalsIgnoreCase("Etapa 3: Análisis de Situación")) {
			buenas++;
		}
		if(prueba2.selector10.equalsIgnoreCase("Etapa 3: Análisis de Situación")) {
			buenas++;
		}
		if(prueba2.selector11.equalsIgnoreCase("Integración")) {
			buenas++;
		}
		if(prueba2.selector12.equalsIgnoreCase("Organización")) {
			buenas++;
		}
		if(prueba2.selector13.equalsIgnoreCase("Auditoria")) {
			buenas++;
		}
		if(prueba2.selector14.equalsIgnoreCase("Retención")) {
			buenas++;
		}
		if(prueba2.selector15.equalsIgnoreCase("Auditoria")) {
			buenas++;
		}
		if(prueba2.selector16.equalsIgnoreCase("Organización")) {
			buenas++;
		}
		if(prueba2.selector17.equalsIgnoreCase("Integración")) {
			buenas++;
		}
		if(prueba2.selector18.equalsIgnoreCase("Retención")) {
			buenas++;
		}
		if(prueba2.selector19.equalsIgnoreCase("Desarrollo")) {
			buenas++;
		}
		if(prueba2.selector20.equalsIgnoreCase("Desarrollo")) {
			buenas++;
		}
		if(prueba2.selector21.equalsIgnoreCase("Departamentalización por territorio")) {
			buenas++;
		}
		if(prueba2.selector22.equalsIgnoreCase("Departamentalización por equipos")) {
			buenas++;
		}
		if(prueba2.selector23.equalsIgnoreCase("Departamentalización por tipo de cliente")) {
			buenas++;
		}
		if(prueba2.selector24.equalsIgnoreCase("Departamentalización matricial")) {
			buenas++;
		}
		if(prueba2.selector25.equalsIgnoreCase("Departamentalización por funciones")) {
			buenas++;
		}
		if(prueba2.selector26.equalsIgnoreCase("Departamentalización por proyectos")) {
			buenas++;
		}
		if(prueba2.selector27.equalsIgnoreCase("Departamentalización por tiempo")) {
			buenas++;
		}
		if(prueba2.selector28.equalsIgnoreCase("Departamentalización por procesos")) {
			buenas++;
		}
		if(prueba2.selector29.equalsIgnoreCase("Departamentalización por productos o servicios")) {
			buenas++;
		}
		if(prueba2.selector30.equalsIgnoreCase("Por Pedidos")) {
			buenas++;
		}
		if(prueba2.selector31.equalsIgnoreCase("Intermitente")) {
			buenas++;
		}
		if(prueba2.selector32.equalsIgnoreCase("Por stock")) {
			buenas++;
		}
		if(prueba2.selector33.equalsIgnoreCase("Mixto")) {
			buenas++;
		}
		if(prueba2.selector34.equalsIgnoreCase("A destajo")) {
			buenas++;
		}
		if(prueba2.selector35.equalsIgnoreCase("Continua")) {
			buenas++;
		}
		if(prueba2.segundaPartePregunta1.equalsIgnoreCase("e")) {
			buenas++;
		}
		if(prueba2.segundaPartePregunta2.equalsIgnoreCase("e")) {
			buenas++;
		}
		if(prueba2.segundaPartePregunta3.equalsIgnoreCase("a")) {
			buenas++;
		}
		if(prueba2.segundaPartePregunta4.equalsIgnoreCase("d")) {
			buenas++;
		}
		if(prueba2.segundaPartePregunta5.equalsIgnoreCase("b")) {
			buenas++;
		}
		if(prueba2.segundaPartePregunta6.equalsIgnoreCase("b")) {
			buenas++;
		}
		if(prueba2.segundaPartePregunta7.equalsIgnoreCase("c")) {
			buenas++;
		}
		if(prueba2.segundaPartePregunta8.equalsIgnoreCase("e")) {
			buenas++;
		}
		if(prueba2.segundaPartePregunta9.equalsIgnoreCase("b")) {
			buenas++;
		}
		if(prueba2.segundaPartePregunta10.equalsIgnoreCase("b")) {
			buenas++;
		}
		if(prueba2.segundaPartePregunta12.equalsIgnoreCase("b")) {
			buenas++;
		}
		if(prueba2.segundaPartePregunta13.equalsIgnoreCase("d")) {
			buenas++;
		}
		if(prueba2.segundaPartePregunta14.equalsIgnoreCase("d")) {
			buenas++;
		}
		if(prueba2.segundaPartePregunta15.equalsIgnoreCase("e")) {
			buenas++;
		}
		if(prueba2.segundaPartePregunta16.equalsIgnoreCase("c")) {
			buenas++;
		}
		if(prueba2.segundaPartePregunta17.equalsIgnoreCase("e")) {
			buenas++;
		}
		if(prueba2.segundaPartePregunta18.equalsIgnoreCase("a")) {
			buenas++;
		}
		if(prueba2.segundaPartePregunta19.equalsIgnoreCase("d")) {
			buenas++;
		}
		if(prueba2.segundaPartePregunta20.equalsIgnoreCase("d")) {
			buenas++;
		}
		if(prueba2.segundaPartePregunta21.equalsIgnoreCase("d")) {
			buenas++;
		}
		if(prueba2.segundaPartePregunta22.equalsIgnoreCase("d")) {
			buenas++;
		}
		if(prueba2.segundaParteSelector1.equalsIgnoreCase("Sistema Estratégico")) {
			buenas++;
		}
		if(prueba2.segundaParteSelector2.equalsIgnoreCase("Sistema Táctico")) {
			buenas++;
		}
		if(prueba2.segundaParteSelector3.equalsIgnoreCase("Sistema Interinstitucional")) {
			buenas++;
		}
		if(prueba2.segundaParteSelector4.equalsIgnoreCase("Sistema Operativo")) {
			buenas++;
		}
		return buenas;
	}
	private static Integer revisaPrueba3(Prueba3 prueba3) {
		int buenas = 0;
		if(prueba3.pregunta1.equalsIgnoreCase("d")) {
			buenas++;
		}
		if(prueba3.pregunta2.equalsIgnoreCase("b")) {
			buenas++;
		}
		if(prueba3.pregunta3.equalsIgnoreCase("b")) {
			buenas++;
		}
		if(prueba3.pregunta4.equalsIgnoreCase("a")) {
			buenas++;
		}
		if(prueba3.pregunta5.equalsIgnoreCase("a")) {
			buenas++;
		}
		if(prueba3.pregunta6.equalsIgnoreCase("d")) {
			buenas++;
		}
		if(prueba3.pregunta7.equalsIgnoreCase("b")) {
			buenas++;
		}
		if(prueba3.pregunta8.equalsIgnoreCase("c")) {
			buenas++;
		}
		if(prueba3.pregunta9.equalsIgnoreCase("e")) {
			buenas++;
		}
		if(prueba3.vyf1.equalsIgnoreCase("f")) {
			buenas++;
		}
		if(prueba3.vyf2.equalsIgnoreCase("v")) {
			buenas++;
		}
		if(prueba3.vyf3.equalsIgnoreCase("v")) {
			buenas++;
		}
		if(prueba3.vyf4.equalsIgnoreCase("v")) {
			buenas++;
		}
		if(prueba3.vyf5.equalsIgnoreCase("f")) {
			buenas++;
		}
		if(prueba3.vyf6.equalsIgnoreCase("v")) {
			buenas++;
		}
		if(prueba3.pregunta10.equalsIgnoreCase("d")) {
			buenas++;
		}
		if(prueba3.vyf7.equalsIgnoreCase("f")) {
			buenas++;
		}
		if(prueba3.vyf8.equalsIgnoreCase("f")) {
			buenas++;
		}
		if(prueba3.vyf9.equalsIgnoreCase("v")) {
			buenas++;
		}
		if(prueba3.vyf10.equalsIgnoreCase("f")) {
			buenas++;
		}
		if(prueba3.vyf11.equalsIgnoreCase("v")) {
			buenas++;
		}
		if(prueba3.vyf12.equalsIgnoreCase("v")) {
			buenas++;
		}
		if(prueba3.vyf13.equalsIgnoreCase("f")) {
			buenas++;
		}
		if(prueba3.vyf14.equalsIgnoreCase("v")) {
			buenas++;
		}
		if(prueba3.vyf15.equalsIgnoreCase("v")) {
			buenas++;
		}
		if(prueba3.vyf16.equalsIgnoreCase("v")) {
			buenas++;
		}
		if(prueba3.vyf17.equalsIgnoreCase("f")) {
			buenas++;
		}
		if(prueba3.vyf18.equalsIgnoreCase("v")) {
			buenas++;
		}
		if(prueba3.vyf19.equalsIgnoreCase("v")) {
			buenas++;
		}
		if(prueba3.vyf20.equalsIgnoreCase("v")) {
			buenas++;
		}
		if(prueba3.vyf21.equalsIgnoreCase("f")) {
			buenas++;
		}
		if(prueba3.vyf22.equalsIgnoreCase("v")) {
			buenas++;
		}
		if(prueba3.vyf23.equalsIgnoreCase("v")) {
			buenas++;
		}
		if(prueba3.vyf24.equalsIgnoreCase("v")) {
			buenas++;
		}
		if(prueba3.pregunta11.equalsIgnoreCase("c")) {
			buenas++;
		}
		if(prueba3.pregunta12.equalsIgnoreCase("b")) {
			buenas++;
		}
		if(prueba3.pregunta13.equalsIgnoreCase("d")) {
			buenas++;
		}
		if(prueba3.pregunta14.equalsIgnoreCase("e")) {
			buenas++;
		}
		if(prueba3.pregunta15.equalsIgnoreCase("d")) {
			buenas++;
		}
		if(prueba3.pregunta16.equalsIgnoreCase("e")) {
			buenas++;
		}
		if(prueba3.pregunta17.equalsIgnoreCase("e")) {
			buenas++;
		}
		if(prueba3.pregunta18.equalsIgnoreCase("a")) {
			buenas++;
		}
		if(prueba3.pregunta19.equalsIgnoreCase("d")) {
			buenas++;
		}
		if(prueba3.pregunta20.equalsIgnoreCase("c")) {
			buenas++;
		}
		if(prueba3.pregunta21.equalsIgnoreCase("a")) {
			buenas++;
		}
		if(prueba3.pregunta22.equalsIgnoreCase("c")) {
			buenas++;
		}
		if(prueba3.pregunta23.equalsIgnoreCase("b")) {
			buenas++;
		}
		if(prueba3.pregunta24.equalsIgnoreCase("c")) {
			buenas++;
		}
		if(prueba3.pregunta25.equalsIgnoreCase("e")) {
			buenas++;
		}
		if(prueba3.selector1.equalsIgnoreCase("No Renta")) {
			buenas++;
		}
		if(prueba3.selector2.equalsIgnoreCase("No Renta")) {
			buenas++;
		}
		if(prueba3.selector3.equalsIgnoreCase("Renta")) {
			buenas++;
		}
		if(prueba3.selector4.equalsIgnoreCase("No Renta")) {
			buenas++;
		}
		if(prueba3.selector5.equalsIgnoreCase("No Renta")) {
			buenas++;
		}
		if(prueba3.selector6.equalsIgnoreCase("Renta")) {
			buenas++;
		}
		if(prueba3.selector7.equalsIgnoreCase("No Renta")) {
			buenas++;
		}
		if(prueba3.selector8.equalsIgnoreCase("Renta")) {
			buenas++;
		}
		return buenas;
	}
	private static Integer revisaPrueba4(Prueba4 prueba4) {
		int buenas = 0;
		if(prueba4.vyf1.equalsIgnoreCase("v")) {
			buenas++;
		}
		if(prueba4.vyf2.equalsIgnoreCase("v")) {
			buenas++;
		}
		if(prueba4.vyf3.equalsIgnoreCase("f")) {
			buenas++;
		}
		if(prueba4.vyf4.equalsIgnoreCase("v")) {
			buenas++;
		}
		if(prueba4.vyf5.equalsIgnoreCase("v")) {
			buenas++;
		}
		if(prueba4.vyf6.equalsIgnoreCase("v")) {
			buenas++;
		}
		if(prueba4.pregunta2.equalsIgnoreCase("e")) {
			buenas++;
		}
		if(prueba4.pregunta3.equalsIgnoreCase("e")) {
			buenas++;
		}
		if(prueba4.pregunta4.equalsIgnoreCase("d")) {
			buenas++;
		}
		if(prueba4.pregunta5.equalsIgnoreCase("d")) {
			buenas++;
		}
		if(prueba4.pregunta6.equalsIgnoreCase("c")) {
			buenas++;
		}
		if(prueba4.pregunta7.equalsIgnoreCase("c")) {
			buenas++;
		}
		if(prueba4.pregunta9.equalsIgnoreCase("b")) {
			buenas++;
		}
		if(prueba4.riesgo1.equalsIgnoreCase("Riesgo de Control")){
			buenas++;
		}
		if(prueba4.riesgo2.equalsIgnoreCase("Riesgo de Detección")){
			buenas++;
		}
		if(prueba4.riesgo3.equalsIgnoreCase("Riesgo Inherente")){
			buenas++;
		}
		if(prueba4.pregunta10.equalsIgnoreCase("d")) {
			buenas++;
		}
		if(prueba4.pregunta11.equalsIgnoreCase("c")) {
			buenas++;
		}
		if(prueba4.pregunta12.equalsIgnoreCase("e")) {
			buenas++;
		}
		if(prueba4.pregunta13.equalsIgnoreCase("a")) {
			buenas++;
		}
		if(prueba4.pregunta14.equalsIgnoreCase("a")) {
			buenas++;
		}
		if(prueba4.pregunta15.equalsIgnoreCase("d")) {
			buenas++;
		}
		if(prueba4.pregunta16.equalsIgnoreCase("e")) {
			buenas++;
		}
		if(prueba4.pregunta17.equalsIgnoreCase("e")) {
			buenas++;
		}
		if(prueba4.pregunta18.equalsIgnoreCase("d")) {
			buenas++;
		}
		if(prueba4.pregunta26.equalsIgnoreCase("d")) {
			buenas++;
		}
		if(prueba4.pregunta27.equalsIgnoreCase("a")) {
			buenas++;
		}
		if(prueba4.pregunta28.equalsIgnoreCase("b")) {
			buenas++;
		}
		if(prueba4.pregunta29.equalsIgnoreCase("a")) {
			buenas++;
		}
		if(prueba4.etica1.equalsIgnoreCase("No acepta.")) {
			buenas++;
		}
		if(prueba4.etica2.equalsIgnoreCase("No acepta.")) {
			buenas++;
		}
		if(prueba4.etica3.equalsIgnoreCase("Acepta")) {
			buenas++;
		}
		if(prueba4.etica4.equalsIgnoreCase("Acepta")) {
			buenas++;
		}
		if(prueba4.etica5.equalsIgnoreCase("No acepta")) {
			buenas++;
		}
		return buenas;
	}

	private static Integer revisaPrueba5(Prueba5 prueba5) {
		int buenas = 0;
		if(prueba5.selector1.equalsIgnoreCase("Pagaré")) {
			buenas++;
		}
		if(prueba5.selector2.equalsIgnoreCase("Factura")) {
			buenas++;
		}
		if(prueba5.selector3.equalsIgnoreCase("Nota de Crédito")) {
			buenas++;
		}
		if(prueba5.selector4.equalsIgnoreCase("Cheque")) {
			buenas++;
		}
		if(prueba5.selector5.equalsIgnoreCase("Nota de Débito")) {
			buenas++;
		}
		if(prueba5.selector6.equalsIgnoreCase("Boleta de Ventas y Servicios")) {
			buenas++;
		}
		if(prueba5.selector7.equalsIgnoreCase("Guía de Despacho")) {
			buenas++;
		}
		if(prueba5.selector8.equalsIgnoreCase("Activo")) {
			buenas++;
		}
		if(prueba5.selector9.equalsIgnoreCase("Pérdida")) {
			buenas++;
		}
		if(prueba5.selector10.equalsIgnoreCase("Activo")) {
			buenas++;
		}
		if(prueba5.selector11.equalsIgnoreCase("Ganancia")) {
			buenas++;
		}
		if(prueba5.selector12.equalsIgnoreCase("Pasivo")) {
			buenas++;
		}
		if(prueba5.selector13.equalsIgnoreCase("Pérdida")) {
			buenas++;
		}
		if(prueba5.selector14.equalsIgnoreCase("Ganancia")) {
			buenas++;
		}
		if(prueba5.selector15.equalsIgnoreCase("Pérdida")) {
			buenas++;
		}
		if(prueba5.selector16.equalsIgnoreCase("Pasivo")) {
			buenas++;
		}
		if(prueba5.selector17.equalsIgnoreCase("Activo")) {
			buenas++;
		}
		if(prueba5.selector18.equalsIgnoreCase("Ganancia")) {
			buenas++;
		}
		if(prueba5.selector19.equalsIgnoreCase("Ganancia")) {
			buenas++;
		}
		if(prueba5.selector20.equalsIgnoreCase("Pasivo")) {
			buenas++;
		}
		if(prueba5.selector21.equalsIgnoreCase("Pasivo")) {
			buenas++;
		}
		if(prueba5.pregunta2.equalsIgnoreCase("a")) {
			buenas++;
		}
		if(prueba5.pregunta3.equalsIgnoreCase("e")) {
			buenas++;
		}
		if(prueba5.pregunta5.equalsIgnoreCase("c")) {
			buenas++;
		}
		if(prueba5.pregunta6.equalsIgnoreCase("b")) {
			buenas++;
		}
		if(prueba5.pregunta7.equalsIgnoreCase("e")) {
			buenas++;
		}
		if(prueba5.pregunta8.equalsIgnoreCase("a")) {
			buenas++;
		}
		if(prueba5.pregunta9.equalsIgnoreCase("e")) {
			buenas++;
		}
		if(prueba5.pregunta10.equalsIgnoreCase("c")) {
			buenas++;
		}
		if(prueba5.vyf1.equalsIgnoreCase("v")) {
			buenas++;
		}
		if(prueba5.vyf2.equalsIgnoreCase("f")) {
			buenas++;
		}
		if(prueba5.vyf3.equalsIgnoreCase("v")) {
			buenas++;
		}
		if(prueba5.vyf4.equalsIgnoreCase("f")) {
			buenas++;
		}
		if(prueba5.vyf5.equalsIgnoreCase("f")) {
			buenas++;
		}
		if(prueba5.vyf6.equalsIgnoreCase("v")) {
			buenas++;
		}
		if(prueba5.vyf7.equalsIgnoreCase("v")) {
			buenas++;
		}
		if(prueba5.vyf8.equalsIgnoreCase("v")) {
			buenas++;
		}
		if(prueba5.vyf9.equalsIgnoreCase("f")) {
			buenas++;
		}
		if(prueba5.vyf10.equalsIgnoreCase("v")) {
			buenas++;
		}
		if(prueba5.selector22.equalsIgnoreCase("Flujo Operacional")) {
			buenas++;
		}
		if(prueba5.selector23.equalsIgnoreCase("Flujo de inversión")) {
			buenas++;
		}
		if(prueba5.selector24.equalsIgnoreCase("Flujo por financiamiento")) {
			buenas++;
		}
		if(prueba5.pregunta11.equalsIgnoreCase("c")) {
			buenas++;
		}
		if(prueba5.pregunta12.equalsIgnoreCase("d")) {
			buenas++;
		}
		if(prueba5.pregunta13.equalsIgnoreCase("e")) {
			buenas++;
		}
		if(prueba5.pregunta14.equalsIgnoreCase("e")) {
			buenas++;
		}
		if(prueba5.pregunta15.equalsIgnoreCase("e")) {
			buenas++;
		}
		if(prueba5.selector25.equalsIgnoreCase("Gasto")) {
			buenas++;
		}
		if(prueba5.selector26.equalsIgnoreCase("Costo")) {
			buenas++;
		}
		if(prueba5.selector27.equalsIgnoreCase("Costo")) {
			buenas++;
		}
		if(prueba5.selector28.equalsIgnoreCase("Gasto")) {
			buenas++;
		}
		if(prueba5.selector29.equalsIgnoreCase("Costo")) {
			buenas++;
		}
		if(prueba5.selector30.equalsIgnoreCase("Costo")) {
			buenas++;
		}
		if(prueba5.selector31.equalsIgnoreCase("Costo")) {
			buenas++;
		}
		if(prueba5.selector32.equalsIgnoreCase("Gasto")) {
			buenas++;
		}
		if(prueba5.selector33.equalsIgnoreCase("Costo")) {
			buenas++;
		}
		if(prueba5.selector34.equalsIgnoreCase("Gasto")) {
			buenas++;
		}
		if(prueba5.selector35.equalsIgnoreCase("Gasto")) {
			buenas++;
		}
		if(prueba5.selector36.equalsIgnoreCase("Costo")) {
			buenas++;
		}
		if(prueba5.pregunta16.equalsIgnoreCase("c")) {
			buenas++;
		}
		if(prueba5.pregunta17.equalsIgnoreCase("e")) {
			buenas++;
		}
		if(prueba5.pregunta18.equalsIgnoreCase("a")) {
			buenas++;
		}
		if(prueba5.selector37.equalsIgnoreCase("COT")) {
			buenas++;
		}
		if(prueba5.selector38.equalsIgnoreCase("CM")) {
			buenas++;
		}
		if(prueba5.selector39.equalsIgnoreCase("CM")) {
			buenas++;
		}
		if(prueba5.selector40.equalsIgnoreCase("COT")) {
			buenas++;
		}
		if(prueba5.selector41.equalsIgnoreCase("CPP")) {
			buenas++;
		}
		if(prueba5.selector42.equalsIgnoreCase("COT")) {
			buenas++;
		}
		if(prueba5.selector43.equalsIgnoreCase("COT")) {
			buenas++;
		}
		if(prueba5.selector44.equalsIgnoreCase("CPP")) {
			buenas++;
		}
		if(prueba5.selector45.equalsIgnoreCase("CPP")) {
			buenas++;
		}
		if(prueba5.selector46.equalsIgnoreCase("CM")) {
			buenas++;
		}
		if(prueba5.selector47.equalsIgnoreCase("CPP")) {
			buenas++;
		}
		if(prueba5.selector48.equalsIgnoreCase("COT")) {
			buenas++;
		}
		if(prueba5.pregunta19.equalsIgnoreCase("c")) {
			buenas++;
		}
		if(prueba5.pregunta20.equalsIgnoreCase("b")) {
			buenas++;
		}
		if(prueba5.pregunta21.equalsIgnoreCase("d")) {
			buenas++;
		}
		if(prueba5.pregunta22.equalsIgnoreCase("e")) {
			buenas++;
		}
		if(prueba5.pregunta23.equalsIgnoreCase("d")) {
			buenas++;
		}
		if(prueba5.pregunta24.equalsIgnoreCase("c")) {
			buenas++;
		}
		if(prueba5.pregunta25.equalsIgnoreCase("d")) {
			buenas++;
		}
		if(prueba5.pregunta26.equalsIgnoreCase("e")) {
			buenas++;
		}
		if(prueba5.pregunta27.equalsIgnoreCase("a")) {
			buenas++;
		}
		if(prueba5.pregunta28.equalsIgnoreCase("d")) {
			buenas++;
		}
		if(prueba5.pregunta29.equalsIgnoreCase("b")) {
			buenas++;
		}
		if(prueba5.pregunta30.equalsIgnoreCase("b")) {
			buenas++;
		}
		if(prueba5.pregunta31.equalsIgnoreCase("c")) {
			buenas++;
		}
		return buenas;
	}
}
