package e3_luizahackenhaarnaziazeno.e3;

import java.util.List;
import org.springframework.http.ResponseEntity;

public interface IEventoRepository {
    List<Evento> getEvento();
    boolean cadastro(Evento evento);
    boolean validaevento(long codigo);
    List<Evento> getListaEvento();
    boolean cadevento(Evento evento);
}

