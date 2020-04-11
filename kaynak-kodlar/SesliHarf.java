/**
*
* @author Bünyamin Şanlı, Furkan Bingül 
* bunyamin.sanli@ogr.sakarya.edu.tr , muhammet.bingul@ogr.sakarya.edu.tr
* @since 08.03.2020
* <p>
* sesli harf sayma işlemi yapılan sınıf
* </p>
*/
public class SesliHarf {
    
    public int sesliHarfHesapla(int ss, String[] veri)
    {
        //forlar sayesinde tek tek her satırı daha sonra içindeki her karakteri gezerek sesli harf gordukce sesli sayaci artırıyor
        int sesliSayaci = 0;
        for(int j = 0; j < ss; j++)
        {
            for(int i = 0; i < veri[j].length(); i++)
            {
                 char sesli = veri[j].charAt(i);
                 if(sesli == 'a' || sesli == 'e' || sesli == 'ı' || sesli == 'i' 
                    || sesli == 'o' || sesli == 'ö' || sesli == 'u' || sesli == 'ü' 
                    || sesli == 'A' || sesli == 'E' || sesli == 'I' || sesli == 'İ'
                    || sesli == 'O' || sesli == 'Ö' || sesli == 'U' || sesli == 'Ü')
                     
                    {
                         sesliSayaci ++;
                    }
            }
        }
        
        System.out.println("Sesli harf sayisi = " + (sesliSayaci));
        return sesliSayaci;
    }
    
}
