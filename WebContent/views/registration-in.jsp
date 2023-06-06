<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>


<%@page import="jp.co.aforce.bean.Message" %>
<%Message m = new Message(); %>



<%=m.IWMM1 %>


<p>■会員番号<br>
${info.memberId }</p>

<p>■名前<br>
姓: ${info.lastName} 名:${param.firstName}</p>

<p>■性別<br>
${info.sex}</p>

<p>■生年月日<br>
${ info.getBirthYear()}年 ${info.getBirthMonth()}月 ${info.getBirthDay() }日</p>

<p>■電話番号<br>
${info.getPhoneNumber()}</p>

<p>■メールアドレス<br>
${info.getMailAddress()}</p>

<p>■職業<br>
${info.getJob()}</p>

<a href="menu.jsp" value="メニュー画面へ">メニューに戻る</a>

</body>
</html>



					