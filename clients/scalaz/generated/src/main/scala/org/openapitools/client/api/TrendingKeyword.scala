package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import TrendingKeyword._

case class TrendingKeyword (
  demographics: Option[TrendingKeywordDemographics],
/* Indicates whether the keyword has a prediction available for the next 90 days.<br /> This field is only applicable when `include_prediction` query parameter is set to `true`. <br /> By default, the value is `false` and no prediction data is included in the response. */
  hasPrediction: Option[Boolean],
/* The keyword that is trending. */
  keyword: Option[String],
/* The month-over-month percent change in search volume for this keyword.<br /> For example, a value of \"400\" would represent a 400% increase in searches in the last 30 days compared to the month prior.<br /> **Note**: growth rates are rounded, with a maximum of +/- 10000% change.  A value of 10001 indicates that this keyword experienced > 10000% month-over-month growth. */
  pctGrowthMom: Option[Integer],
/* The week-over-week percent change in search volume for this keyword.<br /> For example, a value of \"50\" would represent a 50% increase in searches in the last seven days compared to the week prior.<br /> **Note**: growth rates are rounded, with a maximum of +/- 10000% change.  A value of 10001 indicates that this keyword experienced > 10000% week-over-week growth. */
  pctGrowthWow: Option[Integer],
/* The year-over-year percent change in search volume for this keyword.<br /> For example, a value of \"-5\" would represent a 5% decrease in searches in the last 365 days compared to the month prior.<br /> **Note**: growth rates are rounded, with a maximum of +/- 10000% change.  A value of 10001 indicates that this keyword experienced > 10000% year-over-year growth. */
  pctGrowthYoy: Option[Integer],
predictedTimeSeries: Option[PredictedTimeSeries],
timeSeries: Option[TimeSeries])

object TrendingKeyword {
  import DateTimeCodecs._

  implicit val TrendingKeywordCodecJson: CodecJson[TrendingKeyword] = CodecJson.derive[TrendingKeyword]
  implicit val TrendingKeywordDecoder: EntityDecoder[TrendingKeyword] = jsonOf[TrendingKeyword]
  implicit val TrendingKeywordEncoder: EntityEncoder[TrendingKeyword] = jsonEncoderOf[TrendingKeyword]
}
