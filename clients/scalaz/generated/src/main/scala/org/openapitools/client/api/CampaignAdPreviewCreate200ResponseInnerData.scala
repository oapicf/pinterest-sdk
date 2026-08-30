package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import CampaignAdPreviewCreate200ResponseInnerData._

case class CampaignAdPreviewCreate200ResponseInnerData (
  /* Advertiser ID for this preview. */
  adAccountId: String,
/* Ad group ID to create a preview record for. */
  adGroupId: String,
/* Client ID that created preview. */
  clientId: Option[Integer],
/* Unix timestamp in milliseconds for preview expiration. */
  expiresAt: Integer,
/* Whether preview link is active. */
  isActive: Boolean,
/* Pin ID for pin promotion preview. */
  pinId: Option[Integer],
/* Pin promotion ID for this preview. */
  pinPromotionId: Option[Integer],
/* Promoted product group ID for catalog previews. */
  promotedProductGroupId: Option[Integer],
/* Campaign ad preview URL. */
  url: String,
/* User ID that created preview. */
  userId: Integer,
/* Pin promotion preview key. */
  uuid: String,
exceptions: Error)

object CampaignAdPreviewCreate200ResponseInnerData {
  import DateTimeCodecs._

  implicit val CampaignAdPreviewCreate200ResponseInnerDataCodecJson: CodecJson[CampaignAdPreviewCreate200ResponseInnerData] = CodecJson.derive[CampaignAdPreviewCreate200ResponseInnerData]
  implicit val CampaignAdPreviewCreate200ResponseInnerDataDecoder: EntityDecoder[CampaignAdPreviewCreate200ResponseInnerData] = jsonOf[CampaignAdPreviewCreate200ResponseInnerData]
  implicit val CampaignAdPreviewCreate200ResponseInnerDataEncoder: EntityEncoder[CampaignAdPreviewCreate200ResponseInnerData] = jsonEncoderOf[CampaignAdPreviewCreate200ResponseInnerData]
}
