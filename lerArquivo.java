package Contato;

import java.io.FileReader;
import java.io.IOException;
import java.io.BufferedReader;

public class lerArquivo {
    public static void main(String[] args) throws IOException {
        FileReader fr = new FileReader("listaDecontato.txt");
        BufferedReader br = new BufferedReader(fr);
        String linha;
        while ((linha = br.readLine()) != null) {
            System.out.println(linha);
        }
        br.close();
        fr.close();
    }
}
/* verificado e funcionando */