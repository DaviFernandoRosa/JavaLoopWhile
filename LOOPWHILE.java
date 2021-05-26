/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *Note que a variável contador é iniciada com 0, a cada loop executado é somado
1 ao contador. Perceba que o while irá manter a repetição enquanto a variável
contador for menor que 5.
Outro ponto importante é que a variável contador é inicializada antes de
chegar ao while, assim, o while comparará a sentença e só depois permitirá a
execução do bloco. Se quisermos fazer todo o bloco primeiro e só depois fazer
a comparação, devemos utilizar o comando DO WHILE
 * @author Davi
 */
public class LOOPWHILE {
    
    
    public static void main(String[]args){
    
    
    
        int contador = 0;
        while (contador <= 5){
          System.out.println("Repetição Nro: " + contador);
          contador++;

        }
     
        
    }
    
}
