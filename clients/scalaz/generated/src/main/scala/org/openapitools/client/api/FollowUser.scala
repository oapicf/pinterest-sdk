package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import FollowUser._

case class FollowUser (
  /* Always 'user' */
  `type`: Option[String],
/* Username */
  username: Option[String])

object FollowUser {
  import DateTimeCodecs._

  implicit val FollowUserCodecJson: CodecJson[FollowUser] = CodecJson.derive[FollowUser]
  implicit val FollowUserDecoder: EntityDecoder[FollowUser] = jsonOf[FollowUser]
  implicit val FollowUserEncoder: EntityEncoder[FollowUser] = jsonEncoderOf[FollowUser]
}
