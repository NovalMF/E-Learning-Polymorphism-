//Nama : Noval Muhamad Faisal
//Kelas : TIF RP 14 A 
// NPM : 14111069

public class polymorphHewan {
	String jenis;
	String ciri;
	
	public void suara(){
		System.out.println("Suara Hewan");
		}
	public void makan(){
		System.out.println("Cara Makan Hewan");
		}
	}
class Kucing extends polymorphHewan{
	public void suara(){
		System.out.println("Suara Kucing Meong");
		}
	public void makan(){
		System.out.println("Kucing Makan Ikan");
		System.out.println("======================");
		}
	}
class Kambing extends polymorphHewan{
	public void suara(){
		System.out.println("Suara Kambing Mbeeeee");
		}
	public void makan(){
		System.out.println("Kambing Makan Rumput");
		System.out.println("======================");
		}
	}
class Serigala extends polymorphHewan{
	public void suara(){
		System.out.println("Suara Serigala Auuuuuuuu");
		}
	public void makan(){
		System.out.println("Serigala Makan Daging");
		System.out.println("======================");
		}
	}
