package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import AdvancedAuctionKey._

case class AdvancedAuctionKey (
  /* The catalog retail item id in the merchant namespace */
  itemId: String,
country: Country,
language: Language)

object AdvancedAuctionKey {
  import DateTimeCodecs._

  implicit val AdvancedAuctionKeyCodecJson: CodecJson[AdvancedAuctionKey] = CodecJson.derive[AdvancedAuctionKey]
  implicit val AdvancedAuctionKeyDecoder: EntityDecoder[AdvancedAuctionKey] = jsonOf[AdvancedAuctionKey]
  implicit val AdvancedAuctionKeyEncoder: EntityEncoder[AdvancedAuctionKey] = jsonEncoderOf[AdvancedAuctionKey]
}
