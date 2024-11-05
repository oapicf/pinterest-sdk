package model

import play.api.libs.json._

/**
  * Gets an audience size estimate for a set of given targeting spec data. <p>Returns:</p> An object containing an audience size estimate that has a reach estimate (number of unique users) against the given targeting template. This by default provides a monthly estimate. 
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2024-11-05T03:04:47.577040925Z[Etc/UTC]", comments = "Generator version: 7.9.0")
case class TargetingTemplateAudienceSizing(
  reachEstimate: Option[TargetingTemplateAudienceSizingReachEstimate]
)

object TargetingTemplateAudienceSizing {
  implicit lazy val targetingTemplateAudienceSizingJsonFormat: Format[TargetingTemplateAudienceSizing] = Json.format[TargetingTemplateAudienceSizing]
}

