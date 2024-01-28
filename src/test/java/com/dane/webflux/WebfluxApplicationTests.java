package com.dane.webflux;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

// 랜덤포트 사용으로 테스트시 메인과 포트 충돌 방지
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
class WebfluxApplicationTests {

	@Test
	void contextLoads() {
	}

}
