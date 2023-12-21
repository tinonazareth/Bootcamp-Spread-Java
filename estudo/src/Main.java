public class Main {
    public static void main(String[] args) {
        int la = 1;
        int lb = la;
        System.out.println("la= " + la + " lb= " + lb);
        la = 2;
        System.out.println("la= " + la + " lb= " + lb);

        Obj objA = new Obj( 1);
        Obj objB = objA;
        System.out.println("objA= " + objA + " objB= " + objB);
        objA.setNum(2);
        System.out.println("objA= " + objA + " objB= " + objB);
    }
}