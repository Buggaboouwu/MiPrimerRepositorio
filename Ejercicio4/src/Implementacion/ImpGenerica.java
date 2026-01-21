package Implementacion;

import java.util.HashMap;

import Principal.IMetdos;

public class ImpGenerica implements IMetdos{

	
	//declaración de HashMap generico
	protected HashMap<Object, Object> hash = new HashMap<Object, Object>();
	
	@Override
	public void create(Object key, Object value) {
		hash.put(key, value);
	}

	@Override
	public void read() {
		
		System.out.println(hash);
	}

	@Override
	public void update(Object key, Object value) {
		hash.put(key, value);
		
	}

	@Override
	public void delete(Object key) {
		hash.remove(key);
		
	}
	
	@Override
	public Object search(Object key) {  // Changed void to Object
        return hash.get(key);
		
	}
	
	
	
	

}
