//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.Scanner;

public class DiagnosticoDengue {
    public static void main(String[] args) {
        String diagnostico = "";
    int infectados = 0;
    String dados = "";
    String sintoma = "";

       for (int x = 0; x <= 10; x++){
           Scanner input = new Scanner(System.in);
           System.out.println("Qual o nome do paciente ? :");
           String nome = input.nextLine();
           System.out.println("Documento CPF: ");
           long documento = input.nextLong();
           System.out.println("Qual região você reside? :");
           Scanner input2 = new Scanner(System.in);
           String regiao = input2.nextLine();
           System.out.println("Seu nome é: " + nome);
       System.out.println( "Quais sintomas está sentindo, digite o número correspondente ? : ");
           System.out.println("1 - Febre");
           System.out.println("2 - Dor de cabeça");
           System.out.println("3 - Dores pelo corpo");
           System.out.println("4 - Náuseas");
           System.out.println("5 - Manchas vermelhas");
           System.out.println("6 - Sangramentos");
           System.out.println("7 - Dor abdominal intensa");
           System.out.println("8 - Vômitos");
           System.out.println("0 - Não sinto nada");
           int numero = input.nextInt();
           if(numero == 1){
               sintoma = "Febre";
           } else if (numero == 2) {
               sintoma = "Dor de cabeça";
           } else if (numero == 3) {
               sintoma = "Dores pelo corpo";
           } else if (numero == 4) {
               sintoma = "Náuseas";
           } else if (numero == 5) {
               sintoma = "Manchas vermelhas";
           } else if (numero == 6) {
               sintoma = "Sangramentos";
           } else if (numero == 7) {
               sintoma = "Dor abdominal intensa";
           } else if (numero == 8) {
               sintoma = "Vômitos";
           } else if (numero == 0) {
               sintoma = "Assintomático";
           }
           if(numero > 0 && numero < 9) {
               infectados+=1;
               if (numero >= 5 && numero < 9) {
                   System.out.println(nome + " - está com dengue HEMORRÁGICA !!!");
                   System.out.println("-----! MEDICAÇÃO !-----");
                   System.out.println("DIPIRONA OU PARACETAMOL, para aliviar a dor\n" +
                           "fazer repouso;\n" +
                           "ingerir bastante líquido (água);\n" +
                           "não tomar medicamentos por conta própria;\n" +
                           "a hidratação pode ser por via oral (ingestão de líquidos pela boca) ou por via intravenosa (com uso de soro, por exemplo)");
               } else {
                   System.out.println(nome + " - está com dengue !!!");
                   System.out.println("-----! MEDICAÇÃO !-----");
                   System.out.println("fazer repouso;\n" +
                           "ingerir bastante líquido (água);\n" +
                           "não tomar medicamentos por conta própria;\n" +
                           "a hidratação pode ser por via oral (ingestão de líquidos pela boca) ou por via intravenosa (com uso de soro, por exemplo)");
               }
               diagnostico = "INFECTADO";
           } else{
               System.out.println(nome + " - NÃO ESTÁ COM DENGUE !!!");
               diagnostico = "NÃO INFECTADO";
           }
           dados = dados + "\n------------\n" +
                   "Nome: " + nome+ "\n" +
                   "CPF: " + documento + "\n" +
                   "Região: " + regiao + "\n" +
                   "Diagnóstico: " + diagnostico + "\n" +
                   "Sintoma: " + sintoma +
                    "\n------------\n"

           ;

       }
        System.out.println("\n" + infectados + " pessoas foram infectadas com dengue !!!");
        System.out.println("\n------LISTA------");
        System.out.println(dados);
    }
}