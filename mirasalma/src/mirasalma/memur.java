package mirasalma;
public class memur extends kisi {
    protected String gorev;
	
    public void evrakGetir(){
	System.out.println("evraklari getiriyor");
	}
    public void evrakGotur(){
	System.out.println("evrakları al gotur");
	}
    public String getGorev() {
	return gorev;
	}
    public void setGorev(String gorev) {
	this.gorev = gorev;
	}
    public void memurbilgisi(){
        super.kisibilgisi();
	System.out.println("gorevi:"+gorev);
	}
    
}
