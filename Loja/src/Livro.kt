package produto

class Livro(nome: String, preco: Float, autor: String): Produto(nome, preco){
    var autor: String = autor
    override fun exibirDetales() {
        println(" O livro é: "${this.nome},o autor é: ${this.autor},o valor é: ${this.preco}")
    }


}