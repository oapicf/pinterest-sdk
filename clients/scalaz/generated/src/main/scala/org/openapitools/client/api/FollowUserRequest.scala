package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import FollowUserRequest._

case class FollowUserRequest (
  /* Whether this request comes as result of auto-follow after clicking on a link. Follow links can be used by partners on their site or in emails. Only selected partners can be followed this way. We verify that partner can be auto-followed. */
  autoFollow: Option[Boolean])

object FollowUserRequest {
  import DateTimeCodecs._

  implicit val FollowUserRequestCodecJson: CodecJson[FollowUserRequest] = CodecJson.derive[FollowUserRequest]
  implicit val FollowUserRequestDecoder: EntityDecoder[FollowUserRequest] = jsonOf[FollowUserRequest]
  implicit val FollowUserRequestEncoder: EntityEncoder[FollowUserRequest] = jsonEncoderOf[FollowUserRequest]
}
