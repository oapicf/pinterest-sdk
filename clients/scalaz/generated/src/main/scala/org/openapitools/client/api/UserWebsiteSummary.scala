package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import UserWebsiteSummary._

case class UserWebsiteSummary (
  /* Website with path or domain only */
  website: Option[String],
/* Status of the verification process */
  status: Option[String],
/* UTC timestamp when the verification happened - sometimes missing */
  verifiedAt: Option[String])

object UserWebsiteSummary {
  import DateTimeCodecs._

  implicit val UserWebsiteSummaryCodecJson: CodecJson[UserWebsiteSummary] = CodecJson.derive[UserWebsiteSummary]
  implicit val UserWebsiteSummaryDecoder: EntityDecoder[UserWebsiteSummary] = jsonOf[UserWebsiteSummary]
  implicit val UserWebsiteSummaryEncoder: EntityEncoder[UserWebsiteSummary] = jsonEncoderOf[UserWebsiteSummary]
}
