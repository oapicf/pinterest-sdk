package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import BulkCampaignDeliveryEstimatesItem._

case class BulkCampaignDeliveryEstimatesItem (
  /* Range audience sizes for each ad group, in the same order as the ad groups in the request. */
  adgroupAudienceSizes: Option[List[CampaignPlanningAdGroupAudienceSize]],
/* Conversion rate estimate. Used to translate impressions into conversions for oCPM ads, adapted based on the input conversion event and attribution windows. */
  conversionRate: Option[Float],
/* Conversion rate estimates. Used to translate impressions into conversions for oCPM ads based on different conversion event and attribution windows settings. */
  conversionRates: Option[List[CampaignPlanningConversionRate]],
/* Estimated curves. Each curve will pertain to a single estimation type. */
  curves: Option[List[CampaignPlanningCurveEstimate]],
derivedMetrics: Option[CampaignDeliveryEstimatesDerivedMetrics],
/* Errors encountered during estimation for this campaign. */
  errors: Option[List[CampaignPlanningResponseError]],
/* UUID used to track delivery estimates when they are generated as part of a saved campaign. */
  estimateId: Option[String],
/* Maximum potential spend estimate. */
  maxPotentialSpend: Option[Integer])

object BulkCampaignDeliveryEstimatesItem {
  import DateTimeCodecs._

  implicit val BulkCampaignDeliveryEstimatesItemCodecJson: CodecJson[BulkCampaignDeliveryEstimatesItem] = CodecJson.derive[BulkCampaignDeliveryEstimatesItem]
  implicit val BulkCampaignDeliveryEstimatesItemDecoder: EntityDecoder[BulkCampaignDeliveryEstimatesItem] = jsonOf[BulkCampaignDeliveryEstimatesItem]
  implicit val BulkCampaignDeliveryEstimatesItemEncoder: EntityEncoder[BulkCampaignDeliveryEstimatesItem] = jsonEncoderOf[BulkCampaignDeliveryEstimatesItem]
}
