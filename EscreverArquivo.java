package Contato;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class EscreverArquivo {
    /**
     * @param args
     * @throws IOException
     */
    public static void main(String[] args) throws IOException {
        String pessoa;
        try (FileReader fr = new FileReader("listaDeContato.txt")) {
        }
        System.out.println("Texto digitado:");
        FileWriter fw = new FileWriter("listaDeContato.txt", true);
        fw.write("rerer");
        fw.close();
        System.out.println("Arquivo Salvo Com Sucesso! \n");
    }

}
