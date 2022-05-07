package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import CampaignResponse._

case class CampaignResponse (
  /* Campaign ID. */
  id: String,
/* Campaign's Advertiser ID. */
  adAccountId: String,
/* Campaign name. */
  name: Option[String],
status: Option[EntityStatus],
/* Campaign total spending cap. */
  lifetimeSpendCap: Option[Integer],
/* Campaign daily spending cap. */
  dailySpendCap: Option[Integer],
/* Order line ID that appears on the invoice. */
  orderLineId: Option[String],
trackingUrls: Option[TrackingUrls],
/* Campaign start time. Unix timestamp in seconds. Only used for Campaign Budget Optimization (CBO) campaigns. */
  startTime: Option[Integer],
/* Campaign end time. Unix timestamp in seconds. Only used for Campaign Budget Optimization (CBO) campaigns. */
  endTime: Option[Integer],
objectiveType: Option[ObjectiveType],
/* Campaign creation time. Unix timestamp in seconds. */
  createdTime: Option[Integer],
/* UTC timestamp. Last update time. */
  updatedTime: Option[Integer],
/* Always \"campaign\". */
  `type`: Option[String])

object CampaignResponse {
  import DateTimeCodecs._

  implicit val CampaignResponseCodecJson: CodecJson[CampaignResponse] = CodecJson.derive[CampaignResponse]
  implicit val CampaignResponseDecoder: EntityDecoder[CampaignResponse] = jsonOf[CampaignResponse]
  implicit val CampaignResponseEncoder: EntityEncoder[CampaignResponse] = jsonEncoderOf[CampaignResponse]
}
