package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import ProductGroupPromotionCustomizableCTAType._

case class ProductGroupPromotionCustomizableCTAType (
  
object ProductGroupPromotionCustomizableCTAType {
  import DateTimeCodecs._

  implicit val ProductGroupPromotionCustomizableCTATypeCodecJson: CodecJson[ProductGroupPromotionCustomizableCTAType] = CodecJson.derive[ProductGroupPromotionCustomizableCTAType]
  implicit val ProductGroupPromotionCustomizableCTATypeDecoder: EntityDecoder[ProductGroupPromotionCustomizableCTAType] = jsonOf[ProductGroupPromotionCustomizableCTAType]
  implicit val ProductGroupPromotionCustomizableCTATypeEncoder: EntityEncoder[ProductGroupPromotionCustomizableCTAType] = jsonEncoderOf[ProductGroupPromotionCustomizableCTAType]
}
