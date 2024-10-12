package pe.edu.cibertec.DAWIISpringSecurity.model;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "paciente")
public class Paciente {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String nombre;

    @Column(nullable = false)
    private String apellido;

    @Column(unique = true, nullable = false, length = 8)
    private String dni;

    private String direccion;
    private String telefono;
    private String correo;
    private java.util.Date fechaNacimiento;

    @ManyToOne
    @JoinColumn(name = "usuario_id")
    private Usuario usuario;
}
