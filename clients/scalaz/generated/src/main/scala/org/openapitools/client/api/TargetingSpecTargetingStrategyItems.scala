package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import TargetingSpecTargetingStrategyItems._

case class TargetingSpecTargetingStrategyItems (
  
object TargetingSpecTargetingStrategyItems {
  import DateTimeCodecs._

  implicit val TargetingSpecTargetingStrategyItemsCodecJson: CodecJson[TargetingSpecTargetingStrategyItems] = CodecJson.derive[TargetingSpecTargetingStrategyItems]
  implicit val TargetingSpecTargetingStrategyItemsDecoder: EntityDecoder[TargetingSpecTargetingStrategyItems] = jsonOf[TargetingSpecTargetingStrategyItems]
  implicit val TargetingSpecTargetingStrategyItemsEncoder: EntityEncoder[TargetingSpecTargetingStrategyItems] = jsonEncoderOf[TargetingSpecTargetingStrategyItems]
}
