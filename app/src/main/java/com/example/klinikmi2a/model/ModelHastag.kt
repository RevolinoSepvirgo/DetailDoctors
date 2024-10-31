package com.example.klinikmi2a.model

data class ModelHastag(

    var hastag : String
)

object MockList1{
    fun getModel() : List<ModelHastag>{
        val itemModel1 = ModelHastag(
            "#mounth"
        )

        val itemModel2 = ModelHastag(
            "#eyes"
        )

        val itemModel3 = ModelHastag(
            "#surgeon"
        )

        val itemModel4 = ModelHastag(
            "#teeth"
        )

        val itemModel5 = ModelHastag(
            "#heart"
        )

        val itemList : ArrayList<ModelHastag> = ArrayList()
        itemList.add(itemModel1)
        itemList.add(itemModel2)
        itemList.add(itemModel3)
        itemList.add(itemModel4)
        itemList.add(itemModel5)

        return itemList
    }
}
