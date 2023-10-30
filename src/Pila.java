import java.util.Stack;

public class Pila {
    public Stack<Character> pilaDeApertura;
    public Stack<Character> pilaDeCierre;

    public Pila() {
        pilaDeApertura=new Stack<Character>();
        pilaDeCierre=new Stack<Character>();
    }

    public void agregarAPila(Stack pila, Character dato){
        pila.push(dato);
    }
    public void borrarTodoDeLaPila(Stack<Character> pila){
        while (!pila.empty()){
            pila.pop();
        }
    }
    public boolean balancearTexto (String texto, Stack<Character> apertura,Stack<Character> cierre){
        for (int i=0;i<texto.length();i++){
            if(texto.charAt(i)=='('){agregarAPila(apertura,'(');}
            if(texto.charAt(i)==')'){agregarAPila(cierre,')');}
            if(texto.charAt(i)=='['){agregarAPila(apertura,'[');}
            if(texto.charAt(i)==']'){agregarAPila(cierre,']');}
            if(texto.charAt(i)=='{'){agregarAPila(apertura,'{');}
            if(texto.charAt(i)=='}'){agregarAPila(cierre,'}');}
        }
        if (apertura.size()==cierre.size()){
            borrarTodoDeLaPila(apertura);
            borrarTodoDeLaPila(cierre);
            return true;

        }else{
            borrarTodoDeLaPila(apertura);
            borrarTodoDeLaPila(cierre);
            return false;

        }

    }

}
