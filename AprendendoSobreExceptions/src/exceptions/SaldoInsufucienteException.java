/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exceptions;

/**
 *
 * @author lu azevedo
 */
public class SaldoInsufucienteException extends RuntimeException {

    public SaldoInsufucienteException() {
        super("Saldo Insuficiente!");
    }

    public SaldoInsufucienteException(String message) {
        super(message);
    }

    public SaldoInsufucienteException(String message, Throwable cause) {
        super(message, cause);
    }
    
}
