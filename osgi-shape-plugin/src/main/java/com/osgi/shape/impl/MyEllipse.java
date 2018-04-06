package com.osgi.shape.impl;

import com.osgi.shape.comp.*;
import javafx.scene.paint.*;
import javafx.scene.shape.*;

public class MyEllipse extends Ellipse implements Component {

    public MyEllipse() {
        super(300, 300, 60, 80);
        setFill(Color.RED);
    }

    @Override
    public Shape getComponent() {

        return this;
    }
}
