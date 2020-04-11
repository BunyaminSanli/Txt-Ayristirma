/**
*
* @author Bünyamin Şanlı, Furkan Bingül 
* bunyamin.sanli@ogr.sakarya.edu.tr , muhammet.bingul@ogr.sakarya.edu.tr
* @since 08.03.2020
* <p>
* web sayfasi sayma işlemi yapılır
* </p>
*/
public class WebBul {
    
     public int webSitesiHesapla(int ss, String[] veri)
    {
        
        int webSayaci = 0;  // her bulduğumuz web linki için arttıracağımız sayacı tanımlarız
        String kelimeDizi[];    // veri dizisinden çektiğimiz cümleleri kelime dizisine atamak için için tanımladığım dizi
        String [] sorguDizisi = {".com", ".edu", ".net", ".org"};   
      
        for (int i=0; i < ss; i++)
            {
               kelimeDizi = veri[i].split(" ");
               int len=kelimeDizi.length;
               
              
                for(int a = 0; a < len; a++)
                {
                    for(int j = 0; j < 4; j++)
                    {   // sorgudizisi elemanları varsa ve @ yoksa web sayaci artar
                        if(kelimeDizi[a].contains(sorguDizisi[j]) && !(kelimeDizi[a].contains("@")))
                            {
                                webSayaci++;    
                            } 
                    }
                }
            }
       
        
        
       
        
        System.out.println("web sitesi sayisi: " + webSayaci);
        return webSayaci;
    }
    
}
