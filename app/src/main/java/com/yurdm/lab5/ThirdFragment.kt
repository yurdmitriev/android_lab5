package com.yurdm.lab5

import android.os.Bundle
import androidx.fragment.app.Fragment

class ThirdFragment : Fragment(R.layout.fragment_third) {
    companion object {
        fun newInstance(position: Int): ThirdFragment {
            val args = Bundle()
            args.putInt("position", position)

            val fragment = ThirdFragment()
            fragment.arguments = args

            return fragment
        }
    }
}