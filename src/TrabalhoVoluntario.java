public class TrabalhoVoluntario extends Projeto{
    private String tipoTrabalho;
    private int duracaoTrabalho;

    public TrabalhoVoluntario(String nomeProjeto, String descricao, String endereco, String dataInicio, String dataFim, String tipoTrabalho, int duracao) {
        super(nomeProjeto, descricao, endereco, dataInicio, dataFim);
        this.tipoTrabalho = tipoTrabalho;
        this.duracaoTrabalho = duracao;
    }

    public String getTipoTrabalho() {
        return tipoTrabalho;
    }

    public void setTipoTrabalho(String tipoTrabalho) {
        this.tipoTrabalho = tipoTrabalho;
    }

    public int getDuracaoTrabalho() {
        return duracaoTrabalho;
    }

    public void setDuracaoTrabalho(int duracaoTrabalho) {
        this.duracaoTrabalho = duracaoTrabalho;
    }

    @Override
    public boolean validaProjeto(String nomeProjeto) {
        if(getDuracaoTrabalho() > 2){
            return true;
        }
        return false;
    }

    @Override
    public String imprimeProjeto() {
        String retorno = "";
        retorno = getNomeProjeto()+", "+getDescricao()+", "+getDataInicio()+", "+getDataFim()+", "+getTipoTrabalho()+", "+getDuracaoTrabalho();
        return retorno;
    }
}
