<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="decorator" uri="http://www.opensymphony.com/sitemesh/decorator" %>
<c:set var="ctx" value="${pageContext.request.contextPath}" scope="request" />

<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN"
"http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html>
<head>
   <meta http-equiv="Content-type" content="text/html; charset=UTF-8">
   <title><decorator:title default="" /></title>
   <script type="text/javascript" src="${ctx}/script/main.js"></script>
   <decorator:head />
   <link rel="shortcut icon" href="${ctx}/img/16x16/favicon.ico" />
   <link rel="icon" href="${ctx}/img/16x16/favicon.ico" type="image/x-icon" />
   <link rel="stylesheet" href="${ctx}/style/main.css" type="text/css" media="screen" />
</head>
<body id="home">
   <div id="wrapper">
      <div id="banner">
         <h1 class="logo"><a href="${ctx}/home" title="todo"><span>To Do</span></a></h1>
         <div id="dock">
            <div class="left"></div>
            <ul>
               <li><a href="${ctx}">Home</a></li>
               <li style="padding-right: 12px;"><a
                  href="${ctx}/lists">Service</a></li>
               <li style="padding-left: 12px;">
               <div
                  style="background: rgb(85, 85, 85) none repeat scroll 0% 0%; -moz-background-clip: border; -moz-background-origin: padding; -moz-background-inline-policy: continuous; width: 1px; height: 24px; position: absolute; left: 0px;">
               </div>
               <a href="#">Site Map</a></li>
               <li><a href="#">About</a></li>
            </ul>
            <div class="right"></div>
         </div>
         <div id="navigation">
            <div class="left"></div>
            <ul>
               <li><a href="${ctx}/lists">Lists</a></li>
               <li><a href="${ctx}/items">Items</a></li>
               <li><a href="${ctx}/users">Users</a></li>
               <li class="last"><a href="#">Support</a></li>
            </ul>
            <div class="right"></div>
         </div>
      </div>
      <div id="content-wrapper">
         <div id="content">
            <div class="content">
               <div class="content-body">
                  <div id="home-content-wrapper">
                     <decorator:body />
                  </div>
               </div>
            </div>
         </div>
      </div>
      <div id="footer">The Footer</div>
   </div>
</body>
</html>
