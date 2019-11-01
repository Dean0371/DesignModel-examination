package third;

public class Main {
    public static void main(String[] args) {
        Context context = new Context();
        Strategy strategy = new ComputerBookStrategy();
        Strategy strategy2 = new LanguageBookStrategy();
        Strategy strategy3 = new NovelBookStrategy();
        context.setStrategy(strategy);
        context.discount();
        context.setStrategy(strategy2);
        context.discount();
        context.setStrategy(strategy3);
        context.discount();
    }
}
// output:每10本折后10%
//        每本2元折扣
//        每100元折扣10元