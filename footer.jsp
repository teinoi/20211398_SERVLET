<%@ page contentType="text/html; charset=utf-8"%>	
<footer class="container">
<p>&copy; WebMarket</p>
<%
Date day = new java.util.Date();
String am_pm;
int hour = day.getHours();
int minute = day.getMinutes();
int second = day.getSeconds();
if (hour / 12 == 0) {
am_pm = "AM";
} else {
am_pm = "PM";
hour = hour - 12;
}
String CT = hour + ":" + minute + ":" + second + " " + am_pm;
out.println("현재 접속 시각: " + CT + "\n");
%>
</footer>