package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import AdvancedAuctionOperation._

case class AdvancedAuctionOperation (
  
object AdvancedAuctionOperation {
  import DateTimeCodecs._

  implicit val AdvancedAuctionOperationCodecJson: CodecJson[AdvancedAuctionOperation] = CodecJson.derive[AdvancedAuctionOperation]
  implicit val AdvancedAuctionOperationDecoder: EntityDecoder[AdvancedAuctionOperation] = jsonOf[AdvancedAuctionOperation]
  implicit val AdvancedAuctionOperationEncoder: EntityEncoder[AdvancedAuctionOperation] = jsonEncoderOf[AdvancedAuctionOperation]
}
