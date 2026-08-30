package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import IntendedPromotionType._

case class IntendedPromotionType (
  
object IntendedPromotionType {
  import DateTimeCodecs._

  implicit val IntendedPromotionTypeCodecJson: CodecJson[IntendedPromotionType] = CodecJson.derive[IntendedPromotionType]
  implicit val IntendedPromotionTypeDecoder: EntityDecoder[IntendedPromotionType] = jsonOf[IntendedPromotionType]
  implicit val IntendedPromotionTypeEncoder: EntityEncoder[IntendedPromotionType] = jsonEncoderOf[IntendedPromotionType]
}
