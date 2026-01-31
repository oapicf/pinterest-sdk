package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import NotificationResponse._

case class NotificationResponse (
  /* Returns true if the notification accepted. */
  success: Option[Boolean],
/* Received time. Unix timestamp in seconds. */
  receivedAt: Option[Integer],
/* error message when success is false */
  errorMsg: Option[String])

object NotificationResponse {
  import DateTimeCodecs._

  implicit val NotificationResponseCodecJson: CodecJson[NotificationResponse] = CodecJson.derive[NotificationResponse]
  implicit val NotificationResponseDecoder: EntityDecoder[NotificationResponse] = jsonOf[NotificationResponse]
  implicit val NotificationResponseEncoder: EntityEncoder[NotificationResponse] = jsonEncoderOf[NotificationResponse]
}
