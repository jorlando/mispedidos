class UrlMappings {

	static mappings = {
		"/$controller/$action?/$id?"{
			constraints {
				// apply constraints here
			}
		}

		"/"(view:"/index")
		"500"(view:'/error')
		
		"/"(controller: "ping"){
			action = [ GET:"ping"]
		}
		
		"/console/$action/" { controller = "console" }
	}
}
