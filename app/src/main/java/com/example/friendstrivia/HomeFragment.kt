package com.example.friendstrivia

import android.os.Bundle
import android.view.*
import androidx.fragment.app.Fragment
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import androidx.navigation.findNavController
import androidx.navigation.ui.NavigationUI
import com.example.friendstrivia.R.layout.home_layout
import com.example.friendstrivia.R.layout.quiz_layout
import com.example.friendstrivia.databinding.HomeLayoutBinding as HomeLayoutBinding

/**
 * A simple [Fragment] subclass.
 */
class HomeFragment : Fragment() {

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        val binding = DataBindingUtil.inflate<HomeLayoutBinding>(inflater,
            R.layout.home_layout,container,false)
        (activity as AppCompatActivity).supportActionBar?.title =
            getString(R.string.app_name)
        binding.readyButton.setOnClickListener{
            view:View -> view.findNavController().navigate(R.id.action_homeFragment_to_quizFragment)
        }
        setHasOptionsMenu(true)
        return binding.root
    }

    override fun onCreateOptionsMenu(menu: Menu, inflater: MenuInflater) {
        super.onCreateOptionsMenu(menu, inflater)
        inflater.inflate(R.menu.threedot_menu,menu)
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        return NavigationUI.onNavDestinationSelected(item, view!!.findNavController()) ||
                super.onOptionsItemSelected(item)
    }
}
