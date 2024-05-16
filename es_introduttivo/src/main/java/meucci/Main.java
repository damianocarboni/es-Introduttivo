package meucci;

public class Main {
    public static void main(String[] args) {
        int contMain = 0;
        MyThread t = new MyThread();
        t.run();

        for(int i = 0; i<10; i++){
            System.out.println("il main dice: " + contMain );
            contMain++;
        }
    }
}