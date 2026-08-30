package model

import play.api.libs.json._

/**
  * Audience interests and demographics.
  * @param categories Category interest distribution
  * @param date Generation date
  * @param size Population count.
  * @param sizeIsUpperBound Indicates whether the audience size has been rounded up to the next highest upper boundary.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-08-30T10:17:18.040485445Z[Etc/UTC]", comments = "Generator version: 7.24.0")
case class AudienceInsights(
  categories: Option[List[AudienceCategory]],
  date: Option[String],
  demographics: Option[AudienceDemographics],
  size: Option[Int],
  sizeIsUpperBound: Option[Boolean],
  `type`: Option[AudienceInsightType]
)

object AudienceInsights {
  implicit lazy val audienceInsightsJsonFormat: Format[AudienceInsights] = Json.format[AudienceInsights]
}

