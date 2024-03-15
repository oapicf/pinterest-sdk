package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._

/**
 * Queryable audience representation.
 * @param date Generation date
 * @param _type Generated audience type to request.
 * @param scope Generated audience scope to request.
 */
case class AudienceDefinition(date: Option[String],
                _type: Option[String],
                scope: Option[String]
                )

object AudienceDefinition {
    /**
     * Creates the codec for converting AudienceDefinition from and to JSON.
     */
    implicit val decoder: Decoder[AudienceDefinition] = deriveDecoder
    implicit val encoder: ObjectEncoder[AudienceDefinition] = deriveEncoder
}
