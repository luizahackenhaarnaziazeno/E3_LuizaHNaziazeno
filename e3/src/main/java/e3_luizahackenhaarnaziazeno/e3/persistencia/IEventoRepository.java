package e3_luizahackenhaarnaziazeno.e3.persistencia;

import java.util.List;

public interface IEventoRepository {
    List<Evento> getEventos();
    Evento getCodigo(long codigo);
    boolean cadastro(Evento evento);

}

