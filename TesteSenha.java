package br.com.alura.screenmatch.exerciciosExceptions.senhaException;

import java.util.Scanner;

public class TesteSenha {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite uma senha: ");
        String senha = scanner.nextLine();

        try{
            validaSenha(senha);
            System.out.println("Senha válida, acesso permitido!");
        }catch (SenhaInvalidaException e){
            System.out.println("Erro: " + e.getMessage());
        }
    }

    public static void validaSenha(String senha){
        if (senha.length()<8){
            throw new SenhaInvalidaException("A senha deve ter pelo menos 8 caracteres");
        }
    }
}
