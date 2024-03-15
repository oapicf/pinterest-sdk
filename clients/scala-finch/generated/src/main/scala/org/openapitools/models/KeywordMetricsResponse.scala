package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.KeywordMetrics

/**
 * 
 * @param keyword Keyword name, e.g., \"keyword\":\"fashion outfits\"
 * @param metrics 
 */
case class KeywordMetricsResponse(keyword: Option[String],
                metrics: Option[KeywordMetrics]
                )

object KeywordMetricsResponse {
    /**
     * Creates the codec for converting KeywordMetricsResponse from and to JSON.
     */
    implicit val decoder: Decoder[KeywordMetricsResponse] = deriveDecoder
    implicit val encoder: ObjectEncoder[KeywordMetricsResponse] = deriveEncoder
}
