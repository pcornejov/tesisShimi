package proyectobase.model;

import earlgrey.annotations.Model;
import earlgrey.annotations.ModelField;
import earlgrey.annotations.PrimaryKey;
import earlgrey.core.ModelCore;
@Model(name = "rutperfil", tableName = "rutperfil", version = 1)
public class rutperfil extends ModelCore{
	@ModelField
	@PrimaryKey
	public String rut;
	@ModelField
	public String perfil;
}
