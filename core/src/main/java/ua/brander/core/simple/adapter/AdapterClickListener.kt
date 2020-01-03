package ua.brander.core.simple.adapter

import android.view.View

interface AdapterClickListener {
    fun onItemClicked(pos: Int, view: View?)
}