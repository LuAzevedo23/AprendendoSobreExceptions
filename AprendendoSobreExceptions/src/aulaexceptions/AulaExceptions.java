package aulaexceptions;

import java.util.logging.Level;
import java.util.logging.Logger;

public class AulaExceptions {

    public static void main(String[] args) {
        ContaBancaria contaRafael = new ContaBancaria(123, 456789);
        contaRafael.adicionarSaldo(500);
        contaRafael.setChequeEspecial(500);
        
        contaRafael = null;
        
        try {
            BancoService.subtrairSaldo(contaRafael, 1001);
        } catch (Exception ex) {
            Logger.getLogger(AulaExceptions.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

}
