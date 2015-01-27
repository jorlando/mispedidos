package com.mispedidos.app

import org.junit.internal.runners.statements.FailOnTimeout;

class PingController {

    def ping() {
		render "PONG"
	}
	
	def create(){
		Clientes miCliente = new Clientes()
		miCliente.address = params?.address
		miCliente.number = 123
		miCliente.location = "saavedra"
		miCliente.telephone = "11-4444-5555"
		miCliente.save(flush:true,failOnError:true)
		render "${miCliente.toString()}"
	}
	
	def show(){
		def misClientes = Clientes.findAll()
		def respuesta = misClientes.collect{it.toString()}
		render respuesta
		
	}
}
