package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import MatchType._

case class MatchType (
  
object MatchType {
  import DateTimeCodecs._

  implicit val MatchTypeCodecJson: CodecJson[MatchType] = CodecJson.derive[MatchType]
  implicit val MatchTypeDecoder: EntityDecoder[MatchType] = jsonOf[MatchType]
  implicit val MatchTypeEncoder: EntityEncoder[MatchType] = jsonEncoderOf[MatchType]
}
