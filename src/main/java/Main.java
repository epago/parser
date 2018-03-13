import javax.enterprise.inject.se.SeContainer;
import javax.enterprise.inject.se.SeContainerInitializer;

public class Main {
    private static SeContainer container;

    public static void main(String[] args) {
        start(args);
    }

    public static void start(String[] args) {
        container = SeContainerInitializer.newInstance().initialize();
        container.select(Parser.class).get().parse(args);
    }

    public void stop() {
        container.close();
    }
}
