package org.denigma

import org.querki.jquery
import org.querki.jquery.JQuery

import scala.scalajs.js


package object selectize {
  implicit class SelectizeJquery(jq:JQuery) extends jquery.JQueryExtensions(jq){

    def selectize(config:SelectizeConfig):Selectize = {
      jq.asInstanceOf[js.Dynamic].selectize(config).asInstanceOf[Selectize]
    }
  }
}
