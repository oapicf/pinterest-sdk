package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import ProductGroupPromotionUpdateRequest._

case class ProductGroupPromotionUpdateRequest (
  /* ID of the ad group the product group belongs to. */
  adGroupId: String,
productGroupPromotion: List[ProductGroupPromotion])

object ProductGroupPromotionUpdateRequest {
  import DateTimeCodecs._

  implicit val ProductGroupPromotionUpdateRequestCodecJson: CodecJson[ProductGroupPromotionUpdateRequest] = CodecJson.derive[ProductGroupPromotionUpdateRequest]
  implicit val ProductGroupPromotionUpdateRequestDecoder: EntityDecoder[ProductGroupPromotionUpdateRequest] = jsonOf[ProductGroupPromotionUpdateRequest]
  implicit val ProductGroupPromotionUpdateRequestEncoder: EntityEncoder[ProductGroupPromotionUpdateRequest] = jsonEncoderOf[ProductGroupPromotionUpdateRequest]
}
