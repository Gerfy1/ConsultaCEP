public class Cep {
    private String cep;
    private String logradouro;
    private String bairro;
    private String localidade;
    private String uf;
    private String ddd;
    private String erro;

    @Override
    public String toString() {
        return "Informações do CEP:\n" +
                "CEP: '" + cep + '\'' +
                "\nLogradouro: '" + logradouro + '\'' +
                "\nBairro: '" + bairro + '\'' +
                "\nCidade: '" + localidade + '\'' +
                "\nUF: '" + uf + '\'' +
                "\nDDD: '" + ddd + '\'' +
                ' ';
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public String getLogradouro() {
        return logradouro;
    }

    public void setLogradouro(String logradouro) {
        this.logradouro = logradouro;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public String getLocalidade() {
        return localidade;
    }

    public void setLocalidade(String localidade) {
        this.localidade = localidade;
    }

    public String getUf() {
        return uf;
    }

    public void setUf(String uf) {
        this.uf = uf;
    }

    public String getDdd() {
        return ddd;
    }

    public void setDdd(String ddd) {
        this.ddd = ddd;
    }

    public Cep(String cep) {
        this.cep = cep;
    }
}