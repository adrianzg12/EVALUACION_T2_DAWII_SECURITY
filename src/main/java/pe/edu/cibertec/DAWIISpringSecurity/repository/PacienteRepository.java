package pe.edu.cibertec.DAWIISpringSecurity.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import pe.edu.cibertec.DAWIISpringSecurity.model.Paciente;

public interface PacienteRepository extends JpaRepository<Paciente, Long> {
    Paciente findbyId(int idPaciente);
}
