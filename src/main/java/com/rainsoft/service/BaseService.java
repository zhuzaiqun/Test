package com.rainsoft.service;

import java.util.List;

public interface BaseService<T> {
	public void sava(T t);
	public void update(T t);
	public T get(int id);
	public List<T> query();
}
