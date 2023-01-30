package pt.com.rubira;
/**
 *
 * @author Everson Rubira
 *
 */

public class ContaClienteTeste {

    public static void main(String[] args) {

        //conta1

        Conta contaOne = new Conta();
        contaOne.setTitular("Maria");
        contaOne.setAgencia(123);
        contaOne.numeroConta(999999);
        contaOne.setSaldo(200.00);

        Cliente maria = new Cliente("Maria");
        maria.setConta(contaOne);
        System.out.println(maria.getConta().getTitular());
        System.out.println(maria.getConta().getAgencia());
        System.out.println(maria.getConta().getNumeroConta());

        //conta2

        Conta contaTwo = new Conta();
        contaTwo.setTitular("Pedro");
        contaTwo.setAgencia(435);
        contaTwo.setNumeroConta(888888);
        contaTwo.setSaldo(500.00);

        Cliente pedro = new Cliente("Pedro");
        pedro.setConta(contaTwo);
        System.out.println(pedro.getConta().getTitular());
        System.out.println(pedro.getConta().getAgencia());
        System.out.println(pedro.getConta().getNumeroConta());


    }

}
