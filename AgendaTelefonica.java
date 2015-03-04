import java.util.HashMap;
/**
 * HashMap que simula una agenda de telefono
 * 
 * @author Ruben Jimenez
 * @version 1.0
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
     * @name clave nombre
     */
    public String lookupNumber(String name)
    {
        return agenda.get(name);
    }
    
    /**
    * Print all keys
    */
    public void printAllNames()
    {
        System.out.println(agenda.entrySet());
    }
}
