package com.wlang.one

import android.os.Bundle
import com.wlang.one.fragment.TestOneFragment
import com.wlang.one.utils.Wlogger

class MainActivity : BaseActivity() {
    override fun getViewRootId(): Int {
        return R.id.my_test_main_content
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        Wlogger.debug("onCreate")

        switchFragmentForward(TestOneFragment::class.java.name, Bundle())
    }
}
