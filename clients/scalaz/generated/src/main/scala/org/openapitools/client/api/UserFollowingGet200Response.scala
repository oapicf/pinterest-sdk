package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import UserFollowingGet200Response._

case class UserFollowingGet200Response (
  /* Users */
  items: List[UserSummary],
bookmark: Option[String])

object UserFollowingGet200Response {
  import DateTimeCodecs._

  implicit val UserFollowingGet200ResponseCodecJson: CodecJson[UserFollowingGet200Response] = CodecJson.derive[UserFollowingGet200Response]
  implicit val UserFollowingGet200ResponseDecoder: EntityDecoder[UserFollowingGet200Response] = jsonOf[UserFollowingGet200Response]
  implicit val UserFollowingGet200ResponseEncoder: EntityEncoder[UserFollowingGet200Response] = jsonEncoderOf[UserFollowingGet200Response]
}
