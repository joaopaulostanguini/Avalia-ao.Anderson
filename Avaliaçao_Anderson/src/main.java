public class main {
public static void main(String[] args) {
       Aluno alunoAnderson;
       Aluno alunoJo�o;
       Aluno alunoJoaquim;
       Aluno alunoMaria;

       alunoAnderson = new Aluno();
       alunoJo�o = new Aluno();
       alunoJoaquim = new Aluno();
       alunoMaria = new Aluno();

       alunoJoaquim.nome = "Joaquim";
       alunoJoaquim.curso = "ADS";
       alunoJoaquim.serie = 2;
       alunoJoaquim.disciplina = "SO";
       alunoJoaquim.avaliacao = 7.8;
       
       alunoAnderson.nome = "Anderson";
       alunoAnderson.curso = "ADS";
       alunoAnderson.serie = 4;
       alunoAnderson.disciplina = "LTPIV";
       alunoAnderson.avaliacao = 1.5;
       alunoAnderson.disciplina1 = "SO";
       alunoAnderson.avaliacao1 = 5.4;
       
       alunoMaria.nome = "Maria";
       alunoMaria.curso = "ADS";
       alunoMaria.serie = 2;
       alunoMaria.disciplina = "SO";
       alunoMaria.avaliacao = 3.4;
      
       alunoJo�o.nome = "Jo�o";
       alunoJo�o.curso = "ADS";
       alunoJo�o.serie = 4;
       alunoJo�o.disciplina = "LTPIV";
       alunoJo�o.avaliacao = 9.8;

      

       

       double media = (alunoAnderson.avaliacao + alunoAnderson.avaliacao1 + alunoJo�o.avaliacao
               + alunoJoaquim.avaliacao + alunoMaria.avaliacao);
       System.out.println("A m�dia do curso ADS �: " + media);

       double mediaSerie4 = (alunoAnderson.avaliacao + alunoAnderson.avaliacao1 + alunoJo�o.avaliacao) / 3;
       System.out.println("A m�dia da Serie 4 �: " + mediaSerie4);

       double mediaAnderson = (alunoAnderson.avaliacao + alunoAnderson.avaliacao1) / 2;
       System.out.println("A m�dia do Aluno" + alunoAnderson.nome + " �:" + mediaAnderson);

       double mediaSO = (alunoJoaquim.avaliacao + alunoMaria.avaliacao + alunoAnderson.avaliacao1) / 3;
       System.out.print("A m�dia da disciplina SO �: " + mediaSO);

   }

}


