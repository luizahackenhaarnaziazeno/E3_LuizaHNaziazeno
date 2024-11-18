package e3_luizahackenhaarnaziazeno.e3.persistencia;

import java.util.LinkedList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Primary;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Repository;
import org.springframework.web.server.ResponseStatusException;


@Repository
@Primary
public class EventoRepoJpaImpl implements IEventoRepository {
    private IEventoJpaItfRep repository;

    @Autowired
    public void EventoRepoJpaIpl(IEventoJpaItfRep repository) {
        this.repository = repository;
       
    }

    @Override
    public List<Evento> getEventos() {
        List<Evento> eventos = repository.findAll();
        if (eventos.size() == 0) {
            return new LinkedList<Evento>();
        } else {
            return eventos.stream()
                         .toList();
        }
    }

    @Override
    public Evento getCodigo(long codigo) {
        return repository.findById(codigo).orElse(null);
    }

  @Override
public boolean cadastro(Evento evento) {
    try {
        repository.save(evento);  // Tenta salvar o evento no banco de dados
        return true;
    } catch (Exception e) {
        // Em caso de erro, lança uma exceção genérica
        throw new ResponseStatusException(HttpStatus.BAD_REQUEST, "Erro ao cadastrar evento", e);
    }
}


}
