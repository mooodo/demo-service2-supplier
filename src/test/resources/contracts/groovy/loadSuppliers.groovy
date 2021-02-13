package contracts.groovy

import org.springframework.cloud.contract.spec.Contract

Contract.make {
	description("load a list of suppliers by ids.")
	request {
	    method GET()
	    url("/orm/supplier/loadSuppliers") {
	        queryParameters {
	            parameter("ids", '20001,20002')
	        }
	    }
	}
	response {
	    body(file('suppliers.json'))
	    status 200
	    headers {
			contentType(applicationJson())
		}
	}
}