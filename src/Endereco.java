public record Endereco(String cep, String logradouro, String bairro, String localidade, String uf, String ddd ) {
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
}
