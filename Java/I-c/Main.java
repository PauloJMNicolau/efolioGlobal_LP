import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {

    public int calcularMedia(int num1, int num2){
        return calcularSoma(num1, num2)/2;
    }

    public int calcularSoma(int num1, int num2){
        return (num1 + num2);
    }

    public ArrayList<Integer> preencherLista(ArrayList<Integer> lista1, ArrayList<Integer> lista2){
        ArrayList<Integer> lista = new ArrayList<Integer>();
        for(int i = 0; i < lista1.size(); i++){
            int num1 = lista1.get(i);
            int num2 = lista2.get(i);
            if(num1 > 0 && num2 > 0){
                lista.add(calcularMedia(num1, num2));
            } else{
                lista.add(calcularSoma(num1,num2));
            }
        }
        return lista;
    }

    public static void main(String[] args){
        List<Integer> temp = Arrays.asList(1,2,4,6,9,-2,-5);
        ArrayList<Integer> lista1 = new ArrayList<Integer>();
        lista1.addAll(temp);
        temp = Arrays.asList(-2,5,3,4,5,-4,-3);
        ArrayList<Integer> lista2 = new ArrayList<Integer>();
        lista2.addAll(temp);
        Main exec = new Main();
        ArrayList<Integer> resultado = exec.preencherLista(lista1,lista2);
        System.out.println(resultado.toString());
    }
}
