package com.example.friendstrivia

import android.content.Intent
import android.os.Bundle
import android.view.*
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import androidx.navigation.findNavController
import com.example.friendstrivia.databinding.LostLayoutBinding

/**
 * A simple [Fragment] subclass.
 */
class LostFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val binding = DataBindingUtil.inflate<LostLayoutBinding>(
            inflater,
            R.layout.lost_layout,
            container,
            false
        )
        (activity as AppCompatActivity).supportActionBar?.title = "Loser"
        binding.button.setOnClickListener{
            view:View -> view.findNavController().navigate(LostFragmentDirections.actionLostFragment2ToQuizFragment())
        }
        var args= LostFragmentArgs.fromBundle(arguments!!)
        Toast.makeText(context,"Questions Correct- ${args.correctAnswers}, Total Questions- ${args.numOfQuestions}",
            Toast.LENGTH_LONG ).show()
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
            R.id.shareItem -> shareSucess()
        }
        return super.onOptionsItemSelected(item)
    }
    private fun getShareItem():Intent
    {
        var args= LostFragmentArgs.fromBundle(arguments!!)
        var shareIntent= Intent(Intent.ACTION_SEND_MULTIPLE)
        shareIntent.setType("text/plain").
        putExtra(Intent.EXTRA_TEXT,getString(R.string.share, args.correctAnswers, args.numOfQuestions))
        return shareIntent
    }
    private fun shareSucess()
    {
        startActivity(getShareItem())
    }
}
