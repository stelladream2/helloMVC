<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Customer Information</title>
</head>
<body>

<%-- JSP 2.0(Preferred)  --%>
<ul>
  <li>Name: ${customer.name}</li>
  <li>Email: ${customer.email}</li>  
  <li>ID: ${customer.id}</li>
 </ul>  


<%-- JSP 1.2(old) --%>
<jsp:useBean id="customer" type="beans.Customer" scope="request"> 
</jsp:useBean>

<ul>
  <li>Name: <jsp:getProperty name="customer" property="name" /></li>
  <li>Email: <jsp:getProperty name="customer" property="email" /></li>  
  <li>ID: <jsp:getProperty name="customer" property="id" /></li>
 </ul>  
