package ie.tudublin;

import java.util.ArrayList;

import processing.core.PApplet;
import processing.data.Table;
import processing.data.TableRow;

public class StarMap extends PApplet {

    ArrayList<Star> stars = new ArrayList<Star>();

    public void loadData() {
        Table table = loadTable("HabHYG15ly.csv", "header");

        for (TableRow row : table.rows()) {
            Star r = new Star(row);
            stars.add(r);
        }
    }

    public void printStars() {
        for (Star s : stars) {
            println(s);
        }
    }

    public void setup() {
        loadData();
        printStars();
    }
}
