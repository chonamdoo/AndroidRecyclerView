package tech.thdev.androidrecyclerview.data

import android.content.Context
import android.content.Intent
import tech.thdev.androidrecyclerview.contract.Contract
import tech.thdev.androidrecyclerview.view.main.MainActivity
import tech.thdev.support.widget.data.BaseItem

/**
 * Created by Tae-hwan on 11/10/2016.
 */

data class MainItem(val title: String,
                    override val viewType: Int) : BaseItem {

    var intent: Intent? = null

    fun setActivityIntent(pkg: String, componentName: String): MainItem {
        intent = Intent()
        intent?.setClassName(pkg, componentName)
        return this
    }

    fun setBrowseIntent(context: Context, path: String): MainItem {
        intent = Intent()
        intent?.setClass(context, MainActivity::class.java)
        intent?.putExtra(Contract.KEY_EXTRA_PATH, path)
        return this
    }
}