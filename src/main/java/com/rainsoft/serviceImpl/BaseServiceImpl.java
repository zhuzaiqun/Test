package com.rainsoft.serviceImpl;


import java.lang.reflect.ParameterizedType;
import java.util.List;
import com.rainsoft.service.*;

import java.lang.reflect.Method; 
import java.lang.reflect.InvocationTargetException;

public class BaseServiceImpl<T> implements BaseService<T> {

	private Class clazz;

	public BaseServiceImpl() throws InstantiationException {

		ParameterizedType type = (ParameterizedType) this.getClass().getGenericSuperclass();

		clazz = (Class) type.getActualTypeArguments()[0];

		System.out.println("clazz " + clazz);
		
		System.out.println("clazz " + clazz.getSimpleName());

		//取出其方法
		try {
			Method m1 = clazz.getDeclaredMethod("Test");
			 try {
				 m1.invoke(clazz.newInstance());
			} catch (IllegalAccessException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IllegalArgumentException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (InvocationTargetException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		} catch (NoSuchMethodException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SecurityException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	@Override
	public void sava(T t) {
		// TODO Auto-generated method stub

	}

	@Override
	public void update(T t) {
		// TODO Auto-generated method stub

	}

	@Override
	public T get(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<T> query() {
		// TODO Auto-generated method stub
		return null;
	}

}
