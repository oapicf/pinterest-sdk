package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._

/**
 * 
 */
case class TargetingSpecAgeBucket()

object TargetingSpecAgeBucket {
    /**
     * Creates the codec for converting TargetingSpecAgeBucket from and to JSON.
     */
    implicit val decoder: Decoder[TargetingSpecAgeBucket] = deriveDecoder
    implicit val encoder: ObjectEncoder[TargetingSpecAgeBucket] = deriveEncoder
}
