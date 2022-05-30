package challenge03;

public abstract class Employee {
    private String name;
    private long cpf;
    protected final Double minimumWage = 1000.0;

    public Employee(String name, long cpf) {
        this.name = name;
        this.cpf = cpf;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public long getCpf() {
        return cpf;
    }

    public void setCpf(long cpf) {
        this.cpf = cpf;
    }

    public Double getMinimumWage() {
        return minimumWage;
    }

    public abstract double salary();
}
