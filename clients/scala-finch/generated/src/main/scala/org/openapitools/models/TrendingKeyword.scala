package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.PredictedTimeSeries
import org.openapitools.models.TimeSeries
import org.openapitools.models.TrendingKeywordDemographics

/**
 * 
 * @param demographics 
 * @param hasUnderscoreprediction Indicates whether the keyword has a prediction available for the next 90 days.<br /> This field is only applicable when `include_prediction` query parameter is set to `true`. <br /> By default, the value is `false` and no prediction data is included in the response.
 * @param keyword The keyword that is trending.
 * @param pctUnderscoregrowthUnderscoremom The month-over-month percent change in search volume for this keyword.<br /> For example, a value of \"400\" would represent a 400% increase in searches in the last 30 days compared to the month prior.<br /> **Note**: growth rates are rounded, with a maximum of +/- 10000% change.  A value of 10001 indicates that this keyword experienced > 10000% month-over-month growth.
 * @param pctUnderscoregrowthUnderscorewow The week-over-week percent change in search volume for this keyword.<br /> For example, a value of \"50\" would represent a 50% increase in searches in the last seven days compared to the week prior.<br /> **Note**: growth rates are rounded, with a maximum of +/- 10000% change.  A value of 10001 indicates that this keyword experienced > 10000% week-over-week growth.
 * @param pctUnderscoregrowthUnderscoreyoy The year-over-year percent change in search volume for this keyword.<br /> For example, a value of \"-5\" would represent a 5% decrease in searches in the last 365 days compared to the month prior.<br /> **Note**: growth rates are rounded, with a maximum of +/- 10000% change.  A value of 10001 indicates that this keyword experienced > 10000% year-over-year growth.
 * @param predictedUnderscoretimeUnderscoreseries 
 * @param timeUnderscoreseries 
 */
case class TrendingKeyword(demographics: Option[TrendingKeywordDemographics],
                hasUnderscoreprediction: Option[Boolean],
                keyword: Option[String],
                pctUnderscoregrowthUnderscoremom: Option[Int],
                pctUnderscoregrowthUnderscorewow: Option[Int],
                pctUnderscoregrowthUnderscoreyoy: Option[Int],
                predictedUnderscoretimeUnderscoreseries: Option[PredictedTimeSeries],
                timeUnderscoreseries: Option[TimeSeries]
                )

object TrendingKeyword {
    /**
     * Creates the codec for converting TrendingKeyword from and to JSON.
     */
    implicit val decoder: Decoder[TrendingKeyword] = deriveDecoder
    implicit val encoder: ObjectEncoder[TrendingKeyword] = deriveEncoder
}
