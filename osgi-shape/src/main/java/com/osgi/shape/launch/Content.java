package com.osgi.shape.launch;

import com.osgi.shape.comp.*;
import javafx.scene.layout.*;

public class Content extends Pane {

    public Content() {

        setStyle("-fx-background-color: lightcyan");
    }

    public void addComponent(Component component) {

        getChildren().add(component.getComponent());
    }
}
