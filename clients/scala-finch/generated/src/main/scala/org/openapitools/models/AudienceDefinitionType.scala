package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._

/**
 * Generated audience type to request.
 * @param scope 
 */
case class AudienceDefinitionType(scope: Option[String]
                )

object AudienceDefinitionType {
    /**
     * Creates the codec for converting AudienceDefinitionType from and to JSON.
     */
    implicit val decoder: Decoder[AudienceDefinitionType] = deriveDecoder
    implicit val encoder: ObjectEncoder[AudienceDefinitionType] = deriveEncoder
}
