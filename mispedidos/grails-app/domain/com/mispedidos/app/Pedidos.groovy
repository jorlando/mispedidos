package com.mispedidos.app

import java.util.Date;

class Pedidos {
	
	String marca
	Date dateCreated = new Date()
	
	static belongsTo = [cliente:Clientes]
}
