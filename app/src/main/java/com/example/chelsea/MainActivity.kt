package com.example.chelsea

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.chelsea.Kelas

class MainActivity : AppCompatActivity() {
    val list = ArrayList<Kelas>()
    val listNama = arrayOf(
        "ADINDA WIDIA CHOIRUNNISA",
        "ANDREAS ADI MINARSO",
        "ANITA SARI",
        "ARDIAN MUHAMMAD IQBAL",
        "BAGAS SAPUTRA",
        "CHELSEA ADITYA SUYATNO",
        "DIMAS ILHAMSYAH RAMADHAN",
        "DINA MUSTIKA",
        "DWI RANI SYARIFAH",
        "FIFIT SHOLIKHATUL MUFALAH",
        "FIKA ISMATUL HAWA"
    )


    lateinit var kelasView: RecyclerView
    lateinit var kelasAdapter: KelasAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        kelasView = findViewById(R.id.kelasView)
        kelasView.layoutManager = LinearLayoutManager(this)



        kelasAdapter = KelasAdapter(list)
        kelasAdapter.notifyDataSetChanged()
        kelasView.adapter = kelasAdapter
    }
}