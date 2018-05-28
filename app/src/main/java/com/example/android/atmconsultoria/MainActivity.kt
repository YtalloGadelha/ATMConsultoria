package com.example.android.atmconsultoria

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        button_contato.setOnClickListener {

            val intent = Intent(this, DetalheContatoActivity::class.java)
            startActivity(intent)
        }

        button_empresa.setOnClickListener {

            val intent = Intent(this, DetalheEmpresaActivity::class.java)
            startActivity(intent)
        }

        button_servico.setOnClickListener {

            val intent = Intent(this, DetalheServicosActivity::class.java)
            startActivity(intent)
        }

        button_cliente.setOnClickListener {

            val intent = Intent(this, DetalheClientesActivity::class.java)
            startActivity(intent)
        }
    }
}
