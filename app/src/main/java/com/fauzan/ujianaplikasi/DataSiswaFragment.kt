package com.fauzan.ujianaplikasi

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.annotation.Nullable
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.*
import kotlinx.android.synthetic.main.fragment_data_siswa.*

class DataSiswaFragment : Fragment() {
    lateinit var listSiswa:ArrayList<DataSiswa>
    private fun simulasiDataSiswa() {
        listSiswa= ArrayList()
        listSiswa.add(DataSiswa("Alfa", "Teknik Informatika", "SMK PRATAMA PUTRA",
        "Distrik 01", "083174566873"))
        listSiswa.add(DataSiswa("Beta", "Teknik Informatika", "SMK DWI PRATAMA",
        "Distrik 02", "085312321367"))
        listSiswa.add(DataSiswa("Charlie", "Teknik Informatika", "SMK TRIJAYA SUKMA",
        "Distrik 03", "081256523687"))
        listSiswa.add(DataSiswa("Delta", "Teknik Informatika", "SMK DELTA SURYA",
        "Distrik 04", "083331265713"))
        listSiswa.add(DataSiswa("Emma", "Teknik Informatika", "SMA NEGRI 5",
        "Distrik 05", "085313264357"))
        listSiswa.add(DataSiswa("Falfa", "Teknik Informatika", "SMK UNGGULAN 66",
        "Distrik 06", "083114218488"))
        listSiswa.add(DataSiswa("Gamma", "Teknik Informatika", "SMK MERDEKA 17",
        "Distrik 07", "085147368248"))
        listSiswa.add(DataSiswa("Hilda", "Teknik Informatika", "SMK HEBAT 88",
        "Distrik 08", "081343243287"))
        listSiswa.add(DataSiswa("Illy", "Teknik Informatika", "SMK INTERNASIONAL",
        "Distrik 09", "0850001273877"))
        listSiswa.add(DataSiswa("Juliett", "Teknik Informatika", "SMK SEPULUH NOVEMBER",
        "Distrik 10", "0853127836482"))
    }

    private fun tampilSiswa() {
        rv_listDataSiswa.layoutManager=LinearLayoutManager(activity)
        rv_listDataSiswa.adapter=DataSiswaAadapter(activity!!, listSiswa)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_data_siswa, container, false)
    }

    override fun onViewCreated(view: View, @Nullable savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        initView()
    }

    private fun initView() {
        simulasiDataSiswa()
        tampilSiswa()
    }

    override fun onDestroy() {
        super.onDestroy()
        this.clearFindViewByIdCache()
    }
}