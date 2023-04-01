package media_temperatura_ano; // package name

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator; 
import java.util.List;
import java.util.Random;

public class Main{

public static void main(String args[]){
    float temp_min = 0.0f;
    float temp_max = 50.0f;
    float temp_sum = 0f;

    ArrayList<Mes> ano_2022 = new ArrayList<Mes>(); // ArrayList referente ao ano de 2022, do tipo mes que é uma classe que armazena o nome do mes e a temperatura

    List<String> meses = new ArrayList<String>(Arrays.asList("Janeiro", "Fevereiro",
     "Marco", "Abril", "Maio", "Junho","Julho","Agosto","Setembro",
     "Outubro","Novembro","Dezembro")); // ArrayList do tipo String que armazena todos os 12 mese do ano

    Random random = new Random(); // Objeto random para gerar numeros aleatorios


    for(String mes : meses){ // Percorrendo o ArrayList meses e adicionando os meses e as temperaturas aleatorias ao ArrayList ano_2022
        ano_2022.add(new Mes(mes, temp_min + (temp_max-temp_min)* random.nextFloat()));
    }

    System.out.println(ano_2022); // Imprimindo o ArrayList ano_2022
    Iterator<Mes> iterator = ano_2022.iterator(); // Criando um iterador para percorrer o ArrayList ano_2022

    while(iterator.hasNext()){ // Percorrendo o ArrayList ano_2022 e somando as temperaturas
        Float prox = iterator.next().getTemp();
        temp_sum = temp_sum + prox;
    }
    float temp_media = (temp_sum/(float)ano_2022.size()); // Calculando a media das temperaturas
    System.out.printf("Temperatura media foi de: %.2f\n", temp_media); 
    System.out.println("Lista dos meses que ficaram acima da media: ");

    Iterator<Mes> iterator2 = ano_2022.iterator(); // Criando um iterador para percorrer o ArrayList ano_2022
 
    while(iterator2.hasNext()){ // Percorrendo o ArrayList ano_2022 e imprimindo os meses que ficaram acima da media
        Mes mes = iterator2.next();
        if( mes.getTemp() > temp_media){
            System.out.println(mes.getNome() +" : "+mes.getTemp());
        }
    }

}

}

class Mes { // Classe que armazena o nome do mes e a temperatura
    private String nome;
    private float temp;

    public Mes(String nome, float temp){
        this.nome = nome;
        this.temp = temp;
    }
    public float getTemp(){
        return this.temp;
    }
    public void setTemp(float temp){
        this.temp = temp;
    }
    public String getNome(){
        return this.nome;
    }
    public void setNome(String nome){
        this.nome = nome;
    }
    public String toString(){
        return "Nome: " + this.nome + " Temperatura: " + this.temp + "\n";
    }
}