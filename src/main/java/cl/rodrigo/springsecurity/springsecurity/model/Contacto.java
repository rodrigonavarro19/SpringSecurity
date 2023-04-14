package cl.rodrigo.springsecurity.springsecurity.model;

import lombok.Data;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Data
public class Contacto {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idcontacto")
    private Integer id;

    private String nombre;

    @Column(name="fechanac")
    private LocalDate fechaNacimiento;

    private String celular;
    private String email;


}
