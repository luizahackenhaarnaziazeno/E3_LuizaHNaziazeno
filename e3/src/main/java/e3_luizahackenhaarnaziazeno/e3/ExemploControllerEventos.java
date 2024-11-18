
package e3_luizahackenhaarnaziazeno.e3;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.*;
import org.springframework.web.bind.annotation.*;

import java.util.*;
import java.util.stream.Collectors;



@RestController
@RequestMapping("/acmerescue")
public class ExemploControllerEventos {
    private IEventoRepository eventoRepository;

    @Autowired
    public ExemploControllerEventos(IEventoRepository eventoRepository) {
        this.eventoRepository = eventoRepository;
    }

    @GetMapping("/")
    public String getMensagemInicial() {
        return "Iniciando eventos acmerescue!";
    }

    //nao ta ok todos os metodos abaixo
    @GetMapping("/evento")
    public ResponseEntity<List<Evento>> getEvento() {
        try {
            List<Evento> eventos = eventoRepository.getEvento();
            return new ResponseEntity<>(eventos, HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @PostMapping("/cadastro")
    public boolean cadastro(@RequestBody final Evento eventos) {
        return eventoRepository.cadastro(eventos);
    }

    @PostMapping("/validaevento")
    public boolean validaevento(long codigo) {
        for (Evento evento : eventoRepository.getEvento()) {
            if (evento.getCodigo() == codigo) {
                return true;
            }
        }
        return false;
    }

    
     @GetMapping("/acmerescue/cadastro/listaeventos")
     public List<Evento> getlistaeventos() {
     return eventoRepository.getListaEvento().stream()
                  .map(eventoString -> new Evento(0, "","", 0, 0))
                  .collect(Collectors.toList());
     }

     @PostMapping("/acmerescue/cadastro/cadevento")
     public boolean cadevento(@RequestBody final Evento evento) {
        return this.eventoRepository.cadastro(evento);
    }
    
       

}