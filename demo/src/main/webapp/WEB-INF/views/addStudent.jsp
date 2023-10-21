<%@	include file ="incude/Head.jspf" %>
<body>
	<%@ include file ="incude/Headerin.jspf"%>

	<hr>
	<div>
	
		
		





		<form action="/add"
			method="post">
			<div class="alert alert-danger" role="alert">${errorN}</div>

			<div class="con">
				<input type="text" placeholder="name" name="name"> <label
					for="floatingInput">name</label>
			</div>
			<div>
				<input type="text" placeholder="description" name="description">
				<label for="floatingDescription">description</label>
			</div>
            <div>
				<input type="text" placeholder="phoneNumber" name="phoneNumber">
				<label for="floatingNumber">phoneNumber</label>
			</div>
            <div>
				<input type="email" placeholder="emailAddress" name="emailAddress">
				<label for="floatingEmail">emailAddress</label>
			</div>
            <div>
			<p>Choose your State:</p>
				<input type="radio"  placeholder="true"  name="isActive" value="true">
				<label for="floatingIsActive">true</label>
				<input type="radio"  name="isActive" value="false">
				<label for="floatingIsActive">false</label>
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
