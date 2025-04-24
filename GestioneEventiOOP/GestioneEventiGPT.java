package gestioneEventi;

import Astratte1.UtenteGPT;
import java.util.ArrayList;

public class GestioneEventiGPT {

    private ArrayList<EventoGPT> elencoEventi;
    private ArrayList<UtenteGPT> elencoUtenti;

    public GestioneEventiGPT() {

        elencoEventi = new ArrayList<EventoGPT>();
        elencoUtenti = new ArrayList<UtenteGPT>();

    }

    public boolean aggiungiEvento(EventoGPT evento) {
        for (EventoGPT event : elencoEventi) {
            if (event.equals(evento)) {
                return false;
            }
        }
        elencoEventi.add(evento);
        return true;
    }

    public boolean annullaEvento(String idEvento) {
        for (EventoGPT event : elencoEventi) {
            if (event.getIdEvento().equals(idEvento)) {
                event.setStatoEvento("Annullato");
                return true;
            }
        }
        return false;
    }

   public boolean prenotazioneEvento(String idEvento, int postiPrenotazione) {
        for (EventoGPT event : elencoEventi) {
            if (event.getIdEvento().equals(idEvento)) {
                if (event.getStatoEvento().equals("Annullato")) {
                    System.out.println("Errore: L'evento è annullato.");
                    return false;
                }
                if (event.getPostiDisponibili() >= postiPrenotazione) {
                    event.setPostiDisponibili(event.getPostiDisponibili() - postiPrenotazione);
                    System.out.println("Prenotazione effettuata " + event.descrizioneEventoGPT());
                    
                    if (event.getPostiDisponibili() == 0) {
                        event.setStatoEvento("Esaurito");
                    }
                    System.out.println("Posti rimanenti = " + event.getPostiDisponibili());
                    return true;
                } else {
                    System.out.println("Errore: Posti insufficienti per questo evento.");
                    return false;
                }
            }
        }
        System.out.println("Errore: Evento non trovato.");
        return false;
    }
    
    
   public ArrayList<EventoGPT> eventiPerTipo(String tipoEvento){
       ArrayList<EventoGPT> eventiPerTipo = new ArrayList<EventoGPT>();
       for(EventoGPT event : elencoEventi){
           if(event.descrizioneEventoGPT().contains(tipoEvento)){
               eventiPerTipo.add(event);
           }
       }
       return eventiPerTipo;
   }
   
     public ArrayList<EventoGPT> eventiPerData(String data) {
        ArrayList<EventoGPT> eventiPerData = new ArrayList<>();
        for (EventoGPT event : elencoEventi) {
            if (event.getDataEvento().equals(data)) {
                eventiPerData.add(event);
            }
        }
        return eventiPerData;
    }
}
