package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import TrendsGenderFilter._

case class TrendsGenderFilter (
  
object TrendsGenderFilter {
  import DateTimeCodecs._

  implicit val TrendsGenderFilterCodecJson: CodecJson[TrendsGenderFilter] = CodecJson.derive[TrendsGenderFilter]
  implicit val TrendsGenderFilterDecoder: EntityDecoder[TrendsGenderFilter] = jsonOf[TrendsGenderFilter]
  implicit val TrendsGenderFilterEncoder: EntityEncoder[TrendsGenderFilter] = jsonEncoderOf[TrendsGenderFilter]
}
