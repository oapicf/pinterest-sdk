package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import FollowersList200Response._

case class FollowersList200Response (
  items: List[UserSummary],
bookmark: Option[String])

object FollowersList200Response {
  import DateTimeCodecs._

  implicit val FollowersList200ResponseCodecJson: CodecJson[FollowersList200Response] = CodecJson.derive[FollowersList200Response]
  implicit val FollowersList200ResponseDecoder: EntityDecoder[FollowersList200Response] = jsonOf[FollowersList200Response]
  implicit val FollowersList200ResponseEncoder: EntityEncoder[FollowersList200Response] = jsonEncoderOf[FollowersList200Response]
}
