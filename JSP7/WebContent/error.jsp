<%@ page isErrorPage = "true" %>

<html>
   <head>
      <title>Show Error Page</title>
   </head>
   <body>
      <h1>Opps...</h1>
      <p>Sorry, an error occurred.</p>
      <p>Stack trace : </p>
      <pre><% exception.printStackTrace(response.getWriter()); %></pre>
   </body>
</html>

