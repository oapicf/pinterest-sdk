package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.TrendingKeywordsResponseTrendsInner
import scala.collection.immutable.Seq

/**
 * 
 * @param trends The top trending keywords for the specified trend type in the requested region.<br /> Results are ordered, with the first element in the array representing the #1 top trend.
 */
case class TrendingKeywordsResponse(trends: Option[Seq[TrendingKeywordsResponseTrendsInner]]
                )

object TrendingKeywordsResponse {
    /**
     * Creates the codec for converting TrendingKeywordsResponse from and to JSON.
     */
    implicit val decoder: Decoder[TrendingKeywordsResponse] = deriveDecoder
    implicit val encoder: ObjectEncoder[TrendingKeywordsResponse] = deriveEncoder
}
