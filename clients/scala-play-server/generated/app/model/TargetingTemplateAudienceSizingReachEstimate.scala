package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for TargetingTemplateAudienceSizing_reach_estimate.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-01-31T05:12:04.015471536Z[Etc/UTC]", comments = "Generator version: 7.18.0")
case class TargetingTemplateAudienceSizingReachEstimate(
  estimate: Option[Long],
  lowerBound: Option[Long],
  upperBound: Option[Long]
)

object TargetingTemplateAudienceSizingReachEstimate {
  implicit lazy val targetingTemplateAudienceSizingReachEstimateJsonFormat: Format[TargetingTemplateAudienceSizingReachEstimate] = Json.format[TargetingTemplateAudienceSizingReachEstimate]
}

