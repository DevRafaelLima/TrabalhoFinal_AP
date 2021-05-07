package trabalhofinal;
import java.io.*;
public class Aluno implements Serializable{
    //atributos
    private String idade;
    private String genero;
    private float peso;
    private float altura;
    private String origem;
    private String curso;
    private String horasDiarias;
    private String frequenciaBebidasAlcoolicas;
    private String fumante;
    //construtor

    public Aluno(String idade, String genero, float peso, float altura, String origem, String curso, String horasDiarias, String frequenciaBebidasAlcoolicas, String fumante) {
        this.idade = idade;
        this.genero = genero;
        this.peso = peso;
        this.altura = altura;
        this.origem = origem;
        this.curso = curso;
        this.horasDiarias = horasDiarias;
        this.frequenciaBebidasAlcoolicas = frequenciaBebidasAlcoolicas;
        this.fumante = fumante;
    }
    
    //metodos acessores e moficadores;
    public String getIdade() {return idade;}
    public void setIdade(String idade) {this.idade = idade;}
    public String getGenero() {return genero;}
    public void setGenero(String genero) {this.genero = genero;}
    public float getPeso() {return peso;}
    public void setPeso(float peso) {this.peso = peso;}
    public float getAltura() {return altura;}
    public void setAltura(float altura) {this.altura = altura;}
    public String getOrigem() {return origem;}
    public void setOrigem(String origem) {this.origem = origem;}
    public String getCurso() {return curso;}
    public void setCurso(String curso) {this.curso = curso;}
    public String getHorasDiarias() {return horasDiarias;}
    public void setHorasDiarias(String horasDiarias) {this.horasDiarias = horasDiarias;}
    public String getFrequenciaBebidasAlcoolicas() {return frequenciaBebidasAlcoolicas;}
    public void setFrequenciaBebidasAlcoolicas(String frequenciaBebidasAlcoolicas) {this.frequenciaBebidasAlcoolicas = frequenciaBebidasAlcoolicas;}
    public String getFumante() {return fumante;}
    public void setFumante(String fumante) {this.fumante = fumante;}
//toString
    @Override
    public String toString() {
        return "Aluno{" + "idade=" + idade + ", genero=" + genero + ", peso=" + peso + ", altura=" + altura + ", origem=" + origem + ", curso=" + curso + ", horasDiarias=" + horasDiarias + ", frequenciaBebidasAlcoolicas=" + frequenciaBebidasAlcoolicas + ", fumante=" + fumante + '}';
    }
   public boolean obeso(){
       float IMC = this.peso/(this.altura*this.altura);
        if(IMC>30){
            return true;
        } 
         return false;
   }    
}
