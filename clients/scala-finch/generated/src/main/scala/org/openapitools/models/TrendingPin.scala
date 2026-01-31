package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._

/**
 * Pin image data for trending topics
 * @param height Height of the pin image in pixels
 * @param id Unique identifier for the pin
 * @param src URL of the pin image
 * @param width Width of the pin image in pixels
 */
case class TrendingPin(height: Int,
                id: String,
                src: String,
                width: Int
                )

object TrendingPin {
    /**
     * Creates the codec for converting TrendingPin from and to JSON.
     */
    implicit val decoder: Decoder[TrendingPin] = deriveDecoder
    implicit val encoder: ObjectEncoder[TrendingPin] = deriveEncoder
}
