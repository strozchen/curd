<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<script type="text/javascript" src="js/jquery-1.12.3.js"></script>
<script type="text/javascript">
		$(function(){
			$("#json").click(function(){
				var url=this.href;
				var args={};
				$.post(url,args,function(data){
					for (var i=0;i<data.length;i++){
						var name=data[i].userName;
						alert(name);
					}
				});
				return false;
			});
		})
		
</script>
</head>
<body>
	<a href="curd/userlist">查看所有用户</a>
	<br>
	<a href="curd/userread">查看用户</a>
	<br>
	<a href="curd/json" id="json">json</a>
	<br>
	<a href="curd/i18n">i18n</a>
	<br>
	<a href="i18n2">i18n2</a>
	<br>
	<a href="curd/i18n?locale=zh_CN">中文</a>
	<br>
	<a href="curd/i18n?locale=en_US">英文</a>
	<hr>
	<form action="UAD/fileUp" enctype="multipart/form-data" method="post">
		desc:<input type="text" name="desc">
		file:<input type="file" name="file">
		<input type="submit" value="submit">
	</form>
<hr>
<a href="UAD/fileDownbyEntity">下载(entity)</a>
<br>
<a href="UAD/fileDownbyAnno">下载(Anno)</a>
<hr>
<a href="calcute?i=0">计算</a>
<hr>
<a href="customException?i=10">自定义错误</a>
</body>
</html>