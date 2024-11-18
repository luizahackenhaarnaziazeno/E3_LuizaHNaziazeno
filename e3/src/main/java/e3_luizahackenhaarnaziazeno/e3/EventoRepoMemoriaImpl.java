package e3_luizahackenhaarnaziazeno.e3;

import java.util.*;
import org.springframework.http.*;
import org.springframework.stereotype.Repository;

@Repository
public class EventoRepoMemoriaImpl implements IEventoRepository {
    private List<Evento> eventos;

    public EventoRepoMemoriaImpl(){
       eventos = new ArrayList<>();

        eventos.add(new Evento(1, "Terremoto de magnitude 7.8", "2024-11-15 14:30:00", -9.1900, -77.0353));
        eventos.add(new Evento(2, "Ciclone Tropical", "2024-10-22 06:00:00", -23.5505, 46.6333));
        eventos.add(new Evento(3,"Enchente devido a fortes chuvas", "2024-11-10 22:00:00", -20.3120, -40.3125));
        eventos.add(new Evento (4,"Deslizamento de Terra","2024-10-18 16:45:00", -22.9157, -43.1896));
        eventos.add(new Evento (5, "Furacão com ventos de 250 km/h", "2024-09-28 08:15:00", 18.2570, -77.0164));
    }

    @Override
    public List<Evento>getEvento(){  
        return eventos; 
    }

    @Override
    public boolean cadastro(Evento evento) {
        return eventos.add(evento);
    }
   
    @Override
    public boolean validaevento(long codigo) {
        for (Evento evento : eventos) {
            if (evento.getCodigo() == codigo) {
                return true;
            }
        }
        return false;
    }

    @Override
    public List<Evento> getListaEvento() {
        return getEvento();
    }

    @Override
    public boolean cadevento(Evento evento) {
        return eventos.add(evento);
    }
    }
