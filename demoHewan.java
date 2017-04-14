//Class Method Mainnya (program utama)

public class demoHewan{
	public static void main(String[] asdasd){
		Kucing HewanKucing = new Kucing();
		Kambing HewanKambing = new Kambing();
		Serigala HewanSerigala = new Serigala();
		
	polymorphHewan h;
	System.out.println("Kucing");
	h = HewanKucing;
	h.suara();
	h.makan();
	
	System.out.println("Kambing");
	h = HewanKambing;
	h.suara();
	h.makan();
	
	System.out.println("Serigala");
	h = HewanSerigala;
	h.suara();
	h.makan();
	
	}
}
	