package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.TrendingKeywordsResponseTrendsInnerTimeSeries

/**
 * 
 * @param keyword The keyword that is trending.
 * @param pctUnderscoregrowthUnderscorewow The week-over-week percent change in search volume for this keyword.<br /> For example, a value of \"50\" would represent a 50% increase in searches in the last seven days compared to the week prior.<br /> **Note**: growth rates are rounded, with a maximum of +/- 10000% change.  A value of 10001 indicates that this keyword experienced > 10000% week-over-week growth.
 * @param pctUnderscoregrowthUnderscoremom The month-over-month percent change in search volume for this keyword.<br /> For example, a value of \"400\" would represent a 400% increase in searches in the last 30 days compared to the month prior.<br /> **Note**: growth rates are rounded, with a maximum of +/- 10000% change.  A value of 10001 indicates that this keyword experienced > 10000% month-over-month growth.
 * @param pctUnderscoregrowthUnderscoreyoy The year-over-year percent change in search volume for this keyword.<br /> For example, a value of \"-5\" would represent a 5% decrease in searches in the last 365 days compared to the month prior.<br /> **Note**: growth rates are rounded, with a maximum of +/- 10000% change.  A value of 10001 indicates that this keyword experienced > 10000% year-over-year growth.
 * @param timeUnderscoreseries 
 */
case class TrendingKeywordsResponseTrendsInner(keyword: Option[String],
                pctUnderscoregrowthUnderscorewow: Option[Int],
                pctUnderscoregrowthUnderscoremom: Option[Int],
                pctUnderscoregrowthUnderscoreyoy: Option[Int],
                timeUnderscoreseries: Option[TrendingKeywordsResponseTrendsInnerTimeSeries]
                )

object TrendingKeywordsResponseTrendsInner {
    /**
     * Creates the codec for converting TrendingKeywordsResponseTrendsInner from and to JSON.
     */
    implicit val decoder: Decoder[TrendingKeywordsResponseTrendsInner] = deriveDecoder
    implicit val encoder: ObjectEncoder[TrendingKeywordsResponseTrendsInner] = deriveEncoder
}
