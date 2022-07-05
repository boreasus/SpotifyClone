package poyraz.apps.spotifydeneme.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import poyraz.apps.spotifydeneme.databinding.ActivityMainBinding.inflate
import poyraz.apps.spotifydeneme.databinding.FavoriteBinding
import poyraz.apps.spotifydeneme.datas.Favorite

class FavoriteAdapter(var mContext: Context, var FavList:List<Favorite>):
    RecyclerView.Adapter<FavoriteAdapter.FavoriteTutucu>() {

    inner class FavoriteTutucu(binding: FavoriteBinding): RecyclerView.ViewHolder(binding.root) {
        var binding:FavoriteBinding
        init {
            this.binding = binding
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): FavoriteTutucu {
        val layoutInflater = LayoutInflater.from(mContext)
        val binding= FavoriteBinding.inflate(layoutInflater,parent,false)
        return FavoriteTutucu(binding)

    }

    override fun onBindViewHolder(holder: FavoriteTutucu, position: Int) {
        var fv = FavList.get(position)
        var h = holder.binding
        h.baslik.text = fv.title
        h.imageFV.setImageResource(fv.image)
    }

    override fun getItemCount(): Int {
        return FavList.size
    }
}