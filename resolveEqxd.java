/*
 * Hardcoded Questionnaire ALPHA - Modulo Resolucion
 * This project is not complete, is just a prototype
 * by github.com/dev-lang
 */
package com.mycompany.myfirstjava;

/*
 * @author github.com/dev-lang
 */

public class resolveEqxd {

    public static void ResolveEqxd(String[] args) {
        char RespuestaCorrecta = 'C';
        char RespuestaElegida = 'C';

        if (RespuestaElegida == 'C' && RespuestaElegida == RespuestaCorrecta) {
            System.out.println("Respuesta correcta\nHa elegido:");
        } else {
            System.out.println("Respuesta incorrecta");
            System.out.println("La respuesta correcta es: " + RespuestaCorrecta);
        }

        switch (RespuestaElegida) {
            case 'A':
            case 'a':
                if (RespuestaElegida == 'A' && RespuestaElegida == RespuestaCorrecta) {
                    System.out.println("IBM");
                } else {
                    break;
                }
            case 'B':
            case 'b':
                if (RespuestaElegida == 'B' && RespuestaElegida == RespuestaCorrecta) {
                    System.out.println("Oracle");
                } else {
                    break;
                }
            case 'C':
            case 'c':
                if (RespuestaElegida == 'C' && RespuestaElegida == RespuestaCorrecta) {
                    System.out.println("Microsoft Corporation");
                } else {
                    break;
                }
            case 'D':
            case 'd':
                if (RespuestaElegida == 'D' && RespuestaElegida == RespuestaCorrecta) {
                    System.out.println("Sun Microsystems");
                } else {
                    break;
                }
            default:
                System.out.println("No es una respuesta válida");
        }
        System.out.println();
    }
}
