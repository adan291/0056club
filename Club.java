import java.util.ArrayList;
/**
 * Store details of club memberships.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Club
{
    // Define any necessary fields here ...
    //Atributo para crear miembros
    private ArrayList<Membership> miembros;
    
    /**
     * Constructor for objects of class Club
     */
    public Club()
    {
        // Initialise any fields here ...
        miembros = new ArrayList<Membership>();
    }
 

    /**
     * Metodo para a�adir miembros
     */
    public void join(Membership member)
    {
        miembros.add(member);
    }

    /**
     * Devuelve el numero de miembros que hay
     */
    public int numberOfMembers()
    {
        return miembros.size();
    }
}
