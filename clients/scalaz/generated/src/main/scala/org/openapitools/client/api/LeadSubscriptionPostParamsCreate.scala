package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import LeadSubscriptionPostParamsCreate._

case class LeadSubscriptionPostParamsCreate (
  /* Lead form ID. */
  leadFormId: Option[String],
/* Standard HTTPS webhook URL. */
  webhookUrl: String,
/* Partner access token. Only for clients that requires authentication. We recommend to avoid this param. */
  partnerAccessToken: Option[String],
/* Partner metadata. Only for clients that requires special handling. We recommend to avoid this param. */
  partnerMetadata: Option[PartnerMetadata],
/* Partner refresh token. Only for clients that requires authentication. We recommend to avoid this param. */
  partnerRefreshToken: Option[String])

object LeadSubscriptionPostParamsCreate {
  import DateTimeCodecs._

  implicit val LeadSubscriptionPostParamsCreateCodecJson: CodecJson[LeadSubscriptionPostParamsCreate] = CodecJson.derive[LeadSubscriptionPostParamsCreate]
  implicit val LeadSubscriptionPostParamsCreateDecoder: EntityDecoder[LeadSubscriptionPostParamsCreate] = jsonOf[LeadSubscriptionPostParamsCreate]
  implicit val LeadSubscriptionPostParamsCreateEncoder: EntityEncoder[LeadSubscriptionPostParamsCreate] = jsonEncoderOf[LeadSubscriptionPostParamsCreate]
}
