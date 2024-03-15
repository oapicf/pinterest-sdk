package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.KeywordMetricsResponse
import scala.collection.immutable.Seq

/**
 * 
 * @param data 
 */
case class KeywordsMetricsArrayResponse(data: Option[Seq[KeywordMetricsResponse]]
                )

object KeywordsMetricsArrayResponse {
    /**
     * Creates the codec for converting KeywordsMetricsArrayResponse from and to JSON.
     */
    implicit val decoder: Decoder[KeywordsMetricsArrayResponse] = deriveDecoder
    implicit val encoder: ObjectEncoder[KeywordsMetricsArrayResponse] = deriveEncoder
}
