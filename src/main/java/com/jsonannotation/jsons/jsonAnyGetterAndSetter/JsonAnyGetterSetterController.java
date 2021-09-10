package com.jsonannotation.jsons.jsonAnyGetterAndSetter;

import java.util.HashMap;
import java.util.Map;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/jsonAnyGetterSetter")
public class JsonAnyGetterSetterController {

	@RequestMapping(path = "/post", method = RequestMethod.POST, consumes = "application/json", produces = "application/json")
	public ResponseEntity<?> getData(@RequestBody JsonAnyGetterSetterAnnotationBean request) {
//		Map<String, String> subjects = new HashMap<>();
//		subjects.put("subject1", "Maths");
//		subjects.put("subject2", "Computer Science");
//		request.setSubjects(subjects);
		return ResponseEntity.status(HttpStatus.OK).body(request);
	}
}
