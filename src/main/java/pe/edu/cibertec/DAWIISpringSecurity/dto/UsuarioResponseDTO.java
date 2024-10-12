package pe.edu.cibertec.DAWIISpringSecurity.dto;

import lombok.Builder;
import lombok.Data;

@Builder
@Data
public class UsuarioResponseDTO {
    private Integer idusuario;
    private String codigo;
    private String token;
}
