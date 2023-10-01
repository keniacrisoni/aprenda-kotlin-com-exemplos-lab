// [Template no Kotlin Playground](https://pl.kotl.in/WcteahpyN)

enum class Nivel { BASICO, INTERMEDIARIO, AVANCADO }

class Usuario(val nome: String, val nivel: Nivel)

data class ConteudoEducacional(val nome: String, val duracao: Int = 60)

data class Formacao(val nome: String, val conteudos: List<ConteudoEducacional>) {

    val inscritos = mutableListOf<Usuario>()

    fun matricular(vararg usuarios: Usuario) {
        inscritos.addAll(usuarios)
    }

    fun usuariosInscritos() {
        for (u in inscritos) {
            var nome = u.nome
            var nivel = u.nivel
            println("Nome: $nome, Nivel: $nivel")
            
        }

    }

    fun imprimirFormacao() {
        println("----------------------------------------------------")
        println("Nome da Formação: $nome")
        println("----------------------------------------------------")
        println("Conteúdos:")
        println("----------------------------------------------------")
        for (conteudo in conteudos) {
            println(" - ${conteudo.nome}, Duração: ${conteudo.duracao} minutos")
        }
        println("----------------------------------------------------")
        println("Usuários Inscritos:")
        println("----------------------------------------------------")
        usuariosInscritos()
    }
}

fun main() {
    val usuario01 = Usuario("Maria", Nivel.BASICO)
    val usuario02 = Usuario("Jose", Nivel.INTERMEDIARIO)
    val usuario03 = Usuario("Ana", Nivel.AVANCADO)

    val conteudo01 = ConteudoEducacional("Java para iniciantes")
    val conteudo02 = ConteudoEducacional("Banco de dados relacional")
    val conteudo03 = ConteudoEducacional("Desafio de projetos")

    val conteudos: MutableList<ConteudoEducacional> = mutableListOf(conteudo01, conteudo02, conteudo03)

    val formacao = Formacao("Desenvolvedor", conteudos)

    formacao.matricular(usuario01, usuario02, usuario03)

    // Print the formation details
    formacao.imprimirFormacao()
}
