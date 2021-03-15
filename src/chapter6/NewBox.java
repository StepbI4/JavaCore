package chapter6;

class NewBox {
    double width;
    double height;
    double depth;

    double volume() {
        return width * height * depth;
    }
    void setDim(double w, double h, double d) {
        width = w;
        height = h;
        depth = d;
    }
}

class BoxDemo4 {
    public static void main(String[] args) {
        NewBox myBox1 = new NewBox();
        NewBox myBox2 = new NewBox();
        double vol;

        myBox1.width = 10;
        myBox1.height = 20;
        myBox1.depth = 15;

        myBox2.width = 3;
        myBox2.height = 6;
        myBox2.depth = 9;

        vol = myBox1.volume();
        System.out.println("Volume equal to " + vol);

        vol = myBox2.volume();
        System.out.println("Volume equal to " + vol);
    }
}