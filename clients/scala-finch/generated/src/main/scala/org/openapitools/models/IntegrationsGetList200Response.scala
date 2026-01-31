package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.IntegrationRecord
import scala.collection.immutable.Seq

/**
 * 
 * @param bookmark 
 * @param items 
 */
case class IntegrationsGetList200Response(bookmark: Option[String],
                items: Seq[IntegrationRecord]
                )

object IntegrationsGetList200Response {
    /**
     * Creates the codec for converting IntegrationsGetList200Response from and to JSON.
     */
    implicit val decoder: Decoder[IntegrationsGetList200Response] = deriveDecoder
    implicit val encoder: ObjectEncoder[IntegrationsGetList200Response] = deriveEncoder
}
