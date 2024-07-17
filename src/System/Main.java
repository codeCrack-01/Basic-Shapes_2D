package System;

import javax.swing.*;

public class Main {

    public Main () {

        JFrame window = new JFrame("Primitive Shapes");
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        window.setResizable(false);
        window.add(new Anim_Panel());

        window.pack();

        window.setLocationRelativeTo(null);
        window.setVisible(true);
    }

    public static void main(String[] args) {
        new Main();
    }

}