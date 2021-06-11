package com.project.alertdialogkotlin

import android.content.DialogInterface
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.app.AlertDialog
import android.view.View
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


    }

    fun alertDialog(view: View) {
       // val alertDialog = AlertDialog.Builder(view.context)
        //Instantiate builder variable
        val builder = AlertDialog.Builder(view.context)

        // set title
        builder.setTitle("New Update found")

        //set content area
        builder.setMessage("Update your android 9.0 to 10.0")

        //set negative button
        builder.setPositiveButton(
            "Update Now") { dialog, id ->
            // User clicked Update Now button
            Toast.makeText(this, "Updating your device",Toast.LENGTH_SHORT).show()
            //Toast.makeText(this, "yes",Toast.LENGTH_SHORT).show()
        }

        //set positive button
        builder.setNegativeButton(
            "Cancel") { dialog, id ->
            // User cancelled the dialog
        }

        //set neutral button
        builder.setNeutralButton("Reminder me later") {dialog, id->
            // User Click on reminder me latter
        }

        builder.show()
    }

   /* fun alertDialog1(view:View){
        val builder = AlertDialog.Builder(this)
        builder.setTitle("Androidly Alert")
        builder.setMessage("We have a message")
//builder.setPositiveButton("OK", DialogInterface.OnClickListener(function = x))

        builder.setPositiveButton("Update Now") { dialog, which ->
            Toast.makeText(applicationContext,
                android.R.string.yes, Toast.LENGTH_SHORT).show()
        }

        builder.setNegativeButton("Cancel") { dialog, which ->
            Toast.makeText(applicationContext,
                android.R.string.no, Toast.LENGTH_SHORT).show()
        }

        builder.setNeutralButton("Reminder me later") { dialog, which ->
            Toast.makeText(applicationContext,
                "Maybe", Toast.LENGTH_SHORT).show()
        }
        builder.show()
    }*/
}