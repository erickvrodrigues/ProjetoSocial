import javax.swing.JOptionPane;
public class ProjetoSocial {
    public static void main(String[] args) {
        while (true) {

            String escolha = JOptionPane.showInputDialog("Escolha uma opção:\n"
                    + "1 - Distribuição de Alimentos\n"
                    + "2 - Trabalho Voluntário\n"
                    + "3 - Sair");


            if (escolha == null) {

                System.exit(0);
            } else if (escolha.equals("1")) {

                DistribuicaoAlimento distribuicao = new DistribuicaoAlimento("Ajuda todos","evento","rua 2","02/12/2023","01/01/2024","não perecivel",2.55F);
                distribuicao.validaProjeto(distribuicao.getNomeProjeto());
                JOptionPane.showMessageDialog(null, distribuicao.imprimeProjeto());


            } else if (escolha.equals("2")) {

                TrabalhoVoluntario voluntario = new TrabalhoVoluntario("Ajuda todos","evento","rua 2","02/12/2023","01/01/2024","não perecivel",3);
                voluntario.validaProjeto(voluntario.getNomeProjeto());
                JOptionPane.showMessageDialog(null, voluntario.imprimeProjeto());


            } else if (escolha.equals("3")) {

                System.exit(0);
            } else {

                JOptionPane.showMessageDialog(null, "Opção inválida. Por favor, escolha novamente.");
            }
        }
    }
}
