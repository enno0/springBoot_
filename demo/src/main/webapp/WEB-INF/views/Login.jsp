<%@	include file ="incude/Head.jspf" %>
<body>
	<%-- <%@ include file ="incude/Headerin.jspf"%> --%>

	<hr>
	<div>
		<form action="/Login"
			method="post">
			<div class="alert alert-danger" role="alert">${error}</div>

			<div class="con">
				<input type="text" placeholder="name" name="UserName"> <label
					for="floatingInput">UserName</label>
			</div>
			<div>
				<input type="password" placeholder="Password" name="Password">
				<label for="floatingPassword">Password</label>
				
			</div>
			<div>
			<%@ include file ="incude/csrf.jspf"%>
				<input type="submit">
			</div>
		</form>

	</div>







	<footer>
		
	</footer>



</body>
</html>
