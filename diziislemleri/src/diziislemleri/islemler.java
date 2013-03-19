package diziislemleri;

import java.util.Scanner;

public class islemler {
    private int s;
    private int k;
    private int[] sayilar;
    
    public void sirala(int[] _sayilar)
    {
        Scanner input=new Scanner(System.in);
        System.out.println("kac tane sayi girmek istersiniz:");
        int boyut,yedek,i=0;
        boyut=input.nextInt();
        
        this.setSayilar(_sayilar);
        _sayilar=new int[boyut];
        
        setSayilar(new int[boyut]);
        for ( i = 0; i < boyut; i++) {
            System.out.println(i+1 +". sayiyi giriniz");
            _sayilar[i]=input.nextInt();
        }
        for ( i = 1; i < boyut; i++) {
            for (int j = 0; j < boyut-i; j++) {
                if (_sayilar[j]>_sayilar[j+1]) {
                    yedek=_sayilar[j];
                    _sayilar[j]=_sayilar[j+1];
                    _sayilar[j+1]=yedek;
                    
                }
                
            }
            
        }
        System.out.println("siralama\n");
        for ( i = 0; i < boyut; i++) {
            System.out.print(_sayilar[i] + "-");    
        }
        System.out.println("\n");
        System.out.println("degerlendirme\n");
        System.out.println("en buyuk sayi "+_sayilar[boyut-1]);
        System.out.println("en kucuk sayi "+_sayilar[boyut-boyut]);
        
        
    }
    public int[] getSayilar() {
        return sayilar;
    }

    public void setSayilar(int[] _sayilar) {
        this.sayilar = _sayilar;
    }
    
}
