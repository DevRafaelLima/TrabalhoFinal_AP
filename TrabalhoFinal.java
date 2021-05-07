package trabalhofinal;

import java.util.Scanner;

public class TrabalhoFinal  {
    
    public static void main(String[] args) throws Exception {
        Estudantes estudante = null;
        Scanner teclado = new Scanner(System.in);
        int op;
        try{
            estudante = new Estudantes(Arquivo.getLinhas("Estudantes.csv"));
        }catch(Exception e){
            System.out.println("Erro:"+e.getMessage());
        }      
        System.out.println("Menu");
        System.out.println("1. Total de entrevistados");
        System.out.println("2. Percentual de estudantes do sexo feminino, do sexo masculinoe que tenhas se identificado como outro");
        System.out.println("3. Percentual de estudantes de cada região brasileira");
        System.out.println("4. Número de estudantes obesos, de acordo com a tabela IMC, e sua distribuição por curso");
        System.out.println("5. Número de fumantes e sua distribuição por curso");
        System.out.println("6. Número de estudantes que bebem ao menos 2 vezes na semana e sua distribuição por surso");
        System.out.println("7. Número de estudantes dos curso noturnos (CC e ES) que dormem menos do que 5 horas diárias");
        System.out.println("8. Mostrar todas as informações");
        System.out.println("9. Gerar resultado");
        op=teclado.nextInt();
        teclado.nextLine();
        switch(op){
            case 1:
                estudante.totEntrevistado();
                break;
            case 2:
                estudante.sexo();
                break;
            case 3:
                estudante.regiao();
                break;
            case 4:
                estudante.totObeso();
                estudante.obesoPorCurso();   
                break;
            case 5:
                estudante.totFumantes();
                estudante.fumantesPorCurso(); 
                break;
            case 6:
                estudante.totBebem();
                estudante.bebem();
                break;
            case 7:
                 estudante.CcEs();
                break;
            case 8:
                estudante.totEntrevistado();
                estudante.sexo();
                estudante.regiao();
                estudante.totObeso();
                estudante.obesoPorCurso();   
                estudante.totFumantes();
                estudante.fumantesPorCurso();
                estudante.totBebem();
                estudante.bebem();
                estudante.CcEs();
                break;
            case 9:
                
                break;
            default:
                    System.out.println("Opção inválida");
                break;
        }
    }
    
}
