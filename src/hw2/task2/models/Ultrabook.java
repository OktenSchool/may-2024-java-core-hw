package hw2.task2.models;

public class Ultrabook extends Laptop{
    private int thickness;

    public Ultrabook() {
    }

    public Ultrabook(int CPUs, int RAM, double monitor, int weight, int thickness) {
        super(CPUs, RAM, monitor, weight);
        this.thickness = thickness;
    }

    public int getThickness() {
        return thickness;
    }

    public void setThickness(int thickness) {
        this.thickness = thickness;
    }

    @Override
    public String toString() {
        return "Ultrabook{" +
                "thickness=" + thickness +
                "} " + super.toString();
    }
}
