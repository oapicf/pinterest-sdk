package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import LeadSubscription._

case class LeadSubscription (
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
  webhookUrl: Option[String])

object LeadSubscription {
  import DateTimeCodecs._

  implicit val LeadSubscriptionCodecJson: CodecJson[LeadSubscription] = CodecJson.derive[LeadSubscription]
  implicit val LeadSubscriptionDecoder: EntityDecoder[LeadSubscription] = jsonOf[LeadSubscription]
  implicit val LeadSubscriptionEncoder: EntityEncoder[LeadSubscription] = jsonEncoderOf[LeadSubscription]
}
