package com.mispedidos.app

import java.util.Date;

class Itineraries {

	String comment
	String city
	Date dateCreated = new Date()
	
	static hasMany = [orders:Orders]
	
	static constraints = {
		comment nullable: true
		city nullable: true
	}
	
	String toString(){
		return "comment: ${comment} - city: ${city} - dateCreated ${dateCreated}"
	}
}
