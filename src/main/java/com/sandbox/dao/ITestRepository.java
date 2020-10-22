package com.sandbox.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.sandbox.model.TestClass;

@Repository
public interface ITestRepository extends JpaRepository<TestClass, Long> {
}
