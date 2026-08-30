package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import ProductCondition._

case class ProductCondition (
  
object ProductCondition {
  import DateTimeCodecs._

  implicit val ProductConditionCodecJson: CodecJson[ProductCondition] = CodecJson.derive[ProductCondition]
  implicit val ProductConditionDecoder: EntityDecoder[ProductCondition] = jsonOf[ProductCondition]
  implicit val ProductConditionEncoder: EntityEncoder[ProductCondition] = jsonEncoderOf[ProductCondition]
}
