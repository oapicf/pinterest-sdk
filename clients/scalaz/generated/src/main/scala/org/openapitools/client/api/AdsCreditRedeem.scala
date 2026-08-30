package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import AdsCreditRedeem._

case class AdsCreditRedeem (
  /* Error code type if error occurs */
  errorCode: Option[Integer],
/* Reason for failure */
  errorMessage: Option[String],
/* Returns true if the offer code was successfully applied(validateOnly=false) or can be applied(validateOnly=true). */
  success: Option[Boolean])

object AdsCreditRedeem {
  import DateTimeCodecs._

  implicit val AdsCreditRedeemCodecJson: CodecJson[AdsCreditRedeem] = CodecJson.derive[AdsCreditRedeem]
  implicit val AdsCreditRedeemDecoder: EntityDecoder[AdsCreditRedeem] = jsonOf[AdsCreditRedeem]
  implicit val AdsCreditRedeemEncoder: EntityEncoder[AdsCreditRedeem] = jsonEncoderOf[AdsCreditRedeem]
}
