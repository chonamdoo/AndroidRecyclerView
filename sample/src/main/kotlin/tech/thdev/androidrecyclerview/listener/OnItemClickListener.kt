package tech.thdev.androidrecyclerview.listener

import tech.thdev.support.widget.adapter.BaseRecyclerAdapter


/**
 * Created by Tae-hwan on 11/10/2016.
 */

interface OnItemClickListener {

    fun onItemClick(view: BaseRecyclerAdapter<*>, position: Int)
}