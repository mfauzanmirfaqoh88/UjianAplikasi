package com.fauzan.ujianaplikasi

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.RecyclerView.ViewHolder
import kotlinx.android.extensions.LayoutContainer
import kotlinx.android.synthetic.main.data_siswa_item.*

class DataSiswaAadapter(private val context: Context, private val items:ArrayList<DataSiswa>):
    RecyclerView.Adapter<DataSiswaAadapter.ViewHolder>() {
        override fun onCreateViewHolder(parent: ViewGroup, viewType: Int)=ViewHolder(
            LayoutInflater.from(context).inflate(R.layout.data_siswa_item, parent, false)
        )

    override fun getItemCount(): Int {
        return items.size
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.bindItem(items.get(position))
    }

    class ViewHolder(override val containerView:View):
            RecyclerView.ViewHolder(containerView), LayoutContainer{
                fun bindItem(item:DataSiswa) {
                    txtSiswaNama.text=item.nama
                    txtSiswaJurusan.text=item.jurusan
                    txtSiswaAsal.text=item.asal
                    txtSiswaAlamat.text=item.alamat
                    txtSiswaTelp.text=item.telp
                }
            }
}