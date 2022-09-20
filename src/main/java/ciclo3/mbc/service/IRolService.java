package ciclo3.mbc.service;

import ciclo3.mbc.entities.Rol;

import java.util.List;

public interface IRolService {

    public Rol findById(int id);

    public List<Rol> findAll();

    public Rol createRol(Rol rol);

    public Rol updateRol(int id, Rol rol);

    public void deleteRol(int id);


}
