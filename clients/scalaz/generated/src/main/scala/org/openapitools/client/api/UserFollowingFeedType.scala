package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import UserFollowingFeedType._

case class UserFollowingFeedType (
  
object UserFollowingFeedType {
  import DateTimeCodecs._

  implicit val UserFollowingFeedTypeCodecJson: CodecJson[UserFollowingFeedType] = CodecJson.derive[UserFollowingFeedType]
  implicit val UserFollowingFeedTypeDecoder: EntityDecoder[UserFollowingFeedType] = jsonOf[UserFollowingFeedType]
  implicit val UserFollowingFeedTypeEncoder: EntityEncoder[UserFollowingFeedType] = jsonEncoderOf[UserFollowingFeedType]
}
