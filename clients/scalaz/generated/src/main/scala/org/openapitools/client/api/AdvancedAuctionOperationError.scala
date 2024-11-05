package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import AdvancedAuctionOperationError._

case class AdvancedAuctionOperationError (
  /* The error code for the item bid option operation validation error */
  code: Option[Integer],
/* Message describing the item bid option operation validation error */
  message: Option[String])

object AdvancedAuctionOperationError {
  import DateTimeCodecs._

  implicit val AdvancedAuctionOperationErrorCodecJson: CodecJson[AdvancedAuctionOperationError] = CodecJson.derive[AdvancedAuctionOperationError]
  implicit val AdvancedAuctionOperationErrorDecoder: EntityDecoder[AdvancedAuctionOperationError] = jsonOf[AdvancedAuctionOperationError]
  implicit val AdvancedAuctionOperationErrorEncoder: EntityEncoder[AdvancedAuctionOperationError] = jsonEncoderOf[AdvancedAuctionOperationError]
}
