<%@ include file="common/header.jspf" %>
<%@ include file="common/navigation.jspf" %>

<div class="container">

	<font color="red">${errorMessage}</font>
	<form method="post">
		User ID : <input type="text" name="userId" /><br>
		User Password <input type="text" name="userPassword" />
		Name : <input type="text" name="userName" />
		Email : <input type="text" name="userEmail" />
		Contact : <input type="text" name="userContactNo" /> 
		
		<input type="submit" />
	</form>
</div>
<%@ include file="common/footer.jspf" %>