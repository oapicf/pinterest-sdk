package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._

/**
 * 
 */
case class Gender()

object Gender {
    /**
     * Creates the codec for converting Gender from and to JSON.
     */
    implicit val decoder: Decoder[Gender] = deriveDecoder
    implicit val encoder: ObjectEncoder[Gender] = deriveEncoder
}
