public class Ghiozdan {

    private final static int CAPACITATE_GHIOZDAN=10;
    Rechizite[] rechizite = new Rechizite[CAPACITATE_GHIOZDAN];

    public void addCaiet(Caiet myCaiet)
    {
        int i=0;
        while(i<CAPACITATE_GHIOZDAN&&rechizite[i]!=null)
            i++;
        if(i<CAPACITATE_GHIOZDAN)
            rechizite[i]=myCaiet;

    }

    public void addManual(Manual myManual)
    {
        int i=0;
        while(i<CAPACITATE_GHIOZDAN&&rechizite[i]!=null)
            i++;
        if(i<CAPACITATE_GHIOZDAN)
            rechizite[i]=myManual;
    }


    public void listItems()
    {
        for(Rechizite r : rechizite)
            if(r!=null)
                System.out.print(r.getNume() + " ");
    }

    public int countAndlistManual()
    {
        int i=0;
        Manual temp = new Manual(null);
        for(Rechizite m : rechizite) {
            if(m!=null)
                if (m instanceof Manual) {
                    i++;
                    System.out.print(m.getNume() + ", ");
                }
        }
        return i;
    }

    public int countAndlistCaiet()
    {
        int i=0;
        Caiet temp = new Caiet(null);
        for(Rechizite c : rechizite)
        {
            if(c!=null)
                if(c instanceof Caiet)
                {
                    i++;
                    System.out.print(c.getNume() + ", ");
                }
        }
        return i;
    }





}

