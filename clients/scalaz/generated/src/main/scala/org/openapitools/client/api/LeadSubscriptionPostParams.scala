package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import LeadSubscriptionPostParams._

case class LeadSubscriptionPostParams (
  /* The Ad Account ID that this lead form belongs to. */
  adAccountId: Option[String],
/* API version. */
  apiVersion: Option[String],
/* Subscription creation time. Unix timestamp in milliseconds. */
  createdTime: Option[Integer],
/* Lead data encryption algorithm. */
  cryptographicAlgorithm: Option[String],
/* Base64 encoded key for client to decrypt lead data. */
  cryptographicKey: Option[String],
/* Subscription ID. */
  id: Option[String],
/* Lead form ID. */
  leadFormId: Option[String],
/* User account used to subscribe lead data. */
  userAccountId: Option[String],
/* Standard HTTPS webhook URL. */
  webhookUrl: Option[String],
/* Partner access token. Only for clients that requires authentication. We recommend to avoid this param. */
  partnerAccessToken: Option[String],
/* Partner metadata. Only for clients that requires special handling. We recommend to avoid this param. */
  partnerMetadata: Option[PartnerMetadata],
/* Partner refresh token. Only for clients that requires authentication. We recommend to avoid this param. */
  partnerRefreshToken: Option[String])

object LeadSubscriptionPostParams {
  import DateTimeCodecs._

  implicit val LeadSubscriptionPostParamsCodecJson: CodecJson[LeadSubscriptionPostParams] = CodecJson.derive[LeadSubscriptionPostParams]
  implicit val LeadSubscriptionPostParamsDecoder: EntityDecoder[LeadSubscriptionPostParams] = jsonOf[LeadSubscriptionPostParams]
  implicit val LeadSubscriptionPostParamsEncoder: EntityEncoder[LeadSubscriptionPostParams] = jsonEncoderOf[LeadSubscriptionPostParams]
}
