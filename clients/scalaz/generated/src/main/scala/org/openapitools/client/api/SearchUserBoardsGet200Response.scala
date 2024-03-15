package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import SearchUserBoardsGet200Response._

case class SearchUserBoardsGet200Response (
  /* items */
  items: List[Board],
bookmark: Option[String])

object SearchUserBoardsGet200Response {
  import DateTimeCodecs._

  implicit val SearchUserBoardsGet200ResponseCodecJson: CodecJson[SearchUserBoardsGet200Response] = CodecJson.derive[SearchUserBoardsGet200Response]
  implicit val SearchUserBoardsGet200ResponseDecoder: EntityDecoder[SearchUserBoardsGet200Response] = jsonOf[SearchUserBoardsGet200Response]
  implicit val SearchUserBoardsGet200ResponseEncoder: EntityEncoder[SearchUserBoardsGet200Response] = jsonEncoderOf[SearchUserBoardsGet200Response]
}
