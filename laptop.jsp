<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>BrandLaptop</title>
</head>
<body>

	${BrandName},$brand.lenght caractere
	
	if(brand.lenght%2==0)
		${BrandName}, par
	else	
		${BrandName}, impar
		
</body>
</html>