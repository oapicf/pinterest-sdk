package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import UserAccountFollowedInterests200Response._

case class UserAccountFollowedInterests200Response (
  items: List[Interest],
bookmark: Option[String])

object UserAccountFollowedInterests200Response {
  import DateTimeCodecs._

  implicit val UserAccountFollowedInterests200ResponseCodecJson: CodecJson[UserAccountFollowedInterests200Response] = CodecJson.derive[UserAccountFollowedInterests200Response]
  implicit val UserAccountFollowedInterests200ResponseDecoder: EntityDecoder[UserAccountFollowedInterests200Response] = jsonOf[UserAccountFollowedInterests200Response]
  implicit val UserAccountFollowedInterests200ResponseEncoder: EntityEncoder[UserAccountFollowedInterests200Response] = jsonEncoderOf[UserAccountFollowedInterests200Response]
}
