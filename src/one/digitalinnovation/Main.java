package one.digitalinnovation;

public class Main {
    public static void main(String[] args) {

        Pilha MinhaPilha = new Pilha();

        MinhaPilha.push(new No(1));
        MinhaPilha.push(new No(2));
        MinhaPilha.push(new No(3));
        MinhaPilha.push(new No(4));
        MinhaPilha.push(new No(5));
        MinhaPilha.push(new No(6));

        System.out.println(MinhaPilha);

    }
}
