package ciclo3.mbc.service;

import ciclo3.mbc.entities.Usuario;
import ciclo3.mbc.repository.IUsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UsuarioService implements IUsuarioService{
    @Autowired
    private IUsuarioRepository usuarioRepository;
    @Override
    public Usuario findById(int id){
        Optional<Usuario> usuario = usuarioRepository.findById((long) id);
        return usuario.get();
    }

    @Override
    public List<Usuario> findAll(){
        List<Usuario> usuarios = (List<Usuario>) usuarioRepository.findAll();
        return usuarios;
    }

    @Override
    public Usuario createUsuario(Usuario usuario){
        Usuario newUsuario = usuarioRepository.save(usuario);
        return newUsuario;
    }

    @Override
    public Usuario updateUsuario(int id, Usuario usuario){
        Usuario newUsuario = usuarioRepository.save(usuario);
        return newUsuario;
    }

    @Override
    public void deleteUsuario(int id){
        usuarioRepository.deleteById((long) id);
    }
}
