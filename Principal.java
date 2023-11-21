package Atividade3Pontos;
import java.time.LocalDate;
import java.time.Period;

public class Principal {
        public static void main(String[] args) {
            Pessoa einstein = new Pessoa("Albert Einstein", 14, 3, 1879);
            Pessoa newton = new Pessoa("Isaac Newton", 4, 1, 1643);

            einstein.calculaIdade(LocalDate.now());
            newton.calculaIdade(LocalDate.now());

            System.out.println("Albert Einstein teria " + einstein.informaIdade() + " anos hoje.");
            System.out.println("Isaac Newton teria " + newton.informaIdade() + " anos hoje.");
        }
    }

