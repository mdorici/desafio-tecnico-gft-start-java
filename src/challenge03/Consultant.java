package challenge03;

public class Consultant extends Employee {
    private double hourValue;
    private long workedHours;

    public Consultant(String name, long cpf, double hourValue, long workedHours) {
        super(name, cpf);
        this.hourValue = hourValue;
        this.workedHours = workedHours;
    }

    @Override
    public double salary() {
        return hourValue * workedHours;
    }

    public double getHourValue() {
        return hourValue;
    }

    public void setHourValue(double hourValue) {
        this.hourValue = hourValue;
    }

    public long getWorkedHours() {
        return workedHours;
    }

    public void setWorkedHours(long workedHours) {
        this.workedHours = workedHours;
    }
}
