package org.denigma.selectize

import org.querki.jquery.JQuery

import scala.collection.immutable.Map
import scala.scalajs.js
import scala.scalajs.js.{ThisFunction2, ThisFunction1}
import scalajs.js.native

object Selectize extends js.Object {

  def define(pluginName:String, fun:ThisFunction1[js.Dynamic,js.Dynamic,Unit]):Unit = js.native
}


/**
 * Object to define selectize plugins
 */
object SelectizePlugin {
  var plugins:Map[String,ThisFunction1[js.Dynamic,js.Dynamic,Unit]] = Map.empty

  def define(name:String)(init:ThisFunction1[js.Dynamic,js.Dynamic,Unit]):Unit = if(!plugins.contains(name)){
    Selectize.define(name,init)
  }

  def apply(name:String)(fun:(js.Dynamic,js.Dynamic)=>Unit):Unit = define(name)(fun:ThisFunction1[js.Dynamic,js.Dynamic,Unit])

}

class Selectize extends js.Object {




  var settings:js.Dynamic = js.native
  var $input:JQuery = js.native
  var tagType:String = js.native

  var $wrapper:JQuery = js.native
  var $control:JQuery = js.native
  var $control_input:JQuery = js.native
  var $dropdown:JQuery = js.native
  var $dropdown_content:JQuery = js.native

  //var $dropdown_parent:JQuery = js.native

  var inputMode:Any = js.native
  var classes:String = js.native


  var isOpen     :Boolean = js.native
  var isDisabled :Boolean = js.native
  var isInvalid  :Boolean = js.native
  var isLocked   :Boolean = js.native
  var isFocused  :Boolean = js.native
  var isInputHidden:Boolean   = js.native
  var isSetup    :Boolean = js.native
  var isShiftDown:Boolean = js.native
  var isCmdDown  :Boolean = js.native
  var isCtrlDown :Boolean = js.native
  var ignoreFocus:Boolean = js.native
  var ignoreBlur :Boolean = js.native
  var ignoreHover:Boolean = js.native
  var hasOptions :Boolean = js.native
  var caretPos:Int = js.native
  var lastValue:String = js.native
  var loading:Double = js.native //TODO: check if works
  var $activaOption:JQuery = js.native
  var $activeItems:js.Array[JQuery] = js.native


  def lock():Unit = js.native
  
  def unlock():Unit = js.native

  def setupTemplates() = js.native


  /**
   * Searches through available options and returns
   * a sorted array of matches.
   *
   * Returns an object containing:
   *
   *   - query {string}
   *   - tokens {array}
   *   - total {int}
   *   - items {array}
   */
  def search(query:String):js.Dynamic = js.native

  /**
   * Adds an available option. If it already exists,
   * nothing will happen. Note: this does not refresh
   * the options list dropdown (use `refreshOptions`
   * for that).
   *
   * Usage:
   *   this.addOption(data)
   */
  def addOption(option:js.Any):js.Any = js.native

  /**
   * Updates an option available for selection. If
   * it is visible in the selected items or options
   * dropdown, it will be re-rendered automatically.
   */
  def updateOption(value:String,data:Any):Unit = js.native

  /**
   * Refreshes the list of available options shown
   * in the autocomplete dropdown menu.
   */
  def refreshOptions(triggerDropDown:Boolean) = js.native


  /**
   * Clears all options.
   */
  def clearOptions():Unit = js.native

  /**
   * Sets the input field of the control to the specified value.
   */
  def setTextboxValue(value:String):Unit = js.native


  /**
   * Removes a single option.
   */
  def removeOption(value:String):Unit = js.native


  /**
   * Invokes the provided method that provides
   * results to a callback---which are then added
   * as options to the control.
   */
  def load(fn:js.Function) = js.native


  /**
   * Returns the jQuery element of the item
   * matching the given value.
   */
  def getItem(value:String):JQuery = js.native

  /**
   * "Selects" an item. Adds it to the list
   * at the current caret position.
   */
  def addItem(value:Any):Unit = js.native

  /**
   * "Selects" multiple items at once. Adds them to the list
   * at the current caret position.
   */
  def addItems(values:js.Array[Any]):Unit = js.native //add many items

  /**
   * Removes the selected item matching
   * the provided value.
   */
  def removeItem(value:String):Unit = js.native

  /**
   * Invokes the `create` method provided in the
   * selectize options that should provide the data
   * for the new item, given the user input.
   *
   * Once this completes, it will be added
   * to the item list.
   *
   * @return {boolean}
   */
  def createItem(triggerDropdown:Any):Boolean = js.native

  /**
   * Re-renders the selected item lists.
   */
  def refreshItems():Unit = js.native

  /**
   * Updates all state-dependent attributes
   * and CSS classes.
   */
  def refreshState():Unit = js.native

  /**
   * Updates all state-dependent CSS classes.
   */
  def refreshClasses():Unit = js.native

  /**
   * Determines whether or not more items can be added
   * to the control without exceeding the user-defined maximum.
   */
  def isFull():Boolean = js.native


  var options:js.Dictionary[js.Object] = js.native


  var items:js.Array[String] = js.native

  //  var settings_element:js.Any = js.native



  /**
   * Refreshes the original <select> or <input>
   * element to reflect the current state.
   */
  def updateOriginalInput():Unit = js.native

  /**
   * Returns the jQuery element of the option
   * matching the given value.
   */
  def getOption(value:String):JQuery = js.native

  /**
   * Returns the jQuery element of the next or
   * previous selectable option.
   */
  def getAdjacentOption(option:JQuery, direction:Int):JQuery = js.native

  /**
   * Shows/hide the input placeholder depending
   * on if there items in the list already.
   */
  def updatePlaceholder:Unit = js.native
  /**
   * Shows the autocomplete dropdown containing
   * the available options.
   */
  def open:Unit = js.native

  /**
   * Closes the autocomplete dropdown menu.
   */
  def close:Unit = js.native



  /**
   * Finds the first element with a "data-value" attribute
   * that matches the given value.
   */
  def getElementWithValue(value:Any, els:JQuery):js.Dynamic = js.native

  /**
   * Calculates and applies the appropriate
   * position of the dropdown.
   */
  def positionDropdown():Unit = js.native

  /**
   * Resets / clears all selected items
   * from the control.
   */
  def clear():Unit = js.native

  /**
   * A helper method for inserting an element
   * at the current caret position.
   */
  def insertAtCaret($el:JQuery) = js.native

  /**
   * Removes the current selected item(s).
  */
  def deleteSelection(e:Any) = js.native

  /**
   * Selects the previous / next item (depending
   * on the `direction` argument).
   *
   * > 0 - right
   * < 0 - left
   */
  def advanceSelection(direction:Int, e:js.Dynamic):Unit = js.native

  /**
   * Moves the caret left / right.
   */
  def advanceCaret(direction:Int,e:js.Any):Unit = js.native

  /**
   * Moves the caret to the specified index.
   */
  def setCaret(i:Int):Unit = js.native

  /**
   * Disables user input on the control completely.
   * While disabled, it cannot receive focus.
   */
  def disable():Unit = js.native

  /**
   * Enables the control so that it can respond
   * to focus and user input.
   */
  def enable():Unit = js.native


  /**
   * Completely destroys the control and
   * unbinds all event listeners so that it can
   * be garbage collected.
   */
  def destroy():Unit = js.native

  /**
   * A helper method for rendering "item" and
   * "option" templates, given the data.
   */
  def render(templateName:String, data:Any):String = js.native

  /**
   * Clears the render cache for a template. If
   * no template is given, clears all render
   * caches.
   */
  def clearCache(templateName:String):Unit = js.native

  /**
   * Determines whether or not to display the
   * create item prompt, given a user input.
   */
  def canCreate(input:String):Boolean = js.native



}