<!DOCTYPE html>
<html lang="en">

<head>

    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <meta name="description" content="inicio de sesion">
    <meta name="author" content="Maria Anzola">

    <title>Iniciar Sesion</title>
              <!-- logo barra -->
        <link rel="shortcut icon" type="image/x-icon" href="assets/images/LOGO-KG.png"/>

      <!--  <link href="assets/css/bootstrap.min.css" rel="stylesheet">-->
    <!--cuadro login-->
     <link href="assets/css/bootstrap.css" rel="stylesheet">
       <!--panel-tittle "por favor... +color verde boton ingresar"-->
      <link href="assets/css/bootstrap-theme.min.css" rel="stylesheet">





         <!--fuente tamaño logo-->
        <link href="assets/css/style.css" rel="stylesheet">

        <!--este estilo se usa para fondo -->
        <link href="assets/css/estilos-jose.css" rel="stylesheet">





    <!-- HTML5 Shim and Respond.js IE8 support of HTML5 elements and media queries -->
    <!-- WARNING: Respond.js doesn't work if you view the page via file:// -->
    <!--[if lt IE 9]>
        <script src="https://oss.maxcdn.com/libs/html5shiv/3.7.0/html5shiv.js"></script>
        <script src="https://oss.maxcdn.com/libs/respond.js/1.4.2/respond.min.js"></script>
    <![endif]-->

</head>

<!--body-login en etilos-jose.css-->
<body class="body-login">

<!--seccion del header-->
<nav class="navbar navbar-kaizen">


                        <div class="container">
                            <div class="row">
                                <div class="col-xs-6">
                                     <div class="logo small-img">
                                        <a href="index"><img src="assets/images/LOGO-KG.png"></a>
                                    </div>
                                </div>
                            </div>
                        </div>
                </nav>

    <div class="container ">
        <div class="row">
          <div class="col-md-4 col-md-offset-4">
           <div class="login-panel panel panel-default">
            <div class="panel-heading">
              <h3 class="panel-title">Por favor ingresas tus datos</h3>
            </div>
              <div class="panel-body">
                <form role="form" method="post" action="Login">
                 <fieldset>
                  <div class="form-group">
                    <input class="form-control" placeholder="Usuario" name="Usuario" type="text" autofocus>
                  </div>
                  <div class="form-group">
                   <input class="form-control" placeholder="Contraseña" name="Contrasena" type="password" >
                  </div>

                    <input  class="btn btn-lg btn-success btn-block" type="submit" value="Ingresar">
                  </fieldset>
                 </form>
                </div>
              </div>
            </div>
        </div>
    </div>



    <!-- Bootstrap Core JavaScript -->
    <script src="../assets/js/bootstrap.min.js"></script>
    <sript src="../assets/js/loginJS.js"></script>


</body>

</html>
