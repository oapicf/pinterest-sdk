package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import java.time.LocalDateTime
import scala.collection.immutable.HashMap

/**
 * A sequence of weekly observations of the relative search volume for this keyword over the past year.<br /> These values are normalized to a [0-100] range, and can be used to visualize the history of user interest in this keyword. By default, normalization is applied independently to the time series of each keyword, but the `normalize_against_group` query parameter can be used in cases where you wish to compare relative volume between keywords.<br /> **Note**: The date of each observation is in ISO-8601 format and represents the *end* of the week.  For example, a value of `2023-10-31` would include searches that happened between `2023-10-25` and `2023-10-31`.
 * @param date 
 */
case class TrendingKeywordsResponseTrendsInnerTimeSeries(date: Option[LocalDateTime]
                )

object TrendingKeywordsResponseTrendsInnerTimeSeries {
    /**
     * Creates the codec for converting TrendingKeywordsResponseTrendsInnerTimeSeries from and to JSON.
     */
    implicit val decoder: Decoder[TrendingKeywordsResponseTrendsInnerTimeSeries] = deriveDecoder
    implicit val encoder: ObjectEncoder[TrendingKeywordsResponseTrendsInnerTimeSeries] = deriveEncoder
}
