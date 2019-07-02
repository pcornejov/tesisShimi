package proyectobase.model;

import earlgrey.annotations.Model;
import earlgrey.annotations.ModelField;
import earlgrey.core.ModelCore;
@Model(name = "prueba2", tableName = "prueba2", version = 1)
public class Prueba2 extends ModelCore{
	@ModelField
	public String id;
	@ModelField
	public String uno;
	@ModelField
	public String dos;
}