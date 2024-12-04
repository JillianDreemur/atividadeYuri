import java.util.Stack;

public class AutomatoComPilha {
    public static boolean reconheceLinguagem(String cadeia) {
        Stack<Character> pilha = new Stack<>();
        for (char c : cadeia.toCharArray()) {
            if (c == '0') {
                pilha.push(c);
            } else if (c == '1') {
                if (pilha.isEmpty() || pilha.pop() != '0') {
                    return false;
                }
            } else {
                return false;
            }
        }
        return pilha.isEmpty();
    }
}
