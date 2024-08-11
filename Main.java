public class Main {
    public static void main(String[] args) {
        StaticStack stack = new StaticStack(5);

        System.out.println("Empilhando elementos:");
        stack.push(10);
        System.out.println("10 empilhado");
        stack.push(20);
        System.out.println("20 empilhado");
        stack.push(30);
        System.out.println("30 empilhado");
        stack.push(40);
        System.out.println("40 empilhado");
        stack.push(50);
        System.out.println("50 empilhado");
        
        System.out.println("Tentando empilhar 60:");
        stack.push(60);

        System.out.println("\nDesempilhando elementos:");
        System.out.println("Elemento removido: " + stack.pop());
        System.out.println("Elemento removido: " + stack.pop());

        System.out.println("\nStatus da pilha:");
        System.out.println("A pilha está vazia? " + (stack.isEmpty() ? "Sim" : "Não"));
        System.out.println("A pilha está cheia? " + (stack.isFull() ? "Sim" : "Não"));

        System.out.println("\nLimpando a pilha");
        stack.clear();

        System.out.println("A pilha está vazia após limpar? " + (stack.isEmpty() ? "Sim" : "Não"));

        System.out.println("\nTentando desempilhar de uma pilha vazia:");
        System.out.println("Elemento removido: " + stack.pop());
    }
}