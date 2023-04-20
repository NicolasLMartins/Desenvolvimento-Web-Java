public class Produto {
    
    //atributos
    private int contador = 0;
    private double total;
    private int valor;  //Pode ser lida apenas na classe onde foi definida
    private Produto[] produtos;
    // private Produto[] Produtos2 = new Produto[10];

    // public int numero;  //pode ser lida de qualquer lugar do projeto
    // protected int sala; //pode ser lida de qualquer subclasse
    // default int doc;    //pode ser lida de qualquer lugar dentro do pacote

    // getters e setters
    public double getTotal() {
        return total;
    }
    public void setTotal(double total) {
        this.total = total;
    }
    
    public int getValor() {
        return valor;
    }
    public void setValor(int valor) {
        this.valor = valor;
    }

    // public Produto getProduto(int i) {
    //     return produtos[i];
    // }
    // public void setProduto(int i, Produto valor) {
    //     this.produtos[i] = valor;
    // }

    public void adiciona(Produto produto) {
        System.out.println("Adicionando: " + produto);
        this.produtos[contador] = produto;
        contador++;
        this.total += produto.getValor();
    }

    public void ListaProdutos() {
        
    }
}
