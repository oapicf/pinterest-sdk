package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import PromotionType._

case class PromotionType (
  
object PromotionType {
  import DateTimeCodecs._

  implicit val PromotionTypeCodecJson: CodecJson[PromotionType] = CodecJson.derive[PromotionType]
  implicit val PromotionTypeDecoder: EntityDecoder[PromotionType] = jsonOf[PromotionType]
  implicit val PromotionTypeEncoder: EntityEncoder[PromotionType] = jsonEncoderOf[PromotionType]
}
