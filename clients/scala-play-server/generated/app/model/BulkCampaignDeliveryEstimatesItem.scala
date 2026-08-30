package model

import play.api.libs.json._

/**
  * Delivery estimate result for a single campaign within a bulk request.
  * @param adgroupAudienceSizes Range audience sizes for each ad group, in the same order as the ad groups in the request.
  * @param conversionRate Conversion rate estimate. Used to translate impressions into conversions for oCPM ads, adapted based on the input conversion event and attribution windows.
  * @param conversionRates Conversion rate estimates. Used to translate impressions into conversions for oCPM ads based on different conversion event and attribution windows settings.
  * @param curves Estimated curves. Each curve will pertain to a single estimation type.
  * @param errors Errors encountered during estimation for this campaign.
  * @param estimateId UUID used to track delivery estimates when they are generated as part of a saved campaign.
  * @param maxPotentialSpend Maximum potential spend estimate.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-08-30T10:17:18.040485445Z[Etc/UTC]", comments = "Generator version: 7.24.0")
case class BulkCampaignDeliveryEstimatesItem(
  adgroupAudienceSizes: Option[List[CampaignPlanningAdGroupAudienceSize]],
  conversionRate: Option[Float],
  conversionRates: Option[List[CampaignPlanningConversionRate]],
  curves: Option[List[CampaignPlanningCurveEstimate]],
  derivedMetrics: Option[CampaignDeliveryEstimatesDerivedMetrics],
  errors: Option[List[CampaignPlanningResponseError]],
  estimateId: Option[String],
  maxPotentialSpend: Option[Int]
)

object BulkCampaignDeliveryEstimatesItem {
  implicit lazy val bulkCampaignDeliveryEstimatesItemJsonFormat: Format[BulkCampaignDeliveryEstimatesItem] = Json.format[BulkCampaignDeliveryEstimatesItem]
}

