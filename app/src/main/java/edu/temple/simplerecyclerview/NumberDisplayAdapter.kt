package edu.temple.simplerecyclerview

import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

// Step 3: Complete adapter implementation

class NumberDisplayAdapter(private val numbers :IntArray) :RecyclerView.Adapter<NumberDisplayAdapter.NumberViewHolder>() {

    class NumberViewHolder (val textView: TextView) : RecyclerView.ViewHolder (textView) {}

    //we will give it all the stuff we want to display, also we give it the fixed propirtues
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): NumberViewHolder {
        return NumberViewHolder(
            //apply take the object without using this keyword
            TextView(parent.context).apply {
                setPadding(5,5,5,5)
            }
        )




    }

    /*Another way to type the function
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int)= NumberViewHolder(
            TextView(parent.context).apply {
                setPadding(5,5,5,5)
            }
        )
    }*/


    //this function populate views
    override fun onBindViewHolder(holder: NumberViewHolder, position: Int) {
        holder.textView.text= numbers[position].toString()
        holder.textView.textSize=numbers[position].toFloat()
    }

    override fun getItemCount(): Int {
        return numbers.size

    }

    // TODO Step 3b: Complete function definitions for adapter

}