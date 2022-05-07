package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import CampaignCommon._

case class CampaignCommon (
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
  endTime: Option[Integer])

object CampaignCommon {
  import DateTimeCodecs._

  implicit val CampaignCommonCodecJson: CodecJson[CampaignCommon] = CodecJson.derive[CampaignCommon]
  implicit val CampaignCommonDecoder: EntityDecoder[CampaignCommon] = jsonOf[CampaignCommon]
  implicit val CampaignCommonEncoder: EntityEncoder[CampaignCommon] = jsonEncoderOf[CampaignCommon]
}
