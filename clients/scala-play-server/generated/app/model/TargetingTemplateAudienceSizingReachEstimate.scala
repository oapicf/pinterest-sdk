package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for TargetingTemplateAudienceSizingReachEstimate.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-08-30T10:17:18.040485445Z[Etc/UTC]", comments = "Generator version: 7.24.0")
case class TargetingTemplateAudienceSizingReachEstimate(
  estimate: Option[Long],
  lowerBound: Option[Long],
  upperBound: Option[Long]
)

object TargetingTemplateAudienceSizingReachEstimate {
  implicit lazy val targetingTemplateAudienceSizingReachEstimateJsonFormat: Format[TargetingTemplateAudienceSizingReachEstimate] = Json.format[TargetingTemplateAudienceSizingReachEstimate]
}

