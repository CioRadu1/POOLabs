
public class Manual extends Rechizite{

    public Manual(String nume)
    {
        super(nume);
    }


    @Override
    public String getNume()
    {
        return "Manualul " + super.nume;
    }
}
