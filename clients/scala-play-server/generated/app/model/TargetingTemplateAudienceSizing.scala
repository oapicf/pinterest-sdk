package model

import play.api.libs.json._

/**
  * Gets an audience size estimate for a set of given targeting spec data. <p>Returns:</p> An object containing an audience size estimate that has a reach estimate (number of unique users) against the given targeting template. This by default provides a monthly estimate. 
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-01-31T05:12:04.015471536Z[Etc/UTC]", comments = "Generator version: 7.18.0")
case class TargetingTemplateAudienceSizing(
  reachEstimate: Option[TargetingTemplateAudienceSizingReachEstimate]
)

object TargetingTemplateAudienceSizing {
  implicit lazy val targetingTemplateAudienceSizingJsonFormat: Format[TargetingTemplateAudienceSizing] = Json.format[TargetingTemplateAudienceSizing]
}

