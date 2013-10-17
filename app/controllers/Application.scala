package controllers

import play.api._
import play.api.mvc._

object Application extends Controller {
  
  def index = Action {
    Ok(views.html.index())
  }

  def notes = Action {
  	Ok(views.html.notes())
  }

  def assignments(assignment:Int) = Action {
  	if(assignment == 0) Ok(views.html.assignments());
  	else if(assignment == 1) Ok(views.html.assignment1());
  	else NotFound;
  }
  
}