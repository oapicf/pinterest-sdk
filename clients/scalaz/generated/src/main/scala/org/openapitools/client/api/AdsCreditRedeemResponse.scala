package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import AdsCreditRedeemResponse._

case class AdsCreditRedeemResponse (
  /* Returns true if the offer code was successfully applied(validateOnly=false) or can be applied(validateOnly=true). */
  success: Option[Boolean],
/* Error code type if error occurs */
  errorCode: Option[Integer],
/* Reason for failure */
  errorMessage: Option[String])

object AdsCreditRedeemResponse {
  import DateTimeCodecs._

  implicit val AdsCreditRedeemResponseCodecJson: CodecJson[AdsCreditRedeemResponse] = CodecJson.derive[AdsCreditRedeemResponse]
  implicit val AdsCreditRedeemResponseDecoder: EntityDecoder[AdsCreditRedeemResponse] = jsonOf[AdsCreditRedeemResponse]
  implicit val AdsCreditRedeemResponseEncoder: EntityEncoder[AdsCreditRedeemResponse] = jsonEncoderOf[AdsCreditRedeemResponse]
}
