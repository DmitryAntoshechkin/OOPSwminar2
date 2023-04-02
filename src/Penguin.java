public class Penguin extends Predator implements Walkable, Swimable {

    public Penguin(String name) {
        super(name);
    }

    @Override
    public String speak() {
        return "Кря-кря";
    }

    @Override
    public int swimSpeed() {
        return 8;
    }

    @Override
    public int runSpeed() {
        return 1;
    }

    @Override
    public String feed() {
        return "Рыба";
    }
}
