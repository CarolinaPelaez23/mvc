package ciclo3.mbc.repository;

import ciclo3.mbc.entities.Usuario;
import org.springframework.data.repository.CrudRepository;

public interface IUsuarioRepository extends CrudRepository<Usuario, Long> {
}
