package org.denigma.selectize

import org.querki.jquery.JQuery
import org.scalajs.dom.raw.HTMLElement

import scala.scalajs.js
import scala.scalajs.js._
import scala.scalajs.js.annotation.JSExportAll

object SelectOption
{
  implicit def convert(op:SelectOption): js.Dynamic =op.asInstanceOf[js.Dynamic]
}


@JSExportAll
case class SelectOption(id:String,title:String)

@JSExportAll
trait SelectRenderer{
  val item: js.Function1[SelectOption,String]
  val option: js.Function1[SelectOption,String]
  //val option_create: js.Function1[InputHolder,  String]

}

trait Escaper {
  protected val replacements = ("\"", "&#34;") ::("<", "&lt;") ::(">", "&gt;") ::("'", "&#39;") :: Nil

  def escape(str: String) = replacements.foldLeft(str) {case (acc, (from,to))=>acc.replace(from,to) }

  def unescape(str: String) = replacements.foldLeft(str) {case (acc, (from,to))=>acc.replace(to,from) }

}


class InputHolder extends js.Object{
  val input:String = js.native
}

/**
 * Basic class for all selectors, contains some basic handlers and helper methods
 */
trait Selector  {

  protected def makeOption(vid:String,title:String): SelectOption

  protected def itemAddHandler(value:String, item:js.Dynamic): Unit

  protected def itemRemoveHandler(value:String): Unit

  protected def selectParams(el: HTMLElement):SelectizeConfigBuilder

  protected def selectizeFrom(el:HTMLElement): Selectize = {
    val s = el.asInstanceOf[js.Dynamic].selectize
    s.asInstanceOf[Selectize]
  }

  def selectizeOption(el:HTMLElement):Option[Selectize] =   el.asInstanceOf[js.Dynamic].dyn.selectize match {
    case s if s==null | js.isUndefined(s)=>None
    case s=>Some(s.asInstanceOf[Selectize])
  }

}

class BetterDropdownPlugin(val pluginName:String)
{

  def pluginHandler(self:js.Dynamic,settings:js.Dynamic):Unit =
  {
    val dropDown:ThisFunction0[js.Dynamic,Unit] = positionDropdown _
    self.positionDropdown = dropDown
  }

  def positionDropdown(self:js.Dynamic):Unit = {
    val control = self.$control.asInstanceOf[JQuery]
    val offset = control.asInstanceOf[js.Dynamic].position()
    if(isUndefined(offset.top)) offset.top = 0
    offset.top = offset.top.asInstanceOf[Double] + control.outerHeight(true)
    self.$dropdown.css(js.Dynamic.literal(
      //width = control.outerWidth(),
      top   = offset.top,
      left  = offset.left
    ))

  }

  def pluginFun:ThisFunction1[js.Dynamic,js.Dynamic,Unit] = pluginHandler _

  def activatePlugin() = SelectizePlugin(pluginName)(pluginFun)

}