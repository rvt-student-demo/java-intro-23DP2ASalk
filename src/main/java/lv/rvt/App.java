package lv.rvt;
import java.util.*;
import java.io.*;

public class App {
    public static void main(String[] args) throws Exception {
        Timer timer = new Timer(0, 0);
        while (true) {
            System.out.println(timer);
            timer.advance();
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
