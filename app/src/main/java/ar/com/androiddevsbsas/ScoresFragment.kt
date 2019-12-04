package ar.com.androiddevsbsas

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProviders

class ScoresFragment : Fragment() {

    private lateinit var viewModel: GameViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        viewModel = ViewModelProviders.of(requireActivity())[GameViewModel::class.java]
    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        return inflater.inflate(R.layout.fragment_scores, container, false).apply {
            viewModel.playerOneScore.observe(viewLifecycleOwner, Observer {
                this.findViewById<TextView>(R.id.playerOne).text = it.toString()
            })
            viewModel.playerTwoScore.observe(viewLifecycleOwner, Observer {
                this.findViewById<TextView>(R.id.playerTwo).text = it.toString()
            })
        }
    }

}