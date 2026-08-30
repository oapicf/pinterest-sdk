package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import ProductGroupPromotions._

case class ProductGroupPromotions (
  /* Response-only: created or updated product group promotions, or exceptions. */
  items: Option[List[ProductGroupPromotionResponseItem]])

object ProductGroupPromotions {
  import DateTimeCodecs._

  implicit val ProductGroupPromotionsCodecJson: CodecJson[ProductGroupPromotions] = CodecJson.derive[ProductGroupPromotions]
  implicit val ProductGroupPromotionsDecoder: EntityDecoder[ProductGroupPromotions] = jsonOf[ProductGroupPromotions]
  implicit val ProductGroupPromotionsEncoder: EntityEncoder[ProductGroupPromotions] = jsonEncoderOf[ProductGroupPromotions]
}
