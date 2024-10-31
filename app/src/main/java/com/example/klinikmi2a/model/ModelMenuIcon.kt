package com.example.klinikmi2a.model

import com.example.klinikmi2a.R

data class ModelMenuIcon(
    var gambar : Int,
    var judul : String
)

object MockList{
    fun getModel() : List<ModelMenuIcon>{
        val itemModel1 = ModelMenuIcon(
            R.drawable.icontooth,
            "Dentist"
        )

        val itemModel2 = ModelMenuIcon(
            R.drawable.iconeye,
            "Ophthalmologyst"
        )

        val itemModel3 = ModelMenuIcon(
            R.drawable.iconheart,
            "Cardiologyst"
        )
        val itemModel4 = ModelMenuIcon(
            R.drawable.icontooth,
            "Dentist"
        )

        val itemModel5 = ModelMenuIcon(
            R.drawable.iconeye,
            "Ophthalmologyst"
        )

        val itemModel6 = ModelMenuIcon(
            R.drawable.iconheart,
            "Cardiologyst"
        )





        val itemList : ArrayList<ModelMenuIcon> = ArrayList()
        itemList.add(itemModel1)
        itemList.add(itemModel2)
        itemList.add(itemModel3)
        itemList.add(itemModel4)
        itemList.add(itemModel5)
        itemList.add(itemModel6)


        return itemList


    }

}


