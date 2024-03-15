package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._

/**
 * 
 */
case class TrendsSupportedRegion()

object TrendsSupportedRegion {
    /**
     * Creates the codec for converting TrendsSupportedRegion from and to JSON.
     */
    implicit val decoder: Decoder[TrendsSupportedRegion] = deriveDecoder
    implicit val encoder: ObjectEncoder[TrendsSupportedRegion] = deriveEncoder
}
