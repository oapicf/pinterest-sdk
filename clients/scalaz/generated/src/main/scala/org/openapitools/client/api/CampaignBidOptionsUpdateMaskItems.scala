package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import CampaignBidOptionsUpdateMaskItems._

case class CampaignBidOptionsUpdateMaskItems (
  
object CampaignBidOptionsUpdateMaskItems {
  import DateTimeCodecs._

  implicit val CampaignBidOptionsUpdateMaskItemsCodecJson: CodecJson[CampaignBidOptionsUpdateMaskItems] = CodecJson.derive[CampaignBidOptionsUpdateMaskItems]
  implicit val CampaignBidOptionsUpdateMaskItemsDecoder: EntityDecoder[CampaignBidOptionsUpdateMaskItems] = jsonOf[CampaignBidOptionsUpdateMaskItems]
  implicit val CampaignBidOptionsUpdateMaskItemsEncoder: EntityEncoder[CampaignBidOptionsUpdateMaskItems] = jsonEncoderOf[CampaignBidOptionsUpdateMaskItems]
}
