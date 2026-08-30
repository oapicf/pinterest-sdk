package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import PromotionApplicationLevel._

case class PromotionApplicationLevel (
  
object PromotionApplicationLevel {
  import DateTimeCodecs._

  implicit val PromotionApplicationLevelCodecJson: CodecJson[PromotionApplicationLevel] = CodecJson.derive[PromotionApplicationLevel]
  implicit val PromotionApplicationLevelDecoder: EntityDecoder[PromotionApplicationLevel] = jsonOf[PromotionApplicationLevel]
  implicit val PromotionApplicationLevelEncoder: EntityEncoder[PromotionApplicationLevel] = jsonEncoderOf[PromotionApplicationLevel]
}
