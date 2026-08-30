package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import LeadSubscriptionCreate._

case class LeadSubscriptionCreate (
  /* Lead form ID. */
  leadFormId: Option[String],
/* Standard HTTPS webhook URL. */
  webhookUrl: String)

object LeadSubscriptionCreate {
  import DateTimeCodecs._

  implicit val LeadSubscriptionCreateCodecJson: CodecJson[LeadSubscriptionCreate] = CodecJson.derive[LeadSubscriptionCreate]
  implicit val LeadSubscriptionCreateDecoder: EntityDecoder[LeadSubscriptionCreate] = jsonOf[LeadSubscriptionCreate]
  implicit val LeadSubscriptionCreateEncoder: EntityEncoder[LeadSubscriptionCreate] = jsonEncoderOf[LeadSubscriptionCreate]
}
