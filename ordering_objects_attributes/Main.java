package ordering_objects_attributes;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Objects;
import java.util.Set;


public class Main {
    
    public static void main(String[] args) {
        Linguagens python = new Linguagens("Python", 1991, "Pycharm");
        Linguagens java = new Linguagens("Java", 1991, "Eclipse");
        Linguagens c = new Linguagens("C", 1972, "Code::Blocks");
        Linguagens lua = new Linguagens("Lua", 1993, "VSCode");

        Set<Linguagens> linguagens = new HashSet<Linguagens>(Arrays.asList(python,java,c,lua));

        System.out.println(linguagens);
        System.out.println("Ordem de inserção:");

        Set<Linguagens> linguagens_order_insert = new LinkedHashSet<>(Arrays.asList(python,java,c,lua)); // LinkedHashSet mantém a ordem de inserção dos elementos.

        System.out.println(linguagens_order_insert);

        System.out.println("Ordem natural(Nome):");

        List<Linguagens> linguagens_order_name = new ArrayList<Linguagens>(linguagens);
        Collections.sort(linguagens_order_name);

        System.out.println(linguagens_order_name);

        CompareIde compareIde = new CompareIde();

        List<Linguagens> ling_order_ide = new ArrayList<Linguagens>(linguagens);
        Collections.sort(ling_order_ide, compareIde);

        System.out.println("Orderm natural (IDE):");
        System.out.println(ling_order_ide);

        CompareNomeAnoIde compare_nome_ano_ide = new CompareNomeAnoIde();

        List<Linguagens> ling_order = new ArrayList<Linguagens>(linguagens);
        Collections.sort(ling_order, compare_nome_ano_ide);

        System.out.println("Orderm Nome, Ano, IDE: ");
        System.out.println(ling_order);

    }
}

class Linguagens implements Comparable<Linguagens>{
    private String nome;
    private int ano_nasc;
    private String ide;

    public Linguagens(String nome, int ano, String ide) {
        this.ano_nasc = ano;
        this.nome = nome;
        this.ide = ide;
    }

    public String getNome(){
        return this.nome;
    }
    public String getIde(){
        return this.ide;
    }
    public int getAnoNasc(){
        return this.ano_nasc;
    }
    public void setNome(String nome){
        this.nome = nome;
    }
    public void setIde(String ide){
        this.ide = ide;
    }
    public void setAnoNasc(int ano_nasc){
        this.ano_nasc = ano_nasc;
    }

    @Override
    public String toString(){
        return "\nNome: " + this.nome + "\n" + "Nasc. :" + this.ano_nasc + "\n" + "IDE: " + this.ide + "\n";
    }
    
    @Override
    public boolean equals(Object o){ // equals verifica se dois objetos são iguais. 
        if (this.equals(o)) return true; // this.equals verifica se o objeto é igual a ele mesmo.
        if (o == null || getClass() != o.getClass()) return false; // getClass retorna a classe do objeto. 
        Linguagens linguagem = (Linguagens) o; // (Linguagens) converte o objeto para o tipo Linguagens.
        return nome.equals(linguagem.nome) && ide.equals(linguagem.ide) && ano_nasc == linguagem.ano_nasc; // equals verifica se os atributos são iguais.

    }
    @Override
    public int hashCode(){ // hashCode retorna um número inteiro que representa o objeto.
        return Objects.hash(nome, ide, ano_nasc); // Objects.hash retorna um número inteiro que representa os atributos do objeto.

    }

    @Override
    public int compareTo(Linguagens outra) {
        return this.nome.compareTo(outra.nome);
   
    }

}

class CompareIde implements Comparator<Linguagens> {
    @Override
    public int compare(Linguagens a, Linguagens b) {
        return a.getIde().compareTo(b.getIde());
        
    }
}

class CompareNomeAnoIde implements Comparator<Linguagens> {
    @Override
    public int compare(Linguagens a, Linguagens b) {

        int nome = a.getNome().compareTo(b.getNome());
        if(nome != 0){
            return nome;
        }

        int ano = Integer.compare(a.getAnoNasc(), b.getAnoNasc());
        if(ano != 0){
            return ano;
        }

        int ide = a.getIde().compareTo(b.getIde());
 
            return ide;
 
        }
        
    }
