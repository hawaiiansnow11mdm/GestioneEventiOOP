/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gestioneEventi;

/**
 *
 * @author Faima
 */
public class ConcertoGPT extends EventoGPT {
    
    private String artistaPrincipale;
    private int durataConcerto;
    
    public ConcertoGPT(String id, String titolo, String data, int posti, String artista, int durata){
        super(id, titolo,data, posti);
        
        this.artistaPrincipale= artista;
        this.durataConcerto= durata;
    }
    
    @Override
    public String descrizioneEventoGPT(){
        
        return "Concerto[id concerto : " +idEvento + "titolo : " + titoloEvento + "data : " +dataEvento + "posti : " + postiDisponibili + "artista principale " +artistaPrincipale + 
                "durata ]" + durataConcerto + "]";
    }

    public String getArtistaPrincipale() {
        return artistaPrincipale;
    }

    public void setArtistaPrincipale(String artistaPrincipale) {
        this.artistaPrincipale = artistaPrincipale;
    }

    public int getDurataConcerto() {
        return durataConcerto;
    }

    public void setDurataConcerto(int durataConcerto) {
        this.durataConcerto = durataConcerto;
    }
    
    
    @Override
    public boolean equals (Object o){
        if(o == null || (!(o instanceof ConcertoGPT))){
            return false;
        }
        ConcertoGPT oConcertoGPT = (ConcertoGPT) o;
        return this.idEvento.equals(oConcertoGPT.idEvento);
    }
}
