package com.example.admin.testkotlin.activities

import android.content.Context
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.widget.LinearLayoutManager
import android.support.v7.widget.RecyclerView
import android.view.View
import android.widget.Toast
import com.example.admin.testkotlin.R
import com.example.admin.testkotlin.adapters.NewListRecyclerAdapter
import kotlinx.android.synthetic.main.activity_main.*

@Suppress("UNREACHABLE_CODE")
class MainActivity() : BaseActivity() {
    //must intitiate null
    private var mNewListRecyclerAdapter : NewListRecyclerAdapter? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        /*button.setOnClickListener(View.OnClickListener(){
            if(et_email.text.toString().equals("hsu",ignoreCase = true)&& et_password.text.toString().toString().equals("hsu",ignoreCase = true)){
                Toast.makeText(this, "Correct:" + et_password.text.toString(), Toast.LENGTH_LONG).show()
            }
            else{
                Toast.makeText(this, "Wrong", Toast.LENGTH_LONG).show()

            }

        })

    }*/
                  setUpRecyclerAdapter()
    }

    private fun setUpRecyclerAdapter() {
         mNewListRecyclerAdapter = NewListRecyclerAdapter()
        recycler_view.layoutManager = LinearLayoutManager(this)
        recycler_view.adapter = mNewListRecyclerAdapter

    }

    override fun getLayout(): Int {
        return R.layout.activity_main
    }

}

