package br.ubs.client;


import br.cbo.soap.CboManagerImpService;
import br.cbo.soap.CboService;
import br.fuso.soap.FusoHorarioImplService;
import br.fuso.soap.FusoHorarioService;
import br.ubs.soap.IUnidadeSaudeService;
import br.ubs.soap.UnidadeSaudeImplService;

import java.util.Scanner;

public class SOAPClientUBS {
    public static void main(String[] args) {
        // Implements
        // UBS
        UnidadeSaudeImplService serviceUbs = new UnidadeSaudeImplService();
        IUnidadeSaudeService ubs = serviceUbs.getUnidadeSaudeImplPort();

        // Fuso
        FusoHorarioImplService serviceFuso = new FusoHorarioImplService();
        FusoHorarioService fuso = serviceFuso.getFusoHorarioImplPort();

        // CBO
        CboManagerImpService serviceCbo = new CboManagerImpService();
        CboService cbo = serviceCbo.getCboManagerImpPort();

        Scanner scanner = new Scanner(System.in);
        String option;

        do {
            System.out.println("\n----------------------MENU PRINCIPAL-------------------------");
            System.out.println("1 - Gerenciar UBS");
            System.out.println("2 - Gerenciar Fusos Horários");
            System.out.println("3 - Gerenciar CBOs");
            System.out.println("0 - SAIR");
            System.out.println("-------------------------------------------------------------");
            System.out.print("Escolha uma opção: ");

            option = scanner.nextLine().trim();

            switch (option) {
                case "1":
                    menuUBS(ubs, scanner);
                    break;
                case "2":
                    menuFusoHorario(fuso, scanner);
                    break;
                case "3":
                    menuCBO(cbo, scanner);
                    break;
                case "0":
                    System.out.println("\nAté a próxima! ^^");
                    break;
                default:
                    System.out.println("\nOpção inválida. Tente novamente! :'(");
                    break;
            }
        } while (!option.equals("0"));
    }

    private static void menuUBS(IUnidadeSaudeService ubs, Scanner scanner) {
    }

    private static void menuFusoHorario(FusoHorarioService fuso, Scanner scanner) {
    }

    private static void menuCBO(CboService cbo, Scanner scanner) {
    }
}
