package com.mispedidos.app

class Clientes {
	String address
	Integer number
	String location
	String city
	Date dateCreated = new Date()
	String telephone
	
	static constraints = {
		address nullable: true
		number nullable: true
		location nullable: true
		telephone nullable: true
		city nullable: true
	}
	
	String toString(){
		return "address: ${address} - number: ${number} - location ${location} - telephone ${telephone}"
	}
	
}
