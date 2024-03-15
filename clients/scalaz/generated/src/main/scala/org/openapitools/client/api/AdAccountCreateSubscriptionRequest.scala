package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import AdAccountCreateSubscriptionRequest._

case class AdAccountCreateSubscriptionRequest (
  /* Standard HTTPS webhook URL. */
  webhookUrl: String,
/* Lead form ID. */
  leadFormId: Option[String],
/* Partner access token. Only for clients that requires authentication. We recommend to avoid this param. */
  partnerAccessToken: Option[String],
/* Partner refresh token. Only for clients that requires authentication. We recommend to avoid this param. */
  partnerRefreshToken: Option[String])

object AdAccountCreateSubscriptionRequest {
  import DateTimeCodecs._

  implicit val AdAccountCreateSubscriptionRequestCodecJson: CodecJson[AdAccountCreateSubscriptionRequest] = CodecJson.derive[AdAccountCreateSubscriptionRequest]
  implicit val AdAccountCreateSubscriptionRequestDecoder: EntityDecoder[AdAccountCreateSubscriptionRequest] = jsonOf[AdAccountCreateSubscriptionRequest]
  implicit val AdAccountCreateSubscriptionRequestEncoder: EntityEncoder[AdAccountCreateSubscriptionRequest] = jsonEncoderOf[AdAccountCreateSubscriptionRequest]
}
