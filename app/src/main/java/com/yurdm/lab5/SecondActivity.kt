package com.yurdm.lab5

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.TextUtils.replace
import androidx.fragment.app.Fragment
import androidx.fragment.app.commit
import androidx.viewpager2.adapter.FragmentStateAdapter
import com.yurdm.lab5.databinding.ActivitySecondBinding

class SecondActivity : AppCompatActivity() {
    private lateinit var binding: ActivitySecondBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySecondBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.viewpager.adapter = ViewAdapter(this)

        binding.nav.setOnItemSelectedListener {
            when(it.itemId) {
                R.id.first -> binding.viewpager.currentItem = 0
                R.id.second -> binding.viewpager.currentItem = 1
                R.id.third -> binding.viewpager.currentItem = 2
            }
            true
        }
    }

    class ViewAdapter(activity: AppCompatActivity) : FragmentStateAdapter(activity) {
        override fun getItemCount() = 3;

        override fun createFragment(position: Int): Fragment {
            return when(position) {
                0 -> FirstFragment()
                1 -> SecondFragment()
                else -> ThirdFragment()
            }
        }
    }
}