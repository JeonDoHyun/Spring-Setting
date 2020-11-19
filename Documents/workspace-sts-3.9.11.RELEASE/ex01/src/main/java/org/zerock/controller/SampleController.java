package org.zerock.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.zerock.domain.SampleDTO;

import lombok.extern.java.Log;
import lombok.extern.log4j.Log4j;

/*
 * @RequestMapping 은 현재 클래스의 모든 메서드들의 기본적인 url 경로가 됩니다.
 * 예를 들어 다음과 같은 url은 모두  SampleController 에서 처리됩니다. 
 * /sample/aaa
 * /sample/bbb
 */
@Controller
@RequestMapping("/sample/*")
@Log
public class SampleController {

	@RequestMapping("")
	public void basic() {
		log.info("basic...............");
	}

	@GetMapping("/basicOnlyGet")
	public void basicGet2() {
		log.info("basic get noly get........");
	}

	@GetMapping("/ex01")
	public String ex01(SampleDTO dto) {
		log.info(" " + dto);
		return "ex01";
	}

	@GetMapping("/ex02")
	public String ex02(@RequestParam("name") String name, @RequestParam("age") int age) {
		log.info("name : " + name);
		log.info("age : " + age);

		return "ex02";
	}

}
