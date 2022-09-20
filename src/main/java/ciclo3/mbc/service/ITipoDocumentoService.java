package ciclo3.mbc.service;

import ciclo3.mbc.entities.TipoDocumento;

import java.util.List;

public interface ITipoDocumentoService {

    public TipoDocumento findById(int id);

    public List<TipoDocumento> findAll();

    public TipoDocumento createTipoDocumento(TipoDocumento documento);

    public TipoDocumento updateTipoDocumento(int id, TipoDocumento documento);

    public void deleteTipoDocumento(int id);

}
