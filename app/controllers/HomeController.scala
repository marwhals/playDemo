package controllers

import javax.inject._
import models.UserData
import play.api._
import play.api.mvc._
import play.api.data._
import play.api.data.Forms._
import views.html.Home.home


/**
 * This controller creates an `Action` to handle HTTP requests to the
 * application's home page.
 */
@Singleton
class HomeController @Inject()(val controllerComponents: ControllerComponents) extends BaseController {

  /**
   * Create an Action to render an HTML page.
   *
   * The configuration in the `routes` file means that this method
   * will be called when the application receives a `GET` request with
   * a path of `/`.
   */

  def index = Action { implicit request: Request[AnyContent] =>
    Ok(views.html.index())
  }

  def about = Action { implicit request: Request[AnyContent] =>
    Ok(s"""Hellooooooooooo""")
  }

  def welcome(name: String) = Action { implicit request: Request[AnyContent] =>
    Ok(s"""Hellooooooooooo $name""")
  }

  def woop(name: String, lastname: String) = Action { implicit request: Request[AnyContent] =>
    Ok(home.render(name,lastname))
  }





}
