package br.ubs.client;

import br.cbo.soap.CboManagerImpService;
import br.cbo.soap.CboService;
import br.cidade.soap.Cidade;
import br.cidade.soap.CidadeService;
import br.cidade.soap.CidadeServiceImpService;
import br.fuso.soap.FusoHorarioImplService;
import br.fuso.soap.FusoHorario;
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

        //Cidade
        CidadeServiceImpService serviceCidade = new CidadeServiceImpService();
        CidadeService cidade = serviceCidade.getCidadeServiceImpPort();

        Scanner scanner = new Scanner(System.in);
        String option;

        do {
            System.out.println("\n----------------------MENU PRINCIPAL-------------------------");
            System.out.println("1 - Gerenciar UBS");
            System.out.println("2 - Gerenciar Fusos Horários");
            System.out.println("3 - Gerenciar CBOs");
            System.out.println("3 - Gerenciar Cidades");
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
                case "4":
                    menuCidade(cidade, scanner);
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
        String option;
        do {
            System.out.println("\n----------------------MENU UBS-------------------------");
            System.out.println("1 - Criar UBS");
            System.out.println("2 - Listar UBS");
            System.out.println("3 - Alterar UBS");
            System.out.println("4 - Deletar UBS");
            System.out.println("0 - VOLTAR");
            System.out.println("---------------------------------------------------");
            System.out.print("Escolha uma opção: ");

            option = scanner.nextLine().trim();

            switch (option) {
                case "1":
                    System.out.print("\nDigite o cnes da UBS: ");
                    String cnes = scanner.nextLine();

                    System.out.print("\nDigite o nome da UBS: ");
                    String name = scanner.nextLine();

                    System.out.print("\nDigite o bairro da UBS: ");
                    String bairro = scanner.nextLine();

                    ubs.save(cnes, name, bairro);
                    break;

                case "2":
                    System.out.print("\nLista de UBS: \n");
                    for (int i = 0; i < ubs.getAll().size(); i++) {
                        System.out.println(i + " - " + ubs.getAll().get(i).getName());
                    }
                    break;

                case "3":
                    System.out.print("\nInforme o índice da UBS que deseja alterar: \n");
                    for (int i = 0; i < ubs.getAll().size(); i++) {
                        System.out.println(i + " - " + ubs.getAll().get(i).getName());
                    }
                    int updateUBS = Integer.parseInt(scanner.nextLine());

                    System.out.print("\nDigite o cnes da UBS: ");
                    String newCnes = scanner.nextLine();

                    System.out.print("\nDigite o nome da UBS: ");
                    String newName = scanner.nextLine();

                    System.out.print("\nDigite o bairro da UBS: ");
                    String newBairro = scanner.nextLine();

                    ubs.update(updateUBS, newCnes, newName, newBairro);
                    break;

                case "4":
                    System.out.print("\nInforme o índice da UBS que deseja deletar: \n");
                    for (int i = 0; i < ubs.getAll().size(); i++) {
                        System.out.println(i + " - " + ubs.getAll().get(i).getName());
                    }
                    int deleteUbs = Integer.parseInt(scanner.nextLine());

                    ubs.delete(deleteUbs);
                    break;

                case "0":
                    break;

                default:
                    System.out.println("\nOpção inválida. Tente novamente! :'(");
                    break;
            }
        } while (!option.equals("0"));
    }

    private static void menuFusoHorario(FusoHorarioService fuso, Scanner scanner) {
        String option;
        do {
            System.out.println("\n----------------------MENU FUSO HORÁRIO-------------------------");
            System.out.println("1 - Listar todos os fusos");
            System.out.println("2 - Buscar fuso por CNES");
            System.out.println("3 - Adicionar fuso horário");
            System.out.println("4 - Remover fuso horário");
            System.out.println("5 - Atualizar fuso horário");
            System.out.println("0 - VOLTAR");
            System.out.println("---------------------------------------------------------------");
            System.out.print("Escolha uma opção: ");

            option = scanner.nextLine().trim();

            switch (option) {
                case "1":
                    System.out.println("\nLista de Fusos Horários:");
                    for (FusoHorario fh : fuso.getAll()) {
                        System.out.println("CNES: " + fh.getCnes() + " | Cidade: " + fh.getCidade() +
                                " | UTC: " + fh.getFuso());
                    }
                    break;

                case "2":
                    System.out.print("\nDigite o CNES para buscar: ");
                    String cnesBusca = scanner.nextLine();
                    FusoHorario fh = fuso.getByCNES(cnesBusca);
                    if (fh != null) {
                        System.out.println("Fuso encontrado:");
                        System.out.println("CNES: " + fh.getCnes() + " | Cidade: " + fh.getCidade() +
                                " | UTC: " + fh.getFuso());
                    } else {
                        System.out.println("Fuso não encontrado para o CNES: " + cnesBusca);
                    }
                    break;

                case "3":
                    System.out.print("\nDigite o CNES: ");
                    String novoCnes = scanner.nextLine();
                    System.out.print("Digite a cidade: ");
                    String cidade = scanner.nextLine();
                    System.out.print("Digite o UTC (ex: -03:00): ");
                    String utc = scanner.nextLine();

                    FusoHorario novoFuso = new FusoHorario();
                    novoFuso.setCnes(novoCnes);
                    novoFuso.setCidade(cidade);
                    novoFuso.setFuso(utc);

                    boolean adicionado = fuso.addFuso(novoFuso);
                    if (adicionado) {
                        System.out.println("Fuso adicionado com sucesso!");
                    } else {
                        System.out.println("Falha ao adicionar fuso.");
                    }
                    break;

                case "4":
                    System.out.print("\nDigite o CNES do fuso a ser removido: ");
                    String cnesRemover = scanner.nextLine();
                    boolean removido = fuso.removeFusoByCNES(cnesRemover);
                    if (removido) {
                        System.out.println("Fuso removido com sucesso!");
                    } else {
                        System.out.println("Falha ao remover fuso ou fuso não encontrado.");
                    }
                    break;

                case "5":
                    System.out.print("\nDigite o CNES do fuso a ser atualizado: ");
                    String cnesAtualizar = scanner.nextLine();
                    FusoHorario fusoExistente = fuso.getByCNES(cnesAtualizar);
                    if (fusoExistente == null) {
                        System.out.println("Fuso não encontrado!");
                        break;
                    }

                    System.out.print("Digite a nova cidade (atual: " + fusoExistente.getCidade() + "): ");
                    String novaCidade = scanner.nextLine();
                    System.out.print("Digite o novo UTC (atual: " + fusoExistente.getFuso() + "): ");
                    String novoUtc = scanner.nextLine();

                    fusoExistente.setCidade(novaCidade);
                    fusoExistente.setFuso(novoUtc);

                    boolean atualizado = fuso.updateFuso(fusoExistente);
                    if (atualizado) {
                        System.out.println("Fuso atualizado com sucesso!");
                    } else {
                        System.out.println("Falha ao atualizar fuso.");
                    }
                    break;

                case "0":
                    break;

                default:
                    System.out.println("\nOpção inválida. Tente novamente! :'(");
                    break;
            }
        } while (!option.equals("0"));
    }

    private static void menuCBO(CboService cbo, Scanner scanner) {
        String option;
        do {
            System.out.println("\n----------------------MENU CBO-------------------------");
            System.out.println("1 - Listar todos os CBOs");
            System.out.println("2 - Buscar CBO por código");
            System.out.println("3 - Adicionar/Atualizar CBO");
            System.out.println("4 - Remover CBO");
            System.out.println("0 - VOLTAR");
            System.out.println("---------------------------------------------------");
            System.out.print("Escolha uma opção: ");

            option = scanner.nextLine().trim();

            switch (option) {
                case "1":
                    System.out.println("\nLista de CBOs:");
                    for (int i = 0; i < cbo.getListCbo().size(); i++) {
                        System.out.println(i + " - Código: " + cbo.getListCbo().get(i).getCodCbo() +
                                " | Profissão: " + cbo.getListCbo().get(i).getProfissao());
                    }
                    break;

                case "2":
                    System.out.print("\nDigite o código CBO para buscar: ");
                    String codBusca = scanner.nextLine();
                    String profissao = cbo.getCbo(codBusca).getProfissao();
                    if (profissao != null && !profissao.isEmpty()) {
                        System.out.println("CBO encontrado:");
                        System.out.println("Código: " + codBusca + " | Profissão: " + profissao);
                    } else {
                        System.out.println("CBO não encontrado para o código: " + codBusca);
                    }
                    break;

                case "3":
                    System.out.print("\nDigite o código CBO: ");
                    String codCbo = scanner.nextLine();
                    System.out.print("Digite a profissão: ");
                    String novaProfissao = scanner.nextLine();

                    cbo.setCbo(codCbo, novaProfissao);
                    System.out.println("CBO adicionado/atualizado com sucesso!");
                    break;

                case "4":
                    System.out.print("\nInforme o índice do CBO que deseja remover: \n");
                    for (int i = 0; i < cbo.getListCbo().size(); i++) {
                        System.out.println(i + " - " + cbo.getListCbo().get(i).getProfissao());
                    }

                    try {
                        int index = Integer.parseInt(scanner.nextLine());
                        String profissaoRemovida = cbo.removeCbo(index).getProfissao();
                        if (profissaoRemovida != null) {
                            System.out.println("CBO removido: " + profissaoRemovida);
                        } else {
                            System.out.println("Índice inválido!");
                        }
                    } catch (NumberFormatException e) {
                        System.out.println("Por favor, digite um número válido!");
                    }
                    break;

                case "0":
                    break;

                default:
                    System.out.println("\nOpção inválida. Tente novamente! :'(");
                    break;
            }
        } while (!option.equals("0"));
    }

    private static void menuCidade(CidadeService cidadeService, Scanner scanner) {
        String option;
        do {
            System.out.println("\n----------------------MENU CIDADES-------------------------");
            System.out.println("1 - Adicionar Cidade");
            System.out.println("2 - Listar Cidades");
            System.out.println("3 - Buscar Cidade por índice");
            System.out.println("4 - Atualizar Cidade");
            System.out.println("5 - Remover Cidade");
            System.out.println("0 - VOLTAR");
            System.out.println("--------------------------------------------------------");
            System.out.print("Escolha uma opção: ");

            option = scanner.nextLine().trim();

            switch (option) {
                case "1":
                    System.out.print("Digite o código IBGE: ");
                    String codigoIbge = scanner.nextLine();

                    System.out.print("\nDigite o nome da cidade: ");
                    String nome = scanner.nextLine();

                    Cidade novaCidade = new Cidade();
                    novaCidade.setIbge(codigoIbge);
                    novaCidade.setNome(nome);

                    cidadeService.insertCidade(novaCidade);
                    System.out.println("Cidade adicionada com sucesso!");
                    break;

                case "2":
                    System.out.println("\nLista de Cidades:");
                    for (int i = 0; i < cidadeService.getCidades().size(); i++) {
                        System.out.println(i + " - " + cidadeService.getCidades().get(i).getNome() +
                                " (IBGE: " + cidadeService.getCidades().get(i).getIbge() + ")");
                    }
                    break;

                case "3":
                    System.out.print("\nDigite o índice da cidade: ");
                    try {
                        int index = Integer.parseInt(scanner.nextLine());
                        if (index >= 0 && index < cidadeService.getCidades().size()) {
                            Cidade c = cidadeService.getCidade(index);
                            System.out.println("Cidade encontrada:");
                            System.out.println("Código IBGE: " + c.getIbge());
                            System.out.println("Nome: " + c.getNome());
                        } else {
                            System.out.println("Índice inválido!");
                        }
                    } catch (NumberFormatException e) {
                        System.out.println("Por favor, digite um número válido!");
                    }
                    break;

                case "4":
                    System.out.println("\nLista de Cidades disponíveis para atualização:");
                    for (int i = 0; i < cidadeService.getCidades().size(); i++) {
                        System.out.println(i + " - " + cidadeService.getCidades().get(i).getNome());
                    }

                    System.out.print("Digite o índice da cidade a atualizar: ");
                    try {
                        int indexUpdate = Integer.parseInt(scanner.nextLine());
                        if (indexUpdate >= 0 && indexUpdate < cidadeService.getCidades().size()) {
                            Cidade cidadeAtual = cidadeService.getCidade(indexUpdate);

                            System.out.print("Digite o novo nome (" + cidadeAtual.getNome() + "): ");
                            String novoNome = scanner.nextLine();


                            System.out.print("Digite o novo código IBGE (" + cidadeAtual.getIbge() + "): ");
                            String novoIbge = scanner.nextLine();

                            Cidade cidadeAtualizada = new Cidade();
                            cidadeAtualizada.setNome(novoNome.isEmpty() ? cidadeAtual.getNome() : novoNome);
                            cidadeAtualizada.setIbge(novoIbge.isEmpty() ? cidadeAtual.getIbge() : novoIbge);

                            cidadeService.updateCidade(cidadeAtualizada);
                            System.out.println("Cidade atualizada com sucesso!");
                        } else {
                            System.out.println("Índice inválido!");
                        }
                    } catch (NumberFormatException e) {
                        System.out.println("Por favor, digite um número válido!");
                    }
                    break;

                case "5":
                    System.out.println("\nLista de Cidades disponíveis para remoção:");
                    for (int i = 0; i < cidadeService.getCidades().size(); i++) {
                        System.out.println(i + " - " + cidadeService.getCidades().get(i).getNome());
                    }

                    System.out.print("Digite o índice da cidade a remover: ");
                    try {
                        int indexDelete = Integer.parseInt(scanner.nextLine());
                        if (indexDelete >= 0 && indexDelete < cidadeService.getCidades().size()) {
                            cidadeService.deleteCidade(indexDelete);
                            System.out.println("Cidade removida com sucesso!");
                        } else {
                            System.out.println("Índice inválido!");
                        }
                    } catch (NumberFormatException e) {
                        System.out.println("Por favor, digite um número válido!");
                    }
                    break;

                case "0":
                    break;

                default:
                    System.out.println("\nOpção inválida. Tente novamente! :'(");
                    break;
            }
        } while (!option.equals("0"));
    }
}