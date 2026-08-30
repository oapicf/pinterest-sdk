package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import TrendsGender._

case class TrendsGender (
  
object TrendsGender {
  import DateTimeCodecs._

  implicit val TrendsGenderCodecJson: CodecJson[TrendsGender] = CodecJson.derive[TrendsGender]
  implicit val TrendsGenderDecoder: EntityDecoder[TrendsGender] = jsonOf[TrendsGender]
  implicit val TrendsGenderEncoder: EntityEncoder[TrendsGender] = jsonEncoderOf[TrendsGender]
}
