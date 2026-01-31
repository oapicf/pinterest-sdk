package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._

/**
 * 
 */
case class ProductCategoryDetailLookbackWindow()

object ProductCategoryDetailLookbackWindow {
    /**
     * Creates the codec for converting ProductCategoryDetailLookbackWindow from and to JSON.
     */
    implicit val decoder: Decoder[ProductCategoryDetailLookbackWindow] = deriveDecoder
    implicit val encoder: ObjectEncoder[ProductCategoryDetailLookbackWindow] = deriveEncoder
}
