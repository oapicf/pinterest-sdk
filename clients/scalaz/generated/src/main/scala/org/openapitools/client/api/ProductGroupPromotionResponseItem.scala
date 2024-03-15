package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import ProductGroupPromotionResponseItem._

case class ProductGroupPromotionResponseItem (
  data: Option[ProductGroupPromotion],
exceptions: Option[List[Exception]])

object ProductGroupPromotionResponseItem {
  import DateTimeCodecs._

  implicit val ProductGroupPromotionResponseItemCodecJson: CodecJson[ProductGroupPromotionResponseItem] = CodecJson.derive[ProductGroupPromotionResponseItem]
  implicit val ProductGroupPromotionResponseItemDecoder: EntityDecoder[ProductGroupPromotionResponseItem] = jsonOf[ProductGroupPromotionResponseItem]
  implicit val ProductGroupPromotionResponseItemEncoder: EntityEncoder[ProductGroupPromotionResponseItem] = jsonEncoderOf[ProductGroupPromotionResponseItem]
}
