<%@ page import="java.util.*"%>
<%@ page import="com.asosleugim.common.movieData.Movie"%>

<html>
<body>


	<% Movie movie = (Movie)request.getAttribute("movie");%>
	<h1>Spring 3 MVC REST web service</h1>

	<h3>Movie Name:</h3>
	<% if (movie!=null) 
{ %>
	<% out.print(movie.getName());  %>
	<h3>Starts:</h3>
	<% out.print(movie.getCurrentTime());  %>

	<h3>Location:</h3>
	<% out.print(movie.getMovieLocation());  %>

	<h3>Genre:</h3>
	<%  out.print(movie.getMovieType()); %>

	<h3>Ticket Price:</h3>
	<%  out.print("$"+movie.getTicketPrice() + " dls."); %>

	<h3>Theater Name:</h3>
	<% out.print(movie.getTheatherName()); %>
	<% }%>
</body>
</html>