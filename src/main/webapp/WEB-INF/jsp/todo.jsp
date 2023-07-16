	<%@ include file="common/header.jspf" %>
	<%@ include file="common/navigation.jspf" %>
	<div class="container">
			<form:form method="post" modelAttribute="todo">
				<form:hidden path="UserId" />
				<fieldset class="form-group">
					<form:label path="desc">Description : </form:label>
					<form:input path="desc" name = "desc" type = "text" class="form-control" required="required"/>
					<form:errors path="desc" cssClass="text-warning"></form:errors>
				</fieldset>
					<fieldset class="form-group">
					<form:label path="startDate">Start Date : </form:label>
					<form:input path="startDate" name = "startDate" type = "text" class="form-control" required="required"/>
					<form:errors path="startDate" cssClass="text-warning"></form:errors>
				</fieldset>
				<fieldset class="form-group">
					<form:label path="targetDate">Target Date : </form:label>
					<form:input path="targetDate" name = "targetDate" type = "text" class="form-control" required="required"/>
					<form:errors path="targetDate" cssClass="text-warning"></form:errors>
				</fieldset>
				<fieldset class="form-group">
				<form:label path="isDone">Status : </form:label>
				<br>
				  <input type="radio" checked="checked" name="isDone" path="isDone" value = "Not Started">
				  <span class="checkmark">Not Started  &nbsp</span><tr>
				  <input type="radio" name="isDone" path="isDone"  value = "Started">
				  <span class="checkmark">Started  &nbsp</span>
				  <input type="radio" name="isDone" path="isDone" value = "In Progress"> 
				  <span class="checkmark">In Progress  &nbsp</span>	
				  <input type="radio" name="isDone" path="isDone" value = "Completed">
				  <span class="checkmark">Completed</span>

				</fieldset>
				
				<button type = "submit" class="btn btn-success" >Add</button>
			</form:form>
		</div>
		<%@ include file="common/footer.jspf" %>
	