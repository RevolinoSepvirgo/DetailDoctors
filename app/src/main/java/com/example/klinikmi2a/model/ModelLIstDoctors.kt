package com.example.klinikmi2a.model

import com.example.klinikmi2a.R

data class ModelLIstDoctors(
    var imgDoctors : Int,
    var namaDoctors: String,
    var spesDoctors: String,
     var jumlahReview: String,
    var angkaRating : String

)
object MockList2 {
    fun getModel(): List<ModelLIstDoctors> {
        val itemModel1 = ModelLIstDoctors(
            R.drawable.dokter1,
            "Dr.Floyd Miles",
            "Pediatrics",
            "(123 reviews)",
            "4.9"
        )
        val itemModel2 = ModelLIstDoctors(
            R.drawable.dokter2,
            "Dr.Guy Hawkins",
            "Dentist",
            "(85 reviews)",
            "4.9"
        )
        val itemModel3 = ModelLIstDoctors(
            R.drawable.dokter3,
            "Dr.Jane Cooper",
            "Cardiologist",
            "(44 reviews)",
            "4.7"
        )
        val itemModel4 = ModelLIstDoctors(
            R.drawable.dokter4,
            "Dr.Jacob Jones",
            "Nephrologyst",
            "(101 reviews)",
            "5.0"
        )
        val itemModel5 = ModelLIstDoctors(
            R.drawable.dokter5,
            "Dr.Savannah Nguyen",
            "Urologyst",
            "(123 reviews)",
            "4.9"
        )
        val itemModel6 = ModelLIstDoctors(
            R.drawable.dokter1,
            "Dr.Floyd Miles",
            "Pediatrics",
            "(123 reviews)",
            "4.9"
        )
        val itemModel7 = ModelLIstDoctors(
            R.drawable.dokter2,
            "Dr.Guy Hawkins",
            "Dentist",
            "(85 reviews)",
            "4.9"
        )

        val itemList: ArrayList<ModelLIstDoctors> = ArrayList()
        itemList.add(itemModel1)
        itemList.add(itemModel2)
        itemList.add(itemModel3)
        itemList.add(itemModel4)
        itemList.add(itemModel5)
        itemList.add(itemModel6)
        itemList.add(itemModel7)

        return itemList

    }
}

