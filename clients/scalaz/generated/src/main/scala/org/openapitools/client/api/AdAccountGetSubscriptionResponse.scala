package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import AdAccountGetSubscriptionResponse._

case class AdAccountGetSubscriptionResponse (
  /* Lead form ID. */
  leadFormId: Option[String],
/* Standard HTTPS webhook URL. */
  webhookUrl: Option[String],
/* Subscription ID. */
  id: Option[String],
/* User account used to subscribe lead data. */
  userAccountId: Option[String],
/* The Ad Account ID that this lead form belongs to. */
  adAccountId: Option[String],
/* API version. */
  apiVersion: Option[String],
/* Base64 encoded key for client to decrypt lead data. */
  cryptographicKey: Option[String],
/* Lead data encryption algorithm. */
  cryptographicAlgorithm: Option[String],
/* Lead form creation time. Unix timestamp in milliseconds. */
  createdTime: Option[Integer])

object AdAccountGetSubscriptionResponse {
  import DateTimeCodecs._

  implicit val AdAccountGetSubscriptionResponseCodecJson: CodecJson[AdAccountGetSubscriptionResponse] = CodecJson.derive[AdAccountGetSubscriptionResponse]
  implicit val AdAccountGetSubscriptionResponseDecoder: EntityDecoder[AdAccountGetSubscriptionResponse] = jsonOf[AdAccountGetSubscriptionResponse]
  implicit val AdAccountGetSubscriptionResponseEncoder: EntityEncoder[AdAccountGetSubscriptionResponse] = jsonEncoderOf[AdAccountGetSubscriptionResponse]
}
