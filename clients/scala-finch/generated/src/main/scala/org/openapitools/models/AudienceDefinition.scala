package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._

/**
 * Queryable audience representation.
 * @param date Generation date
 * @param scope 
 * @param _type 
 */
case class AudienceDefinition(date: Option[String],
                scope: Option[String],
                _type: Option[String]
                )

object AudienceDefinition {
    /**
     * Creates the codec for converting AudienceDefinition from and to JSON.
     */
    implicit val decoder: Decoder[AudienceDefinition] = deriveDecoder
    implicit val encoder: ObjectEncoder[AudienceDefinition] = deriveEncoder
}
