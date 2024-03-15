package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._

/**
 * 
 * @param pinUnderscoreid Pin ID.
 */
case class AdPinId(pinUnderscoreid: Option[String]
                )

object AdPinId {
    /**
     * Creates the codec for converting AdPinId from and to JSON.
     */
    implicit val decoder: Decoder[AdPinId] = deriveDecoder
    implicit val encoder: ObjectEncoder[AdPinId] = deriveEncoder
}
