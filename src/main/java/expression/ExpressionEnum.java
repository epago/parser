package expression;

public enum ExpressionEnum {

    ADDITION("+"),
    SUBSTRACTION("-");

    private String exp;

    ExpressionEnum(String exp) {
        this.exp = exp;
    }

    public static boolean containsValue(String value) {

        for (ExpressionEnum expressionEnum : ExpressionEnum.values()) {
            if (expressionEnum.getExp().equals(value))
                return true;
        }
        return false;

    }

    public String getExp() {
        return exp;
    }
}
