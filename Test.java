
/**
 * Write a description of class Test here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Test
{
    public void test1()
    {
        AgendaTelefonica agenda = new AgendaTelefonica();
        
        agenda.enterNumber("Ruben1","111111111");
        agenda.enterNumber("Pedro2","222222222");
        agenda.enterNumber("Miguel3","333333333");
        agenda.enterNumber("Antonio4","444444444");
        
        agenda.printAllNames();
    }
    
    
}
