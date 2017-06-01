/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servlets;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Laboratorio
 */
@WebServlet(name = "Category05", urlPatterns = {"/category05"})
public class Category05 extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>\n" +
"<!--[if lt IE 7]>      <html class=\"no-js lt-ie9 lt-ie8 lt-ie7\"> <![endif]-->\n" +
"<!--[if IE 7]>         <html class=\"no-js lt-ie9 lt-ie8\"> <![endif]-->\n" +
"<!--[if IE 8]>         <html class=\"no-js lt-ie9\"> <![endif]-->\n" +
"<!--[if gt IE 8]><!--> <html class=\"no-js\"> <!--<![endif]-->\n" +
"	<head>\n" +
"	<meta charset=\"utf-8\">\n" +
"	<meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">\n" +
"	<title>GuiaSuper - As melhores ofertas de Rio Branco!</title>\n" +
"	<meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\n" +
"	<meta name=\"description\" content=\"GuiaSuper\" />\n" +
"	<meta name=\"keywords\" content=\"Saiba onde comprar barato!\" />\n" +
"	<meta name=\"author\" content=\"...\" />\n" +
"\n" +
"  	\n" +
"  	<link rel=\"shortcut icon\" href=\"GuiaSuper.png\">\n" +
"\n" +
"  	<!-- Google Webfont -->\n" +
"	<link href='http://fonts.googleapis.com/css?family=Lato:300,400,700' rel='stylesheet' type='text/css'>\n" +
"	<!-- Themify Icons -->\n" +
"	<link rel=\"stylesheet\" href=\"css/themify-icons.css\">\n" +
"	<!-- Bootstrap -->\n" +
"	<link rel=\"stylesheet\" href=\"css/bootstrap.css\">\n" +
"	<!-- Owl Carousel -->\n" +
"	<link rel=\"stylesheet\" href=\"css/owl.carousel.min.css\">\n" +
"	<link rel=\"stylesheet\" href=\"css/owl.theme.default.min.css\">\n" +
"	<!-- Magnific Popup -->\n" +
"	<link rel=\"stylesheet\" href=\"css/magnific-popup.css\">\n" +
"	<!-- Superfish -->\n" +
"	<link rel=\"stylesheet\" href=\"css/superfish.css\">\n" +
"	<!-- Easy Responsive Tabs -->\n" +
"	<link rel=\"stylesheet\" href=\"css/easy-responsive-tabs.css\">\n" +
"	<!-- Animate.css -->\n" +
"	<link rel=\"stylesheet\" href=\"css/animate.css\">\n" +
"	<!-- Theme Style -->\n" +
"	<link rel=\"stylesheet\" href=\"css/style.css\">\n" +
"\n" +
"	<!-- Modernizr JS -->\n" +
"	<script src=\"js/modernizr-2.6.2.min.js\"></script>\n" +
"	<!-- FOR IE9 below -->\n" +
"	<!--[if lt IE 9]>\n" +
"	<script src=\"js/respond.min.js\"></script>\n" +
"	<![endif]--></head>\n" +
"	<body class=\"inner-page\">\n" +
"\n" +
"		<!-- START #fh5co-header -->\n" +
"\n" +
"<header id=\"fh5co-header-section\" role=\"header\" class=\"\" >\n" +
"			<div class=\"container\">\n" +
"\n" +
"				\n" +
"\n" +
"				<!-- <div id=\"fh5co-menu-logo\"> -->\n" +
"					<!-- START #fh5co-logo -->\n" +
"					<h1 id=\"fh5co-logo\" class=\"pull-left\"><a href=\"index.jsp\">				\n" +
"					<!-- START #fh5co-menu-wrap -->\n" +
"					<nav id=\"fh5co-menu-wrap\" role=\"navigation\">\n" +
"						\n" +
"						\n" +
"						<ul class=\"sf-menu\" id=\"fh5co-primary-menu\">\n" +
"							<li>\n" +
"															</li>\n" +
"							<li>\n" +
"								\n" +
"								 <ul class=\"fh5co-sub-menu\">\n" +
"								 																		<ul class=\"fh5co-sub-menu\">\n" +
"															\n" +
"											\n" +
"									\n" +
"										</ul>\n" +
"									</li>\n" +
"															</ul>\n" +
"							</li>\n" +
"												\n" +
"						</ul>\n" +
"					</nav>\n" +
"				<!-- </div> -->\n" +
"\n" +
"			</div>\n" +
                    
"		</header>\n" +
                    
"		\n" +
"		\n" +
                   
"		<div id=\"fh5co-hero\">\n" +
"			<a href=\"#fh5co-main\" class=\"smoothscroll fh5co-arrow to-animate hero-animate-4\"><i class=\"ti-angle-down\"></i></a>\n" +
"			<!-- End fh5co-arrow -->\n" +
"			<div class=\"container\">\n" +
"				<div class=\"col-md-8 col-md-offset-2\">\n" +
"					<div class=\"fh5co-hero-wrap\">\n" +
"						<div class=\"fh5co-hero-intro\">\n" +
"							<h2 class=\"to-animate hero-animate-1\">CATEGORIA</h2>\n" +        
"							<h1 class=\"to-animate hero-animate-2\">Brinquedos</h1>\n" +
                    "                                               <br><br><p><a href=\"index.jsp\" class=\"btn btn-outline btn-sm\">Início</a></p>\n" +
"\n"+
"\n"+
"						</div>\n" +
"					</div>\n" +
"				</div>\n" +
"			</div>		\n" +
"		</div>\n" +
"\n" +
                    
"		<div id=\"fh5co-main\">\n" +
"			<div class=\"container\">\n" +
"				<div class=\"row\">\n" +
"\n" +
"					<div class=\"fh5co-spacer fh5co-spacer-sm\"></div>	\n" +
"					<div class=\"col-md-8\">\n" +
"						<form action=\"#\" method=\"post\">\n" +
"							<div class=\"col-md-12\">\n" +
"								<div class=\"form-group\">\n" +
"							</div>	\n" +
"							</div>\n" +
"							<div class=\"col-md-12\">\n" +
"								<div class=\"form-group\">\n" +
"\n" +
"				</div>	\n" +
"							</div>\n" +
"							\n" +
"							<div class=\"col-md-12\">\n" +
"														</div>	\n" +
"							</div>\n" +
"							\n" +
"							\n" +
"						</form>	\n" +
"						\n" +
"					</div>\n" +
"					<div class=\"col-md-4\">\n" +
"						<h3>Listagem</h3>\n" +
 
"												\n" +
"							</div>\n" +
"\n" +
"					<div class=\"fh5co-spacer fh5co-spacer-md\"></div>	\n" +
"\n" +
"				</div>\n" +
"			</div>\n" +
"\n" +
"		\n" +
"		</div>\n" +
"		<!-- END fhtco-main -->\n" +
"\n" +
"\n" +
"		<footer role=\"contentinfo\" id=\"fh5co-footer\">\n" +
"			<a href=\"#\" class=\"fh5co-arrow fh5co-gotop footer-box\"><i class=\"ti-angle-up\"></i></a>\n" +
"			<div class=\"container\">\n" +
"				<div class=\"row\">\n" +
"					<div class=\"col-md-4 col-sm-6 footer-box\">\n" +
"						<h3 class=\"fh5co-footer-heading\">Sobre Nós</h3>\n" +
"						<p>Guilherme Júnior e Rodrigo Barbosa. Acadêmicos do Curso de Sistemas de Informação na instituição de ensino União Educacional do Norte - UNINORTE, sob a orientação do Prof. Maicon Vasconcelos.</p>\n" +
"						<p><a href=\"#\" class=\"btn btn-outline btn-sm\">Início</a></p>\n" +
"\n" +
"					</div>\n" +
"					<div class=\"col-md-4 col-sm-6 footer-box\">\n" +
"						<h3 class=\"fh5co-footer-heading\">Links</h3>\n" +
"						<ul class=\"fh5co-footer-links\">\n" +
"							<li><a href=\"#\">Termos e Condições</a></li>\n" +
"							<li><a href=\"contact.jsp\">Suporte</a></li>\n" +
"							\n" +
"							\n" +
"						</ul>\n" +
"					</div>\n" +
"					<div class=\"col-md-4 col-sm-12 footer-box\">\n" +
"						<h3 class=\"fh5co-footer-heading\">Contato</h3>\n" +
"						<ul class=\"fh5co-social-icons\">\n" +
"							\n" +
"							<li><a href=\"#\"><i class=\"ti-google\"></i></a></li>\n" +
"							<li><a href=\"#\"><i class=\"ti-twitter-alt\"></i></a></li>\n" +
"							<li><a href=\"#\"><i class=\"ti-facebook\"></i></a></li>	\n" +
"							<li><a href=\"#\"><i class=\"ti-instagram\"></i></a></li>\n" +
"							<li><a href=\"#\"><i class=\"ti-dribbble\"></i></a></li>\n" +
"						</ul>\n" +
"					</div>\n" +
"					<div class=\"col-md-12 footer-box\">\n" +
"						<div class=\"fh5co-copyright\">\n" +
"						<p>&copy; 2017 GuiaSuper. Todos os direitos reservados.\n" +
"						</div>\n" +
"					</div>\n" +
"					\n" +
"				</div>\n" +
"				<!-- END row -->\n" +
"				<div class=\"fh5co-spacer fh5co-spacer-md\"></div>\n" +
"			</div>\n" +
"		</footer>\n" +
"			\n" +
"			\n" +
"		<!-- jQuery -->\n" +
"		<script src=\"js/jquery-1.10.2.min.js\"></script>\n" +
"		<!-- jQuery Easing -->\n" +
"		<script src=\"js/jquery.easing.1.3.js\"></script>\n" +
"		<!-- Bootstrap -->\n" +
"		<script src=\"js/bootstrap.js\"></script>\n" +
"		<!-- Owl carousel -->\n" +
"		<script src=\"js/owl.carousel.min.js\"></script>\n" +
"		<!-- Magnific Popup -->\n" +
"		<script src=\"js/jquery.magnific-popup.min.js\"></script>\n" +
"		<!-- Superfish -->\n" +
"		<script src=\"js/hoverIntent.js\"></script>\n" +
"		<script src=\"js/superfish.js\"></script>\n" +
"		<!-- Easy Responsive Tabs -->\n" +
"		<script src=\"js/easyResponsiveTabs.js\"></script>\n" +
"		<!-- FastClick for Mobile/Tablets -->\n" +
"		<script src=\"js/fastclick.js\"></script>\n" +
"		<!-- Parallax -->\n" +
"		<script src=\"js/jquery.parallax-scroll.min.js\"></script>\n" +
"		<!-- Waypoints -->\n" +
"		<script src=\"js/jquery.waypoints.min.js\"></script>\n" +
"\n" +
"		<!-- Main JS -->\n" +
"		<script src=\"js/main.js\"></script>\n" +
"\n" +
"	</body>\n" +
"</html>");
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
