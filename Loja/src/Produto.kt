package produto

open abstract class Produto(nome: String, preco: Float) {
    var nome: String = nome
    var preco: Float = preco

open abstract  fun exibirDetales()

}

