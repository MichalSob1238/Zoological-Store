import controller.DataGeneratorController;
import controller.DatabaseController;
import model.Model;

import java.awt.EventQueue;
import java.io.IOException;

public class SklepZoologiczny {
    public static void main(String[] args) {

        EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                Model model = new Model();
                try {
                    //DatabaseController.initialize();
                    DataGeneratorController gen = new DataGeneratorController();
                    //gen.generateDaneKlienta(100);
                    //gen.generateStanowisko();
                    //gen.generatePracownik(40);
                    //gen.generateTransport(500);
                    //gen.generateTransakcja(1000);
                    gen.generateHurtownia(17);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });

    }
}
