package com.jsonannotation.jsons.jsonFormate;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/jsonFormat")
public class JsonFormatController {

	@RequestMapping(path = "/post", method = RequestMethod.POST, consumes = "application/json", produces = "application/json")
	public ResponseEntity<?> getData(@RequestBody JsonFormatAnnotationBean request) {
		Map<String, String> subjects = new HashMap<>();
		subjects.put("subject1", "Maths");
		subjects.put("subject2", "Computer Science");
		request.setSubjects(subjects);

		request.setTimeStamp(new Date());
		return ResponseEntity.status(HttpStatus.OK).body(request);
	}
}
