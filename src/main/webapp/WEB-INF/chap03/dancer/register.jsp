<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html lang="ko">
<head>
    <meta charset="UTF-8">
    <title>Insert Your Title</title>
    <style>
        label {
            display: block;
            margin-bottom: 20px;
        }
    </style>
</head>
<body>
    <h1>jsp 버전 댄서등록 폼</h1>
    <form action="/regist.do" method="post" id="reg-form">
        <label>
            # 이름 : <input type="text" name="name">
        </label>
        <label>
            # 크루이름 : <input type="text" name="crewName">
        </label>
        <label>
            # 레벨 :
            <input type="radio" name="danceLevel" value="PROFESSIONAL"> 프로
            <input type="radio" name="danceLevel" value="AMATEUR"> 아마추어
            <input type="radio" name="danceLevel" value="BEGINNER"> 초보자
        </label>
        <label>
            # 장르 :
            <input type="checkbox" name="genres" value="HIPHOP"> 힙합
            <input type="checkbox" name="genres" value="STREET"> 스트릿
            <input type="checkbox" name="genres" value="KPOP"> 케이팝
        </label>
        <label>
            <button id="reg-btn" type="submit">등록</button>
        </label>
    </form>
</body>
</html>