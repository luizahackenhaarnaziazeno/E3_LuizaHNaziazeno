package e3_luizahackenhaarnaziazeno.e3;


import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Primary;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Repository;
import org.springframework.jdbc.core.JdbcTemplate;

@Repository
@Primary
public class EventoRepoJdbcImpl implements IEventoRepository {
    private JdbcTemplate jdbcTemplate;

    @Autowired
    public EventoRepoJdbcImpl(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    @Override
    public List<Evento> findAll() {
        return getEvento();
    }

    @Override
    public List<Evento> getEvento() {
        List<Evento> resp = this.jdbcTemplate.query("SELECT * FROM evento",
                (rs, rowNum) -> new Evento(rs.getLong("codigo"),
                rs.getString("descricao"),
                rs.getString("data"),
                rs.getDouble("latitude"),
                rs.getDouble("longitude")));
        return resp;
    }

    @Override
    public boolean cadastro(Evento evento) {
        this.jdbcTemplate.update(
                "INSERT INTO evento(codigo, descricao, data, latitude, longitude) VALUES (?,?,?,?)",
               evento.getCodigo(), evento.getDescricao(), evento.getData(), evento.getLatitude(), evento.getLongitude());
        return true;
    }

    @Override
    public boolean validaevento(long codigo) {
        List<Evento> resp = this.jdbcTemplate.query(
                "SELECT * FROM evento WHERE codigo = ?",
                ps -> {
                    ps.setLong(1, codigo);
                },
                (rs, rowNum) -> new Evento(rs.getLong("codigo"),
                rs.getString("descricao"),
                rs.getString("data"),
                rs.getDouble("latitude"),
                rs.getDouble("longitude")));
        return resp.size() > 0;
    }

    @Override
    public List<Evento> getListaEvento() {
        List<Evento> eventos = getEvento();
        List<Evento> listaEventos = new ArrayList<>();
        for (Evento evento : eventos) {
            listaEventos.add(evento);  
        }
        return listaEventos;
    }
     

    @Override
    public boolean cadevento(Evento evento) {
        this.jdbcTemplate.update(
                "INSERT INTO evento(codigo, descricao, data, latitude, longitude) VALUES (?,?,?,?)",
                evento.getCodigo(), evento.getDescricao(), evento.getData(), evento.getLatitude(), evento.getLongitude());
        return true;
    }

    }

