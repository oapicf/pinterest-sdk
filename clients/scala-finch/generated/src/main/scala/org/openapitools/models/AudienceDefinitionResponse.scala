package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.AudienceDefinition
import scala.collection.immutable.Seq

/**
 * 
 * @param items 
 */
case class AudienceDefinitionResponse(items: Option[Seq[AudienceDefinition]]
                )

object AudienceDefinitionResponse {
    /**
     * Creates the codec for converting AudienceDefinitionResponse from and to JSON.
     */
    implicit val decoder: Decoder[AudienceDefinitionResponse] = deriveDecoder
    implicit val encoder: ObjectEncoder[AudienceDefinitionResponse] = deriveEncoder
}
