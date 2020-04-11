/**
*
* @author Bünyamin Şanlı, Furkan Bingül 
* bunyamin.sanli@ogr.sakarya.edu.tr , muhammet.bingul@ogr.sakarya.edu.tr
* @since 08.03.2020
* <p>
* mail sayma işlemi yapılır
* </p>
*/
public class Mail {
     public int mailHesapla(int ss, String[] veri)
    {
        
        int mailSayaci = 0;
        String kelimeDizi[];
        //sorgulayacağım stringleri diziye koydum böylece bir for ile hepsini tek tek sorgulayabileceğim
        String [] sorguDizisi = {".com", ".edu", ".net", ".org"};
      
        for(int i=0; i < ss; i++)
           {
               kelimeDizi = veri[i].split(" ");
               int len=kelimeDizi.length;
              
                for(int a = 0; a < len; a++)
                  {
                    for(int j = 0; j < 4; j++)
                       {    //sorgudizisi elemanları varsa ve @ varsa mail sayaci artar
                            if(kelimeDizi[a].contains(sorguDizisi[j]) && (kelimeDizi[a].contains("@")))
                              {
                                mailSayaci++;    
                              } 
                       }
                 }
           }
       
        
        
       
        
        System.out.println("Mail adresi sayisi: " + mailSayaci);
        return mailSayaci;
    }
}
