package proyectobase.model;

import earlgrey.annotations.Model;
import earlgrey.annotations.ModelField;
import earlgrey.core.ModelCore;
@Model(name = "prueba", tableName = "prueba", version = 1)
public class prueba extends ModelCore{
	@ModelField
	public String id;
	@ModelField
	public String uno;
	@ModelField
	public String dos;
}
