package trabalhofinal;
import java.io.*;
import java.util.Scanner;
public class Estudantes extends Arquivo{
    private Aluno aluno[];
    private String cursos[] = {"CC", "EA", "EC", "EE", "ES","EM","ET"};        
    private String regioes[] = {"Centro-oeste","Norte","Nordeste","sul","Sudeste"};
    
    public Estudantes(String linhas[]){
         if(linhas.length>1){
            aluno = new Aluno[linhas.length-1];
            for(int i=0; i<aluno.length;i++){
                String dados[] = linhas[i+1].split("; ");
                       aluno[i]= new Aluno(dados[0], dados[1], Float.parseFloat(dados[2]), Float.parseFloat(dados[3]), dados[4], dados[5], dados[6], dados[7], dados[8]);             
                }
            }
}
    public void totEntrevistado(){
       
        System.out.println("total de pessoas entrevistadas: "+aluno.length+" pessoas"); 
    }
    public void sexo() {
       float f =0, m=0, o=0;      
        
       for(int i = 0;i<aluno.length;i++){
               if(aluno[i].getGenero().equals("f")){
                   f+=1;
               }
               else if(aluno[i].getGenero().equals("m")){
                   m+=1;
               }
               else if(aluno[i].getGenero().equals("o")){
                   o+=1;
               }
       }
       
        System.out.println("Percentual de estudantes do sexo feminino:"+f);
        System.out.println("Percentual de estudantes do sexo Masculino:  "+m);
        System.out.println("Percentual de pessoas que se identificou como outro: "+o);
                
    }
    public void regiao(){
        int[] x = new int[regioes.length];
        //percorre a matriz
        for(int i =0; i<aluno.length; i++){
                if(aluno[i].getOrigem().equals("Centro-oeste")){
                    x[0]+=1;
                } else if(aluno[i].getOrigem().equals("Norte")){
                    x[1]+=1;
                } else if(aluno[i].getOrigem().equals("Nordeste")){
                    x[2]+=1;
                } else if(aluno[i].getOrigem().equals("Sul")){
                    x[3]+=1;
                } else if(aluno[i].getOrigem().equals("Sudeste")){
                    x[4]+=1;
                }
        }
        System.out.println("Percentual de estudantes de	cada região brasileira: ");
        for(int i=0; i<x.length;i++){
            System.out.println(regioes[i]+": "+x[i]);
        }
    }
    public void totObeso() {
        int obeso=0;
        for(int i=0;i<300;i++){
                if(aluno[i].obeso()){
                    obeso+=1;
                }
        }
        
        System.out.println("Número de Estudantes obesos:" +obeso);
    }
    public void obesoPorCurso(){
        int[] c = new int[cursos.length];
        
        for(int i=0; i<aluno.length; i++){
                if(aluno[i].obeso()){
                    if(aluno[i].getCurso().equals("CC")){
                       c[0]+=1;
                    } else if(aluno[i].getCurso().equals("EA")){
                        c[1]+=1;
                    } else if(aluno[i].getCurso().equals("EC")){
                        c[2]+=1;
                    } else if(aluno[i].getCurso().equals("EE")){
                        c[3]+=1;
                    }else if(aluno[i].getCurso().equals("ES")){
                        c[4]+=1;
                    }else if(aluno[i].getCurso().equals("EM")){
                        c[5]+=1;
                    } else if(aluno[i].getCurso().equals("ET")){
                        c[6]+=1;
                    }
            }
        }
        System.out.println("Didtribuição de obesos por curso");
        for(int i=0; i<c.length;i++){
            System.out.println(cursos[i]+": "+c[i]+" Alunos");
        }
    }
    public void totFumantes(){
        int fumante = 0;
        
        for(int i=0; i<aluno.length;i++){
            for(int k=0; k<1;k++){
                if(aluno[i].getFumante().equals("Sim")){
                    fumante+=1;
                } 
            }
        }
        System.out.println("Números de fumantes: "+fumante+" alunos");
    }
    public void fumantesPorCurso(){
        int f[] = new int[cursos.length];
        for(int i=0; i<aluno.length; i++){
                if(aluno[i].obeso()){
                    if(aluno[i].getCurso().equals("CC")){
                       f[0]+=1;
                    } else if(aluno[i].getCurso().equals("EA")){
                        f[1]+=1;
                    } else if(aluno[i].getCurso().equals("EC")){
                        f[2]+=1;
                    } else if(aluno[i].getCurso().equals("EE")){
                        f[3]+=1;
                    }else if(aluno[i].getCurso().equals("ES")){
                        f[4]+=1;
                    }else if(aluno[i].getCurso().equals("EM")){
                        f[5]+=1;
                    } else if(aluno[i].getCurso().equals("ET")){
                        f[6]+=1;
                    }
            }
        }  
        System.out.println("Distribuição por curso");
        for(int i=0;i<cursos.length;i++){
            System.out.println(cursos[i]+": "+f[i]+" alunos");
        }
        
    }
    public void totBebem(){
        int x=0;
        
        for(int i=0; i<aluno.length;i++){
            if(!aluno[i].getFrequenciaBebidasAlcoolicas().equals("Apenas nos fins de semana") && !aluno[i].getFrequenciaBebidasAlcoolicas().equals("Raramente")){
                x+=1;
            }
        }
        System.out.println("Total de alunos que bebem ao menos 2 vezes na semana: "+x+" alunos");
    }
    public void bebem(){
        int x[] = new int[cursos.length];
        for(int i=0; i<aluno.length;i++){
            if(!aluno[i].getFrequenciaBebidasAlcoolicas().equals("Apenas nos fins de semana") && !aluno[i].getFrequenciaBebidasAlcoolicas().equals("Raramente")){
                if(aluno[i].getCurso().equals("CC")){
                       x[0]+=1;
                    } else if(aluno[i].getCurso().equals("EA")){
                        x[1]+=1;
                    } else if(aluno[i].getCurso().equals("EC")){
                        x[2]+=1;
                    } else if(aluno[i].getCurso().equals("EE")){
                        x[3]+=1;
                    }else if(aluno[i].getCurso().equals("ES")){
                        x[4]+=1;
                    }else if(aluno[i].getCurso().equals("EM")){
                        x[5]+=1;
                    } else if(aluno[i].getCurso().equals("ET")){
                        x[6]+=1;
                    }
            } 
        }
        System.out.println("Distribuição por cursos");
        for(int i=0; i<x.length;i++){
            System.out.println(cursos[i]+": "+x[i]+" alunos");
        }
       // return x;
    }
    public void CcEs(){
        int x=0;
        int CC=0, ES=0;
        for(int i=0; i<aluno.length;i++){
            
            if(aluno[i].getHorasDiarias().equals("Menos que 5 horas")){
                x+=1;
                if(aluno[i].getCurso().equals("CC")){
                    CC+=1;
                } else if(aluno[i].getCurso().equals("ES")){
                    ES+=1;
                }
            }
        }
        System.out.println("total de alunos de CC e ES que dorme menos que 5 horas "+x+" alunos");
        System.out.println("distrbuição entre os cursos:");
        System.out.println("CC "+CC+" alunos");
        System.out.println("ES "+ES+" alunos");
    }
    
    
}
