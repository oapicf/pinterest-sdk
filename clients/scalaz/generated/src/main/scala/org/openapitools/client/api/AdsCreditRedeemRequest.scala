package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import AdsCreditRedeemRequest._

case class AdsCreditRedeemRequest (
  /* Takes in a SHA256 hash of the offerCode. */
  offerCodeHash: String,
/* If true, only validate if we can redeem offer code. Otherwise it will actually apply the offer code to the account */
  validateOnly: Boolean)

object AdsCreditRedeemRequest {
  import DateTimeCodecs._

  implicit val AdsCreditRedeemRequestCodecJson: CodecJson[AdsCreditRedeemRequest] = CodecJson.derive[AdsCreditRedeemRequest]
  implicit val AdsCreditRedeemRequestDecoder: EntityDecoder[AdsCreditRedeemRequest] = jsonOf[AdsCreditRedeemRequest]
  implicit val AdsCreditRedeemRequestEncoder: EntityEncoder[AdsCreditRedeemRequest] = jsonEncoderOf[AdsCreditRedeemRequest]
}
