package expression;


import java.util.List;

public class ExpressionFactory {

    public static Expression getExpression(List<String> expression) {
        if (expression.size() != 3) {
            throw new LocalParserException("Invalid number of arguments.");
        }
        if (ExpressionEnum.ADDITION.getExp().equals(expression.get(2))) {
            return new Addition(expression.get(0), expression.get(1));
        } else if (ExpressionEnum.SUBSTRACTION.getExp().equals(expression.get(2))) {
            return new Substraction(expression.get(0), expression.get(1));
        } else {
            throw new LocalParserException(String.format("Invalid operation type: %s", expression.get(2)));
        }

    }
}