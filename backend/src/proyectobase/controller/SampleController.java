package proyectobase.controller;

import org.json.JSONObject;

import earlgrey.annotations.CORS;
import earlgrey.annotations.Controller;
import earlgrey.annotations.ControllerAction;
import earlgrey.annotations.GET;
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
		rp.perfil = parametros.getString("perfil");
 		rp.update(rp.id);
		JSONObject resultado = new JSONObject();
		resultado.put("SUCCESS", 200);	
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
		prueba1.insert();
		return;
	}

	@ControllerAction(description = "Method to set data", name = "setSample", version = 1)
	@Route(route = "insertaPrueba2")
	@POST
	public static void insertaPrueba2(HttpRequest req, HttpResponse res) {
		log.Info(req.getParams().toString());
		Prueba2 prueba2 = new Prueba2();
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
		prueba4.pregunta1 = parametros.getString("pregunta1");
		prueba4.pregunta2 = parametros.getString("pregunta2");
		prueba4.pregunta3 = parametros.getString("pregunta3");
		prueba4.pregunta4 = parametros.getString("pregunta4");
		prueba4.pregunta5 = parametros.getString("pregunta5");
		prueba4.pregunta6 = parametros.getString("pregunta6");
		prueba4.pregunta7 = parametros.getString("pregunta7");
		prueba4.pregunta8 = parametros.getString("pregunta8");
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
		prueba4.pregunta19 = parametros.getString("pregunta19");
		prueba4.riesgo1 = parametros.getString("riesgo1");
		prueba4.riesgo2 = parametros.getString("riesgo2");
		prueba4.riesgo3 = parametros.getString("riesgo3");
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
		return;
	}

	@ControllerAction(description = "Method to get data", name = "getSample", version = 1)
	@Route(route = "obtienePrueba1")
	@GET
	public static void obtienePrueba1(HttpRequest req, HttpResponse res) {
		log.Info(req.getParams().toString());
		log.Info("resultado insert: ");
		res.send("GET Sample response", 200);
		return;
	}

	@ControllerAction(description = "Method to get data", name = "getSample", version = 1)
	@Route(route = "obtienePrueba2")
	@GET
	public static void obtienePrueba2(HttpRequest req, HttpResponse res) {
		log.Info(req.getParams().toString());
		log.Info("resultado insert: ");
		res.send("GET Sample response", 200);
		return;
	}

	@ControllerAction(description = "Method to get data", name = "getSample", version = 1)
	@Route(route = "obtienePrueba3")
	@GET
	public static void obtienePrueba3(HttpRequest req, HttpResponse res) {
		log.Info(req.getParams().toString());
		log.Info("resultado insert: ");
		res.send("GET Sample response", 200);
		return;
	}

	@ControllerAction(description = "Method to get data", name = "getSample", version = 1)
	@Route(route = "obtienePrueba4")
	@GET
	public static void obtienePrueba4(HttpRequest req, HttpResponse res) {
		log.Info(req.getParams().toString());
		log.Info("resultado insert: ");
		res.send("GET Sample response", 200);
		return;
	}

	@ControllerAction(description = "Method to get data", name = "getSample", version = 1)
	@Route(route = "obtienePrueba5")
	@GET
	public static void obtienePrueba5(HttpRequest req, HttpResponse res) {
		log.Info(req.getParams().toString());
		log.Info("resultado insert: ");
		res.send("GET Sample response", 200);
		return;
	}
}
