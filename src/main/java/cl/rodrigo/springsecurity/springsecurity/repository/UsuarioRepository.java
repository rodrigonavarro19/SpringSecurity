package cl.rodrigo.springsecurity.springsecurity.repository;

import cl.rodrigo.springsecurity.springsecurity.model.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UsuarioRepository extends JpaRepository<Usuario, Integer> {

    Optional<Usuario> findOneByEmail(String email);
}
