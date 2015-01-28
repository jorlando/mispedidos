package com.mispedidos.app

import java.util.Date;

import com.mispedidos.app.orderAttr.Marca;

class OrdersController {

	OrdersService ordersService
    def create() {
		def newOrder = ordersService.create(params)
		render newOrder
	}
}
