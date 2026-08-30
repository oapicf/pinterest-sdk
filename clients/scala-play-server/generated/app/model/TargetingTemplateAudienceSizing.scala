package model

import play.api.libs.json._

/**
  * Gets an audience size estimate for a set of given targeting spec data. **Returns:** An object containing an audience size estimate that has a reach estimate (number of unique users) against the given targeting template. This by default provides a monthly estimate.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-08-30T10:17:18.040485445Z[Etc/UTC]", comments = "Generator version: 7.24.0")
case class TargetingTemplateAudienceSizing(
  reachEstimate: Option[TargetingTemplateAudienceSizingReachEstimate]
)

object TargetingTemplateAudienceSizing {
  implicit lazy val targetingTemplateAudienceSizingJsonFormat: Format[TargetingTemplateAudienceSizing] = Json.format[TargetingTemplateAudienceSizing]
}

