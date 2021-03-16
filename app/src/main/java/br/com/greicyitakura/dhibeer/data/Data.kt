package br.com.greicyitakura.dhibeer.data

import br.com.greicyitakura.dhibeer.R

public object Data {

    fun data(): List<Beercraft>{

        val beer = Beer(
            "MoshPit - Bamberg",
            "Cerveja forte e escura, mistura de 3 estilos clássicos alemão, com notas torradas, defumadas e boa presença dos lúpulos utilizados.",
            R.drawable.moshpit,
            49.90)

        val listBeers = mutableListOf<Beer>()
        for (i in 1..5) {listBeers.add(beer)}

        val botecodoimportado = Beercraft(
            "Boteco do Importado",
            " Av. Itamarati, 1480 - Vila Curuca Santo André - SP",
            R.drawable.btcimportado,
            listBeers.toList())

        val clubedomalte = Beercraft(
            "Clube do Malte",
            "Av. Dr. Décio de Tolêdo Leite, 512 - Jardim das Oliveiras São Paulo - SP",
            R.drawable.clubedomalte,
            listBeers.toList())

        val emporiodacerveja = Beercraft(
            "Empório da Cerveja",
            " R. Mateus Grou, 122 - Pinheiros São Paulo - SP",
            R.drawable.empcerveja,
            listBeers.toList())


        val beercraftList = listOf<Beercraft>(botecodoimportado,clubedomalte,emporiodacerveja)

        return beercraftList
    }
}
