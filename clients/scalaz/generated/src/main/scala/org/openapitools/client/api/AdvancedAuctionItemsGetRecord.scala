package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import AdvancedAuctionItemsGetRecord._

case class AdvancedAuctionItemsGetRecord (
  /* The catalog retail item id in the merchant namespace */
  itemId: String,
country: Country,
language: Language)

object AdvancedAuctionItemsGetRecord {
  import DateTimeCodecs._

  implicit val AdvancedAuctionItemsGetRecordCodecJson: CodecJson[AdvancedAuctionItemsGetRecord] = CodecJson.derive[AdvancedAuctionItemsGetRecord]
  implicit val AdvancedAuctionItemsGetRecordDecoder: EntityDecoder[AdvancedAuctionItemsGetRecord] = jsonOf[AdvancedAuctionItemsGetRecord]
  implicit val AdvancedAuctionItemsGetRecordEncoder: EntityEncoder[AdvancedAuctionItemsGetRecord] = jsonEncoderOf[AdvancedAuctionItemsGetRecord]
}
