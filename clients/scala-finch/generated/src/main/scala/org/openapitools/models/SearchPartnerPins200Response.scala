package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.SummaryPin
import scala.collection.immutable.Seq

/**
 * 
 * @param bookmark 
 * @param items 
 */
case class SearchPartnerPins200Response(bookmark: Option[String],
                items: Seq[SummaryPin]
                )

object SearchPartnerPins200Response {
    /**
     * Creates the codec for converting SearchPartnerPins200Response from and to JSON.
     */
    implicit val decoder: Decoder[SearchPartnerPins200Response] = deriveDecoder
    implicit val encoder: ObjectEncoder[SearchPartnerPins200Response] = deriveEncoder
}
