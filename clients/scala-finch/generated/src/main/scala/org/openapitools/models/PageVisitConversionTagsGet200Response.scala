package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.ConversionEventResponse
import scala.collection.immutable.Seq

/**
 * 
 * @param bookmark 
 * @param items 
 */
case class PageVisitConversionTagsGet200Response(bookmark: Option[String],
                items: Seq[ConversionEventResponse]
                )

object PageVisitConversionTagsGet200Response {
    /**
     * Creates the codec for converting PageVisitConversionTagsGet200Response from and to JSON.
     */
    implicit val decoder: Decoder[PageVisitConversionTagsGet200Response] = deriveDecoder
    implicit val encoder: ObjectEncoder[PageVisitConversionTagsGet200Response] = deriveEncoder
}
