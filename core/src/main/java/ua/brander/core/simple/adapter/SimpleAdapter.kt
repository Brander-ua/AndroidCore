package ua.brander.core.simple.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.annotation.LayoutRes
import androidx.recyclerview.widget.RecyclerView
import java.util.*

abstract class SimpleAdapter<T>(protected val context: Context) : RecyclerView.Adapter<SimpleViewHolder>() {
    private var items: List<T> = Collections.emptyList()
    var clickListener: AdapterClickListener? = null

    fun setItems(items: List<T>) {
        silentSetItems(items)
        notifyDataSetChanged()
    }

    fun silentSetItems(items: List<T>) {
        this.items = items
    }

    override fun getItemCount(): Int {
        return items.size
    }

    fun getItem(position: Int): T? {
        if (position in 0 until items.size) {
            return items[position]
        }

        return null
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): SimpleViewHolder {
        return SimpleViewHolder(
            LayoutInflater.from(context).inflate(getItemLayoutId(), parent, false)
        )
    }

    @LayoutRes
    abstract fun getItemLayoutId(): Int
}