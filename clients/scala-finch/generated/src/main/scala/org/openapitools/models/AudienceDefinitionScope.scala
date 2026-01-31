package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._

/**
 * Generated audience scope to request.
 * @param scope 
 */
case class AudienceDefinitionScope(scope: Option[String]
                )

object AudienceDefinitionScope {
    /**
     * Creates the codec for converting AudienceDefinitionScope from and to JSON.
     */
    implicit val decoder: Decoder[AudienceDefinitionScope] = deriveDecoder
    implicit val encoder: ObjectEncoder[AudienceDefinitionScope] = deriveEncoder
}
