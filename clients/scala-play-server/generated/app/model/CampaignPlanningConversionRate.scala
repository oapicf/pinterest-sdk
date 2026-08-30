package model

import play.api.libs.json._

/**
  * Conversion rate estimate for a specific conversion event and attribution window combination.
  * @param conversionRate Conversion rate estimate. Used to translate impressions into conversions for oCPM ads.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-08-30T10:17:18.040485445Z[Etc/UTC]", comments = "Generator version: 7.24.0")
case class CampaignPlanningConversionRate(
  attributionWindows: CampaignPlanningConversionAttribution,
  conversionEvent: CampaignPlanningConversionEvent,
  conversionRate: Float
)

object CampaignPlanningConversionRate {
  implicit lazy val campaignPlanningConversionRateJsonFormat: Format[CampaignPlanningConversionRate] = Json.format[CampaignPlanningConversionRate]
}

