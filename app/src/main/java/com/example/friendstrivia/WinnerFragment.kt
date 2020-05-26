package com.example.friendstrivia

import android.content.Intent
import android.os.Bundle
import android.view.*
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import androidx.navigation.findNavController
import com.example.friendstrivia.databinding.WinnerLayoutBinding

/**
 * A simple [Fragment] subclass.
 */
class WinnerFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val binding = DataBindingUtil.inflate<WinnerLayoutBinding>(inflater,
            R.layout.winner_layout,container,false)
        (activity as AppCompatActivity).supportActionBar?.title = "True F.A.N."

        binding.button2.setOnClickListener{ view:View ->
            view.findNavController().navigate(R.id.action_winnerFragment_to_homeFragment)
        }
        var agrs= WinnerFragmentArgs.fromBundle(arguments!!)
        Toast.makeText(context,"Questions Correct- ${agrs.correctAnswers}, Total Questions- ${agrs.numOfquestions}",Toast.LENGTH_LONG ).show()
        setHasOptionsMenu(true)
        return binding.root
    }

    override fun onCreateOptionsMenu(menu: Menu, inflater: MenuInflater) {
        super.onCreateOptionsMenu(menu, inflater)
        inflater.inflate(R.menu.shareitem,menu)
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        when(item.itemId)
        {
            R.id.shareItem -> sharesucess()
        }
        return super.onOptionsItemSelected(item)
    }
    private fun ShareActivity():Intent
    {
        val args= WinnerFragmentArgs.fromBundle(arguments!!)

        var shareIntent = Intent(Intent.ACTION_SEND_MULTIPLE)
        shareIntent.setType("text/plain").
        putExtra(Intent.EXTRA_TEXT, getString(R.string.share, args.correctAnswers,args.numOfquestions))
        return shareIntent

    }
    private fun sharesucess()
    {
        startActivity(ShareActivity())
    }

}


