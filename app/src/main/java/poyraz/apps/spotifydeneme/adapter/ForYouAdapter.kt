package poyraz.apps.spotifydeneme.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import android.widget.ImageView
import androidx.recyclerview.widget.RecyclerView
import poyraz.apps.spotifydeneme.R
import poyraz.apps.spotifydeneme.databinding.ForYouBinding
import poyraz.apps.spotifydeneme.datas.ForYou

class ForYouAdapter(var mContext: Context, var forYouList: List<ForYou>) : RecyclerView.Adapter<ForYouAdapter.ForYouTutucu>(){

    inner class ForYouTutucu(binding: ForYouBinding): RecyclerView.ViewHolder(binding.root){
        var binding:ForYouBinding

        init {
            this.binding = binding
        }

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ForYouTutucu {
        val layoutInflater = LayoutInflater.from(mContext)
        val binding = ForYouBinding.inflate(layoutInflater,parent,false)
        return ForYouTutucu(binding)

    }

    override fun onBindViewHolder(holder: ForYouTutucu, position: Int) {
        val fy = forYouList[position]
        var h = holder.binding
        h.baslik.text = fy.baslik.toString()
        h.yazi.text = fy.yazi.toString()
        h.imageView5.setImageResource(fy.image)
    }

    override fun getItemCount(): Int {
        return forYouList.size
    }

}