package poyraz.apps.spotifydeneme.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import android.widget.ImageView
import androidx.recyclerview.widget.RecyclerView
import poyraz.apps.spotifydeneme.R
import poyraz.apps.spotifydeneme.databinding.PlaylistsBinding
import poyraz.apps.spotifydeneme.datas.Playlist


class PlaylistsAdapter(var mContext: Context, var playlist: List<Playlist>) : RecyclerView.Adapter<PlaylistsAdapter.PlaylistsTutucu>(){

    inner class PlaylistsTutucu(binding: PlaylistsBinding) : RecyclerView.ViewHolder(binding.root){
        var binding:PlaylistsBinding
        val img = itemView.findViewById<ImageView>(R.id.imageViewPL)

        init {
            this.binding = binding
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): PlaylistsTutucu {
        val layoutInflater = LayoutInflater.from(mContext)
        val binding = PlaylistsBinding.inflate(layoutInflater,parent,false)
        return PlaylistsTutucu(binding)
    }

    override fun onBindViewHolder(holder: PlaylistsTutucu, position: Int) {
        val pl = playlist.get(position)
        val h = holder.binding
        h.PLtext.text = pl.title.toString()
        h.imageViewPL.setImageResource(pl.image)

        //            binding.imageView.setImageResource(resources.getIdentifier("resim2","drawable",packageName))
    }

    override fun getItemCount(): Int {
        return playlist.size
    }
}