
package gestioneEventi;

public abstract class EventoGPT {
    
    protected String idEvento;
    protected String titoloEvento;
    protected String dataEvento;
    protected int postiDisponibili;
    protected String statoEvento;
    
    
    public EventoGPT (String id, String titolo, String data, int postiDisponibili){
        
        this.idEvento= id;
        this.titoloEvento = titolo;
        this.dataEvento= data;
        this.postiDisponibili= postiDisponibili;
        this.statoEvento= "Disponibile";
    }

    public String getIdEvento() {
        return idEvento;
    }

    public String getTitoloEvento() {
        return titoloEvento;
    }

    public String getDataEvento() {
        return dataEvento;
    }

    public int getPostiDisponibili() {
        return postiDisponibili;
    }

    public String getStatoEvento() {
        return statoEvento;
    }

    public void setIdEvento(String idEvento) {
        this.idEvento = idEvento;
    }

    public void setTitoloEvento(String titoloEvento) {
        this.titoloEvento = titoloEvento;
    }

    public void setDataEvento(String dataEvento) {
        this.dataEvento = dataEvento;
    }

    public void setPostiDisponibili(int postiDisponibili) {
        this.postiDisponibili = postiDisponibili;
    }

    public void setStatoEvento(String statoEvento) {
        this.statoEvento = statoEvento;
    }
    
    
    public abstract String descrizioneEventoGPT();
}
