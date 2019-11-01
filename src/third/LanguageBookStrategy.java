package third;

public class LanguageBookStrategy extends Strategy {
    @Override
    public void discount() {
        System.out.println("每本2元折扣");
    }
}
