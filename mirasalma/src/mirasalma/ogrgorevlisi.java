package mirasalma;
public class ogrgorevlisi extends ogretmen{
    
    	protected String alan;
	int yas;
	public String getalan() {
	return alan;
	}
	public void setalan(String ad) {
	this.alan = ad;
	}
	public int getyas() {
	return yas;
	}
	public void setAd(int yas) {
	this.yas = yas;
	}
        public void ogrtgrvbilgisi(){
        super.ogretmenbilgisi();
	System.out.println("alan "+alan);
        
	}
    
}
