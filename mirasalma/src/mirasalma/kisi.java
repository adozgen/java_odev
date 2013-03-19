package mirasalma;
public class kisi {
    protected int tcno;
    protected String ad;
    protected int dt ;
    public void uyur(){
        
        System.out.println("kisi uyuyor");
     
	
	}
    public void gezer(){
        System.out.println("kisi ayakta");
	}
    public String getAd() {
        return ad;
	}
    public void setAd(String _ad) {
	this.ad = _ad;
	}
    public int getTcno() {
	return tcno;
	}
    public void setTcno(int _tcno) {
	this.tcno = _tcno;
	}
    public int getDt() {
	return dt;
	}
    public void setDt(int _dt) {
	this.dt = _dt;
	}
    public void kisibilgisi(){
	System.out.println("ad= "+ad+"  tc:  "+tcno+"   dogum tarihi:  "+dt);
	}
    
    
}
