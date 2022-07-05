package poyraz.apps.spotifydeneme

import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.StaggeredGridLayoutManager
import poyraz.apps.spotifydeneme.adapter.FavoriteAdapter
import poyraz.apps.spotifydeneme.adapter.ForYouAdapter
import poyraz.apps.spotifydeneme.adapter.PlaylistsAdapter
import poyraz.apps.spotifydeneme.databinding.FragmentAnasayfaBinding
import poyraz.apps.spotifydeneme.datas.Favorite
import poyraz.apps.spotifydeneme.datas.ForYou
import poyraz.apps.spotifydeneme.datas.Playlist


class AnasayfaFragment : Fragment() {
    private lateinit var binding:FragmentAnasayfaBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        binding = FragmentAnasayfaBinding.inflate(inflater, container, false)


        val playlist = ArrayList<Playlist>()
        val pl1 = Playlist(1,R.drawable.khontkar,"Khontkar")
        val pl2 = Playlist(2,R.drawable.ezhel,"Ezhel")
        val pl3 = Playlist(3,R.drawable.ikidortyedi,"24:7")
        val pl4 = Playlist(4,R.drawable.monolink,"Monolink")
        val pl5 = Playlist(5,R.drawable.franzlist,"Franz List")
        val pl6 = Playlist(6,R.drawable.can_bonomo,"Can Bonomo")

        playlist.add(pl1)
        playlist.add(pl3)
        playlist.add(pl4)
        playlist.add(pl6)


        val forYou = ArrayList<ForYou>()
        val fy1 = ForYou(1,R.drawable.bege,"BEGEFENDİ","Albüm · BEGE")
        val fy2 = ForYou(2,R.drawable.twofeet,"Shape & Form","Albüm · Two Feet")
        val fy3 = ForYou(3,R.drawable.sainte,"Local Mvp","EP · Sainte")
        val fy4 = ForYou(4,R.drawable.diplo,"Diplo","Albüm · Diplo")
        val fy5 = ForYou(5,R.drawable.outblue,"Out the Blue","Albüm · Sainte")
        val fy6 = ForYou(6,R.drawable.bridge,"Something","EP · BRIDGE")

        forYou.add(fy1)
        forYou.add(fy4)
        forYou.add(fy5)
        forYou.add(fy2)
        forYou.add(fy3)
        forYou.add(fy6)

        val favorites = ArrayList<Favorite>()

        val fv1 = Favorite("Buyuk Ev Ablukada",R.drawable.buyukev)
        val fv2 = Favorite("Joachim Pastor",R.drawable.joachim_pastor)
        val fv3 = Favorite("Travis Scott",R.drawable.travisiki)
        val fv4 = Favorite("XXXTENTACION",R.drawable.xxxtentacion)
        val fv5 = Favorite("Pop Smoke",R.drawable.popsmoke)

        favorites.add(fv1)
        favorites.add(fv2)
        favorites.add(fv3)
        favorites.add(fv4)
        favorites.add(fv5)

        binding.rvFav.layoutManager = StaggeredGridLayoutManager(1,StaggeredGridLayoutManager.HORIZONTAL)
        val adapterFav = FavoriteAdapter(requireContext(),favorites)
        binding.rvFav.adapter = adapterFav





        Log.e("Deneme", "${forYou[0].yazi}  ${forYou[0].baslik}")

        binding.rvYL.layoutManager = StaggeredGridLayoutManager(1,StaggeredGridLayoutManager.HORIZONTAL)
        val adapterYL = ForYouAdapter(requireContext(),forYou)
        binding.rvYL.adapter = adapterYL








        binding.rvPL.layoutManager = StaggeredGridLayoutManager(2,StaggeredGridLayoutManager.VERTICAL)
        val adapterPL = PlaylistsAdapter(requireContext(),playlist)
        binding.rvPL.adapter = adapterPL






        return binding.root
    }

}