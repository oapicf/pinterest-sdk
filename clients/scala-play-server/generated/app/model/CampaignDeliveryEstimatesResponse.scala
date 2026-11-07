package model

import play.api.libs.json._

/**
  * Delivery estimates response for a campaign.
  * @param curves Estimated curves. Each curve will pertain to a single estimation type.
  * @param maxPotentialSpend Maximum potential spend estimate.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-11-07T02:59:47.831280460Z[Etc/UTC]", comments = "Generator version: 7.26.0")
case class CampaignDeliveryEstimatesResponse(
  curves: Option[List[CampaignPlanningCurveEstimate]],
  derivedMetrics: Option[CampaignDeliveryEstimatesDerivedMetrics],
  maxPotentialSpend: Option[Int]
)

object CampaignDeliveryEstimatesResponse {
  implicit lazy val campaignDeliveryEstimatesResponseJsonFormat: Format[CampaignDeliveryEstimatesResponse] = Json.format[CampaignDeliveryEstimatesResponse]
}

