package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import TrendType._

case class TrendType (
  
object TrendType {
  import DateTimeCodecs._

  implicit val TrendTypeCodecJson: CodecJson[TrendType] = CodecJson.derive[TrendType]
  implicit val TrendTypeDecoder: EntityDecoder[TrendType] = jsonOf[TrendType]
  implicit val TrendTypeEncoder: EntityEncoder[TrendType] = jsonEncoderOf[TrendType]
}
