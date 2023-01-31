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


        System.out.println("--------------------");
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


        System.out.println("--------------------");
        //conta3

        Conta contaThree = new Conta();
        contaThree.setTitular("Claudia");
        contaThree.setAgencia(556);
        contaThree.setNumeroConta(865734);
        contaThree.setSaldo(433.09);

        Cliente Claudia = new Cliente("Claudia");
        Claudia.setConta(contaThree);
        System.out.println(Claudia.getConta().getTitular());
        System.out.println(Claudia.getConta().getAgencia());
        System.out.println(Claudia.getConta().getNumeroConta());

    }

}
