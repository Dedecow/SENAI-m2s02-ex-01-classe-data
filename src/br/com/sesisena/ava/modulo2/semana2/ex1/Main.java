package br.com.sesisena.ava.modulo2.semana2.ex1;

public class Main {
    public static void main(String[] args) {
        Data data = new Data(2023, 9, 12);

        int ano = data.getAno();
        int mes = data.getMes();
        int dia = data.getDia();

        System.out.println("Ano: " + ano);
        System.out.println("Mês: " + mes);
        System.out.println("Dia: " + dia);

        data.exibirData();
    }
}
