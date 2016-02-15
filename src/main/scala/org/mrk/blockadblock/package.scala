package org.mrk

/**
  * Created by mpiche on 2016-02-15.
  */
import scala.scalajs.js

package object blockadblock {
  val BlockAdBlock: BlockAdBlock = js.Dynamic.newInstance(js.Dynamic.global.BlockAdBlock)().asInstanceOf[BlockAdBlock];
}