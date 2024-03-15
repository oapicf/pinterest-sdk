package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._

/**
 * The enhanced match status of the tag
 */
case class EnhancedMatchStatusType()

object EnhancedMatchStatusType {
    /**
     * Creates the codec for converting EnhancedMatchStatusType from and to JSON.
     */
    implicit val decoder: Decoder[EnhancedMatchStatusType] = deriveDecoder
    implicit val encoder: ObjectEncoder[EnhancedMatchStatusType] = deriveEncoder
}
