<!DOCTYPE html>
<html lang="es">
<head>
	     <meta charset="utf-8">
        <meta http-equiv="X-UA-Compatible" content="IE=edge">
        <meta name="viewport" content="width=device-width, initial-scale=1">

        <title>Dashboard</title>
        <!-- logo barra -->
        <link rel="shortcut icon" type="image/x-icon" href="assets/images/LOGO-KG.png"/>

        <link href="assets/css/bootstrap.min.css" rel="stylesheet">
        <link href="assets/css/bootstrap.css" rel="stylesheet">
        <link href="assets/css/bootstrap-theme.min.css" rel="stylesheet">

        <link href="assets/css/owl.carousel.css" rel="stylesheet">
        <link href="assets/css/owl.theme.default.min.css" rel="stylesheet">

        <link href="assets/css/magnific-popup.css" rel="stylesheet">


		    <!-- Morris Charts CSS -->
		    <link href="assets/css/morris.css" rel="stylesheet">

				<link href="assets/css/style.css" rel="stylesheet">
        <link href="assets/font_awesome/css/font-awesome.css" rel="stylesheet">
        <link rel="stylesheet" href="assets/css/clndr.css">
        <script type="text/javascript" src="assets/html5gallery/html5gallery.js"></script>
        <script src="assets/js/morris.min.js"></script>
        <script src="assets/js/morris-data.js"></script>

        <!--[if lt IE 9]>
        <script src="https://oss.maxcdn.com/html5shiv/3.7.3/html5shiv.min.js"></script>
        <script src="https://oss.maxcdn.com/respond/1.4.2/respond.min.js"></script>
        <![endif]-->

</head>
 <body class="color-fondo">
    <div class="main"><!--no necesario-->
    <#include "/usuarios/header-admin.ftl">
    <!--  <header>
         <nav class="">
            <div>
              <div class="container">
                <div class="row">
                   <div class="col-xs-6">
                      <div class="logo small-img">
                        <a href="../index.html"><img src="../assets/images/LOGO-KG.png"></a>
                          </div>
                            </div>
                              <div class="col-xs-6 text-right">
                                <div class="menu m">
                      </div>
                    </div>
                 </div>
               </div>
             </div>
           </nav>
        </header>-->

 <#include "/usuarios/navbar-employee.ftl">


       <!-- <nav class="menu nav-scroll" id="theMenu" role="navigation">
          <div class="menu-wrap">
             <div>
		<h1 class="logo"><a class="center-block" href="../index.html#home">KAIZENWARE </a> </h1>
		<i class="fa fa-arrow-rigth menu-close"></i>
                <div class="small-img">
                    <a href="miperfil.html">
                        <img class="img-circle center-block" src="../assets/images/img2.jpg" alt="Foto de Perfil">
                    </a>

                </div>
                <table>
                    <tr>
                        <td>
                            <a href="miperfil.html"><sub>Perfil</sub></a>
                        </td>
                        <td>
                            <a href="../index.html"><sub>Cerrar Sesi&oacute;n</sub></a>
                        </td>
                    </tr>
                </table>
            </div>
                <hr/>
                <ul>


                    <a href="../index.html"><li>Home</li></a>
                    <li>
                        <a href="javascript:;" data-toggle="collapse" data-target="#gestiones">Gestionar</a>
                        <ul id="gestiones" class="collapse">
                            <li class="second-lvl first">
                                <a href="VCliente.html">Clientes</a>
                            </li>
                            <li class="second-lvl">
                                <a href="VCandidato.html">Candidatos</a>
                            </li>
                            <li class="second-lvl">
                                <a href="VProyecto.html">Proyectos</a>
                            </li>
                            <li class="second-lvl">
                                <a href="VCargos.html">Cargos</a>
                            </li>
                            <li class="second-lvl">
                                <a href="VAsignarEC.html">Asignar Cargos</a>
                            </li>
                            <li class="second-lvl last">
                                <a href="VDiaFeriado.html">D&iacute;as Feriados</a>
                            </li>
                        </ul>
                    </li>
                    <li>
                        <a href="javascript:;" data-toggle="collapse" data-target="#administrar">Administrar</a>
                        <ul id="administrar" class="collapse">
                            <li class="second-lvl first">
                                <a href="VEntrevista.html">Entrevistas</a>
                            </li>
                            <li class="second-lvl">
                                <a href="VAsistencia.html">Asistencias</a>
                            </li>
                            <li class="second-lvl">
                                <a href="falta.html">Faltas</a>
                            </li>
                            <li class="second-lvl">
                                <a href="cobro.html">Cobros</a>
                            </li>
                            <li class="second-lvl last">
                                <a href="pago.ftl">Pagos</a>
                            </li>
                        </ul>
                    </li>
                    <li>
                        <a href="javascript:;" data-toggle="collapse" data-target="#reportes">Reportes</a>
                        <ul id="reportes" class="collapse">
                            <li class="second-lvl first">
                                <a href="VConsultarCliente.html">Clientes</a>
                            </li>
                            <li class="second-lvl">
                                <a href="VConsultarCandidato.html">Candidatos</a>
                            </li>
                            <li class="second-lvl">
                                <a href="VConsultarEntrevistas.html">Entrevistas</a>
                            </li>
                            <li class="second-lvl">
                                <a href="VConsultarHorasT.html">Horas Trabajadas</a>
                            </li>
                            <li class="second-lvl">
                                <a href="consultar-pagos2.html">Record de Pagos</a>
                            </li>
                            <li class="second-lvl">
                                <a href="consultar-utilidad.html">Utilidad</a>
                            </li>
                            <li class="second-lvl last">
                                <a href="consultar-faltas.html">Faltas</a>
                            </li>
                            <li class="second-lvl first">
                                <a href="VUsuario.html">Usuarios</a>
                            </li>
                        </ul>
                    </li>


                </ul>
            </div>

        <div id="menuToggle" class="ion-navicon _ion-android-menu"><i class="fa fa-bars"></i>
        </div>
	</nav>-->
<!--fin menu lateral-->



<!--titulo principal pagina-->
    <div class="row">
        <div class="col-lg-12">
        <h1 class="page-header">
                DASHBOARD
        </h1>

				<p>
					<a href="#video" ><button  type="button" class="btn btn-lg btn-success">Youtube</button></a>
				  <a href="#calendario" ><button type="button" class="btn btn-lg btn-info">Calendario</button></a>
				  <a href="#tabla"><button  type="button" class="btn btn-lg btn-warning">Resumen de Transaccones</button></a>
				  <a href="#grafica"><button  type="button" class="btn btn-lg btn-danger">Grafica</button></a>
				</p>
        </div>
    </div>
<!---->

    <!--cuerpo -->
    <div class="contenedor-principal">
        <h1>Bienvenido Empleado</h1>

	<div class="row">
			<div class="col-lg-12">
					<div class="panel panel-default">
							<div class="panel-heading">
									<h3 class="panel-title"><i class="fa fa-bar-chart-o fa-fw"></i> Area Chart</h3>
							</div>
							<div class="panel-body">
									<div id="morris-area-chart" class="morris-area-chart"></div>
							</div>
					</div>
			</div>
	</div>
</section>


    </div><!--cuerpo -->







        <!-- Scripts section -->
       <script src="https://apis.google.com/js/platform.js"></script>
        <script src="../assets/js/jquery-3.1.1.js"></script>
        <script src="../assets/js/desplegable.js"></script>
        <script src="../assets/js/jquery.js"></script>
        <script src="../assets/js/bootstrap.min.js"></script>
        <script src="../assets/js/owl.carousel.min.js"></script>
        <script src="../assets/js/jquery.magnific-popup.js"></script>
        <script src="../assets/js/script.js"></script>
        <script src="../assets/js/auth.js"></script>
				<!--scripts para calendario-->
				<script src="https://cdnjs.cloudflare.com/ajax/libs/jquery/1.11.3/jquery.min.js"></script>
		    <script src="https://cdnjs.cloudflare.com/ajax/libs/underscore.js/1.8.3/underscore-min.js"></script>
		    <script src="https://cdnjs.cloudflare.com/ajax/libs/moment.js/2.10.6/moment.min.js"></script>
		    <script src="../assets/js/clndr.js"></script>
		    <script src="../assets/js/demo.js"></script>
				<!-- Morris Charts JavaScript -->
		    <script src="../assets/js/raphael.min.js"></script>
		    <script src="../assets/js/morris.min.js"></script>
		    <script src="../assets/js/morris-data.js"></script>

    </body>
</html>
