/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pboulang_10116584_latihan32_daftarfilm;

/**
 *
 * @author
 * NIM  : 10116584
 * NAMA : Muhammad Syahrun Dalu
 */
public class film {
    public String filmName, filmGenre;
    public double filmRating;
    public int filmDuration;
            
    public void nowPlaying (String filmName, String filmGenre, double filmRating, int filmDuration ){
        System.out.println("Judul Film\t: "+filmName);
        System.out.println("Genre Film\t:"+filmGenre);
        System.out.println("Rating Film\t:"+filmGenre);
        System.out.println("Duration Film\t:"+filmDuration);
        System.out.println("");
   }
}