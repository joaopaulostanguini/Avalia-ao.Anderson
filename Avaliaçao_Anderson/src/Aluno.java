public class Aluno {
String nome;
   String curso;
   int serie;
   String disciplina;
   String disciplina1;
   double avaliacao;
   double avaliacao1;

   String dadosAluno() {
       String dados = "Nome do Aluno: " + this.nome;
       dados += "\n Curso: " + this.curso;
       dados += "\n Disciplina: " + this.disciplina;
       dados += "\n Avalia��o: " + this.avaliacao;
       return dados;
   }
}