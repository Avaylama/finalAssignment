abstract class MenuItem {
    abstract void prepare();
    abstract void serve();
}

class Appetizer extends MenuItem {
    @Override
    void prepare() {
        System.out.println("Preparing appetizer...");
    }

    @Override
    void serve() {
        System.out.println("Serving appetizer.");
    }
}

class MainCourse extends MenuItem {
    @Override
    void prepare() {
        System.out.println("Preparing main course...");
    }

    @Override
    void serve() {
        System.out.println("Serving main course.");
    }
}

class Beverage extends MenuItem {
    @Override
    void prepare() {
        System.out.println("Preparing beverage...");
    }

    @Override
    void serve() {
        System.out.println("Serving beverage.");
    }
}

public class RestaurantOrder {
    public static void main(String[] args) {
        MenuItem item1 = new Appetizer();
        MenuItem item2 = new MainCourse();
        MenuItem item3 = new Beverage();

        item1.prepare();
        item1.serve();

        item2.prepare();
        item2.serve();

        item3.prepare();
        item3.serve();
    }
}
