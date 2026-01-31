package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime

import java.util.HashMap

import NotificationPostRequest._

case class NotificationPostRequest (
  
object NotificationPostRequest {
  import DateTimeCodecs._

  implicit val NotificationPostRequestCodecJson: CodecJson[NotificationPostRequest] = CodecJson.derive[NotificationPostRequest]
  implicit val NotificationPostRequestDecoder: EntityDecoder[NotificationPostRequest] = jsonOf[NotificationPostRequest]
  implicit val NotificationPostRequestEncoder: EntityEncoder[NotificationPostRequest] = jsonEncoderOf[NotificationPostRequest]
}
