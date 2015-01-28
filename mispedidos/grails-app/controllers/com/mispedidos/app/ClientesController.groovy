package com.mispedidos.app

class ClientesController {

    def create() { 
		Clientes miClient = new Clientes()
		miClient.address = params?.address
		miClient.number = new Integer(params?.number)
		miClient.location = params?.location
		miClient.city = params?.city
		miClient.telephone = params?.telephone
		miClient.save(flush:true,failOnError:true)
		render "${miClient.toString()}"
	}
}
