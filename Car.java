class Car {
    
    Integer i=10;
    int j=20;
    String s="Hello";

    public static void main(String [] args) {
        int i;
        Car c=new Car();
        System.out.println(c.i);
        i=c.i+c.j;
        System.out.println(i);
        c.i=c.j;
        System.out.println(c.i);
    }

}