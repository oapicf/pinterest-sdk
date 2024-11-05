package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import CampaignCreateRequest._

case class CampaignCreateRequest (
  /* Campaign's Advertiser ID. If you want to create a campaign in a Business Account shared account you need to specify the Business Access advertiser ID in both the query path param as well as the request body schema. */
  adAccountId: String,
/* Campaign name. */
  name: String,
status: Option[EntityStatus],
/* Campaign total spending cap. Required for Campaign Budget Optimization (CBO) campaigns. This and \"daily_spend_cap\" cannot be set at the same time. */
  lifetimeSpendCap: Option[Integer],
/* Campaign daily spending cap. Required for Campaign Budget Optimization (CBO) campaigns. This and \"lifetime_spend_cap\" cannot be set at the same time. */
  dailySpendCap: Option[Integer],
/* Order line ID that appears on the invoice. */
  orderLineId: Option[String],
trackingUrls: Option[TrackingUrls],
/* Campaign start time. Unix timestamp in seconds. Only used for Campaign Budget Optimization (CBO) campaigns. */
  startTime: Option[Integer],
/* Campaign end time. Unix timestamp in seconds. Only used for Campaign Budget Optimization (CBO) campaigns. */
  endTime: Option[Integer],
/* Determine if a campaign has flexible daily budgets setup. */
  isFlexibleDailyBudgets: Option[Boolean],
/* When transitioning from campaign budget optimization to non-campaign budget optimization, the default_ad_group_budget_in_micro_currency will propagate to each child ad groups daily budget. Unit is micro currency of the associated advertiser account. */
  defaultAdGroupBudgetInMicroCurrency: Option[Integer],
/* Specifies whether the campaign was created in the automated campaign flow */
  isAutomatedCampaign: Option[Boolean],
objectiveType: ObjectiveType)

object CampaignCreateRequest {
  import DateTimeCodecs._

  implicit val CampaignCreateRequestCodecJson: CodecJson[CampaignCreateRequest] = CodecJson.derive[CampaignCreateRequest]
  implicit val CampaignCreateRequestDecoder: EntityDecoder[CampaignCreateRequest] = jsonOf[CampaignCreateRequest]
  implicit val CampaignCreateRequestEncoder: EntityEncoder[CampaignCreateRequest] = jsonEncoderOf[CampaignCreateRequest]
}
