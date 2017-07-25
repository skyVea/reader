<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<style type="text/css">
	a{
		color: #fff;
		text-decoration: none;
	}
	*{
		padding:0;
		margin:0;
		font-family: "微软雅黑" ;
	}
	.header{
		height:72px;
		background:#458fce;
	}
	.header div.logo {
		color: #fff ;
	    line-height: 72px ;
	    font-size: 30px ;
	    margin-left: 20px ;
	    font-weight:500 ;
	    float:left;
	    display:inline-block ;
	}
	.header ul li.first {
    	margin-left: 30px ;
    	background:#74b0e2 ;
	}
	.header ul li {
		color: #fff;
	    float: left ;
	    width: 112px ;
	    height: 72px ; 
	    text-align: center ;
	    line-height:72px ;
	    cursor: pointer ;
	    list-style: none ;
	    display:inline-block ;
	}
	.header ul li:HOVER {
		background:#74b0e2;
	}
	.header .login {
    float: right ; 
    color: #fff ;
    line-height: 72px ;
    margin-right: 20px ;
	}
	.banner {
		width: 395px;
		height: 170px;
		margin-left: 122px;
		margin-top: 20px;
		overflow:hidden;
		background: #e3c525;
	}
	.banner .content {
		background: #73ce65;
	}
	.banner .content ul{
		width: 395px;
		height: 170px;
	}
	.banner .content ul li{
		list-style: none;
	}
	.banner .content ul li img{
		width: 395px;
		height: 170px;
		float: left;
		
	}
	.banner .content .btn_prev{
		display: inline-block;
		width: 21px;
		height: 100px;
		background: #db7b34;
		
	}
	
	.banner .content .btn_next{
		display: inline-block;
		width: 21px;
		height: 170px;
		background: #db7b34;
		padding-left: 21px;
	}
	/* .banner .content:HOVER .btn_next{
		opacity: 1;
		transtion:all ease 0.s;
	}
	.banner .content:HOVER .btn_prev{
		opacity: 1;
		transtion:all ease 0.s;
	} */
	
	.fl {float: left}
	.fr {float: right}
	
</style>
</head>
<body>
	<div class="header">
		<div class='logo'>图标</div>
		<ul>
			<li class='first'>首页</li>
			<li><a href="javascript:void(0)">原创</a></li>
			<li><a href="javascript:void(0)">热门</a></li>
			<li><a href="javascript:void(0)">support</a></li>
		</ul>
		<div class='login'>
			<span><a href="javascript:void(0)">登录</a></span>
			<span>|</span>
			<span><a href="javascript:void(0)">注册</a></span>
		</div>
	</div>
	<div class="banner">
		<div class='content'>
			<button class='btn_prev'></button>	
			<button class='btn_next'></button>
			<!-- <input class='btn_prev' type="button"></input>
			<input class='btn_next' type="button"></input> -->
			<ul>
				<li>
					<a href="javascript:void(0)">
						<img alt="" src="./image/1.jpg">
					</a>
				</li>
				<li>
					<a href="javascript:void(0)">
						<img alt="" src="./image/2.jpg">
					</a>
				</li>
				<li>
					<a href="javascript:void(0)">
						<img alt="" src="./image/3.jpg">
					</a>
				</li>
				<li>
					<a href="javascript:void(0)">
						<img alt="" src="./image/4.jpg">
					</a>
				</li>
				<li>
					<a href="javascript:void(0)">
						<img alt="" src="./image/5.jpg">
					</a>
				</li>
			</ul>
			
		</div>
		
			
	
	</div>
	
	
	
	
	
	
	
	
	
	
	
	
</body>
</html>