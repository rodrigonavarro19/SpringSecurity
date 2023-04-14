package cl.rodrigo.springsecurity.springsecurity.repository;

import cl.rodrigo.springsecurity.springsecurity.model.Contacto;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ContactoRepository extends JpaRepository<Contacto, Integer> {
}
