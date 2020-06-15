package com.example.demo.service;

import org.springframework.stereotype.Service;

@Service
public class TestServiceImpl implements TestServive {
	public void print() {
		System.out.println("Service 입니다.");
	}
}
