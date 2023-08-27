/// 2023.08.27 Spring Boot 3.0.xx 프로젝트 구조 이해
/// 1. .gradle/gradle 폴더: 프로젝트 생성 시, gradle 선택으로, gradle 관련 자료
/// 2. bin: == build, VS Code IDE 사용 때 나오는 폴더 임.
/// 2. build: 프로젝트 빌드 시, 생성되는 자료 모음

/// 3. Spring Boot.스프링 부트 자동 설정 이해
/// 	: 스프링 부트는 개발자가 추가한 jar 의존성들을 기준으로, app을 자동으로 설정하려고 시도한다.
///    	@Configuration 클래스 중 하나에 @EnableAutoConfiguration 또는 @SpringBootApplication 어노테이션을 추가해야 한다.
///		어떤 설정이 적용되었는지 확인: -debug 옵션을 사용
///     자동 설정을 제외하려면, 아래와 같이 "exclude"를 사용할 수 있다.
//		@SpringBootApplication(exclude = {SomethingAutoConfiguration.class})
//		public class MyApp {
//
//		}


package shop.onekorea.spring30;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Spring30Application {

	public static void main(String[] args) {

		SpringApplication.run(Spring30Application.class, args);

		System.out.println("Starting Spring...");

	}

}

