class izdelek{
    String naziv;
    double cena;
    String valuta;
    Kategorija kategorija;

    Izdelek(String vhodNaziv, double vhodCena, Kategorija vhodKategorija){
        naziv = vhodNaziv;
        cena = vhodCena;
        kategorija = vhodKategorija;
    }
    
    void vKosarico(double popustOdstotek){
        double koncnaCena = cena - (cena*popustOdstotek);
    }
}