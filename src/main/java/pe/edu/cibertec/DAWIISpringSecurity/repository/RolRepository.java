package pe.edu.cibertec.DAWIISpringSecurity.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pe.edu.cibertec.DAWIISpringSecurity.model.Rol;

@Repository
public interface RolRepository extends JpaRepository<Rol, Integer> {

}