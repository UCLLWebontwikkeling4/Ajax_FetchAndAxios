<%@ page language="java" contentType="text/html; charset=UTF-8"
		 pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
	<title>Overview Example with Ajax - Polling</title>
</head>
<body>
	<h1>Lector of the moment ...</h1>
	<div id="lector"></div>
	<!--Nodig voor axios te kunnen gebruiken-->
	<script src="https://unpkg.com/axios/dist/axios.min.js"></script>
	<script type="text/javascript" src="js/lector.js"></script>
</body>
</html>