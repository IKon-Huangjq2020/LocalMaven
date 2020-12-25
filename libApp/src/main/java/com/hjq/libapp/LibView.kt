package com.hjq.libapp

import android.content.Context
import android.util.AttributeSet
import android.view.LayoutInflater
import androidx.constraintlayout.widget.ConstraintLayout

/**
 *
 * @Description:     LibView
 * @Author:         hjq
 * @CreateDate:     2020/12/25 16:43
 *
 */
class LibView @JvmOverloads constructor(
    context: Context,
    attrs: AttributeSet? = null
) : ConstraintLayout(context, attrs) {

    init {
        LayoutInflater.from(getContext()).inflate(R.layout.view_lib, this, true)
    }
}