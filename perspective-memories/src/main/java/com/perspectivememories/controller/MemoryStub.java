package com.perspectivememories.controller;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import com.perspectivememories.model.Memory;

public class MemoryStub {
	private static HashMap<Long, Memory> memories = new HashMap<>();
	private static long idIndex = 3L;
	
	//populate static memories
	static {
		Memory a = new Memory(LocalDateTime.now(), 101L, 1L, "My First Message");
		memories.put(1L, a);
		Memory b = new Memory(LocalDateTime.now(), 102L, 2L, "My Second Message");
		memories.put(2L, b);
		Memory c = new Memory(LocalDateTime.now(), 103L, 3L, "My Third Message");
		memories.put(3L, c);
	}
	
	public static List<Memory> list(){
		return new ArrayList<Memory>(memories.values());
	}
	
	public static Memory create(Memory memory){
		idIndex+= idIndex;
		memory.setMessageId(idIndex);
		memories.put(idIndex, memory);
		return memory;
	}
	
	public static Memory get(Long id){
		return memories.get(id);
	}
	
	public static Memory update(Long id, Memory memory){
		return memories.put(id, memory);
	}
	
	public static Memory delete(Long id){
		return memories.remove(id);
	}
}
