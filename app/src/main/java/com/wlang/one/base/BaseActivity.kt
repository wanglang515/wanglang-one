package com.wlang.one

import android.os.Bundle
import android.support.v4.app.Fragment
import android.support.v4.app.FragmentActivity
import com.gfwl.chunt.FragmentSwitchInterface

/**
 * @Description:
 * @Created by wl on 2018-01-16.
 */
abstract class BaseActivity : FragmentActivity(), FragmentSwitchInterface {

    private var curFragment: Fragment? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        supportFragmentManager.addOnBackStackChangedListener {
            curFragment = supportFragmentManager.findFragmentById(getViewRootId())
        }
    }

    override fun switchFragmentForward(target: String, bundle: Bundle) {
        try {
            val fragment = Class.forName(target).newInstance() as Fragment

            if (bundle != null)
                fragment.arguments = bundle
            val transaction = supportFragmentManager.beginTransaction()
            if (curFragment != null) {
                transaction.hide(curFragment)
                fragment.setTargetFragment(curFragment, 0)
            }
            transaction.add(getViewRootId(), fragment, target)
            transaction.addToBackStack(target)
            transaction.commit()
        } catch (e: Exception) {

        }
    }

    abstract fun getViewRootId(): Int
}