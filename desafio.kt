// [Template no Kotlin Playground](https://pl.kotl.in/WcteahpyN)
fun main() {

//Criação de mutableList de usuarios e cadastro de usuarios 
val usuario = mutableListOf<Usuarios>()

usuario.add('Adriana Silva',30,'adri.silva@hotmail.com')
usuario.add('Carlos Pereira',35,'carlosP@yahoo.com.br')
usuario.add('Josep Dionisio',28,'dionisio.josep@hotmail.com')
usuario.add('Carla Santana',21,'carlinhaSantana@outlook.com')
usuario.add('Maria Candido',27,'m.candido@outlook.com')

usuario.add('Severino Jonatas',35,'severoJ@uol.com.br')
usuario.add('Lucas Tenorio',22,'tenorioLucas@apple.com')
usuario.add('Monica Conrrado',18,'monica_conrrado@gmail.com')
usuario.add('Felipe Jose',25,'felipe.jose@hotmail.com')
usuario.add('Felicia Agnes',25,'felicia.agnes@gmail.com')


//Criação de mutableList de conteudo e cadastro de conteudos
val android = mutableListOf<ConteudoEducacional>()
val kotlin = mutableListOf<ConteudoEducacional>()
val logica = mutableListOf<ConteudoEducacional>()
val metodologiasAgeis = mutableListOf<ConteudoEducacional>()
val comunicacaoWeb = mutableListOf<ConteudoEducacional>()

android.add('Android',186,Nivel.INTERMEDIARIO)
kotlin.add('Kotlin',72,Nivel.INTERMEDIARIO)
logica.add('Lógica de programação',30,Nivel.BASICO)
metodologiasAgeis.add('Scrum',9,Nivel.AVANCADO)
comunicacaoWeb.add('Oque é a WEB, e os conseitos de HTTP',3,Nivel.BASICO)


//Criação de mutableList de formação e cadastro de formações
val androidDeveloper = mutableListOf<Formacao>()
val beckendKotlin = mutableListOf<Formacao>()

androidDeveloper.add('Android Developer',listOf(logica,kotlin,android,metodologiasAgeis))
beckendKotlin.add('Backend Kotlin',listOf(logica,kotlin,comunicacaoWeb,metodologiasAgeis))


for(i in Usuarios){
    println(i.Nome)
    //androidDeveloper.matricular()
}




}
