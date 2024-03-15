package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.CatalogsFeedProcessingResult
import scala.collection.immutable.Seq

/**
 * 
 * @param items 
 * @param bookmark 
 */
case class FeedProcessingResultsList200Response(items: Seq[CatalogsFeedProcessingResult],
                bookmark: Option[String]
                )

object FeedProcessingResultsList200Response {
    /**
     * Creates the codec for converting FeedProcessingResultsList200Response from and to JSON.
     */
    implicit val decoder: Decoder[FeedProcessingResultsList200Response] = deriveDecoder
    implicit val encoder: ObjectEncoder[FeedProcessingResultsList200Response] = deriveEncoder
}
