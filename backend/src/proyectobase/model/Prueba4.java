package proyectobase.model;

import earlgrey.annotations.Model;
import earlgrey.annotations.ModelField;
import earlgrey.annotations.PrimaryKey;
import earlgrey.core.ModelCore;
@Model(name = "prueba4", tableName = "prueba4", version = 1)
public class Prueba4 extends ModelCore{
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
    public String pregunta16;
    @ModelField
    public String pregunta17;
    @ModelField
    public String pregunta18;
    @ModelField
    public String pregunta19;
    @ModelField
    public String riesgo1;
    @ModelField
    public String riesgo2;
    @ModelField
    public String riesgo3;
}