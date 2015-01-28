package com.mispedidos.app

import com.mispedidos.app.orderAttr.*;
import java.util.Date;

class Orders {
	
	Marca marca
	Clientes cliente
	Date dateCreated = new Date()
	Integer azucarImpalpable = 0
	Integer azucarNegra = 0
	Integer vainilla = 0
	Integer pasaMorocha = 0
	Integer pasaRubia = 0
	Integer conCarozo = 0
	Integer sinCarozo = 0
	Integer nuezPelada = 0
	Integer nuezConCascara = 0
	Integer almendra = 0
	Integer mixto = 0
	Integer azucarImpalpableFree = 0
	Integer azucarNegraFree = 0
	Integer vainillaFree = 0
	Integer pasaMorochaFree = 0
	Integer pasaRubiaFree = 0
	Integer conCarozoFree = 0
	Integer sinCarozoFree = 0
	Integer nuezPeladaFree = 0
	Integer nuezConCascaraFree = 0
	Integer almendraFree = 0
	Integer mixtoFree = 0
	ChangesProducts changesProduct
	

	static belongsTo = [itinerary: Itineraries]
	
	static constraints = {
		changesProduct nullable: true
	}
}
