package org.mrk.blockadblock

/**
  * Created by mpiche on 2016-02-15.
  */

import scala.concurrent.Future
import scala.scalajs.js

@js.native
trait BlockAdBlock extends js.Object{

  def setOption(options: String, value: js.Any ):Unit = js.native

  def check(loop  : Int ): Unit = js.native

  def onNotDetected(callbacks: js.Function): Unit = js.native

  def onDetected(callbacks: js.Function ): Unit = js.native

}
