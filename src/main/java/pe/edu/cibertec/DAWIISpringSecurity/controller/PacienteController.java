package pe.edu.cibertec.DAWIISpringSecurity.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;
import pe.edu.cibertec.DAWIISpringSecurity.model.Paciente;
import pe.edu.cibertec.DAWIISpringSecurity.repository.PacienteRepository;

import java.util.NoSuchElementException;

@RestController
@RequestMapping("/api/paciente")
public class PacienteController {

    @Autowired
    private PacienteRepository pacienteRepository;

    @PutMapping("/{idPaciente}")
    @PreAuthorize("hasAnyAuthority('Gestor', 'Coordinador')")
    public ResponseEntity<Paciente> actualizarPaciente(@PathVariable int idPaciente, @RequestBody Paciente paciente) {
        Paciente pacienteExistente = pacienteRepository.findById((long) idPaciente)
                .orElseThrow(() -> new NoSuchElementException("Paciente no encontrado con id: " + idPaciente));

        pacienteExistente.setNombre(paciente.getNombre());
        pacienteExistente.setApellido(paciente.getApellido());
        pacienteExistente.setDni(paciente.getDni());

        Paciente pacienteActualizado = pacienteRepository.save(pacienteExistente);

        return ResponseEntity.ok(pacienteActualizado);
    }
}

