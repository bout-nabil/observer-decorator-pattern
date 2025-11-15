package nbo.obs;

import java.awt.*;
import java.awt.event.ActionListener;

public class TestMain2 {
    public static void main(String[] args) {
        Button button = new Button("Click Me");
        button.addActionListener((e) -> {
            System.out.println("Button was clicked!");
        });
    }
}
