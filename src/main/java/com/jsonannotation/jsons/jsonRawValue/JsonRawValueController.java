package com.jsonannotation.jsons.jsonRawValue;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/jsonRawValue")
public class JsonRawValueController {

	@RequestMapping(path = "/post", method = RequestMethod.POST, consumes = "application/json", produces = "application/json")
	public ResponseEntity<?> getData(@RequestBody JsonRawValueAnnotationBean request) {

		request.setResponseText("{\"someField\" : \"someValue \"}");
		return ResponseEntity.status(HttpStatus.OK).body(request);
	}
}
