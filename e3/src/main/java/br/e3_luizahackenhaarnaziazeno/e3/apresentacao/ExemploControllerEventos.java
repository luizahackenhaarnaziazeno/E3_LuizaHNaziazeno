
package br.e3_luizahackenhaarnaziazeno.e3.apresentacao;

import br.e3_luizahackenhaarnaziazeno.e3.persistencia.*;
import java.util.*;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;



@RestController
@RequestMapping("/acmerescue")
public class ExemploControllerEventos {
    private IEventoRepository eventoRepository;

    @Autowired
    public ExemploControllerEventos(IEventoRepository eventoRepository) {
        this.eventoRepository = eventoRepository;
    }

    @GetMapping("/evento")
    public String getMensagemInicial() {
        return "Iniciando eventos acmerescue!";
    }

    
    @GetMapping("/cadastro/listaeventos")
    public List<Evento> getEventos() {
        return eventoRepository.getEventos();
    }
    
  //como ver no postman /acmerescue/validaevento?codigo=1
    @PostMapping("/validaevento")
    public boolean validaevento(long codigo) {
        for (Evento evento : eventoRepository.getEventos()) {
            if (evento.getCodigo() == codigo) {
                return true;
            }
        }
        return false;
    }

    

}