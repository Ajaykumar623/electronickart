<!DOCTYPE html>
<html lang="en">
<head>
  <title>Bootstrap Example</title>
  <meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js"></script>
  <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.16.0/umd/popper.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.4.1/js/bootstrap.min.js"></script>
</head>
<body>
<nav class="navbar navbar-expand-sm bg-dark navbar-dark">
  <!-- Brand -->
  <a class="navbar-brand" href="adminhome">Logo</a>
  <!-- Links -->
  <ul class="navbar-nav">
    <li class="nav-item">
      <a class="nav-link" href="adminhome">adminhome</a>
    </li>
    
    <li class="nav-item">
      <a class="nav-link" href="register">register</a>
    </li>
    
      <li class="nav-item">
      <a class="nav-link" href="login">login</a>
    </li>
    
    <!-- Dropdown -->
    <li class="nav-item dropdown">
      <a class="nav-link dropdown-toggle" href="#" id="navbardrop" data-toggle="dropdown">
        products
      </a>
      <div class="dropdown-menu">
        <a class="dropdown-item" href="addproduct">addproduct</a>
        <a class="dropdown-item" href="showproducts">showproduct</a>
      </div>
    </li>
  </ul>
</nav>
<br>
</body>
</html>