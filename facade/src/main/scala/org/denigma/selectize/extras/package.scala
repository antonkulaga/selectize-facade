package org.denigma.selectize

import org.querki.jquery
import org.querki.jquery.JQuery
import scala.scalajs.js

package object extras {

  implicit class Selectize(jq:JQuery) extends jquery.JQueryExtensions(jq){

    def selectize(config:SelectizeConfig) = {
        jq.asInstanceOf[js.Dynamic].selectize(config)
    }
  }
}
