package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import UserSummary._

case class UserSummary (
  /* Username */
  username: Option[String],
/* Always \"user\" */
  `type`: Option[String])

object UserSummary {
  import DateTimeCodecs._

  implicit val UserSummaryCodecJson: CodecJson[UserSummary] = CodecJson.derive[UserSummary]
  implicit val UserSummaryDecoder: EntityDecoder[UserSummary] = jsonOf[UserSummary]
  implicit val UserSummaryEncoder: EntityEncoder[UserSummary] = jsonEncoderOf[UserSummary]
}
