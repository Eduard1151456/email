package com.raven.component;

import com.raven.event.EventMenu;
import com.raven.swing.Button;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.SwingConstants;
import net.miginfocom.swing.MigLayout;

public class Menu extends javax.swing.JPanel {

    private EventMenu event;

    public Menu() {
        initComponents();
        setOpaque(false);
        setLayout(new MigLayout("wrap 2, inset 30", "[fill, 100]10[fill, 100]", "[]10[]"));
    }

    public void initMenu(EventMenu event) {
        this.event = event;
        addMenu(new ImageIcon(getClass().getResource("/com/raven/icon/1.png")), "Registro Pacientes", 0);     
        addMenu(new ImageIcon(getClass().getResource("/com/raven/icon/3.png")), "Registro Personal Salud", 2);
        addMenu(new ImageIcon(getClass().getResource("/com/raven/icon/4.png")), "Estadisticas", 3);
        addMenu(new ImageIcon(getClass().getResource("/com/raven/icon/5.png")), "Pruebas  Personal ", 4);
    Button salirButton = new Button();
    salirButton.setHorizontalTextPosition(SwingConstants.CENTER);
    salirButton.setVerticalTextPosition(SwingConstants.BOTTOM);
    salirButton.setText("Salir");
    salirButton.setIcon(new ImageIcon(getClass().getResource("/com/raven/icon/2.png")));
Continuación:
    salirButton.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent ae) {
            System.exit(0);
        }
    });
    add(salirButton);

    }

    private void addMenu(Icon icon, String name, int index) {
        Button menu = new Button();
        menu.setHorizontalTextPosition(SwingConstants.CENTER);
        menu.setVerticalTextPosition(SwingConstants.BOTTOM);
        menu.setText(name);
        menu.setIcon(icon);
        menu.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                event.selected(index);
            }
        });
        add(menu);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
}
