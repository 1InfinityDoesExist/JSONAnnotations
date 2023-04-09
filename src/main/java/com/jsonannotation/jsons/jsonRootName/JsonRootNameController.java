package com.jsonannotation.jsons.jsonRootName;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Enable property in application.properties.
 * 
 * @author gaian
 *
 */
@RestController
@RequestMapping(value = "/jsonRootName")
public class JsonRootNameController {

	@RequestMapping(path = "/post", method = RequestMethod.POST, consumes = "application/json", produces = "application/json")
	public ResponseEntity<?> getData(@RequestBody JSONRootName request) {

		return ResponseEntity.status(HttpStatus.OK).body(request);
	}
}
