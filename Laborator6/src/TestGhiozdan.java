
public class TestGhiozdan {

	public static void main(String[] args) {
		Ghiozdan ghiozdan = new Ghiozdan();
        Caiet c1 = new Caiet("Dictando");
        Caiet c2 = new Caiet("Matematica");
        Caiet c3 = new Caiet("Muzica");
        Manual m1 = new Manual("Chimie");
        Manual m2 = new Manual("Literatura");

        ghiozdan.addCaiet(c1);
        ghiozdan.addManual(m2);
        ghiozdan.addManual(m1);
        ghiozdan.listItems();
        System.out.println();
        int x = ghiozdan.countAndlistCaiet();
        System.out.println(x);
        int y = ghiozdan.countAndlistManual();
        System.out.println(y);

	}

}
