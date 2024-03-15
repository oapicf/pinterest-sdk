package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import BoardsUserFollowsList200Response._

case class BoardsUserFollowsList200Response (
  items: List[Board],
bookmark: Option[String])

object BoardsUserFollowsList200Response {
  import DateTimeCodecs._

  implicit val BoardsUserFollowsList200ResponseCodecJson: CodecJson[BoardsUserFollowsList200Response] = CodecJson.derive[BoardsUserFollowsList200Response]
  implicit val BoardsUserFollowsList200ResponseDecoder: EntityDecoder[BoardsUserFollowsList200Response] = jsonOf[BoardsUserFollowsList200Response]
  implicit val BoardsUserFollowsList200ResponseEncoder: EntityEncoder[BoardsUserFollowsList200Response] = jsonEncoderOf[BoardsUserFollowsList200Response]
}
