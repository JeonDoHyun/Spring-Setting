# Spring-Setting
###스프링5 기본 개발 세팅

# workspace의 UTF-8 설정
● 'Windw > Preference > General > Workspace ' 에서 확인/변경 가능<br>

# Tomcat9 서버 설정
● JDK 1.8 이상에서 사용
● Tomcat 사이트의 다운로드 링크를 이용해서 버전을 다운로드<br>
● zip이나 tar.gz 등의 압축형태를 다운로드해서 원하는 경로에 압축을 해제<br>
● 'Window >Preperence '메뉴의 'Server' 항목을 통해서 추가<br>

# 스프링 버전 변경
● 스프링 5 버전 사용을 위해 pom.xml 파일을 통해서 관리하므로 수정<br>
● 'maven spring' 검색을통해 'Maven Repository' 의 스프링 링크 찾아서 사용<br>
● 라이브러리 추가하고 'Maven Dependencied'항목을 통해서 스프링 프레임워크 라이브러리들이 제대로 반영되었는지 확인<br>

# Java Version 변경
● 생성된 프로젝트의 JRE System Library를 보면 'JAVASE-1.6'버전일 경우<br>
● 스프링 5.X 버전 사용을 위해 JDK 1.8을 사용하는것이 좋다<br>
● pom.xml의 <plugin> 태그 중 maven-complier-plugin의 내용을 1.6에서 1.8로 수정<br>
  
# Lombok 라이브러리 설치
● Lombok을 이용하면 JAVA 개발 시 자주 사용하는 getter/setter,toString(),생성자 등을 자동으로 생성해줌<br>
  
