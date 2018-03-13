package expression;

public class Addition implements Expression {

    private double component1;
    private double component2;

    public Addition(String component1, String component2) {
        this.component1 = Double.parseDouble(component1);
        this.component2 = Double.parseDouble(component2);
    }

    public Double execute() {
        return component1 + component2;
    }
}
