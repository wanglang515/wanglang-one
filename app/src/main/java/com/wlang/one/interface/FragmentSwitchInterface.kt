package com.gfwl.chunt

import android.os.Bundle

/**
 * 用于activity中fragment的跳转
 *
 * @Description:
 * @Created by wl on 2018-01-16.
 */
interface FragmentSwitchInterface {

    fun switchFragmentForward(target: String, bundle: Bundle)
}