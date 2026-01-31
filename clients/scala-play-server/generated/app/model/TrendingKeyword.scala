package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for TrendingKeyword.
  * @param hasPrediction Indicates whether the keyword has a prediction available for the next 90 days.<br /> This field is only applicable when `include_prediction` query parameter is set to `true`. <br /> By default, the value is `false` and no prediction data is included in the response.
  * @param keyword The keyword that is trending.
  * @param pctGrowthMom The month-over-month percent change in search volume for this keyword.<br /> For example, a value of \"400\" would represent a 400% increase in searches in the last 30 days compared to the month prior.<br /> **Note**: growth rates are rounded, with a maximum of +/- 10000% change.  A value of 10001 indicates that this keyword experienced > 10000% month-over-month growth.
  * @param pctGrowthWow The week-over-week percent change in search volume for this keyword.<br /> For example, a value of \"50\" would represent a 50% increase in searches in the last seven days compared to the week prior.<br /> **Note**: growth rates are rounded, with a maximum of +/- 10000% change.  A value of 10001 indicates that this keyword experienced > 10000% week-over-week growth.
  * @param pctGrowthYoy The year-over-year percent change in search volume for this keyword.<br /> For example, a value of \"-5\" would represent a 5% decrease in searches in the last 365 days compared to the month prior.<br /> **Note**: growth rates are rounded, with a maximum of +/- 10000% change.  A value of 10001 indicates that this keyword experienced > 10000% year-over-year growth.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-01-31T05:12:04.015471536Z[Etc/UTC]", comments = "Generator version: 7.18.0")
case class TrendingKeyword(
  demographics: Option[TrendingKeywordDemographics],
  hasPrediction: Option[Boolean],
  keyword: Option[String],
  pctGrowthMom: Option[Int],
  pctGrowthWow: Option[Int],
  pctGrowthYoy: Option[Int],
  predictedTimeSeries: Option[PredictedTimeSeries],
  timeSeries: Option[TimeSeries]
)

object TrendingKeyword {
  implicit lazy val trendingKeywordJsonFormat: Format[TrendingKeyword] = Json.format[TrendingKeyword]
}

