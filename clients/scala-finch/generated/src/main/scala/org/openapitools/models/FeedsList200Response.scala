package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.CatalogsFeed
import scala.collection.immutable.Seq

/**
 * 
 * @param bookmark 
 * @param items 
 */
case class FeedsList200Response(bookmark: Option[String],
                items: Seq[CatalogsFeed]
                )

object FeedsList200Response {
    /**
     * Creates the codec for converting FeedsList200Response from and to JSON.
     */
    implicit val decoder: Decoder[FeedsList200Response] = deriveDecoder
    implicit val encoder: ObjectEncoder[FeedsList200Response] = deriveEncoder
}
