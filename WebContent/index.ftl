<!DOCTYPE html>
<html lang="en">
    <head>
        <meta charset="utf-8">
        <meta http-equiv="X-UA-Compatible" content="IE=edge">
        <meta name="viewport" content="width=device-width, initial-scale=1">

        <title>KaizenWare | Home</title>
        <!-- logo barra -->
        <link rel="shortcut icon" type="image/x-icon" href="assets/images/LOGO-KG.png"/>

           <!--seccion de contactanos (division)-->
        <link href="assets/css/bootstrap.min.css" rel="stylesheet">
         <!--todo el estiolo (imagenes+division de areas)-->
       <link href="assets/css/style.css" rel="stylesheet">



        <!--[if lt IE 9]>
        <script src="https://oss.maxcdn.com/html5shiv/3.7.3/html5shiv.min.js"></script>
        <script src="https://oss.maxcdn.com/respond/1.4.2/respond.min.js"></script>
        <![endif]-->
    </head>
    <body>
        <nav class="menu" id="theMenu">
		<div class="menu-wrap">
		<h1 class="logo"><a href="index.html#home">KAIZENWARE</a></h1>
		<i class="fa fa-arrow-right menu-close"></i>
            <div class="container">
                <ul>
                    <a href="index"><li>Home</li></a>
                    <a href="#about"><li>¿Quienes somos?</li></a>
                    <a href="#contact"><li>Contactanos</li></a>
                    <a href="Login"><li>Iniciar Sesion</li></a>
                </ul>
            </div>
        </div>
        <!-- Menu button -->

        <div id="menuToggle" class="ion-navicon _ion-android-menu"><i class="fa fa-bars"></i></div>
		</nav>

        <div class="main">
            <header class="bg-img header">
            	<#include "/Vista/usuarios/header-admin.ftl"/>
                
                <div class="container">
                    <div class="row">

                        <div class="intro-box">
                            <div class="intro">
                                <h1>KAIZENWARE</h1>
                                <p>Somos una empresa integral especializada en desarrollo de software, diseño web y digital marketing</p>

                            </div>
                        </div>
                    </div>
                </div>
            </header>
            <section id="about" class="about section">
                <div class="container">
                    <div class="row">
                        <div class="col-sm-8 col-sm-offset-2">
                            <h2 class="title">Sobre Nosotros</h2>
                            <p>
                             Para llevar a la realidad nuestros proyectos, contamos con talento en distintas áreas de desarrollo, diseño, marketing; así como, áreas administrativas y de dirección. Todas las áreas trabajan en equipo para lograr mejores resultados y generar proyectos con un toque de lo mejor de cada talento.
                            </p>
                            <img src="assets/images/signature.png">
                            <span>Group of Four-ceo</span>
                        </div>
                    </div>
                </div>
            </section>


            <section class="ubutia-quote section bg-img">
                <div class="container">
                    <div class="row">
                        <div class="col-sm-12">
                            <img class="quote" src="assets/images/quote.png">
                           <p>
                              La gente exitosa hace lo que la gente sin éxito no está dispuesta a hacer. No desearía que fuera más fácil; Desearía que fuera mejor
                           </p>
                           <p class="author">Jim Rohn</p>
                           <img src="assets/images/mouse.png">
                        </div>
                    </div>
                </div>
            </section>

            <section class="watch bg-img">
                <div class="container">



                    <!--seccion de video-->

                 <div class="row">


                        <div class="col-sm-12">


                           <iframe class="popup-youtube btn" width="800px" height="500px" src="https://www.youtube.com/embed/85MppyLJHz0"  allowfullscreen></iframe>


                        </div>
                    </div>
                </div>
            </section>

        <!--seccion de video-->
            <section id="contact" class="contact section">
                <div class="container">
                    <h2 class="title">Contactanos</h2>
                    <div class="row">
                        <div class="col-sm-4">
                            <div class="ubutia-card">
                                <div class="ubutia-card-header">
                                        <span class="fa fa-map-o" aria-hidden="true"></span>
                                </div>
                                <div class="ubutia-card-content">
                                    <h3>Direccion</h3>
                                    <p>
                                    Barquisimeto, estado Lara, Venezuela
                                    </p>
                                </div>
                            </div>
                        </div>
                        <div class="col-sm-4">
                            <div class="ubutia-card">
                                <div class="ubutia-card-header">
                                        <span class="fa fa-phone" aria-hidden="true"></span>
                                </div>
                                <div class="ubutia-card-content">
                                    <h3>Telefono</h3>
                                    <p>
                                        +58 251 721 76 09
                                    </p>
                                </div>
                            </div>
                        </div>
                        <div class="col-sm-4">
                            <div class="ubutia-card">
                                <div class="ubutia-card-header">
                                        <span class="fa fa-paper-plane" aria-hidden="true"></span>
                                </div>
                                <div class="ubutia-card-content">
                                    <h3>Correo</h3>
                                    <p>
                                        contacto@kaizenware.com
                                    </p>
                                </div>
                            </div>
                        </div>
                        <div class="col-sm-12">

                        </div>
                    </div>
                </div>
            </section>

			<#include "/Vista/usuarios/footer-admin.html" />
</div>

        <script src="assets/js/jquery-3.1.1.js"></script>
        <script src="assets/js/bootstrap.min.js"></script>
        <script src="assets/js/owl.carousel.min.js"></script>
        <script src="assets/js/jquery.magnific-popup.js"></script>
        <script src="assets/js/script.js"></script>
    </body>
</html>
