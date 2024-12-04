public class Main {
    public static void main(String[] args) {
        // Cadeias de teste
        String[] cadeias = {"", "01", "0011", "000111", "0000", "111", "001"};
        
        // Testando o reconhecimento das cadeias
        System.out.println("Testando o Automato Com Pilha para L = {0^n1^n | n >= 0}");
        for (String cadeia : cadeias) {
            boolean resultado = AutomatoComPilha.reconheceLinguagem(cadeia);
            System.out.printf("Cadeia: \"%s\" - %s%n", cadeia, resultado ? "Aceita" : "Rejeitada");
        }
    }
}
