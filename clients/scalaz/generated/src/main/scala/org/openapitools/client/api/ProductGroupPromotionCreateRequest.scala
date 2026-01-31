package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import ProductGroupPromotionCreateRequest._

case class ProductGroupPromotionCreateRequest (
  /* ID of the Ad Group the Product Group Promotion belongs to. */
  adGroupId: String,
productGroupPromotion: List[ProductGroupPromotion])

object ProductGroupPromotionCreateRequest {
  import DateTimeCodecs._

  implicit val ProductGroupPromotionCreateRequestCodecJson: CodecJson[ProductGroupPromotionCreateRequest] = CodecJson.derive[ProductGroupPromotionCreateRequest]
  implicit val ProductGroupPromotionCreateRequestDecoder: EntityDecoder[ProductGroupPromotionCreateRequest] = jsonOf[ProductGroupPromotionCreateRequest]
  implicit val ProductGroupPromotionCreateRequestEncoder: EntityEncoder[ProductGroupPromotionCreateRequest] = jsonEncoderOf[ProductGroupPromotionCreateRequest]
}
