package model

import play.api.libs.json._

/**
  * Audience interests and demographics.
  * @param categories Category interest distribution
  * @param date Generation date
  * @param size Population count.
  * @param sizeIsUpperBound Indicates whether the audience size has been rounded up to the next highest upper boundary.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2024-03-14T23:15:00.394859410Z[Etc/UTC]", comments = "Generator version: 7.4.0")
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

