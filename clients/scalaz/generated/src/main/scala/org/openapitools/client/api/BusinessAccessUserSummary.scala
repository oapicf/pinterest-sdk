package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import BusinessAccessUserSummary._

case class BusinessAccessUserSummary (
  /* Email of the business member/partner. */
  email: Option[String],
/* Unique identifier of the business member/partner. */
  id: Option[String],
/* Username of the business member/partner. */
  username: Option[String])

object BusinessAccessUserSummary {
  import DateTimeCodecs._

  implicit val BusinessAccessUserSummaryCodecJson: CodecJson[BusinessAccessUserSummary] = CodecJson.derive[BusinessAccessUserSummary]
  implicit val BusinessAccessUserSummaryDecoder: EntityDecoder[BusinessAccessUserSummary] = jsonOf[BusinessAccessUserSummary]
  implicit val BusinessAccessUserSummaryEncoder: EntityEncoder[BusinessAccessUserSummary] = jsonEncoderOf[BusinessAccessUserSummary]
}
