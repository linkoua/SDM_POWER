package com.sandbox.service;

import java.util.Date;
import java.util.Objects;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sandbox.dao.ITestRepository;
import com.sandbox.model.TestClass;
@Service
public class TestServiceImpl implements ITestService{
	@Autowired
	private ITestRepository repository;
	
	@Override
	public boolean insertTestObjectFromCodeRe(String codeRe) {
		boolean response= false;
		if(Objects.nonNull(codeRe)) {
			Date dateJ= new Date();
			TestClass newTestClass = new TestClass();
			newTestClass.setCode(codeRe);
			newTestClass.setDateJ(dateJ);
			TestClass result= repository.save(newTestClass);
			if(codeRe.equals(result.getCode()) && result.getDateJ().getTime() == dateJ.getTime()) {
				response=true;
			}	
		}
		return response;
	}

}
