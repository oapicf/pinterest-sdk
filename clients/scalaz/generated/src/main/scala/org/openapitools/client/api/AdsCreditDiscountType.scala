package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import AdsCreditDiscountType._

case class AdsCreditDiscountType (
  
object AdsCreditDiscountType {
  import DateTimeCodecs._

  implicit val AdsCreditDiscountTypeCodecJson: CodecJson[AdsCreditDiscountType] = CodecJson.derive[AdsCreditDiscountType]
  implicit val AdsCreditDiscountTypeDecoder: EntityDecoder[AdsCreditDiscountType] = jsonOf[AdsCreditDiscountType]
  implicit val AdsCreditDiscountTypeEncoder: EntityEncoder[AdsCreditDiscountType] = jsonEncoderOf[AdsCreditDiscountType]
}
