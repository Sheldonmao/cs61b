public class SquareList {
    public static IntList square(IntList L) {
        IntList squared_L = new IntList(L.first*L.first, null);
        IntList pointer_L = squared_L;
        L = L.rest;
        while (L!=null){
            IntList temp_L = new IntList(L.first*L.first, null);
            pointer_L.rest = temp_L;
            L = L.rest;
            pointer_L = pointer_L.rest;
        }
        return squared_L;
    }
    public static void main(String[] args){
        IntList L = new IntList(15, null);
        L = new IntList(10, L);
        L = new IntList(5, L);

        L.print();
        L = square(L);
        L.print();
        
    }
}
