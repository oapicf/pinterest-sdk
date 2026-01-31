package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._

/**
 * Keyword metrics JSON
 * @param keywordUnderscorequeryUnderscorevolume Keyword's search frequency. This value is based on keyword frequency in pepsi client response
 */
case class KeywordMetrics(keywordUnderscorequeryUnderscorevolume: Option[String]
                )

object KeywordMetrics {
    /**
     * Creates the codec for converting KeywordMetrics from and to JSON.
     */
    implicit val decoder: Decoder[KeywordMetrics] = deriveDecoder
    implicit val encoder: ObjectEncoder[KeywordMetrics] = deriveEncoder
}
