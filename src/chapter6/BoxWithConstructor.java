package chapter6;

class BoxWithConstructor {
    double width;
    double height;
    double depth;

    BoxWithConstructor(double w, double h, double d) {
        width = w;
        height = h;
        depth = d;
    }

    double volume() {
        return width * height * depth;
    }
}

class BoxDemo7 {
    public static void main(String[] args) {
        BoxWithConstructor myBox1 = new BoxWithConstructor(10, 20, 15);
        BoxWithConstructor myBox2 = new BoxWithConstructor(3, 6, 9);

        double vol;

        vol = myBox1.volume();
        System.out.println("Volume equals to " + vol);

        vol = myBox2.volume();
        System.out.println("Volume equals to " + vol);
    }
}
