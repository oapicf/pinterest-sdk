package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.Audience
import scala.collection.immutable.Seq

/**
 * 
 * @param bookmark 
 * @param items 
 */
case class AudiencesList200Response(bookmark: Option[String],
                items: Seq[Audience]
                )

object AudiencesList200Response {
    /**
     * Creates the codec for converting AudiencesList200Response from and to JSON.
     */
    implicit val decoder: Decoder[AudiencesList200Response] = deriveDecoder
    implicit val encoder: ObjectEncoder[AudiencesList200Response] = deriveEncoder
}
