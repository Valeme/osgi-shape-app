package com.osgi.shape.launch;

import javafx.application.*;
import javafx.scene.*;
import javafx.stage.*;

public class Main extends Application {

    @Override
    public void start(Stage stage) throws Exception {

        stage.setScene(new Scene(new WorkSpace(stage)));
        stage.setMaximized(true);
        stage.show();
    }
}
