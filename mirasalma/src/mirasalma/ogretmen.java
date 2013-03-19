package mirasalma;
public class ogretmen extends kisi {
    
    private String sicilno;
    private String bolum;
    public String getsicilno() {
	return sicilno;
	}
    public void setsicilno(String sicilno) {
	this.sicilno = sicilno;
	}
    public String getbolum() {
	return bolum;
	}
    public void setbolum(String bolum) {
	this.bolum= bolum;
	}
    public void ders(){
	System.out.println("hoca derste");
	}
    public void sınav(){
	System.out.println("hoca sınav yapiyo");
	}
    public void ogretmenbilgisi(){
        super.kisibilgisi();
	System.out.println("sicilno "+sicilno+"\nbolum: "+bolum);
        
	}

    
    
}
