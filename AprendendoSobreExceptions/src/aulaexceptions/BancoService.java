package aulaexceptions;

import exceptions.SaldoInsufucienteException;

public class BancoService {

    public static void subtrairSaldo(ContaBancaria contaBancaria, double valorASubtrair) throws Exception {
        try {
            contaBancaria.subtrairSaldo(valorASubtrair);

            System.out.println(contaBancaria.toString());
        } catch (SaldoInsufucienteException ex) {
            throw ex;
        } catch (Exception ex){
            System.out.println("QUALQUER OUTRA EXCEPTION");
            
            throw new SaldoInsufucienteException("Mensagem alternativa", ex);
        }
    }
}