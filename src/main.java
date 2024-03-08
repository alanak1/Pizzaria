public class main {
    public static void main(String[] args) {
        Usuario cliente = new Usuario("Jorge", "4199999999");
        cliente.setEndereco("Rua do jorge");
        cliente.setDataNascimento("19/04/2004");

        Usuario clienteDois = new Usuario("Raquel", "4199111111");
        clienteDois.setEndereco("Rua das flores");
        clienteDois.setDataNascimento("31/08/1994");

        System.out.println(cliente);
        var coco = cliente;
        System.out.println(coco);

        System.out.println(cliente.getNome());
        coco.setNome("Juliana");
        System.out.println(cliente.getNome());

        Usuario clienteTres = new Usuario("Mafe", "4199999999");
        clienteTres.setEndereco("Rua da Dolore");
        clienteTres.setDataNascimento("14/05/1003");

        Usuario clienteQuatro = new Usuario("Joana", "41999999");
        clienteQuatro.setEndereco("Rua das Maldivas");
        clienteQuatro.setDataNascimento("25/05/1965");

        Usuario clienteCinco = new Usuario("Kauanny", "4191980000");
        clienteCinco.setEndereco("Rua Porta Dobrada");
        clienteCinco.setDataNascimento("21/12/2002");

        Produto pizzaProdutoUm = new Produto("Pizza de Brocolis", 25.00, 1, "Pizza tradicional de queijo com brocolis");


        Produto pizzaProdutoDois = new Produto("Pizza Marguerita", 22.99, 1, "Pizza tradicional sabor Marguerita");

        Produto pizzaProdutoTres = new Produto("Pizza de Peperoni", 29.90, 1, "Pizza tradicional sabor Calabresa");
    }
}
