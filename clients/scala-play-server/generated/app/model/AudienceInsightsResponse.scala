package model

import play.api.libs.json._

/**
  * Audience interests and demographics.
  * @param categories Category interest distribution
  * @param date Generation date
  * @param size Population count.
  * @param sizeIsUpperBound Indicates whether the audience size has been rounded up to the next highest upper boundary.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2024-11-05T03:04:47.577040925Z[Etc/UTC]", comments = "Generator version: 7.9.0")
case class AudienceInsightsResponse(
  categories: Option[List[AudienceCategory]],
  demographics: Option[AudienceDemographics],
  `type`: Option[AudienceInsightType],
  date: Option[String],
  size: Option[Int],
  sizeIsUpperBound: Option[Boolean]
)

object AudienceInsightsResponse {
  implicit lazy val audienceInsightsResponseJsonFormat: Format[AudienceInsightsResponse] = Json.format[AudienceInsightsResponse]
}

