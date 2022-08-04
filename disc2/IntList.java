public class IntList {
    public int first;
    public IntList rest;
    public IntList(int f, IntList r){
        this.first = f;
        this.rest = r;
    }

    /** Return the size of this IntList */
    public int size() {
        int counter = 0;
        IntList p = this;
        while (p!=null){
            counter  += 1;
            p = p.rest;
        } 
        return counter;
    }

    /** print the content of the list */
    public void print(){
        IntList p = this;
        while (p!=null){
            System.out.print(p.first+" ");
            p = p.rest;
        }
        System.out.println("");
    }
    public static void main(String[] args){
        IntList L = new IntList(15, null);
        L = new IntList(10, L);
        L = new IntList(5, L);
    
        System.out.println("size of list: " + L.size());
        L.print();
    }
}
