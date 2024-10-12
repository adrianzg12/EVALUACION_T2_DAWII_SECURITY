package pe.edu.cibertec.DAWIISpringSecurity.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.Set;

@Setter
@Getter
@Entity
@Table(name = "rol")
public class Rol {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idrol;

    @Column(nullable = false, unique = true)
    private String nomrol;

    @ManyToMany(mappedBy = "roles")
    private Set<Usuario> usuarios;
}
