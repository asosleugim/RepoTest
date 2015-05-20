<%@ page import="java.util.*" %>
<%@ page  import="com.asosleugim.common.movieData.Movie" %>

<html>
<body>


<% Movie movie = (Movie)request.getAttribute("sports");%>
	<h1>Spring 3 MVC REST web service</h1>
	
	<h3>Movie Name :</h3>
	<% if (movie!=null) out.println(movie.getName());  %>	
	<h3>Time :</h3>
		<% if (movie!=null) out.println(movie.getCurrentTime());  %>	
		
	<h3>Location :</h3>
		<% if (movie!=null) out.println(movie.getMovieLocation());  %>	
		
	<h3>Type :</h3>
		<% if (movie!=null) out.println(movie.getMovieType()); %>	
</body>
</html>