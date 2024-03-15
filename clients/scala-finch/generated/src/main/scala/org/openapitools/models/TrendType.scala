package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._

/**
 * 
 */
case class TrendType()

object TrendType {
    /**
     * Creates the codec for converting TrendType from and to JSON.
     */
    implicit val decoder: Decoder[TrendType] = deriveDecoder
    implicit val encoder: ObjectEncoder[TrendType] = deriveEncoder
}
