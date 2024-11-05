package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import AdvancedAuctionItem._

case class AdvancedAuctionItem (
  /* The catalog retail item id in the merchant namespace */
  itemId: String,
country: Country,
language: Language,
bidOptions: AdvancedAuctionBidOptions)

object AdvancedAuctionItem {
  import DateTimeCodecs._

  implicit val AdvancedAuctionItemCodecJson: CodecJson[AdvancedAuctionItem] = CodecJson.derive[AdvancedAuctionItem]
  implicit val AdvancedAuctionItemDecoder: EntityDecoder[AdvancedAuctionItem] = jsonOf[AdvancedAuctionItem]
  implicit val AdvancedAuctionItemEncoder: EntityEncoder[AdvancedAuctionItem] = jsonEncoderOf[AdvancedAuctionItem]
}
