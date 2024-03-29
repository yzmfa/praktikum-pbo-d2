
/********************************************************************************/
/* File      : Titik.java                                                       */
/* Deskripsi : Kelas Titik yang merupakan sebuah titik dengan absis dan ordinat */
/* NIM/Nama  : 24060122120021/Yusuf Zaenul Mustofa                              */
/* Tanggal   : 21 Februari 2024                                                 */
/********************************************************************************/

public class Titik{
    /*Atribut*/
    double absis;
    double ordinat;
    static int counterTitik; 

    /*Konstruktor*/
    Titik(double absis, double ordinat){
        counterTitik++;
        this.absis = absis;
        this.ordinat = ordinat;
    }
    Titik(){
        this(0,0);
    }

    /*Mutator*/ 
    void setAbsis(double a){
        absis = a;
    }
    void setOrdinat(double o){
        ordinat = o;
    }

    /*Selektor*/
    double getAbsis(){
        return absis;
    }
    double getOrdinat(){
        return ordinat;
    }
    static int getCounterTitik(){
        return counterTitik;
    }
}