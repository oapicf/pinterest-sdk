package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import MatchTypeResponse._

case class MatchTypeResponse (
  
object MatchTypeResponse {
  import DateTimeCodecs._

  implicit val MatchTypeResponseCodecJson: CodecJson[MatchTypeResponse] = CodecJson.derive[MatchTypeResponse]
  implicit val MatchTypeResponseDecoder: EntityDecoder[MatchTypeResponse] = jsonOf[MatchTypeResponse]
  implicit val MatchTypeResponseEncoder: EntityEncoder[MatchTypeResponse] = jsonEncoderOf[MatchTypeResponse]
}
