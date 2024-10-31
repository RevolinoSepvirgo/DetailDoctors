package com.example.klinikmi2a

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.klinikmi2a.adapter.AdapterHastag
import com.example.klinikmi2a.adapter.adapterDoctors
import com.example.klinikmi2a.adapter.adapterIcon
import com.example.klinikmi2a.model.MockList
import com.example.klinikmi2a.model.MockList1
import com.example.klinikmi2a.model.MockList2
import com.example.klinikmi2a.model.ModelHastag
import com.example.klinikmi2a.model.ModelLIstDoctors
import com.example.klinikmi2a.model.ModelMenuIcon

class Display : AppCompatActivity() {
    private lateinit var rv_hastag : RecyclerView
    private lateinit var rv_icon : RecyclerView
    private lateinit var rv_dokter : RecyclerView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_display)
        rv_hastag = findViewById(R.id.rv_hastag)
        rv_icon = findViewById(R.id.rv_icon)
        rv_dokter = findViewById(R.id.rv_dokter)
        ///recycle view hastag
        rv_hastag.layoutManager = LinearLayoutManager(this,LinearLayoutManager.HORIZONTAL,true)
        val adapter = AdapterHastag(MockList1.getModel() as ArrayList<ModelHastag>,this)
        rv_hastag.adapter = adapter

        ///recyle view icon
        rv_icon.layoutManager = LinearLayoutManager(this,LinearLayoutManager.HORIZONTAL,true)
        val adapter1 = adapterIcon(MockList.getModel() as ArrayList<ModelMenuIcon>,this)
        rv_icon.adapter = adapter1

        //recycle view dokter
        rv_dokter.layoutManager = GridLayoutManager(this, 1)
        val adapter2 = adapterDoctors(MockList2.getModel() as ArrayList<ModelLIstDoctors>, this)
        rv_dokter.adapter = adapter2



        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    }
}