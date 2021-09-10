package com.jsonannotation.jsons.jsonValue;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/jsonValue")
public class JsonValueController {

	@RequestMapping(path = "/post", method = RequestMethod.POST, consumes = "application/json", produces = "application/json")
	public ResponseEntity<?> getData(@RequestBody JsonValueAnnotationBean request) {
		return ResponseEntity.status(HttpStatus.OK).body(request);
	}
}
