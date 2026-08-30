package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import CampaignAdPreview._

case class CampaignAdPreview (
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
  uuid: String)

object CampaignAdPreview {
  import DateTimeCodecs._

  implicit val CampaignAdPreviewCodecJson: CodecJson[CampaignAdPreview] = CodecJson.derive[CampaignAdPreview]
  implicit val CampaignAdPreviewDecoder: EntityDecoder[CampaignAdPreview] = jsonOf[CampaignAdPreview]
  implicit val CampaignAdPreviewEncoder: EntityEncoder[CampaignAdPreview] = jsonEncoderOf[CampaignAdPreview]
}
