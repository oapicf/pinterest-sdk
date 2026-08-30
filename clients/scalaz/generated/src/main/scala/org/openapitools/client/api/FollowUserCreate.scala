package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import FollowUserCreate._

case class FollowUserCreate (
  /*   Whether this request comes as result of auto-follow after clicking on a link.   Follow links can be used by partners on their site or in emails.   Only selected partners can be followed this way. We verify that partner can be auto-followed. */
  autoFollow: Option[Boolean])

object FollowUserCreate {
  import DateTimeCodecs._

  implicit val FollowUserCreateCodecJson: CodecJson[FollowUserCreate] = CodecJson.derive[FollowUserCreate]
  implicit val FollowUserCreateDecoder: EntityDecoder[FollowUserCreate] = jsonOf[FollowUserCreate]
  implicit val FollowUserCreateEncoder: EntityEncoder[FollowUserCreate] = jsonEncoderOf[FollowUserCreate]
}
