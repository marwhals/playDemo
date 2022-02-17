package controllers

import javax.inject.Inject
import play.api.mvc.Results.Ok
import play.api.mvc.{Action, AnyContent, BaseController, ControllerComponents, Request}
import play.mvc.Controller

class BooksController @Inject()(val controllerComponents: ControllerComponents) extends BaseController {

  def index = Action { implicit request: Request[AnyContent] =>
    Ok(views.html.index())
  }
  def create = Action { implicit request: Request[AnyContent] =>
    Ok(views.html.index())
  }
  def save = Action { implicit request: Request[AnyContent] =>
    Ok(views.html.index())
  }
  def edit(id : Int) = Action { implicit request: Request[AnyContent] =>
    Ok(views.html.index())
  }
  def update = Action { implicit request: Request[AnyContent] =>
    Ok(views.html.index())
  }
  def destroy(id : Int) = Action { implicit request: Request[AnyContent] =>
    Ok(views.html.index())
  }
  def show(id: Int) = Action { implicit request: Request[AnyContent] =>
    Ok(views.html.index())
  }



}
