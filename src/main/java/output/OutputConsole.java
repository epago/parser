package output;

public class OutputConsole implements OutputInterface {

    public void write(String communicate) {
        System.out.println(communicate);
    }
}
