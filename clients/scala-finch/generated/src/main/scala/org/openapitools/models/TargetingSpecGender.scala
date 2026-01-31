package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._

/**
 * 
 */
case class TargetingSpecGender()

object TargetingSpecGender {
    /**
     * Creates the codec for converting TargetingSpecGender from and to JSON.
     */
    implicit val decoder: Decoder[TargetingSpecGender] = deriveDecoder
    implicit val encoder: ObjectEncoder[TargetingSpecGender] = deriveEncoder
}
