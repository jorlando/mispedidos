package com.mispedidos.app.orderAttr

public enum Marca {
	DF("DF"),
	RJ("RJ")

	final String id

	static list() {
		[DF, RJ]
	}

	static fromId(id) {
		list().find {it.id == id}
	}

	Marca(String id) {
		this.id = id
	}

	String toString() {
		this.id
	}

}
