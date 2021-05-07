package trabalhofinal;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStreamReader;

public class Arquivo {
    public static String[] getLinhas(String nomeArquivo) throws Exception{
        //declaração das variáveis
        String[] linhas;
        String linha;
        int nlinhas, i=0;
        //abre o arquivo para leitura
        FileInputStream inFile = new FileInputStream(new File(nomeArquivo));
        BufferedReader buff = new BufferedReader(new InputStreamReader(inFile, "UTF-8"));
        //lê a primeira linha do arquivo (numero de linhas)
        linha = buff.readLine();
        nlinhas = Integer.parseInt(linha);
        linhas = new String[nlinhas+1];
        linhas[i++] = linha;
        //lê as demias linhas do arquivo
        do{
            linha = buff.readLine();
            if(linha != null)
                linhas[i++] = linha;
        }while(linha != null);
        
        //fecha o arquivo
        buff.close();
        inFile.close();
        return linhas;
    }
    public static void lerArquivo(){
        String[] linhas = null;
        try{
            linhas = Estudantes.getLinhas("realatorio4.txt");
        }catch(Exception e){
            System.out.println("Erro: "+e.getMessage());
        }
        for(int i=0;i<linhas.length;i++){
            System.out.println(linhas[i]);
        }
    }
    
}
