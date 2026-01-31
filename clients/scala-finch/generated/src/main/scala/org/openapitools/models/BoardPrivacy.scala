package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._

/**
 * 
 */
case class BoardPrivacy()

object BoardPrivacy {
    /**
     * Creates the codec for converting BoardPrivacy from and to JSON.
     */
    implicit val decoder: Decoder[BoardPrivacy] = deriveDecoder
    implicit val encoder: ObjectEncoder[BoardPrivacy] = deriveEncoder
}
