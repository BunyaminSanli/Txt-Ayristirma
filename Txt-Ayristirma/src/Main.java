/**
*
* @author Bünyamin Şanlı, Furkan Bingül 
* bunyamin.sanli@ogr.sakarya.edu.tr , muhammet.bingul@ogr.sakarya.edu.tr
* @since 08.03.2020
* <p>
* main sınıfımız burada diğer sınıflardan metot çağırma ve 
* dosya okuma işlemleri yapılır
* </p>
*/

import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.InputStreamReader;


public class Main {

   
    public static void main(String[] args) {

        
         String str = "";   //txt den aldığımız her satırı tek tek atmak için bos bir string tanımladım
         String [] veri;    //daha sonra satırları diziye atamak için bir dizi tanımladım
         int ss = satirSayisi();    //burada da txt de kaç satır varsa ss değerine o değer atanıyor
         veri = new String[ss];     //veri dizisinin boyutunu atıyorum
         
         //dosya okuma işlemleri
         try{   
         FileInputStream fStream = new FileInputStream("icerik.txt");
         DataInputStream dStream = new DataInputStream(fStream);
         BufferedReader bReader = new BufferedReader(new InputStreamReader(dStream));
         
         
         int i=0;
         while((str = bReader.readLine()) != null)
         {
            
             veri[i] = str;
             i++;
         }
         dStream.close();
         
         }
         
         catch(Exception e)
         {
             System.out.println("hata" + e.getMessage());
         }
       
       
        //sınıflar ve cagırdıgımız metotları
         Kelime kelime = new Kelime();
         kelime.kelimeHesapla(ss, veri);
         
         SesliHarf sesli = new SesliHarf();
         sesli.sesliHarfHesapla(ss, veri);
         
         WebBul webb = new WebBul();
         webb.webSitesiHesapla(ss, veri);
         
         Mail mail = new Mail();
         mail.mailHesapla(ss, veri);
         
         Cumle cumle = new Cumle();
         cumle.cumleHesapla(ss, veri);
       
         
        
    }
    
//burada tanımladığım metot dosyayı acıp okuyup satır sayısını bulup dosyayı kapatıyor ve 
//main de kullanacağım islemler için satir sayisi (ss) değişkenini kullanmama yarıyor
          
    public static int satirSayisi()
   {
       int sayac = 0;
       
       try{
         FileInputStream fStream = new FileInputStream("icerik.txt");
         DataInputStream dStream = new DataInputStream(fStream);
         BufferedReader bReader = new BufferedReader(new InputStreamReader(dStream));
         while(bReader.readLine() != null)
         {
             sayac++;
             
         }
         
         dStream.close();
         }
       
       catch(Exception e)
         {
             System.out.println("hata" + e.getMessage());
         }
         return sayac;
   }
    
    
}
