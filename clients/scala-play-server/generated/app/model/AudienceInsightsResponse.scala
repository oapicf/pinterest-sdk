package model

import play.api.libs.json._

/**
  * Audience interests and demographics.
  * @param categories Category interest distribution
  * @param date Generation date
  * @param size Population count.
  * @param sizeIsUpperBound Indicates whether the audience size has been rounded up to the next highest upper boundary.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-01-31T05:12:04.015471536Z[Etc/UTC]", comments = "Generator version: 7.18.0")
case class AudienceInsightsResponse(
  categories: Option[List[AudienceCategory]],
  date: Option[String],
  demographics: Option[AudienceDemographics],
  size: Option[Int],
  sizeIsUpperBound: Option[Boolean],
  `type`: Option[AudienceInsightType]
)

object AudienceInsightsResponse {
  implicit lazy val audienceInsightsResponseJsonFormat: Format[AudienceInsightsResponse] = Json.format[AudienceInsightsResponse]
}

