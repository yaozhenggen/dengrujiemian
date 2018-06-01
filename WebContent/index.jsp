<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">=
<title>计算机四班</title>
<link type="text/css" href="css/style.css" rel="stylesheet"><!-- 标签 -->
<link type="text/css" href="css/button.css" rel="stylesheet">
<link type="text/css" href="css/ui-dialog.css" rel="stylesheet">
<link type="text/css" href="css/admin.css" rel="stylesheet">
<script type="text/javascript" src="jquery/jquery-1.9.1.js"></script>
<script type="text/javascript" src="jquery/Calendar3.js"></script>
<script type="text/javascript" src="jquery/dialog-min.js"></script>
<script type="text/javascript">
     //$()找到一个jquery对象
     $(document).ready(function(){
    	 $("#reg").click(function(){
    		 $("#regForm").slideToggle("slow");//slideToggle()该方法是将隐藏的对象显示，将显示的对象隐藏
    		 $("#loginFrom").slideToggle("slow");
    	 });
    	 $("#return").click(function(){
    		 $("#red Form").slideToggle("slow");
    		 $("#loginFrom").slideToggle("slow"); 
    	 });
    	 $("#regdo").click(function(){
    		 var d = dialog({
 			    title: '注册',
 			    content: "<img src='images/help.gif' align='bottom'>&nbsp;&nbsp;确认以上信息正确吗？",
 			    button: [
 			        {
 			            value: '确定',
 			            callback: function () {
 			            	form2.submit();			//让名称为form2的对象进行提交
 			            },
 			            autofocus: true
 			        },
 			        {
 			            value: '取消'
 			        }]
 			});
 			d.showModal().width(320);
    	 });
     });
   </script>

</head>
<body>
<TABLE cellSpacing=0 cellPadding=0 width="100%" bgColor=#002779 border=0>
		<tr height="100px"><td></td></tr>
		<TR >
			<TD align=middle>
			
				<div id="regForm" style="display:none">
				
					<TABLE cellSpacing=0 cellPadding=0 width=468 border=0>
						<TR>
							<TD><IMG height=68 src="images/regtable.jpg" width=468></TD>
						</TR>
					</TABLE>
					<TABLE cellSpacing=0 cellPadding=0 width=468 bgColor=#ffffff border=0>
						<TR>
							<TD width=16><IMG height=410 src="images/login_3.jpg" width=16></TD>
							<TD align=middle>
	
								<TABLE cellSpacing=0 cellPadding=0 width=400 border=0>
									<FORM name=form2 action="reg.jsp" method=post>
										<input type="hidden" name="op" value="reg">
										<TR height=36>
											<TD width="10">&nbsp;</TD>
											<TD width="60" align="right">姓&nbsp;&nbsp;&nbsp;名</TD>
											<TD width="200" ><INPUT class="input" value="" name=username id="username"></TD>
										</TR>
										<TR height=36>
											<TD width="10">&nbsp;</TD>
											<TD width="60" align="right">密&nbsp;&nbsp;&nbsp;码</TD>
											<TD width="200" ><INPUT class="input" type="password" name=password id="password"></TD>
										</TR>
										<TR height=36>
											<TD width="10">&nbsp;</TD>
											<TD width="60" align="right">性&nbsp;&nbsp;&nbsp;别</TD>
											<TD width="200" ><INPUT type="radio" name=sex value="男"><img class="sex" src='images/gg.gif'>
											&nbsp;&nbsp;&nbsp;<INPUT type="radio" name=sex value="女"><img class="sex" src='images/mm.gif'>
											</TD>
										</TR>
										<TR height=36>
											<TD width="10">&nbsp;</TD>
											<TD width="60" align="right">学&nbsp;&nbsp;&nbsp;历</TD>
											<TD width="200" >
												<select name="edu" class="input">
													<option value="大专">大专</option>
													<option value="本科">本科</option>
													<option value="研究生">研究生</option>
													<option value="硕士">硕士</option>
													<option value="博士">博士</option>
												</select>
											</TD>
										</TR>
										<TR height=36>
											<TD width="10">&nbsp;</TD>
											<TD width="60" align="right">手机号码</TD>
											<TD width="200" ><INPUT class="input" value="18912345678" name=mobile id="mobile"></TD>
										</TR>
										<TR height=36>
											<TD width="10">&nbsp;</TD>
											<TD width="60" align="right">实训日期</TD>
											<TD width="200" ><INPUT name=prjtime onclick="_calendar_show = true;new Calendar().show(this);" class="input" readonly value="2017-11-27" ></TD>
										</TR>
										<TR height=36>
											<TD width="10">&nbsp;</TD>
											<TD width="60" align="right">QQ号码</TD>
											<TD width="200" ><INPUT class="input" value="23259988" name=qq id="qq"></TD>
										</TR>
										<TR height=36>
											<TD width="10">&nbsp;</TD>
											<TD width="60" align="right">所属院校</TD>
											<TD width="200" >
												<select name="school" class="input">
													<option value="江西科技学院">江西科技学院</option>
													<option value="江西师范大学">江西师范大学</option>
													<option value="南昌工程学院">南昌工程学院</option>
													<option value="江西外语外贸学院">江西外语外贸学院</option>
													<option value="江西现代职业技术学院">江西现代职业技术学院</option>
												</select>
											</TD>
										</TR>
										<TR height=36>
											<TD width="10">&nbsp;</TD>
											<TD width="60" align="right">主修专业</TD>
											<TD width="200" >
												<select name="major" class="input">
													<option value="计算机">计算机</option>
													<option value="商务英语">商务英语</option>
													<option value="机电工程">机电工程</option>
													<option value="电子信息">电子信息</option>
													<option value="公共关系管理">公共关系管理</option>
												</select>
											</TD>
										</TR>
										<TR height=36>
											<TD>&nbsp;</TD>
											<TD width="60" align="right">状&nbsp;&nbsp;&nbsp;态</TD>
											<TD width="200" >
												<select name="stat" class="input">
													<option value="在读">在读</option>
													<option value="休学">休学</option>
													<option value="已毕业">已毕业</option>
												</select>
											</TD>
										</TR>
										
										
										
										<TR>
											<td>&nbsp;</td><td></td>
											<TD >
												<a href="javascript:void(0);" id="regdo" class="button blue">注册</a>
												<a href="javascript:void(0);" id="return" class="button green">返回登录</a>
											</TD>
										</TR>
									</FORM>
								</TABLE>
	
	
							</TD>
							<TD width=16><IMG height=410 src="images/login_4.jpg" width=16></TD>
						</TR>
						
					</TABLE>
	
	
	
					<TABLE cellSpacing=0 cellPadding=0 width=468 border=0>
						<TR>
							<TD><IMG height=16 src="images/login_5.jpg" width=468></TD>
						</TR>
					</TABLE>

				</div>
				<!-- --------------注册和登录表单分界线--------------- -->
				<div id="loginForm">
				
				
					<TABLE cellSpacing=0 cellPadding=0 width=468 border=0>
						<TR>
							<TD><IMG height=23 src="images/login_1.jpg" width=468></TD>
						</TR>
						<TR>
							<TD><IMG height=147 src="images/login_2.jpg" width=468></TD>
						</TR>
					</TABLE>
	
	
					<TABLE cellSpacing=0 cellPadding=0 width=468 bgColor=#ffffff border=0>
						<TR>
							<TD width=16><IMG height=122 src="images/login_3.jpg" width=16></TD>
							<TD align=middle>
	
								<TABLE cellSpacing=0 cellPadding=0 width=400 border=0>
									<FORM name=form1 action="login.jsp" method=post >
										<input type="hidden" name="op" value="login">
										<TR height=36>
											<TD width="10"><img src="images/Host16.gif"></TD>
											<TD width="60" align="right">用&nbsp;&nbsp;&nbsp;名</TD>
											<td width="10">&nbsp;</td>
											<TD width="200" ><INPUT
												style="width: 220px;BORDER-RIGHT: #000000 1px solid; BORDER-TOP: #000000 1px solid; BORDER-LEFT: #000000 1px solid; BORDER-BOTTOM: #000000 1px solid"
												maxLength=30 value="" name=username id="logname"></TD>
										</TR>
										<TR height=36>
											<TD>&nbsp;</TD>
											<TD width="60" align="right">密&nbsp;&nbsp;&nbsp;码</TD>
											<td width="10">&nbsp;</td>
											<TD><INPUT
												style="width: 220px;BORDER-RIGHT: #000000 1px solid; BORDER-TOP: #000000 1px solid; BORDER-LEFT: #000000 1px solid; BORDER-BOTTOM: #000000 1px solid"
												type=password maxLength=30 value="" name=password></TD>
										</TR>
										
										<TR>
											<td>&nbsp;</td><td>&nbsp;</td>
											<TD colspan=2>
												<a href="javascript:void(0);" id="login" class="button blue">登录</a>
												<a href="javascript:void(0);" id="reg" class="button gray">我要注册</a>
											</TD>
										</TR>
									</FORM>
								</TABLE>
	
	
							</TD>
							<TD width=16><IMG height=122 src="images/login_4.jpg" width=16></TD>
						</TR>
					</TABLE>
	
	
	
					<TABLE cellSpacing=0 cellPadding=0 width=468 border=0>
						<TR>
							<TD><IMG height=16 src="images/login_5.jpg" width=468></TD>
						</TR>
					</TABLE>

				</div>

				<TABLE cellSpacing=0 cellPadding=0 width=468 border=0>
					<TR>
						<TD align=right>
							<IMG height=26 src="images/login_6.gif" width=165 border=0>
						</TD>
					</TR>
				</TABLE>

				
			</TD>
		</TR>
	</TABLE>

</body>
</html>