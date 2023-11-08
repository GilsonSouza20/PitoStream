package br.com.alura.pitostream.principal;

import br.com.alura.pitostream.calculos.CalculadoraDeTempo;
import br.com.alura.pitostream.modelos.Filme;
import br.com.alura.pitostream.modelos.Serie;

import java.util.ArrayList;


public class Main {
    public static void main(String[] args) {
        Filme filme = new Filme("O poderoso chefinho",1980);
        new Serie("Last of us", 2020);
        CalculadoraDeTempo calc = new CalculadoraDeTempo();
        filme.setDuracaoEmMinutos(180);
        filme.setEstaIncluidoNoPlano(true);

        filme.avalia(9);
        filme.avalia(10);
        filme.avalia(5);
        filme.avalia(7);

        filme.exibeFichaTecnica();

        Filme filme1 = new Filme("the lord of rings",2010);
        filme1.setDuracaoEmMinutos(130);
        filme1.setEstaIncluidoNoPlano(true);

        calc.inclui(filme);
        calc.inclui(filme1);
        System.out.println(calc.getTempoTotal());

        ArrayList<Filme> filmes = new ArrayList<>();
        filmes.add(filme);
        filmes.add(filme1);
        System.out.println(filmes.get(0).toString());
        System.out.println(filmes.get(1).toString());



    }
}