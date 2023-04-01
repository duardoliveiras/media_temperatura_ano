package ordering_rainbow_colors;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class Main {

    public static void main(String[] args) {
        int i = 0;

        Set<String> arco_iris = new HashSet<String>(Arrays.asList("Vermelho",
        "Laranja", "Amarelo", "Verde", "Azul", "Anil", "Violeta")); // Set não permite repetição de elementos e não é ordenado (não tem índice).

        for(String cor : arco_iris){ // for each (para cada) - percorre a lista de cores do arco-íris.
            i += 1;
            System.out.println(cor);
        }
        System.out.println("");
        System.out.println("Quantidade de cores: " + i);
        System.out.println("");
        Set<String> arco_iris_order = new TreeSet<String>(arco_iris); // TreeSet ordena os elementos de forma crescente.

        for(String cor : arco_iris_order){
            System.out.println(cor);
        }

        List<String> inverso =  new ArrayList<String>(arco_iris); // List permite repetição de elementos e é ordenado (tem índice).
        Collections.reverse(inverso); // Inverte a ordem da lista.
        System.out.println(""); 

        for (String cor : inverso) {
            System.out.println(cor);
        }

        System.out.println("");
        for(String cor : arco_iris){ 
            if(cor.startsWith("V")){ // startsWith verifica se a String começa com o parâmetro passado.
                System.out.println(cor); 
            }
        }

        Iterator<String> iterator = arco_iris.iterator();

        while(iterator.hasNext()){ // hasNext verifica se há um próximo elemento na lista.
            String cor = iterator.next(); // next retorna o próximo elemento da lista.
            if (cor.startsWith("V")){
                iterator.remove(); // remove o elemento da lista.
            }
        }
        System.out.println(arco_iris);

            arco_iris.clear(); // clear limpa a lista.
            arco_iris_order.clear();
            inverso.clear();

        System.out.println(arco_iris.isEmpty()+" "+ " "+arco_iris_order.isEmpty()+" "+" "+ inverso.isEmpty()); // isEmpty verifica se a lista está vazia.

        }
        
        

    }

    
    

