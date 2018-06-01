<%@page import="com.uplook.jk.dao.impl.UserDaoImpl"%>
<%@page import="com.uplook.jk.entity.UserInfo"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
    request.setCharacterEncoding("UTF-8");
    String name = request.getParameter("username");
    String password = request.getParameter("password");
    String sex = request.getParameter("sex");
    String edu = request.getParameter("edu");
    String mobile = request.getParameter("mobile");
    String prjtime = request.getParameter("prjtime");
    String qq = request.getParameter("qq");
    String school = request.getParameter("school");
    String major = request.getParameter("major");
    String stat = request.getParameter("stat");
    UserInfo user = new UserInfo( name, password, sex, edu,
    		mobile,prjtime,qq,school,major,stat );
    int count = new UserDaoImpl().addUser(user);
    if(count>0){
    	out.print("注册成功！<a href='export.php'>导出Excel表格</a>");
    }else{
    	out.print("注册失败!");
    }
    		
    
%>
姓名:<%=name %><br>
密码:<%=password %><br>
性别:<%=sex %>><br>
学历:<%=edu %>><br>
手机号码:<%=mobile %>><br>
实训日期:<%=prjtime %>><br>
qq:<%=qq %>><br>
所属院校:<%=school %>><br>
主修专业:<%=major %>><br>
状态:<%=stat %>><br>