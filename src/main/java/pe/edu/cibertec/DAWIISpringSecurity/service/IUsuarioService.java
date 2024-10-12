package pe.edu.cibertec.DAWIISpringSecurity.service;

import pe.edu.cibertec.DAWIISpringSecurity.model.Usuario;

public interface IUsuarioService {

    Usuario obtenerUsuarioXcodigo(String Codigo);
}