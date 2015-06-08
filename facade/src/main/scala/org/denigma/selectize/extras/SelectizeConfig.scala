package org.denigma.selectize.extras

import org.denigma.selectize.extras.SEARCH_CONJUNCTION
import org.denigma.selectize.extras.SORT_DIRECTION
import org.querki.jsext._

import scala.scalajs.js

class SelectizeConfig extends js.Object{

}

object SORT_DIRECTION extends Enumeration {
  type SORT_DIRECTION = Value
  val ASC = this.Value("asc")
  val DESC = this.Value("desc")
}


object SEARCH_CONJUNCTION extends Enumeration
{
  type SEARCH_CONJUNCTION = Value
  val AND = this.Value("and")
  val OR = this.Value("or")
}

object SelectizeConfig extends SelectizeConfigBuilder(noOpts)
class SelectizeConfigBuilder(val dict:OptMap) extends JSOptionBuilder[SelectizeConfig, SelectizeConfigBuilder](new SelectizeConfigBuilder(_)) {

  //General
  def persist(value:Boolean) = jsOpt("persist", value)
  def createOnBlur(value:Boolean) = jsOpt("createOnBlur", value)
  def allowEmptyOption(value:Boolean) = jsOpt("allowEmptyOption",value)
  def maxItems(value:Int) = jsOpt("maxItems",value)
  def create(value:Boolean): SelectizeConfigBuilder = jsOpt("create", value)
  def delimiter(value:String) = jsOpt("delimiter",value)
  def diacritics(value:Boolean) = jsOpt("diacritics",value)
  def highlight(value:Boolean) = jsOpt("highlight",value)
  def openOnFocus(value:Boolean) = jsOpt("openOnFocus",value)
  def maxOptions(value:Int) = jsOpt("maxOptions",value)
  def hideSelected(value:Boolean) = jsOpt("hideSelected",value)
  def closeAfterSelect(value:Boolean) = jsOpt("closeAfterSelect",value)
  def scrollDuration(value:Int) = jsOpt("scrollDuration",value)
  def loadThrottle(value:Int) = jsOpt("loadThrottle",value)
  def loadingClass(value:String) = jsOpt("loadingClass",value)
  def preload(value:String): SelectizeConfigBuilder = jsOpt("preload",value)
  def preload(value:Boolean): SelectizeConfigBuilder = jsOpt("preload",value)
  def dropdownParent(value:String) = jsOpt("dropdownParent",value)
  def addPrecedence(value:Boolean) = jsOpt("addPrecedence",value)
  def selectOnTab(value:Boolean) = jsOpt("selectOnTab",value)

  //Data / Searching
  //def options(value:js.Array[SelectOption]): SelectizeConfigBuilder  = jsOpt("options",value)
  def options[T](value:js.Array[T]):SelectizeConfigBuilder = jsOpt("options",value)
  def options[T](value:T):SelectizeConfigBuilder = options(js.Array(value))
  def optgroups(value:js.Array[String]) = jsOpt("optgroups",value)
  def dataAttr(value:String) = jsOpt("dataAttr",value)
  def valueField(value:String) = jsOpt("valueField",value)
  def optgroupValueField(value:String) = jsOpt("optgroupValueField",value)
  def labelField(value:String) = jsOpt("labelField",value)
  def optgroupLabelField(value:String) = jsOpt("optgroupLabelField",value)
  def sortField(fields:String): SelectizeConfigBuilder  =jsOpt("sortField", js.Dynamic.literal(field = fields))
  def sortField(fields:String,dir:SORT_DIRECTION.Value): SelectizeConfigBuilder  =jsOpt("sortField", js.Dynamic.literal(field = fields,direction = dir.toString))
  def sortField(fields:js.Array[String],dir:SORT_DIRECTION.Value = SORT_DIRECTION.DESC): SelectizeConfigBuilder  =jsOpt("sortField", js.Dynamic.literal(field = fields,direction = dir.toString))
  def searchField(value:String): SelectizeConfigBuilder = jsOpt("searchField",value)
  def searchField(value:js.Array[String]): SelectizeConfigBuilder = jsOpt("searchField",value)
  def searchConjunction(value:SEARCH_CONJUNCTION.Value) = jsOpt("searchConjunction",value)
  def lockOptgroupOrder(value:Boolean) = jsOpt("lockOptgroupOrder",value)
  def copyClassesToDropdown(value:Boolean) = jsOpt("copyClassesToDropdown",value)

  //Callbacks
  def load(query:String,callback:js.Function1[js.Any,Unit]): SelectizeConfigBuilder = jsOpt("load",js.Dynamic.literal(query = query, callback = callback))  //TODO: test this
  def score(fun:js.Function1[String,Int]): SelectizeConfigBuilder = jsOpt("score",fun)  //TODO: test this
  def score(fun:String=>Int): SelectizeConfigBuilder = score(fun:js.Function1[String,Int])
  def onInitialize(fun:js.Function0[Unit]): SelectizeConfigBuilder  = jsOpt("onInitialize",fun)
  def onInitialize(fun:()=>Unit): SelectizeConfigBuilder  = this.onInitialize(fun:js.Function0[Unit])
  def onBlur(fun:js.Function0[Unit]): SelectizeConfigBuilder  = jsOpt("onBlur",fun)
  def onBlur(fun:()=>Unit): SelectizeConfigBuilder  = onBlur(fun:js.Function0[Unit])
  def onChange(handler:js.Function1[String,Unit]): SelectizeConfigBuilder = jsOpt("onChange",handler)
  def onChange(fun:String=>Unit): SelectizeConfigBuilder  = onChange(fun:js.Function1[String,Unit])
  def onItemAdd(fun:js.Function2[String,js.Dynamic,Unit]): SelectizeConfigBuilder = jsOpt("onItemAdd",fun)
  def onItemAdd(fun:(String,js.Dynamic)=>Unit): SelectizeConfigBuilder = onItemAdd(fun:js.Function2[String,js.Dynamic,Unit])
  def onItemRemove(fun:js.Function1[String,Unit]): SelectizeConfigBuilder = jsOpt("onItemRemove",fun)
  def onItemRemove(fun:String=>Unit): SelectizeConfigBuilder = onItemRemove(fun:js.Function1[String,Unit])
  def onClear(fun:js.Function0[Unit]): SelectizeConfigBuilder  = jsOpt("onClear",fun)
  def onClear(fun:()=>Unit): SelectizeConfigBuilder  = onClear(fun:js.Function0[Unit])
  def onOptionAdd(fun:js.Function2[SelectOption,js.Dynamic,Unit]): SelectizeConfigBuilder = jsOpt("onOptionAdd",fun)  //TODO: test this
  def onOptionAdd(fun:(SelectOption,js.Dynamic)=>Unit): SelectizeConfigBuilder = onOptionAdd(fun:js.Function2[SelectOption,js.Dynamic,Unit])
  def onOptionRemove(fun:js.Function1[SelectOption,Unit]): SelectizeConfigBuilder = jsOpt("onOptionRemove",fun) //TODO: test this
  def onOptionRemove(fun:SelectOption=>Unit): SelectizeConfigBuilder = onOptionRemove(fun:js.Function1[SelectOption,Unit])
  def onDropdownOpen(fun:js.Function1[org.querki.jquery.JQuery,Unit]): SelectizeConfigBuilder = jsOpt("onDropdownOpen",fun)
  def onDropdownOpen(fun:org.querki.jquery.JQuery=>Unit): SelectizeConfigBuilder = onDropdownOpen(fun:js.Function1[org.querki.jquery.JQuery,Unit])
  def onDropdownClose(fun:js.Function1[org.querki.jquery.JQuery,Unit]): SelectizeConfigBuilder = jsOpt("onDropdownClose",fun)
  def onDropdownClose(fun:org.querki.jquery.JQuery=>Unit): SelectizeConfigBuilder = onDropdownClose(fun:js.Function1[org.querki.jquery.JQuery,Unit])
  def onType(handler:js.Function1[String,Unit]): SelectizeConfigBuilder = jsOpt("onType",handler)
  def onType(fun:String=>Unit): SelectizeConfigBuilder  = onType(fun:js.Function1[String,Unit])
  def onLoad(handler:js.Function1[Any,Unit]): SelectizeConfigBuilder = jsOpt("onLoad",handler)
  def onLoad(fun:Any=>Unit): SelectizeConfigBuilder  = onLoad(fun:js.Function1[Any,Unit]) //TODO: rewrite in more typed way
  def create(onCreate:js.Function1[String,SelectOption]): SelectizeConfigBuilder = jsOpt("create",onCreate)
  def create(fun:String=>SelectOption): SelectizeConfigBuilder = this.create(fun:js.Function1[String,SelectOption])

  //Rendering
  def render(value:SelectRenderer) = jsOpt("render",value)




}


object Test{

}
/*

$('#input-tags').selectize({
persist: false,
createOnBlur: true,
create: true
});*/
