package com.wlang.one.fragment

import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.gfwl.chunt.FragmentSwitchInterface
import com.wlang.one.R
import kotlinx.android.synthetic.main.test_one_fragment.*

/**
 * @Description:
 * @Created by wl on 2018-01-16.
 */
class TestOneFragment : Fragment() {
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        return inflater?.inflate(R.layout.test_one_fragment, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        val bundle = Bundle()
        bundle.putInt("int", 125)
        test_one_click.setOnClickListener { (activity as FragmentSwitchInterface).switchFragmentForward(TestTwoFragment::class.java.name, bundle) }
    }
}