
package e3_luizahackenhaarnaziazeno.e3;

import org.springframework.jdbc.core.RowMapper;
import java.sql.ResultSet;
import java.sql.SQLException;
import e3_luizahackenhaarnaziazeno.e3.Evento;

public class EventoRowMapper implements RowMapper<Evento> {

   @Override
   public Evento mapRow(ResultSet rs, int rowNum) throws SQLException {
       return new Evento(
               rs.getLong("codigo"),
               rs.getString("descricao"),
               rs.getString("data"),
               rs.getDouble("latitude"),
               rs.getDouble("longitude")
       );
   }
}