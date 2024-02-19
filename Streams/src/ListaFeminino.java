import java.util.ArrayList;
import java.util.Scanner;

public class ListaFeminino {
    Scanner sc = new Scanner(System.in);
    ArrayList<String> masculino = new ArrayList<>();
    ArrayList<String> feminino = new ArrayList<>();

    public String[] criarLista() {
        //System.out.println("Digite o nome-sexo,nome-sexo... usar M --> masculino e F --> feminino");
        String input = "gi-F,ma-M,andrea-F,vitor-M,maria-F";
        String[] participantes = input.split(",");
        return participantes;
    }

    public ArrayList<String> filtrarLambda(String[] participantes) {
        for (int i = 0; i < participantes.length; i++) {
            String[] nomeSexo = participantes[i].split("-");
            if (nomeSexo[1].equals("M"))
                masculino.add(nomeSexo[1]);
            else
                feminino.add(nomeSexo[1]);
        }
        return feminino;
    }
}
