package model

import play.api.libs.json._

/**
  * Conversion event for which a conversion rate estimate is computed.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-08-30T10:17:18.040485445Z[Etc/UTC]", comments = "Generator version: 7.24.0")
case class CampaignPlanningConversionEvent(
)

object CampaignPlanningConversionEvent {
  implicit lazy val campaignPlanningConversionEventJsonFormat: Format[CampaignPlanningConversionEvent] = Json.format[CampaignPlanningConversionEvent]
}

