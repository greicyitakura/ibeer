package br.com.greicyitakura.dhibeer.data

data class Beercraft(
    val BeercraftName: String,
    val BeercraftAddress: String,
    val BeercraftImg: Int,
    val BeercraftMenus:List<Beer>)