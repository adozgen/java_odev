package mirasalma;
public class Main {

    public static void main(String[] args) {
        ogrenci ogrn = new ogrenci();
	ogretmen ogrt = new ogretmen();
	memur mmr =new memur();
	ogrgorevlisi og = new ogrgorevlisi();
        
	System.out.println("ogrenci bilgileri\n");
        
	ogrn.gezer();
	ogrn.uyur();
	ogrn.kantin();
	ogrn.setTcno(10060275);
	ogrn.setAd("adem");
	ogrn.setmemleket("corum");
	ogrn.setbolum("bilgisayar muh");
	ogrn.setDt(1991);
        ogrn.kisibilgisi();//kisi biligleri ogrenci bilgilerinede aktarılmıstır.
        ogrn.ogrencibilgisi();
	
	System.out.println("\nogretmen bilgileri\n");

	ogrt.setAd("ismail");
	ogrt.setbolum("bilgisayar muh");
	ogrt.setsicilno("597");
	ogrt.setDt(1980);
        ogrt.setTcno(10060210);
        ogrt.ogretmenbilgisi();
        
        System.out.println("\nogretim gorevlisi bilgileri\n");
        
        og.setAd("recai");
        og.setTcno(10060260);
        og.setDt(1982);
	og.setalan("ozgur yazilim ");
	og.setsicilno("4098");
	og.setbolum("bilgisayar muh");
        og.ogrtgrvbilgisi();
//	
	System.out.println("\nmemur bilgileri\n");
//	
        mmr.setAd("cengiz");
	mmr.setDt(1989);
	mmr.setGorev("yazıci");
	mmr.setTcno(456882);
        mmr.memurbilgisi();
    }
}
