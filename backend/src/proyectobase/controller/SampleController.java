package proyectobase.controller;

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
import proyectobase.model.rutperfil;

@Controller(description = "Sample API controller", name = "SampleController", version = 1)
@Route(route = "/tesis")
@CORS
public class SampleController extends ControllerCore {

	private static Logging log = new Logging(SampleController.class.getName());

	@ControllerAction(description = "Method to get data", name = "getSample", version = 1)
	@Route(route = "insertaPerfil")
	@POST
	public static void insertaPerfil(HttpRequest req, HttpResponse res) {
		log.Info(req.getParams().toString());
		rutperfil rp = new rutperfil();
		rp.rut = req.getParam("rut");
		rp.perfil = req.getParam("perfil");
		log.Info("resultado insert: ");
		res.send("GET Sample response", 200);
		return;
	}

	@ControllerAction(description = "Method to set data", name = "setSample", version = 1)
	@Route(route = "insertaPrueba1")
	@POST
	public static void insertaPrueba1(HttpRequest req, HttpResponse res) {
		log.Info(req.getParams().toString());
		log.Info("resultado insert: ");
		res.send("GET Sample response", 200);
		return;
	}

	@ControllerAction(description = "Method to set data", name = "setSample", version = 1)
	@Route(route = "insertaPrueba2")
	@POST
	public static void insertaPrueba2(HttpRequest req, HttpResponse res) {
		log.Info(req.getParams().toString());
		log.Info("resultado insert: ");
		res.send("GET Sample response", 200);
		return;
	}

	@ControllerAction(description = "Method to set data", name = "setSample", version = 1)
	@Route(route = "insertaPrueba3")
	@POST
	public static void insertaPrueba3(HttpRequest req, HttpResponse res) {
		log.Info(req.getParams().toString());
		log.Info("resultado insert: ");
		res.send("GET Sample response", 200);
		return;
	}

	@ControllerAction(description = "Method to set data", name = "setSample", version = 1)
	@Route(route = "insertaPrueba4")
	@POST
	public static void insertaPrueba4(HttpRequest req, HttpResponse res) {
		log.Info(req.getParams().toString());
		log.Info("resultado insert: ");
		res.send("GET Sample response", 200);
		return;
	}

	@ControllerAction(description = "Method to set data", name = "setSample", version = 1)
	@Route(route = "insertaPrueba5")
	@POST
	public static void insertaPrueba5(HttpRequest req, HttpResponse res) {
		log.Info(req.getParams().toString());
		log.Info("resultado insert: ");
		res.send("GET Sample response", 200);
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
