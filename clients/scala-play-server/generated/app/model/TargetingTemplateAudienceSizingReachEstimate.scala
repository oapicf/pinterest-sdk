package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for TargetingTemplateAudienceSizing_reach_estimate.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2024-11-05T03:04:47.577040925Z[Etc/UTC]", comments = "Generator version: 7.9.0")
case class TargetingTemplateAudienceSizingReachEstimate(
  estimate: Option[Long],
  lowerBound: Option[Long],
  upperBound: Option[Long]
)

object TargetingTemplateAudienceSizingReachEstimate {
  implicit lazy val targetingTemplateAudienceSizingReachEstimateJsonFormat: Format[TargetingTemplateAudienceSizingReachEstimate] = Json.format[TargetingTemplateAudienceSizingReachEstimate]
}

