<%@	include file ="incude/Head.jspf" %>
<body>
	<%@ include file ="incude/Headerin.jspf"%>
	<p><Strong>Hello</Strong> ${UserName} </p>
	
	
   <div>
    <table class="table table-dark">
  <thead>
    <tr>
      <th scope="col">#</th>
      <th scope="col">name</th>
      <th scope="col">description</th>
      <th scope="col">phoneNumber</th>
      <th scope="col">emailAddress</th>
      <th scope="col">isActive</th>
       <th scope="col">action</th>
    </tr>
  </thead>
  <tbody>
  <%! int num=1; %>  

  <c:forEach items="${Students}" var="stud">
  <tr>
      <th scope="row"> ${stud.id} </th>
      <td>${stud.name}</td>
      <td>${stud.description}</td>
      <td>@${stud.phoneNumber}</td>
      <td>${stud.emailAddress}</td>
      <td>${stud.isActive}</td>
      <td>
          <a href="/Del?id=${stud.id}" class ="btn btn-danger" >delete
          <a href="/edit?id=${stud.id}" class ="btn btn-success" >Edite
          </td>
    </tr>
		<%-- ${stud.name} -  ${stud.description}-${stud.phoneNumber}-${stud.emailAddress}-${stud.isActive}<br> --%>
	</c:forEach>

     </tbody>
     <%-- <tfoot>
      <div>
		<a class="ayhagd" href="http://127.0.0.1:8080/add">add-Student</a>
	</div>
     </tfoot> --%>
  </table>
  </div>
	<%-- <hr>
	<div>
		<a class="ayhagd" href="http://127.0.0.1:8080/add">add-Student</a>
	</div> --%>




 


	<footer>
		
	</footer>



</body>
</html>
