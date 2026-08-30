package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import TrendsL1Interest._

case class TrendsL1Interest (
  
object TrendsL1Interest {
  import DateTimeCodecs._

  implicit val TrendsL1InterestCodecJson: CodecJson[TrendsL1Interest] = CodecJson.derive[TrendsL1Interest]
  implicit val TrendsL1InterestDecoder: EntityDecoder[TrendsL1Interest] = jsonOf[TrendsL1Interest]
  implicit val TrendsL1InterestEncoder: EntityEncoder[TrendsL1Interest] = jsonEncoderOf[TrendsL1Interest]
}
