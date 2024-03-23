
public class Caiet extends Rechizite {
		
	public Caiet(String nume)
    {
        super(nume);
    }
    @Override
    public String getNume()
    {
        return "Caiet " + super.nume;
    }

}
