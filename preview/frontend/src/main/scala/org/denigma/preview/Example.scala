package org.denigma.preview

import org.scalajs.dom
import org.querki.jquery._
import org.denigma.selectize.extras._

import scala.scalajs.js

object Example {

  def activate() = {
    $("#input-tags").selectize(
      SelectizeConfig
        .delimiter(",")
        .persist(false)
        .create(true)
    )

    $("#select-beast").selectize(
      SelectizeConfig
        .create(true)
        .sortField("text",SORT_DIRECTION.ASC)
        .delimiter(",")
        .dropdownParent("body")
    )
    $("#select-beast-empty").selectize(
      SelectizeConfig
        .allowEmptyOption(true)
        .create(true)
    )

    $("#select-state").selectize(SelectizeConfig.maxItems(3))

    $("#select-country").selectize(SelectizeConfig)


    $("#select-tools").selectize(
      SelectizeConfig
        .valueField("id")
        .labelField("title")
        .searchField("title")
        .options(js.Array(
        js.Dynamic.literal(id = 1,title = "Spectrometer",url="http://en.wikipedia.org/wiki/Spectrometers"),
        js.Dynamic.literal(id = 2,title = "Start Chart",url="http://en.wikipedia.org/wiki/Start_chart"),
        js.Dynamic.literal(id = 3,title = "Electrical Tape",url="http://en.wikipedia.org/wiki/Electrical_tape")
        ) )
        .create(false)
    )
  }
}
