package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import CampaignUpdateRequestAllOf2._

case class CampaignUpdateRequestAllOf2 (
  bidOptions: Option[CampaignBidOptionsUpdate],
intendedPromotionType: Option[IntendedPromotionType],
/* Specifies whether the campaign is optimized for Lifetime Value (LTV). Only available for eligible advertisers. */
  isLtvOptimized: Option[Boolean],
/* Enable Pinterest Performance+ for your campaign. To learn more, see <a href=\"https://developers.pinterest.com/docs/api-features/pinterest-performance-plus-setup/\">Pinterest Performance+ Setup</a>. This field is immutable, except only for campaigns in draft status which may update this field. */
  isPerformancePlus: Option[Boolean],
/* Enable Top Of Search for your campaign. This field is immutable, except only for campaigns in draft status which may update this field. */
  isTopOfSearch: Option[Boolean],
objectiveType: Option[ObjectiveType])

object CampaignUpdateRequestAllOf2 {
  import DateTimeCodecs._

  implicit val CampaignUpdateRequestAllOf2CodecJson: CodecJson[CampaignUpdateRequestAllOf2] = CodecJson.derive[CampaignUpdateRequestAllOf2]
  implicit val CampaignUpdateRequestAllOf2Decoder: EntityDecoder[CampaignUpdateRequestAllOf2] = jsonOf[CampaignUpdateRequestAllOf2]
  implicit val CampaignUpdateRequestAllOf2Encoder: EntityEncoder[CampaignUpdateRequestAllOf2] = jsonEncoderOf[CampaignUpdateRequestAllOf2]
}
