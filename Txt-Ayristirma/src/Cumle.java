/**
*
* @author Bünyamin Şanlı, Furkan Bingül 
* bunyamin.sanli@ogr.sakarya.edu.tr , muhammet.bingul@ogr.sakarya.edu.tr
* @since 08.03.2020
* <p>
* cumle sayma işlemi yapılır
* </p>
*/


public class Cumle {
    
    public int cumleHesapla(int ss, String[] veri)
    {
     int cumleSayaci = 0;  // her bulduğumuz web linki için arttıracağımız sayacı tanımlarız
        String kelimeDizi[];    // veri dizisinden çektiğimiz cümleleri kelime dizisine atamak için için tanımladığım dizi
     
      
        for (int i=0; i < ss; i++)
            {
               kelimeDizi = veri[i].split(" ");
               int len = kelimeDizi.length;
              
                
                for(int a = 0; a < len; a++)
                {
                   if(kelimeDizi[a].isEmpty())  //birden fazla boşluk varsa prog patlamaması için continue komutu kullanırız
                   {
                     continue;
                   }
                   
                   int ku = kelimeDizi[a].length();    //kelime uzunluğunu tutacak değişkenimiz
                   
                   char bosluk = kelimeDizi[a].charAt(ku-1);    //ku değişkeninin 1 eksiğine yani kelimenin son karakterine bakar
                   if(bosluk == '.')
                   {
                       cumleSayaci++;
                   }
                    
                    
                }
            }
       
        
        
       
        
        System.out.println("cumle sayisi: " + cumleSayaci);
        return cumleSayaci;
    }
}
