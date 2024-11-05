package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._

/**
 * 
 */
case class TargetingSpecAppType()

object TargetingSpecAppType {
    /**
     * Creates the codec for converting TargetingSpecAppType from and to JSON.
     */
    implicit val decoder: Decoder[TargetingSpecAppType] = deriveDecoder
    implicit val encoder: ObjectEncoder[TargetingSpecAppType] = deriveEncoder
}
