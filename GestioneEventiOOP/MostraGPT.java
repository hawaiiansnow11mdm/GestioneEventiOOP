/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gestioneEventi;

/**
 *
 * @author Faima
 */
public class MostraGPT extends EventoGPT {
    
    private String nomeArtista;
    private int numeroDiCopie;
    
    public MostraGPT(String id, String titolo, String data, int posti, String artista, int copie){
        super(id, titolo, data, posti);
        
        this.nomeArtista=artista;
        this.numeroDiCopie= copie;
        
    }
    
    @Override
    public String descrizioneEventoGPT(){
        return "Mostra[id mostra : " +idEvento + "titolo : " + titoloEvento + "data : " +dataEvento + "posti : " + postiDisponibili + "artista  " +nomeArtista + 
                "numero di copie ]" + numeroDiCopie + "]";
    }

    public String getNomeArtista() {
        return nomeArtista;
    }

    public void setNomeArtista(String nomeArtista) {
        this.nomeArtista = nomeArtista;
    }

    public int getNumeroDiCopie() {
        return numeroDiCopie;
    }

    public void setNumeroDiCopie(int numeroDiCopie) {
        this.numeroDiCopie = numeroDiCopie;
    }

    @Override
    public boolean equals(Object o){
        if(o == null || (!(o instanceof MostraGPT))){
            return false;
        }
        MostraGPT oMostraGPT = (MostraGPT) o;
        return this.idEvento.equals(oMostraGPT.idEvento);
    }
}
