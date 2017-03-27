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
      <header>
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
        </header>

        <nav class="menu nav-scroll" id="theMenu" role="navigation">
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
	</nav>
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
        <h2>Bienvenido a tu espacio de trabajo</h2>

<section id="video" class="youtube">


			<div class="video">
<iframe width="560" height="315" src="https://www.youtube.com/embed/videoseries?list=PLlT92iCFDUnIfJuj7lDUZ-XPZstLUntoA" frameborder="0" allowfullscreen></iframe></div>
<!--4looHqnhJhrmAkP6s-O0sA esto es id de usuario, se debe cambiar-->
<iframe id="fr" style="overflow: hidden; height: 105px; width: 300px; border: 0;" name="fr" src="http://www.youtube.com/subscribe_widget?p=4looHqnhJhrmAkP6s-O0sA" height="240" width="320" frameborder="0" scrolling="no"></iframe>
<aside><h4>Recuerda mirar los videos de nuestro canal para mantenerte informado</h4></aside>
</section>

<section id="calendario "class="calendario">

	        <div class="cal1"></div>
	        <div class="cal2">
	        <script type="text/template" id="template-calendar">
	            <div class="clndr-controls">
	                <div class="clndr-previous-button">&lsaquo;</div>
	                <div class="month"><%= intervalStart.format('M/DD') + ' &mdash; ' + intervalEnd.format('M/DD') %></div>
	                <div class="clndr-next-button">&rsaquo;</div>
	            </div>
	            <div class="clndr-grid">
	                <div class="days-of-the-week">
	                <% _.each(daysOfTheWeek, function(day) { %>
	                    <div class="header-day"><%= day %></div>
	                <% }); %>
	                    <div class="days">
	                    <% _.each(days, function(day) { %>
	                        <div class="<%= day.classes %>"><%= day.day %></div>
	                    <% }); %>
	                    </div>
	                </div>
	            </div>
	            <div class="clndr-today-button">Today</div>
	        </script>
	        </div>
	       <!-- <div class="cal3">
	        <script type="text/template" id="template-calendar-months">
	            <div class="clndr-controls top">
	                <div class="clndr-previous-button">&lsaquo;</div>
	                <div class="clndr-next-button">&rsaquo;</div>
	            </div>
	            <div class="clearfix">
	            <% _.each(months, function(cal) { %>
	                <div class="cal">
	                    <div class="clndr-controls">
	                        <div class="month"><%= cal.month.format('MMMM') %></div>
	                    </div>
	                    <div class="clndr-grid">
	                        <div class="days-of-the-week">
	                        <% _.each(daysOfTheWeek, function(day) { %>
	                            <div class="header-day"><%= day %></div>
	                        <% }); %>
	                            <div class="days">
	                            <% _.each(cal.days, function(day) { %>
	                                <div class="<%= day.classes %>"><%= day.day %></div>
	                            <% }); %>
	                            </div>
	                        </div>
	                    </div>
	                </div>
	            <% }); %>
	            </div>
	            <div class="clndr-today-button">Today</div>
	        </script>
				</div>-->
	    </div>




</section>

<section id="tabla" class="tabla">
	<div class="col-lg-4">
			<div class="panel panel-default">
					<div class="panel-heading">
							<h3 class="panel-title"><i class="fa fa-money fa-fw"></i> Panel de transacciones</h3>
					</div>
					<div class="panel-body">
							<div class="table-responsive">
									<table class="table table-bordered table-hover table-striped">
											<thead>
													<tr>
															<th>Nro. Referencia (Sist)</th>
															<th>Fecha de Pago</th>
															<th>Deuda actual</th>
															<th>Monto (Bs)</th>
													</tr>
											</thead>
											<tbody>
													<tr>
															<td>3326</td>
															<td>10/21/2013</td>
															<td>3:29 PM</td>
															<td>$321.33</td>
													</tr>
													<tr>
															<td>3325</td>
															<td>10/21/2013</td>
															<td>3:20 PM</td>
															<td>$234.34</td>
													</tr>
													<tr>
															<td>3324</td>
															<td>10/21/2013</td>
															<td>3:03 PM</td>
															<td>$724.17</td>
													</tr>
													<tr>
															<td>3323</td>
															<td>10/21/2013</td>
															<td>3:00 PM</td>
															<td>$23.71</td>
													</tr>
													<tr>
															<td>3322</td>
															<td>10/21/2013</td>
															<td>2:49 PM</td>
															<td>$8345.23</td>
													</tr>
													<tr>
															<td>3321</td>
															<td>10/21/2013</td>
															<td>2:23 PM</td>
															<td>$245.12</td>
													</tr>
													<tr>
															<td>3320</td>
															<td>10/21/2013</td>
															<td>2:15 PM</td>
															<td>$5663.54</td>
													</tr>
													<tr>
															<td>3319</td>
															<td>10/21/2013</td>
															<td>2:13 PM</td>
															<td>$943.45</td>
													</tr>
											</tbody>
									</table>
							</div>
							<div class="text-right">
									<a href="#">View All Transactions <i class="fa fa-arrow-circle-right"></i></a>
							</div>
					</div>
			</div>
	</div>
</section>

<section id="grafica" class="grafica">
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
