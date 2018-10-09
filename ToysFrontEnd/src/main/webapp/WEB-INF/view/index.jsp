<%@ include file="header.jsp" %>
<html>
<body>
<h2>Hello World!</h2>
<div id="myCarousel" class="carousel slide" data-ride="carousel">
  <!-- Indicators -->
  <ol class="carousel-indicators">
    <li data-target="#myCarousel" data-slide-to="0" class="active"></li>
    <li data-target="#myCarousel" data-slide-to="1"></li>
    <li data-target="#myCarousel" data-slide-to="2"></li>
  </ol>

  <!-- Wrapper for slides -->
  
  <div class="carousel-inner" role="listbox">
    <div class="item active">
      <img class="img-responsive" src="images/1.jpg" alt="TeddyBear" height="100%" width="100%">
      
    </div>

    <div class="item">
       <img class="img-responsive" src="images/2.jpg" alt="Duck" height="100%" width="100%">
    </div>

    <div class="item">
       <img class="img-responsive" src="images/3.jpg" alt="Toy" height="100%" width="100%">
    </div>
  </div>

  <!-- Left and right controls -->
  <a class="left carousel-control" href="#myCarousel" data-slide="prev">
    <span class="glyphicon glyphicon-chevron-left"></span>
    <span class="sr-only">Previous</span>
  </a>
  <a class="right carousel-control" href="#myCarousel" data-slide="next">
    <span class="glyphicon glyphicon-chevron-right"></span>
    <span class="sr-only">Next</span>
  </a>
</div>






















<%@ include file="footer.jsp" %>
</body>
</html>
