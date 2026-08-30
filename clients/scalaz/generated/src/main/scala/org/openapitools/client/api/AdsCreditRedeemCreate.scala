package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import AdsCreditRedeemCreate._

case class AdsCreditRedeemCreate (
  /* Takes in a SHA256 hash of the offerCode. */
  offerCodeHash: String,
/* If true, only validate if we can redeem offer code. Otherwise it will actually apply the offer code to the account */
  validateOnly: Boolean)

object AdsCreditRedeemCreate {
  import DateTimeCodecs._

  implicit val AdsCreditRedeemCreateCodecJson: CodecJson[AdsCreditRedeemCreate] = CodecJson.derive[AdsCreditRedeemCreate]
  implicit val AdsCreditRedeemCreateDecoder: EntityDecoder[AdsCreditRedeemCreate] = jsonOf[AdsCreditRedeemCreate]
  implicit val AdsCreditRedeemCreateEncoder: EntityEncoder[AdsCreditRedeemCreate] = jsonEncoderOf[AdsCreditRedeemCreate]
}
