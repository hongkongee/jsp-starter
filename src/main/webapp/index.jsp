<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
    <h1>Welcome! 꾸꾸까까야</h1>

    <form action="http://localhost:8181/hello">
      <input type="text" name="nick" placeholder="별명을 입력하세요."> <br>
      <input type="text" name="age" placeholder="나이를 입력하세요."> <br>
      <input type="submit" value="제출!">
    </form>

    <br>

    <div>
        <a href="/chap02/dancer/register">서블릭 댄서 등록 폼</a>
    </div>

    <div>
        <a href="chap03/dancer/register.jsp">jsp 댄서 등록 폼</a>
    </div>

    <!-- 컨트롤러 여러 요청 식별 테스트 -->
    <a href="/register.do">댄서 등록 폼</a> <br>
    <a href="/list.do">댄서 목록화면</a> <br>
    <a href="/delete.do">댄서 삭제 요청</a> <br>


</body>
</html>










