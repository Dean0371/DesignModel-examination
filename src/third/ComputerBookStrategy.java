package third;

public class ComputerBookStrategy extends Strategy {
    @Override
    public void discount() {
        System.out.println("每10本折后10%");
    }
}
