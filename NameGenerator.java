
/**
 * Write a description of class NameGenerator here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class NameGenerator
{
    public final static int NOMBRE = 3;
    public final static int APE_PARTE1 = 2;
    public final static int APE_PARTE2 = 3;

    /**
     * Constructor for objects of class NameGenerator
     */
    public NameGenerator()
    {
        
    }
    
    /**
     * 
     */
    public String generateStarWarsName(String nombre, String apellido1, String apellido2, String ciudadNacimiento)
    {
        String starWarsName = "";
        starWarsName += apellido1.substring(0, NOMBRE) + nombre.substring(0,NOMBRE) + " " 
            + apellido2.substring(0,APE_PARTE1) + ciudadNacimiento.substring(0,APE_PARTE2);
        return starWarsName;
    }
}
