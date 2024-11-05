package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import AdvancedAuctionItemsSubmitDeleteRecord._

case class AdvancedAuctionItemsSubmitDeleteRecord (
  /* The catalog retail item id in the merchant namespace */
  itemId: String,
country: Country,
language: Language)

object AdvancedAuctionItemsSubmitDeleteRecord {
  import DateTimeCodecs._

  implicit val AdvancedAuctionItemsSubmitDeleteRecordCodecJson: CodecJson[AdvancedAuctionItemsSubmitDeleteRecord] = CodecJson.derive[AdvancedAuctionItemsSubmitDeleteRecord]
  implicit val AdvancedAuctionItemsSubmitDeleteRecordDecoder: EntityDecoder[AdvancedAuctionItemsSubmitDeleteRecord] = jsonOf[AdvancedAuctionItemsSubmitDeleteRecord]
  implicit val AdvancedAuctionItemsSubmitDeleteRecordEncoder: EntityEncoder[AdvancedAuctionItemsSubmitDeleteRecord] = jsonEncoderOf[AdvancedAuctionItemsSubmitDeleteRecord]
}
