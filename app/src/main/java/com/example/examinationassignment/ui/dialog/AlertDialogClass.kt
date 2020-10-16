package com.example.examinationassignment.ui.dialog

import android.app.Dialog
import android.content.Context
import android.os.Bundle
import com.example.examinationassignment.R
import kotlinx.android.synthetic.main.dialog_custom.*

class AlertDialogClass(context: Context):Dialog(context) {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.dialog_custom)
        window?.setBackgroundDrawableResource(R.drawable.alert_shape)
        setCancelable(false)
        btn_dismiss?.setOnClickListener {
            dismiss()
        }

    }


}