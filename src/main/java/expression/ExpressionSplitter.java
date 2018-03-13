package expression;

import java.util.ArrayList;
import java.util.List;

public class ExpressionSplitter {

    public Double splitAndExecute(String... expressionList) {


        List<String> singlexp = new ArrayList<String>();
        for (String exp : expressionList) {
            singlexp.add(exp);
            if (ExpressionEnum.containsValue(exp)) {
                Double result = ExpressionFactory.getExpression(singlexp).execute();
                singlexp.clear();
                singlexp.add(result.toString());
            }
        }
        return Double.parseDouble(singlexp.get(0));

    }


}
