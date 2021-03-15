package chapter6;

class BoxDemo5 extends NewBox{
    public static void main(String[] args) {
        NewBox myBox1 = new NewBox();
        NewBox myBox2 = new NewBox();
        double vol;

        myBox1.setDim(10, 20, 15);
        myBox2.setDim(3, 6, 9);

        System.out.println("Volume equal to " + myBox1.volume());
        System.out.println("Volume equal to " + myBox2.volume());
    }
}
