package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import KeywordsGet200Response._

case class KeywordsGet200Response (
  items: List[Keyword],
bookmark: Option[String])

object KeywordsGet200Response {
  import DateTimeCodecs._

  implicit val KeywordsGet200ResponseCodecJson: CodecJson[KeywordsGet200Response] = CodecJson.derive[KeywordsGet200Response]
  implicit val KeywordsGet200ResponseDecoder: EntityDecoder[KeywordsGet200Response] = jsonOf[KeywordsGet200Response]
  implicit val KeywordsGet200ResponseEncoder: EntityEncoder[KeywordsGet200Response] = jsonEncoderOf[KeywordsGet200Response]
}
