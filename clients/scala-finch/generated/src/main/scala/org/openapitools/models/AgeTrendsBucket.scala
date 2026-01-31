package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._

/**
 * 
 */
case class AgeTrendsBucket()

object AgeTrendsBucket {
    /**
     * Creates the codec for converting AgeTrendsBucket from and to JSON.
     */
    implicit val decoder: Decoder[AgeTrendsBucket] = deriveDecoder
    implicit val encoder: ObjectEncoder[AgeTrendsBucket] = deriveEncoder
}
