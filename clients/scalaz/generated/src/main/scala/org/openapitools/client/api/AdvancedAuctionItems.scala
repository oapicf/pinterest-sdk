package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import AdvancedAuctionItems._

case class AdvancedAuctionItems (
  /* Response object of item bid options */
  catalogId: Option[String],
/* Array with item bid options */
  items: Option[List[AdvancedAuctionItem]])

object AdvancedAuctionItems {
  import DateTimeCodecs._

  implicit val AdvancedAuctionItemsCodecJson: CodecJson[AdvancedAuctionItems] = CodecJson.derive[AdvancedAuctionItems]
  implicit val AdvancedAuctionItemsDecoder: EntityDecoder[AdvancedAuctionItems] = jsonOf[AdvancedAuctionItems]
  implicit val AdvancedAuctionItemsEncoder: EntityEncoder[AdvancedAuctionItems] = jsonEncoderOf[AdvancedAuctionItems]
}
