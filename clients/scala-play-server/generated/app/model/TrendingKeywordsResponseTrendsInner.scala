package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for TrendingKeywordsResponse_trends_inner.
  * @param keyword The keyword that is trending.
  * @param pctGrowthWow The week-over-week percent change in search volume for this keyword.<br /> For example, a value of \"50\" would represent a 50% increase in searches in the last seven days compared to the week prior.<br /> **Note**: growth rates are rounded, with a maximum of +/- 10000% change.  A value of 10001 indicates that this keyword experienced > 10000% week-over-week growth.
  * @param pctGrowthMom The month-over-month percent change in search volume for this keyword.<br /> For example, a value of \"400\" would represent a 400% increase in searches in the last 30 days compared to the month prior.<br /> **Note**: growth rates are rounded, with a maximum of +/- 10000% change.  A value of 10001 indicates that this keyword experienced > 10000% month-over-month growth.
  * @param pctGrowthYoy The year-over-year percent change in search volume for this keyword.<br /> For example, a value of \"-5\" would represent a 5% decrease in searches in the last 365 days compared to the month prior.<br /> **Note**: growth rates are rounded, with a maximum of +/- 10000% change.  A value of 10001 indicates that this keyword experienced > 10000% year-over-year growth.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2024-11-05T03:04:47.577040925Z[Etc/UTC]", comments = "Generator version: 7.9.0")
case class TrendingKeywordsResponseTrendsInner(
  keyword: Option[String],
  pctGrowthWow: Option[Int],
  pctGrowthMom: Option[Int],
  pctGrowthYoy: Option[Int],
  timeSeries: Option[TrendingKeywordsResponseTrendsInnerTimeSeries]
)

object TrendingKeywordsResponseTrendsInner {
  implicit lazy val trendingKeywordsResponseTrendsInnerJsonFormat: Format[TrendingKeywordsResponseTrendsInner] = Json.format[TrendingKeywordsResponseTrendsInner]
}

