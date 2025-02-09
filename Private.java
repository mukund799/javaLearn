public class Private {
    private static int name = 1;
    private int age = 20;
    public void test(){
        name++;
        age++;
    }
    public static void main(String[] args) {
        Private p = new Private();
        p.test();
        p.test();
        Private p2 = new Private();
        System.out.println("name: "+name);
        System.out.println("age: "+p.age);
        p2.test();
        p2.test();
        System.out.println("name: "+name);
        System.out.println("age: "+p2.age);


    }
}
