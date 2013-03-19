package mirasalma;
public class ogrenci extends kisi{
    protected String memleket;
    protected String bolum;
    protected String Sinif;
    public void ders(){
	System.out.println("ogrenci derste");
	}
    public void kantin(){
	System.out.println("ogrenci kantinde");
	}
    public String getmemleket() {
	return memleket;
	}
    public void setmemleket(String memleket) {
	this.memleket = memleket;
	}
    public String getbolum() {
	return bolum;
	}
    public void setbolum(String bolum) {
	this.bolum = bolum;
	}
    public String getSinif() {
	return Sinif;
	}
    public void setsinif(String _Sinif) {
	this.Sinif = _Sinif;
	}
    public void ogrencibilgisi(){
        super.kisibilgisi();
	System.out.println("memleket "+memleket+"\nbolum: "+bolum);
	}
    
    
}
