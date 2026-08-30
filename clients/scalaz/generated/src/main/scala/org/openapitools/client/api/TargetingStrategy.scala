package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import TargetingStrategy._

case class TargetingStrategy (
  
object TargetingStrategy {
  import DateTimeCodecs._

  implicit val TargetingStrategyCodecJson: CodecJson[TargetingStrategy] = CodecJson.derive[TargetingStrategy]
  implicit val TargetingStrategyDecoder: EntityDecoder[TargetingStrategy] = jsonOf[TargetingStrategy]
  implicit val TargetingStrategyEncoder: EntityEncoder[TargetingStrategy] = jsonEncoderOf[TargetingStrategy]
}
