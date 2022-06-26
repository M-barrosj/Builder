package Builder2;

public class Cadastro {

    public static void main(String[] args) {
        Pessoa pessoa = PessoaBuilder.builder()
                .addNome("Alice", "dos Santos")
                .addDtNascimento(22, 5, 1980)
                .addLogradouro("Rua das Oliveiras")
                .addNumero("272")
                .addComplemento("Bloco B")
                .addBairro("Centro")
                .addCidade("Porto Alegre")
                .addPais("Brasil")
                .addFone(51, 32221236, Telefone.TipoFone.RESIDENCIAL)
                .addFone(51, 99623632, Telefone.TipoFone.CELULAR)
                .get();

        System.out.println(pessoa.toString());
    }
}