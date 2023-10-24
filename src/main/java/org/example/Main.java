package org.example;

import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        try {
            Robot robot = new Robot();
            Rectangle screenRectangle = new Rectangle(0, 0, 500, 500);

            BufferedImage screenshot = robot.createScreenCapture(screenRectangle);
            File outputFile = new File("screenshot.png");
            ImageIO.write(screenshot, "png", outputFile);
            System.out.println("Screenshot is saved in: " + outputFile.getName());
        } catch (AWTException | IOException ex) {
            ex.printStackTrace();
        }
    }
}