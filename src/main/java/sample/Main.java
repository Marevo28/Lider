package sample;

import javafx.application.Application;
import javafx.application.HostServices;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import java.awt.*;
import java.io.File;
import java.io.IOException;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{


        Parent root = FXMLLoader.load(getClass().getResource("main/java/sample/sample.fxml"));
        primaryStage.setTitle("Lider-Express");
        primaryStage.setScene(new Scene(root, 1200, 900));
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }

    public final HostServices services = this.getHostServices();
    public void Perehod(String n) {
        services.showDocument(n);
    }
    public void Open_papka (String position, String zakazchik){
        File dir = new File(zakazchik);
        // если объект представляет каталог
        if(dir.isDirectory()) {
            // получаем все вложенные объекты в каталоге
            for (File item : dir.listFiles()) {
                String papka = item.getName();
                boolean isContain1 = papka.startsWith(position);
                if (isContain1) {
                    System.out.println(papka + "  \t folder");
                    try {
                        Desktop.getDesktop().open(new File(zakazchik + "/"+ item.getName()));
                    } catch (IOException e) {
                        System.out.println("Нет такой папки");
                        e.printStackTrace();
                    }
                    break;
                }
                else {
                    System.out.println("Нет ни чего");
                }
            }
        }
    }

}
