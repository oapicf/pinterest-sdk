package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._

/**
 * 
 */
case class BoardUpdatePrivacy()

object BoardUpdatePrivacy {
    /**
     * Creates the codec for converting BoardUpdatePrivacy from and to JSON.
     */
    implicit val decoder: Decoder[BoardUpdatePrivacy] = deriveDecoder
    implicit val encoder: ObjectEncoder[BoardUpdatePrivacy] = deriveEncoder
}
