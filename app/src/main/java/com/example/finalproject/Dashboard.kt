
package com.example.finalproject
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import android.view.View
import com.bumptech.glide.Glide
class Dashboard : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_dashboard)
        Glide.with(this).load("https://storage.googleapis.com/tagjs-prod.appspot.com/afrqw9Fe3g/0tk7jzqs.png").into(findViewById(R.id.ro36jybt0muc))
        Glide.with(this).load("https://storage.googleapis.com/tagjs-prod.appspot.com/afrqw9Fe3g/blb6wk9c.png").into(findViewById(R.id.rttmn4easjl))
        Glide.with(this).load("https://storage.googleapis.com/tagjs-prod.appspot.com/afrqw9Fe3g/imvm9n5j.png").into(findViewById(R.id.rd59wiq4su7g))
        Glide.with(this).load("https://storage.googleapis.com/tagjs-prod.appspot.com/afrqw9Fe3g/i8r839el.png").into(findViewById(R.id.rbr87rydyaec))
        Glide.with(this).load("https://storage.googleapis.com/tagjs-prod.appspot.com/afrqw9Fe3g/jte15wvi.png").into(findViewById(R.id.rlm9o3e8ujw))
        Glide.with(this).load("https://storage.googleapis.com/tagjs-prod.appspot.com/afrqw9Fe3g/uq8mxo4n.png").into(findViewById(R.id.rpxwkk66zb9))
        Glide.with(this).load("https://storage.googleapis.com/tagjs-prod.appspot.com/afrqw9Fe3g/gamjevw9.png").into(findViewById(R.id.rh5xgmfa9im9))
        Glide.with(this).load("https://storage.googleapis.com/tagjs-prod.appspot.com/afrqw9Fe3g/tiy0m4op.png").into(findViewById(R.id.rz01q5jevnsb))
        Glide.with(this).load("https://storage.googleapis.com/tagjs-prod.appspot.com/afrqw9Fe3g/pku7kqz8.png").into(findViewById(R.id.rcwdqk8hg0v9))
        Glide.with(this).load("https://storage.googleapis.com/tagjs-prod.appspot.com/afrqw9Fe3g/ocifj4s8.png").into(findViewById(R.id.riajjnughv2))
        Glide.with(this).load("https://storage.googleapis.com/tagjs-prod.appspot.com/afrqw9Fe3g/ygg2986m.png").into(findViewById(R.id.rqzcmg0wu4yj))
        val button1: View = findViewById(R.id.riciubd7gdb)
        button1.setOnClickListener {
            println("Pressed")
        }
        val button2: View = findViewById(R.id.r1a3v3uz6nwp)
        button2.setOnClickListener {
            println("Pressed")
        }
        val button3: View = findViewById(R.id.rxsa8r2keljo)
        button3.setOnClickListener {
            println("Pressed")
        }
    }
}