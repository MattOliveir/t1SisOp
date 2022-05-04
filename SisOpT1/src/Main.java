import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Main {


    public static void main(String[] args) throws Exception {


        String nomeArq = "programateste" + ".txt"; // nome do arquivo, ainda precisa ser programado



        String[][] comandos =  readFile(nomeArq);   // leitura do arquivo | Essa matriz representa as operações de um processo qualquer
                                                    // pra poder escalonar, cada processo que for entrar precisa ser transformado num desses
                                                    // Dai podemos usar a posicao da matriz como o PC e fazer loop e tudo mais.
                                                    // é preciso um método que leia essa matriz e faça o que o programa pede tipo somar e subtrair do acumulador;
                                                    // tem que salvar o estado do programa no PCB quando ele sai de execucao pra poder voltar a executar de onde ele parou quando voltar
                                                    // O PCB é onde vai ficar todas essas informações importantes do processo. Cada processo tem um único PCB e vice-versa.
                                                    // O processo é onde vao ficar os comandos e os dados




        testaMatriz(comandos);
        
        /*

        FUNÇÕES

        Aritmético

        ADD op1     | acc=acc+(op1)
        SUB op1     | acc=acc–(op1)
        MULT op1    | acc=acc*(op1)
        DIV op1     | acc=acc/(op1)


        Memória

        LOAD op1    | acc=(op1)
        STORE op1   | (op1)=acc


        Salto

        BRANY label     | pc <- label
        BRPOS label     | Se acc > 0 então pc <- op1
        BRZERO label    | Se acc = 0 então pc <- op1
        BRNEG label     | Se acc < 0 então pc <- op1

        Sistema

        SYSCALL index   | Chamada de sistema


        SYSCALL 0       | FINAL DO PROGRAMA
        SYSCALL 1       | PRINT DO VALOR NO ACUMULADOR
        SYSCALL 2       | LEITURA DE UM VALOR INTEIRO VIA TECLADO


        */


    }



    public static String[][] readFile(String nomeArq)throws Exception
    {


        //System.out.println("Working Directory = " + System.getProperty("user.dir"));

        String path = System.getProperty("user.dir");

        //System.out.println("path is" + path);

        path = path + "\\programas\\" + nomeArq;

        System.out.println("Path is:  "+path);

        String linha = "";

        int i=0;

        String[][] comandos = new String[2 ][15];

        try
        {
            BufferedReader br = new BufferedReader(new FileReader(path));

            while ((linha = br.readLine()) != null)   //returns a Boolean value

            {
                System.out.println("Linha "+i+" |"+linha+"\n");

                String[] s = linha.split(" ");


                if(s.length == 2){

                    System.out.println("\nPrimeira: " +s[0] + "\nSegunda: " + s[1] +"\n" );  // pra ver oq ta rolando

                    comandos[0][i] = s[0];          // COLOCA A OPERAÇÃO NA POSICAO [0][X] DA MATRIZ
                    comandos[1][i] = s[1];          // COLOCA O VALOR NA POSICAO [1][X] DA MATRIZ

                }else{

                    System.out.println("\nPrimeira: " + s[0]+"\n"); // QUANDO É UMA PARTE DO CODIGO QUE NÃO É OPERAÇÃO TIPO O INICIO,FIM E DELIMITADOR DA AREA DE DADOS ELE NÃO TEM NADA NA POSICAO [1][X]
                    comandos[0][i] = s[0];

                }

                i++;
            }
        }

        catch (IOException e)
        {
            e.printStackTrace();
        }


        System.out.println("------------- ARQUIVO LIDO COM SUCESSO ----------------");

        return comandos;

    }



    public static void testaMatriz(String[][] umaMatriz){

        System.out.println("\nTESTE-TESTE-TESTE-TESTE-TESTE-TESTE-TESTE-TESTE-TESTE-\n");

        System.out.println("tam horizontal Matriz: "+umaMatriz[0].length);

        for(int i =0;i< umaMatriz[0].length;i++){
            for(int j =0;j<2;j++){

                System.out.println(umaMatriz[j][i]); // assim printa tudo que é nulo, é melhor pra entender mas fica poluído


//                if(umaMatriz[j][i] != null){
//                    System.out.println(umaMatriz[j][i]);      // pra nao printar os nulos, só comentar acima e tirar esse aqui do comentário
//                }
            }
        }
    }
}
