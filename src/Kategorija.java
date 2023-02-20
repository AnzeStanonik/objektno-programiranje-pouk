class Kategorija{
    String naziv;

    Kategorija[] podkategorija;

    Kategorija(String vhodNaziv, Kategorija vhodpodkategorija){
        naziv = vhodNaziv;
        podkategorija = vhodPodkategorija;
    }

    String nazivKategorije(){
        return naziv;
    }
}