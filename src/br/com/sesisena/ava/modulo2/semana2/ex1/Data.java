package br.com.sesisena.ava.modulo2.semana2.ex1;

public class Data {
    private int dia, mes, ano;

    public Data(int ano, int mes, int dia){
        this.ano = ano;
        this.mes = mes;
        this.dia = dia;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public void setMes(int mes) {
        this.mes = mes;
    }

    public void setDia(int dia) {
        this.dia = dia;
    }

    public int getAno(){
        return ano;
    }

    public int getMes(){
        return mes;
    }

    public int getDia(){
        return dia;
    }

    public void exibirData(){
        System.out.println(dia + "/" + mes + "/" + ano);
    }
}
