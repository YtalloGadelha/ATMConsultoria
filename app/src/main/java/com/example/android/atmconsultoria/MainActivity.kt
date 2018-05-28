package com.example.android.atmconsultoria

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        button_contato.setOnClickListener {

            Toast.makeText(this, "Contato foi clicado!", Toast.LENGTH_SHORT).show()

            val intent = Intent(this, DetalheContatoActivity::class.java)
            startActivity(intent)
        }

        button_empresa.setOnClickListener {

            Toast.makeText(this, "Empresa foi clicada!", Toast.LENGTH_SHORT).show()

            val intent = Intent(this, DetalheEmpresaActivity::class.java)
            startActivity(intent)
        }

        button_servico.setOnClickListener {

            Toast.makeText(this, "Serviços foi clicado!", Toast.LENGTH_SHORT).show()

            val intent = Intent(this, DetalheServicosActivity::class.java)
            startActivity(intent)
        }

        button_cliente.setOnClickListener {

            Toast.makeText(this, "Clientes foi clicado!", Toast.LENGTH_SHORT).show()

            val intent = Intent(this, DetalheClientesActivity::class.java)
            startActivity(intent)
        }

    }
}
