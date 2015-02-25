import java.util.HashMap;
/**
 * Write a description of class AgendaTelefonica here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class AgendaTelefonica
{
    // instance variables - replace the example below with your own
    private HashMap <String,String> agenda;

    /**
     * Constructor for objects of class AgendaTelefonica
     */
    public AgendaTelefonica()
    {
        // initialise instance variables
        agenda = new HashMap<>();
    }

    /**
     * Introduce un nombre con un numero a la agenda
     * 
     * @name  clave nombre
     * @number numero de telefono 
     */
    public void enterNumber(String name, String number)
    {
        agenda.put(name,number);
    }
    
    /**
     * Devuelve el numero de telefon de un nombre que le indiques
     */
    public String lookupNumber(String name)
    {
        return agenda.get(name);
    }
    
}
