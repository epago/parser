import expression.ExpressionSplitter;
import expression.LocalParserException;
import input.InputInterface;
import output.OutputInterface;

import javax.inject.Inject;

public class Parser {
    @Inject
    private InputInterface inputInterface;
    @Inject
    private OutputInterface outputInterface;
    @Inject
    private ExpressionSplitter expressionSplitter;

    public void parse(String... args) {
        String[] inputList = inputInterface.retreiveArgs(args);
        String result;
        try {
            result = String.format("Result valuse is: %s",
                    expressionSplitter.splitAndExecute(inputList).toString());
        } catch (LocalParserException lpe) {
            result = String.format("Exception: %s", lpe.getMessage());
        }

        outputInterface.write(result);
    }
}
