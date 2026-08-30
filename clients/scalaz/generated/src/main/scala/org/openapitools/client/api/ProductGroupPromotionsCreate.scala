package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import ProductGroupPromotionsCreate._

case class ProductGroupPromotionsCreate (
  /* ID of the ad group the product group promotion belongs to. */
  adGroupId: String,
/* List of product group promotions to create or update. */
  productGroupPromotion: List[ProductGroupPromotion])

object ProductGroupPromotionsCreate {
  import DateTimeCodecs._

  implicit val ProductGroupPromotionsCreateCodecJson: CodecJson[ProductGroupPromotionsCreate] = CodecJson.derive[ProductGroupPromotionsCreate]
  implicit val ProductGroupPromotionsCreateDecoder: EntityDecoder[ProductGroupPromotionsCreate] = jsonOf[ProductGroupPromotionsCreate]
  implicit val ProductGroupPromotionsCreateEncoder: EntityEncoder[ProductGroupPromotionsCreate] = jsonEncoderOf[ProductGroupPromotionsCreate]
}
