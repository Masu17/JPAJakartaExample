package com.mycompany.ejemplopersistencia.services;

import com.mycompany.ejemplopersistencia.MainApp;
import com.mycompany.ejemplopersistencia.views.MainAppDialog;
import com.mycompany.ejemplopersistencia.views.MainJFrame;
import com.mycompany.ejemplopersistencia.views.RegistroRapido;
import lombok.Getter;

import javax.swing.*;
import java.util.jar.JarEntry;

public class ShowWindows {

    @Getter
    private static JFrame mainframe;
    @Getter
    private static RegistroRapido registerWindow;
    @Getter
    private static MainAppDialog mainApp;

    public static void initMainFrame(){
        mainframe = new MainJFrame();
        mainframe.setSize(477, 717);
        mainframe.setLocationRelativeTo(null);
        mainframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        mainframe.setVisible(true);
    }

    public static void loadRegisterWindow(){
        registerWindow = new RegistroRapido(mainframe, true);
        registerWindow.setLocationRelativeTo(null);
        registerWindow.setVisible(true);
    }

    public static void loadMainApp(String tittle){
        mainApp = new MainAppDialog(mainframe, true);
        mainApp.setSize(1045, 600);
        mainApp.setTitle("Iniciado sesion como: " + tittle);
        mainframe.setVisible(false);
        mainApp.setLocationRelativeTo(null);
        mainApp.setVisible(true);
    }


}
