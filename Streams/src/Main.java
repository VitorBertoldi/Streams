import java.util.ArrayList;
import java.util.List;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<String> masculino = new ArrayList<>();
        ArrayList<String> feminino = new ArrayList<>();

        System.out.println("Digite o nome-sexo,nome-sexo... usar M --> masculino e F --> feminino");
        String input = sc.next();

        String[] participantes = input.split(",");

        FiltraNomes filtrarLambda = (String[] nomes) -> {
            for (int i = 0; i < participantes.length; i++) {
                String[] nomeSexo = participantes[i].split("-");
                if (nomeSexo[1].equals("M"))
                    masculino.add(nomeSexo[0]);
                else
                    feminino.add(nomeSexo[0]);
            }
            return feminino;
        };

        filtrarLambda.retornaFem(participantes);
        System.out.println(feminino);

    }
}