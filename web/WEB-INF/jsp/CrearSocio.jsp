<!DOCTYPE html>
<html lang="en">

<head>

    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <meta name="description" content="">
    <meta name="author" content="">

    <title>Administrador - Libreria</title>

    <!-- Bootstrap Core CSS -->
    <link href="css/bootstrap.min.css" rel="stylesheet">

    <!-- Custom CSS -->
    <link href="css/sb-admin.css" rel="stylesheet">

    <!-- Morris Charts CSS -->
    <link href="css/plugins/morris.css" rel="stylesheet">

    <!-- Custom Fonts -->
    <link href="font-awesome/css/font-awesome.min.css" rel="stylesheet" type="text/css">

    <!-- HTML5 Shim and Respond.js IE8 support of HTML5 elements and media queries -->
    <!-- WARNING: Respond.js doesn't work if you view the page via file:// -->
    <!--[if lt IE 9]>
        <script src="https://oss.maxcdn.com/libs/html5shiv/3.7.0/html5shiv.js"></script>
        <script src="https://oss.maxcdn.com/libs/respond.js/1.4.2/respond.min.js"></script>
    <![endif]-->

</head>

<body>

    <div id="wrapper">

        <!-- Navigation -->
        <nav class="navbar navbar-inverse navbar-fixed-top" role="navigation">
            <!-- Brand and toggle get grouped for better mobile display -->
            <div class="navbar-header">
                <button type="button" class="navbar-toggle" data-toggle="collapse" data-target=".navbar-ex1-collapse">
                    <span class="sr-only">Toggle navigation</span>
                    <span class="icon-bar"></span>
                    <span class="icon-bar"></span>
                    <span class="icon-bar"></span>
                </button>
                <a class="navbar-brand" href="index.htm"><b>Administrador</b></a>
            </div>

            <!-- Top Menu Items -->
            <ul class="nav navbar-right top-nav">
                <li class="dropdown">
                    <a href="#" class="dropdown-toggle" data-toggle="dropdown"><i class="fa fa-envelope"></i> <b class="caret"></b></a>
                    <ul class="dropdown-menu message-dropdown">
                        <li class="message-preview">
                            <a href="#">
                                <div class="media">
                                    <span class="pull-left">
                                        <img class="media-object" src="http://placehold.it/50x50" alt="">
                                    </span>
                                    <div class="media-body">
                                        <h5 class="media-heading"><strong>Br hernann</strong>
                                        </h5>
                                        <p class="small text-muted"><i class="fa fa-clock-o"></i> Ayer  16:32 PM</p>
                                        <p>Pagame la plata que me debes conch...</p>
                                    </div>
                                </div>
                            </a>
                        </li>
                        <li class="message-footer">
                            <a href="#">Read All New Messages</a>
                        </li>
                    </ul>
                </li>
                <li class="dropdown">
                    <a href="#" class="dropdown-toggle" data-toggle="dropdown"><i class="fa fa-bell"></i> <b class="caret"></b></a>
                    <ul class="dropdown-menu alert-dropdown">
                        <li>
                            <a href="#">Alert Name <span class="label label-default">Alert Badge</span></a>
                        </li>
                        <li>
                            <a href="#">Alert Name <span class="label label-primary">Alert Badge</span></a>
                        </li>
                        <li>
                            <a href="#">Alert Name <span class="label label-success">Alert Badge</span></a>
                        </li>
                        <li>
                            <a href="#">Alert Name <span class="label label-info">Alert Badge</span></a>
                        </li>
                        <li>
                            <a href="#">Alert Name <span class="label label-warning">Alert Badge</span></a>
                        </li>
                        <li>
                            <a href="#">Alert Name <span class="label label-danger">Alert Badge</span></a>
                        </li>
                        <li class="divider"></li>
                        <li>
                            <a href="#">View All</a>
                        </li>
                    </ul>
                </li>
                <li class="dropdown">
                    <a href="#" class="dropdown-toggle" data-toggle="dropdown"><i class="fa fa-user"></i> Br hernann <b class="caret"></b></a>
                    <ul class="dropdown-menu">
                        <li>
                            <a href="#"><i class="fa fa-fw fa-user"></i> Perfil</a>
                        </li>
                        <li>
                            <a href="#"><i class="fa fa-fw fa-envelope"></i> Email</a>
                        </li>
                        <li>
                            <a href="#"><i class="fa fa-fw fa-gear"></i> Configuracion</a>
                        </li>
                        <li class="divider"></li>
                        <li>
                            <a href="#"><i class="fa fa-fw fa-power-off"></i> Log Out</a>
                        </li>
                    </ul>
                </li>
            </ul>
            <!-- Sidebar Menu Items - These collapse to the responsive navigation menu on small screens -->
            <div class="collapse navbar-collapse navbar-ex1-collapse">
                <ul class="nav navbar-nav side-nav">

                    <li class="active">
                        <a href="index.htm"><i class="fa fa-fw fa-dashboard"></i> Panel Principal</a>
                    </li>
                         <li>
                        <a href="CrearPrestamo.htm"><i class="fa fa-fw fa-plus-square-o"></i> Crear  Prestamo</a>
                    </li>
                    <li>
                        <a href=""><i class="fa fa-fw fa-bar-chart-o"></i> Graficos</a>
                    </li>
                    <li>
                        <a href="tablas.do"><i class="fa fa-fw fa-table"></i> Tablas</a>
                    </li>
                    <li>
                        <a href="javascript:;" data-toggle="collapse" data-target="#demo1"><i class="fa fa-fw fa-edit"></i> Formularios <i class="fa fa-fw fa-caret-down"></i></a>
                        <ul id="demo1" class="collapse">
                            <li>
                                <a href="CrearLibro.htm">Formulario Libro</a>
                            </li>
                            <li>
                                <a href="CrearSocio.htm">Formulario Socio</a>
                            </li>
                        </ul>
                    </li>

                    <li>
                        <a href="javascript:;" data-toggle="collapse" data-target="#demo"><i class="fa fa-fw fa-wrench"></i> Herramientas <i class="fa fa-fw fa-caret-down"></i></a>
                        <ul id="demo" class="collapse">
                            <li>
                               <a href="ModificarLibro.htm">Modificar Libro</a>
                            </li>
                            <li>
                                <a href="EliminarLibro.htm">Eliminar Libro</a>
                            </li>
                            <li>
                                <a href="ModificarSocio.htm">Modificar Socio</a>
                            </li>
                           <li>
                                <a href="EliminarSocio.htm">Eliminar Socio</a>
                            </li>
                        </ul>
                    </li>
                    <li>
                        <a href="ExtenderPrestamo.htm"><i class="fa fa-fw fa-plus-square-o"></i> Extender prestamo</a>
                    </li>

                </ul>
            </div>
            <!-- /.navbar-collapse -->
        </nav>

        <div id="page-wrapper">


          <div class="container-fluid">

                          <!-- Page Heading -->
                          <div class="row">
                              <div class="col-lg-12">
                                  <h1 class="page-header">
                                      Nuevo Socio
                                  </h1>
                                  <ol class="breadcrumb">
                                      <li>
                                          <i class="fa fa-dashboard"></i>  <a href="index.html">Principal</a>
                                      </li>
                                      <li class="active">
                                          <i class="fa fa-edit"></i> Formulario Socio
                                      </li>
                                  </ol>
                              </div>
                          </div>
                          <!-- /.row -->

                          <div class="row">

                                <div class="col-lg-6">


                                    <form action="CrearSocio.htm" method="POST" class="form-group">

                                   <input name="txtrut" type="text" class="form-control" required autocomplete placeholder="Rut"><br>
                                   <input name="txtnombre" type="text" class="form-control" required autocomplete placeholder="Nombres"><br>
                                   <input name="txtapellido" type="text" class="form-control" required autocomplete placeholder="Apellidos"><br>
                                   <input name="txtcorreo" type="text" class="form-control" required autocomplete placeholder="Email"><br>
                                   <input name="txttelefono" type="text" class="form-control" required autocomplete placeholder="Telefono"><br>

                                   <br>
                                   <div class="col-lg-4">
                                   <input type="submit" name="name" value="Enviar" class="form-control btn btn-primary">
                                   </div>
                                    </form>

                                </div>
                                <div class="col-lg-4"></div>

                          </div>
                          <br>  <br>  <br>  <br>  <br>  <br>  <br>
                      </div>
            <!-- /.container-fluid -->

        </div>
        <!-- /#page-wrapper -->

    </div>
    <!-- /#wrapper -->

    <!-- jQuery -->
    <script src="js/jquery.js"></script>

    <!-- Bootstrap Core JavaScript -->
    <script src="js/bootstrap.min.js"></script>

    <!-- Morris Charts JavaScript -->
    <script src="js/plugins/morris/raphael.min.js"></script>
    <script src="js/plugins/morris/morris.min.js"></script>
    <script src="js/plugins/morris/morris-data.js"></script>

</body>

</html>
