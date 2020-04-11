/**
*
* @author Bünyamin Şanlı, Furkan Bingül 
* bunyamin.sanli@ogr.sakarya.edu.tr , muhammet.bingul@ogr.sakarya.edu.tr
* @since 08.03.2020
* <p>
* kelime sayma işlemi yapılan sınıf
* </p>
*/
public class Kelime {
   
    public int kelimeHesapla(int ss, String[] veri)
    {
        int kelimeSayaci = 0;
        for(int j = 0; j < ss; j++)
        {
            for(int i = 0; i < veri[j].length(); i++)
            {
                if(veri[j].charAt(i) == ' ') //forlar sayesinde tek tek her satırı daha sonra içindeki her karakteri gezerek bosluk gordukce kelime sayaci artırıyor
                {
                  kelimeSayaci ++;
                }
            }
        }
        
        
        System.out.println("kelime sayisi = " + (kelimeSayaci + ss));
        return kelimeSayaci;
    }
    
}
