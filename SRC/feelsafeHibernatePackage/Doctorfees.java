package feelsafeHibernatePackage;
// Generated by MyEclipse - Hibernate Tools



/**
 * Doctorfees generated by MyEclipse - Hibernate Tools
 */
public class Doctorfees extends AbstractDoctorfees implements java.io.Serializable {

    // Constructors

    /** default constructor */
    public Doctorfees() {
    }

	/** minimal constructor */
    public Doctorfees(Integer id) {
        super(id);        
    }
    
    /** full constructor */
    public Doctorfees(Integer id, Employees employees, String healthproblem, Float fees) {
        super(id, employees, healthproblem, fees);        
    }
   
}
