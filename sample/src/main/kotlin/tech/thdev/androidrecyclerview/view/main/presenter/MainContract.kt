package tech.thdev.androidrecyclerview.view.main.presenter

import android.content.Context
import android.content.Intent
import tech.thdev.androidrecyclerview.adapter.model.MainAdapterContract
import tech.thdev.base.presenter.BasePresenter
import tech.thdev.base.presenter.BaseView

/**
 * Created by Tae-hwan on 11/10/2016.
 */

interface MainContract {

    interface View : BaseView {
        fun changeActivity(intent: Intent?)
    }

    interface Presenter : BasePresenter<View> {

        var adapterContractView: MainAdapterContract.View?
        var adapterContractModel: MainAdapterContract.Model?

        fun getSampleList(prefix: String?, context: Context)

        fun onListItemClick(position: Int)
    }
}