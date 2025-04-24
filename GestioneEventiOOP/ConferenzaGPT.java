
package gestioneEventi;

public class ConferenzaGPT extends EventoGPT{
    
    private String relatorePrincipale;
    private String argomentoTrattato;
    
    
    public ConferenzaGPT (String id, String titolo, String data, int posti, String relatore, String argomento){
        
        super(id, titolo, data, posti);
        
        this.relatorePrincipale=relatore;
        this.argomentoTrattato= argomento;
        
    }
    
    @Override
    public String descrizioneEventoGPT(){
        
        return "Conferenza [id Conferenza " +idEvento + "titolo : " + titoloEvento + "data : " +dataEvento + "posti : " + postiDisponibili + "relatore " 
                +relatorePrincipale + " argomento" + argomentoTrattato+ "]"; 
    }

    public String getRelatorePrincipale() {
        return relatorePrincipale;
    }

    public void setRelatorePrincipale(String relatorePrincipale) {
        this.relatorePrincipale = relatorePrincipale;
    }

    public String getArgomentoTrattato() {
        return argomentoTrattato;
    }

    public void setArgomentoTrattato(String argomentoTrattato) {
        this.argomentoTrattato = argomentoTrattato;
    }
    
    @Override
    public boolean equals (Object o) {
        if (o == null || (!(o instanceof ConferenzaGPT))){
            return false;
        }
        ConferenzaGPT oConferenzaGPT = (ConferenzaGPT) o;
        
        return this.idEvento.equals(oConferenzaGPT.idEvento);
    }
}
