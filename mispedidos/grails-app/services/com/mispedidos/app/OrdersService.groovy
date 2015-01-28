package com.mispedidos.app

import java.util.Date;

import com.mispedidos.app.orderAttr.Marca;

class OrdersService {

    def create(paramsToCreate) {
		Orders newOrder = new Orders()
		newOrder.marca = Marca.fromId(paramsToCreate?.marca)
		newOrder.cliente = Clientes.findById(paramsToCreate?.cliente)
		this.loadProducts(newOrder, paramsToCreate)
		if(paramsToCreate?.hasChanges){
			ChangesProducts changesProduct = new ChangesProducts()
			newOrder.changesProduct = this.loadChanges(changesProduct,paramsToCreate)
		}
		newOrder.save(flush:true, failOnError:true)
		return newOrder
    }
	
	def loadProducts(Orders newOrder,products){
		newOrder.azucarImpalpable =  (products?.azucarImpalpable ? products.azucarImpalpable : 0)
		newOrder.azucarNegra =  (products?.azucarNegra ? products.azucarNegra : 0)
		newOrder.vainilla =  (products?.vainilla ? products.vainilla : 0)
		newOrder.pasaMorocha =  (products?.pasaMorocha ? products.pasaMorocha : 0)
		newOrder.pasaRubia =  (products?.pasaRubia ? products.pasaRubia : 0)
		newOrder.conCarozo =  (products?.conCarozo ? products.conCarozo : 0)
		newOrder.sinCarozo =  (products?.sinCarozo ? products.sinCarozo : 0)
		newOrder.nuezPelada =  (products?.nuezPelada ? products.nuezPelada : 0)
		newOrder.nuezConCascara =  (products?.nuezConCascara ? products.nuezConCascara : 0)
		newOrder.almendra =  (products?.almendra ? products.almendra : 0)
		newOrder.mixto =  (products?.mixto ? products.mixto : 0)
		newOrder.azucarImpalpableFree =  (products?.azucarImpalpableFree ? products.azucarImpalpableFree : 0)
		newOrder.azucarNegraFree =  (products?.azucarNegraFree ? products.azucarNegraFree : 0)
		newOrder.vainillaFree =  (products?.vainillaFree ? products.vainillaFree : 0)
		newOrder.pasaMorochaFree =  (products?.pasaMorochaFree ? products.pasaMorochaFree : 0)
		newOrder.pasaRubiaFree =  (products?.pasaRubiaFree ? products.pasaRubiaFree : 0)
		newOrder.conCarozoFree =  (products?.conCarozoFree ? products.conCarozoFree : 0)
		newOrder.sinCarozoFree =  (products?.sinCarozoFree ? products.sinCarozoFree : 0)
		newOrder.nuezPeladaFree =  (products?.nuezPeladaFree ? products.nuezPeladaFree : 0)
		newOrder.nuezConCascaraFree =  (products?.nuezConCascaraFree ? products.nuezConCascaraFree : 0)
		newOrder.almendraFree =  (products?.almendraFree ? products.almendraFree : 0)
		newOrder.mixtoFree =  (products?.mixtoFree ? products.mixtoFree : 0)
	}
	
	def loadChanges(ChangesProducts changesProduct,paramsToCreate){
			changesProduct.azucarImpalpable =  (paramsToCreate?.azucarImpalpableChange ? paramsToCreate.azucarImpalpableChange : 0)
			changesProduct.azucarNegra =  (paramsToCreate?.azucarNegraChange ? paramsToCreate.azucarNegraChange : 0)
			changesProduct.vainilla =  (paramsToCreate?.vainillaChange ? paramsToCreate.vainillaChange : 0)
			changesProduct.pasaMorocha =  (paramsToCreate?.pasaMorochaChange ? paramsToCreate.pasaMorochaChange : 0)
			changesProduct.pasaRubia =  (paramsToCreate?.pasaRubiaChange ? paramsToCreate.pasaRubiaChange : 0)
			changesProduct.conCarozo =  (paramsToCreate?.conCarozoChange ? paramsToCreate.conCarozoChange : 0)
			changesProduct.sinCarozo =  (paramsToCreate?.sinCarozoChange ? paramsToCreate.sinCarozoChange : 0)
			changesProduct.nuezPelada =  (paramsToCreate?.nuezPeladaChange ? paramsToCreate.nuezPeladaChange : 0)
			changesProduct.nuezConCascara =  (paramsToCreate?.nuezConCascaraChange ? paramsToCreate.nuezConCascaraChange : 0)
			changesProduct.almendra =  (paramsToCreate?.almendraChange ? paramsToCreate.almendraChange : 0)
			changesProduct.mixto =  (paramsToCreate?.mixtoChange ? paramsToCreate.mixtoChange : 0)
			changesProduct.save(flush:true, failOnError:true)
			return changesProduct	
	}
}
