package com.wlang.one.fragment

import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.gfwl.chunt.FragmentSwitchInterface
import com.wlang.one.R
import kotlinx.android.synthetic.main.test_two_fragment.*

/**
 * @Description:
 * @Created by wl on 2018-01-16.
 */
class TestTwoFragment : Fragment() {
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        return inflater?.inflate(R.layout.test_two_fragment, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        test_two_click.text = arguments?.getInt("int").toString()
        test_two_click.setOnClickListener { (activity as FragmentSwitchInterface).switchFragmentForward(TestThreeFragment::class.java.name, Bundle()) }
    }
}