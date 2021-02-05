package com.br.zup;

import java.util.Scanner;

public class IO {

    public static void mostrarTexto(String texto){
        System.out.println(texto);
    }

    public static Scanner criarScanner(){
        return new Scanner(System.in);
    }
}
