package br.com.sfd.mvp.application;

import java.util.Scanner;
import br.com.sfd.mvp.models.Usuario;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        boolean executar = true;
        Usuario usuario = new Usuario(); // Criar instância da classe Usuario

        while (executar) {
            System.out.println("===== MENU =====");
            System.out.println("1. Criar usuário");
            System.out.println("2. Remover usuário");
            System.out.println("3. Validar usuário");
            System.out.println("4. Exibir usuários"); // Opção para exibir usuários
            System.out.println("0. Sair");
            System.out.print("Escolha uma opção: ");
            int opcao = scanner.nextInt();
            scanner.nextLine(); // Limpar o buffer de entrada

            switch (opcao) {
                case 1:
                    System.out.print("Informe o ID do usuário: ");
                    int idUsuario = scanner.nextInt();
                    scanner.nextLine();
                    System.out.print("Informe o nome do usuário: ");
                    String nomeUsuario = scanner.nextLine();
                    System.out.print("Informe a senha do usuário: ");
                    String senhaUsuario = scanner.nextLine();
                    System.out.print("Confirme a senha do usuário: ");
                    String confirmaSenhaUsuario = scanner.nextLine();

                    Usuario novoUsuario = new Usuario(idUsuario, nomeUsuario, senhaUsuario, confirmaSenhaUsuario);
                    usuario.criarUsuario(novoUsuario);
                    System.out.println("Usuário criado com sucesso!");
                    break;
                case 2:
                    System.out.print("Informe o ID do usuário que deseja remover: ");
                    int idRemover = scanner.nextInt();
                    scanner.nextLine();
                    Usuario usuarioRemover = usuario.buscarUsuarioPorId(idRemover);
                    if (usuarioRemover != null) {
                        usuario.removerUsuario(usuarioRemover);
                        System.out.println("Usuário removido com sucesso!");
                    } else {
                        System.out.println("Usuário não encontrado.");
                    }
                    break;
                case 3:
                    System.out.print("Informe o ID do usuário que deseja validar: ");
                    int idValidar = scanner.nextInt();
                    scanner.nextLine();
                    Usuario usuarioValidar = usuario.buscarUsuarioPorId(idValidar);
                    if (usuarioValidar != null) {
                        boolean valido = usuarioValidar.validarUsuario();
                        if (valido) {
                            System.out.println("Usuário válido.");
                        } else {
                            System.out.println("Usuário inválido.");
                        }
                    } else {
                        System.out.println("Usuário não encontrado.");
                    }
                    break;
                case 4:
                    usuario.exibirUsuarios();
                    break;
                case 0:
                    executar = false;
                    break;
                default:
                    System.out.println("Opção inválida. Por favor, escolha novamente.");
                    break;
            }

            System.out.println(); // Linha em branco para separar as iterações
        }

        System.out.println("Programa encerrado.");
        scanner.close();
    }
}


