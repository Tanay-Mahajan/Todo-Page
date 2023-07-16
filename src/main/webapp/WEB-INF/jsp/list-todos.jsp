<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<%@ include file="common/header.jspf" %>
<%@ include file="common/navigation.jspf" %>
		<div class="container">
			<table class="table table-striped">
				<caption>Hi ${name} Your todos are : </caption>
				<thead>
					<tr>
						<th>Description</th>
						<th>Start Date</th>
						<th>Target Date</th>
						<th>Status</th>
						<th>Update</th>
						<th>Delete</th>
						
					</tr>
				</thead>
				<tbody>
					<c:forEach items="${todos}" var="todo">
					<tr>
						<td value="${todo.desc}">${todo.desc}</td>
						<td><fmt:formatDate value="${todo.startDate}" pattern="dd/MM/yyyy" /></td>
						<td><fmt:formatDate value="${todo.targetDate}" pattern="dd/MM/yyyy" /></td>
						<td>${todo.isDone}</td>
						<td><a type ="button" class="btn btn-success" href="/update-todo?id=${todo.todoId}">Update</a></td>
						<td><a type ="button" class="btn btn-warning" href="/delete-todo?id=${todo.todoId}">Delete	</a></td>
					</tr>
					</c:forEach>
				</tbody>
			</table>
		<div>
			<a class="btn btn-primary" href="/add-todo" role="button">Add new Todo</a>
		</div>
		
		
		<%@ include file="common/footer.jspf" %>