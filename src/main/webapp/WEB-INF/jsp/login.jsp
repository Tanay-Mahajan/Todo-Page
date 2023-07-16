<%@ include file="common/header.jspf" %>
<%@ include file="common/navigation.jspf" %>

<div class="container">

	<font color="red">${errorMessage}</font>
	<form method="post">
		Name : <input type="text" name="userName" />
		Password : <input type="password" name="password" /> 
		<input type="submit" />
	</form>
	<a href = "/newUserLogin">New Login</a>
</div>
<%@ include file="common/footer.jspf" %>