package Homework3;

public class Box {

    public int width;
    public int height;
    public int length;


        public void print () {
            String result = "width = " + width  + ", height = " + height + ", length = " + length;
            System.out.println(result);
    }

// public Box(int width, int height, int length) {
//        this.width = width;
//        this.height = height;
//        this.length = length;
//        System.out.println("S: " + width * height * length);
//    }

    public Box(int width, int height, int length) {
        this.width = width;
        this.height = height;
        this.length = length;
        System.out.println("S: " + width * height * length);
    }
}

