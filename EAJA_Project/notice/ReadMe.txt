Guide Line

WebContent
	- META-INF
	- WEB-INF
		- view
			
	- CompanyReport : 사업보고서 / 분기보고서 --> 회사명 기준 폴더 내 저장
	- ShareBoard : sequencing 번호로 Mapping해서 업로드/다운로드
	
Java Resources
	- src
		- config
		- controller
		- dao
		- service
		- vo
		
DB
	- DDL.sql
	- DML.sql

Notice
	- ReadMe.txt
	
Diagram
	- SpringClassDiagram
	- ViewDiagram
	
==============================================================
	1. Git 버전관리 전략
		- SourceTree
		    Origin Branch?
		    
		    Fork?
    
    1-1. Eclipse 개발환경 셋팅
    	- New WorkSpace
    	- Encoding: UTF-8
    	- Tomcat : zip
    	- JRE : 1.8~
    	
	2. Spring 임무 분담
	    Controller
	    
	    Service
	
	    DAO
	        
	    View
	    
	3. notice Folder
	    - ReadMe.txt
	        코딩 규칙, 주의사항
	
	    - ServletMapping.txt
	        View ~ Controller Servlet alias Mapping List
	        컨트롤러별로 작성
	
	    - PageMovingList.txt
	        View ~ View Move List
	        출발 Page To 도착 Page로 작성
	       
	4. DB Folder
	    - 동환 노트북 --> DB Server
	    - DDL.sql
	        테이블, 제약조건        
	    - DML.sql
	        테스트 데이터 삽입
	
	    - Table
	        1/10 오후
	        
	    - SQL
	        1/10 저녁
	
	5. Data Scrapping
	     - Scrapper Folder
	          Scrapper.py
	              > 크롤러 코드
	          Scrapping.txt
	              > 크롤링 데이터 설명 / 크롤러 설명
	
	6. 일정
		수
			역할 분담
			View Page List 확정
			데이터 크롤링 마무리
			
	    목
			게시판 기본기능 (회원가입 + CRUD) 완성
			ServletMapping.txt 완성( 각자 맡은 페이지 )
			
	    금 ( 50% )
	        UI 껍데기 완성 ( 페이지 이동관계 명시 )
	        
	    토
			
			
	    일
			현재까지 진행된 상황 Check + Debugging
