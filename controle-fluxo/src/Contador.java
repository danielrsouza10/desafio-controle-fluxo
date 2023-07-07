import java.util.Locale;
import java.util.Scanner;

public class Contador {
    public static void main(String[] args){
        Scanner contador = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Digite o primeiro parametro: ");
        int primeiroContador = contador.nextInt();

        System.out.println("Digite o segundo parametro");
        int segundoContador = contador.nextInt();

        try{
            validarParametros(primeiroContador, segundoContador);
             
        } catch (ParametrosInvalidosException e){
            System.out.println("Erro: O primeiro parametro deve ser maior do que o segundo");
        }

    }
    static void validarParametros( int parametroUm, int parametroDois) throws ParametrosInvalidosException{
        if(parametroUm < parametroDois){
            throw new ParametrosInvalidosException();
        }else{
            int resultado = parametroUm - parametroDois;
            for(int i = 1; i<= resultado; i++){
                System.out.println("Imprimindo o número " + i);
            }
        }

    }
}
