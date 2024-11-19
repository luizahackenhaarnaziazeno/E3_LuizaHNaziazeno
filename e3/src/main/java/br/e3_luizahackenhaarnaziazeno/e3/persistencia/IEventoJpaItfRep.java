package br.e3_luizahackenhaarnaziazeno.e3.persistencia;

import java.util.List;
import org.springframework.data.repository.CrudRepository;

public interface IEventoJpaItfRep extends CrudRepository<Evento, Long> {
    List<Evento> findAll();
}
