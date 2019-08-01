package proyectobase.model;

import earlgrey.annotations.Model;
import earlgrey.annotations.ModelField;
import earlgrey.annotations.PrimaryKey;
import earlgrey.core.ModelCore;
@Model(name = "rutperfil", tableName = "rutyperfil", version = 1)
public class rutperfil extends ModelCore{
	@ModelField
	@PrimaryKey
	public Integer id;
	@ModelField
	public String rut;
	@ModelField
	public String genero;
	@ModelField
	public String condicion;
	@ModelField
	public String lugarEstudios;
	@ModelField
	public String ocupacion;
}
