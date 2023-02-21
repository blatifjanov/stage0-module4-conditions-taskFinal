package school.mjc.stage0.conditions.finalTask;

public class CoordinatePane {
    public void printQuadrant(int x, int y) {
        System.out.println(x > 0 && y > 0 ? "first" : y > 0 && x < 0 ? "second" : x < 0 && y < 0 ? "third" : x > 0 && y < 0 ? "fourth" : "zero");
    }
}
