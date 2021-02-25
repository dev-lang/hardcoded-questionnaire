/*
 * Hardcoded Questionnaire ALPHA
 * This project is not complete, is just a prototype
 * by github.com/dev-lang
 */
package com.devlang.questionnaire;

import java.util.Scanner;

/*
 * @author github.com/dev-lang
 */
public class main {

    public static void main(String[] args) {
        final char respuestaElegida = 'C';
        final char respuestaCorrecta = 'C';
        //char ingreso = 'a';
        String pregunta = "¿Que empresa utiliza MS como una forma de reducción?";
        var opcionUno = "IBM";
        var opcionDos = "Oracle";
        var opcionTres = "Microsoft";
        var opcionCuatro = "Sun Microsystems";
        var separadorDeOpciones = "\n ---- \n";
        String opcionesDePregunta =     "A: " + opcionUno + separadorDeOpciones +
                                        "B: " + opcionDos + separadorDeOpciones +
                                        "C: " + opcionTres + separadorDeOpciones +
                                        "D: " + opcionCuatro + "\n";
        System.out.println(pregunta);
        System.out.println(opcionesDePregunta);
        scanInput();
        procesarInput();
        resolveEqxd.ResolveEqxd(args);
        //if (ingreso == respuestaCorrecta) {
        /*  System.out.println("ok");
    } else {
      System.out.println("no ok");
    }*/

    }

    public static void scanInput() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese su respuesta:");
        var ingreso = scanner.nextLine();
        System.out.println("Ha ingresado: " + ingreso);
    }

    public static void procesarInput() {
        System.out.println("Codigo Hardcodeado");
    }

    public static void sinUtilizar() {
        System.out.println("Codigo Hardcodeado");
    }

}
