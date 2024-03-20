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
        <a href="register.jsp">jsp 댄서 등록 폼</a>
    </div>

</body>
</html>










