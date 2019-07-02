package proyectobase.model;

import earlgrey.annotations.Model;
import earlgrey.annotations.ModelField;
import earlgrey.annotations.PrimaryKey;
import earlgrey.core.ModelCore;
@Model(name = "prueba3", tableName = "prueba3", version = 1)
public class Prueba3 extends ModelCore{
    @ModelField
	@PrimaryKey
	public Integer id;
	@ModelField
	public String rut;
	@ModelField
    public String pregunta1;
    @ModelField
    public String pregunta2;
    @ModelField
    public String pregunta3;
    @ModelField
    public String pregunta4;
    @ModelField
    public String pregunta5;
    @ModelField
    public String pregunta6;
    @ModelField
    public String pregunta7;
    @ModelField
    public String pregunta8;
    @ModelField
    public String pregunta9;
    @ModelField
    public String pregunta10;
    @ModelField
    public String pregunta11;
    @ModelField
    public String pregunta12;
    @ModelField
    public String pregunta13;
    @ModelField
    public String pregunta14;
    @ModelField
    public String pregunta15;
    @ModelField
    public String vyf1;
    @ModelField
    public String vyf2;
    @ModelField
    public String vyf3;
    @ModelField
    public String vyf4;
    @ModelField
    public String vyf5;
    @ModelField
    public String vyf6;
    @ModelField
    public String vyf7;
    @ModelField
    public String vyf8;
    @ModelField
    public String vyf9;
    @ModelField
    public String vyf10;
    @ModelField
    public String vyf11;
}