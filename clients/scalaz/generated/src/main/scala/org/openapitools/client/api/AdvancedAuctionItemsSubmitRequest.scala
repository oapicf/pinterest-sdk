package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import AdvancedAuctionItemsSubmitRequest._

case class AdvancedAuctionItemsSubmitRequest (
  /* Catalog id pertaining to all items */
  catalogId: String,
/* Array of item bid option operations */
  items: List[AdvancedAuctionItemsSubmitRecord])

object AdvancedAuctionItemsSubmitRequest {
  import DateTimeCodecs._

  implicit val AdvancedAuctionItemsSubmitRequestCodecJson: CodecJson[AdvancedAuctionItemsSubmitRequest] = CodecJson.derive[AdvancedAuctionItemsSubmitRequest]
  implicit val AdvancedAuctionItemsSubmitRequestDecoder: EntityDecoder[AdvancedAuctionItemsSubmitRequest] = jsonOf[AdvancedAuctionItemsSubmitRequest]
  implicit val AdvancedAuctionItemsSubmitRequestEncoder: EntityEncoder[AdvancedAuctionItemsSubmitRequest] = jsonEncoderOf[AdvancedAuctionItemsSubmitRequest]
}
