package com.perspectivememories.controller;

import java.util.List;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.perspectivememories.model.Memory;

@RestController
@RequestMapping("api/v1/")
public class EntryRestController {
	@RequestMapping(value="memories", method = RequestMethod.GET)
	public List<Memory> list() {
		return MemoryStub.list();
	}
	
	@RequestMapping(value="memories/{id}", method = RequestMethod.GET)
	public Memory get(@PathVariable Long id){
		return MemoryStub.get(id);
	}
	
	@RequestMapping(value="memories/{id}", method = RequestMethod.PUT)
	public Memory update(@PathVariable Long id, @RequestBody Memory memory){
		return MemoryStub.update(id, memory);
	}
	
	@RequestMapping(value="memories/{id}", method = RequestMethod.DELETE)
	public Memory delete(@PathVariable Long id){
		return MemoryStub.delete(id);
	}
}
