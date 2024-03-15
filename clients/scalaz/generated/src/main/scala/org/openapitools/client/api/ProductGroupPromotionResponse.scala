package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import ProductGroupPromotionResponse._

case class ProductGroupPromotionResponse (
  items: Option[List[ProductGroupPromotionResponseItem]])

object ProductGroupPromotionResponse {
  import DateTimeCodecs._

  implicit val ProductGroupPromotionResponseCodecJson: CodecJson[ProductGroupPromotionResponse] = CodecJson.derive[ProductGroupPromotionResponse]
  implicit val ProductGroupPromotionResponseDecoder: EntityDecoder[ProductGroupPromotionResponse] = jsonOf[ProductGroupPromotionResponse]
  implicit val ProductGroupPromotionResponseEncoder: EntityEncoder[ProductGroupPromotionResponse] = jsonEncoderOf[ProductGroupPromotionResponse]
}
