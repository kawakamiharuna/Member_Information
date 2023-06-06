<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>削除</title>
</head>
<body>
<form action="../jp.co.aforce/Delete" method="post">
<%@page import="jp.co.aforce.bean.Info" %>
<p>■会員番号<br>
${memberId}</p>

<p>■名前<br>
姓:${lastName} 名:${firstName }</p>

<p>■性別<br>
${sex }</p>

<p>■生年月日<br>
${ birthYear}年 ${birthMonth}月 ${birthDay }日</p>

<p>■電話番号<br>
${phoneNumber}</p>

<p>■メールアドレス<br>
${mailAddress}</p>

<p>■職業<br>
${job}</p>

<a href="menu.jsp" value="メニュー画面へ">メニューに戻る</a>

上記の内容を削除しますか？

<input type="submit" name="delete" value="削除">
<input type="submit" name="return" value="戻る">



</body>
</html>