package com.osgi.shape.launch;

import javafx.scene.control.*;
import javafx.scene.layout.*;
import javafx.stage.*;
import org.apache.felix.framework.*;

import java.io.*;

public class WorkSpace extends BorderPane {

    private Content content;

    public WorkSpace(Stage stage) {

        MenuBar menuBar = new MenuBar();

        Menu file = new Menu("File");

        MenuItem loadExt = new MenuItem("Load extension");
        loadExt.setOnAction(event -> {
            FileChooser fileChooser = new FileChooser();
            fileChooser.setTitle("Open Bundle ");
            fileChooser.getExtensionFilters().addAll(
                    new FileChooser.ExtensionFilter("jar", "*.jar"));
            File selectedFile = fileChooser.showOpenDialog(stage);

            System.out.println("selectedFile = " + selectedFile);
        });

        file.getItems().add(loadExt);
        menuBar.getMenus().add(file);
        menuBar.setUseSystemMenuBar(true);

        setTop(menuBar);

        content = new Content();
        setCenter(content);
    }

    public Content getContent() {

        return content;
    }
}
