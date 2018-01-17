package com.wlang.one.fragment

import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.wlang.one.R
import kotlinx.android.synthetic.main.test_three_fragment.*

/**
 * @Description:
 * @Created by wl on 2018-01-16.
 */
class TestThreeFragment : Fragment() {
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        return inflater?.inflate(R.layout.test_three_fragment, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        test_three_click.setOnClickListener { fragmentManager?.popBackStack() }
    }
}