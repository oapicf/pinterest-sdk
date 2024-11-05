package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import AdvancedAuctionItemsGetRequest._

case class AdvancedAuctionItemsGetRequest (
  /* Catalog id pertaining to the retail item */
  catalogId: String,
/* A list of retail catalog items to fetch bid options for */
  items: List[AdvancedAuctionItemsGetRecord])

object AdvancedAuctionItemsGetRequest {
  import DateTimeCodecs._

  implicit val AdvancedAuctionItemsGetRequestCodecJson: CodecJson[AdvancedAuctionItemsGetRequest] = CodecJson.derive[AdvancedAuctionItemsGetRequest]
  implicit val AdvancedAuctionItemsGetRequestDecoder: EntityDecoder[AdvancedAuctionItemsGetRequest] = jsonOf[AdvancedAuctionItemsGetRequest]
  implicit val AdvancedAuctionItemsGetRequestEncoder: EntityEncoder[AdvancedAuctionItemsGetRequest] = jsonEncoderOf[AdvancedAuctionItemsGetRequest]
}
