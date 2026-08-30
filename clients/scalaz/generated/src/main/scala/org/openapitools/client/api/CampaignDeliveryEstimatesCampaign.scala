package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import CampaignDeliveryEstimatesCampaign._

case class CampaignDeliveryEstimatesCampaign (
  adGroups: List[AdGroupDeliveryEstimates],
/* Duration type of the budget */
  budgetDurationType: BudgetDurationType,
/* Campaign daily spend cap. When the budget_duration_type is FIXED_DAILY or FLEXIBLE_DAILY, this field is required. */
  dailySpendCap: Option[Integer],
/* End date of the date range for an ad campaign, pattern YYYY-MM-DD. Required when budget_duration_type is LIFETIME. */
  endDate: Option[String],
/* Campaign total spending cap. When the budget_duration_type is LIFETIME, this field is required. The end date field is also required for lifetime spending. */
  lifetimeSpendCap: Option[Integer],
objectiveType: DeliveryEstimateObjectiveType,
/* Start date of the date range for an ad campaign, pattern YYYY-MM-DD. */
  startDate: String)

object CampaignDeliveryEstimatesCampaign {
  import DateTimeCodecs._

  implicit val CampaignDeliveryEstimatesCampaignCodecJson: CodecJson[CampaignDeliveryEstimatesCampaign] = CodecJson.derive[CampaignDeliveryEstimatesCampaign]
  implicit val CampaignDeliveryEstimatesCampaignDecoder: EntityDecoder[CampaignDeliveryEstimatesCampaign] = jsonOf[CampaignDeliveryEstimatesCampaign]
  implicit val CampaignDeliveryEstimatesCampaignEncoder: EntityEncoder[CampaignDeliveryEstimatesCampaign] = jsonEncoderOf[CampaignDeliveryEstimatesCampaign]
}
