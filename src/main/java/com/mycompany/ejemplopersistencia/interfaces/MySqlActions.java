package com.mycompany.ejemplopersistencia.interfaces;

import com.mycompany.ejemplopersistencia.models.Usuario;

public interface MySqlActions {

    public void create(Object object);

    public void delete(String identificadorUsuario);

    public boolean findUser(String nombreUsuario, String contrasenaUsuario);



}
