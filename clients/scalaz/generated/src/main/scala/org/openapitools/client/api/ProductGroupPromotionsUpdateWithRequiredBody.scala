package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import ProductGroupPromotionsUpdateWithRequiredBody._

case class ProductGroupPromotionsUpdateWithRequiredBody (
  /* ID of the ad group the product group promotion belongs to. */
  adGroupId: String,
/* List of product group promotions to create or update. */
  productGroupPromotion: List[ProductGroupPromotion])

object ProductGroupPromotionsUpdateWithRequiredBody {
  import DateTimeCodecs._

  implicit val ProductGroupPromotionsUpdateWithRequiredBodyCodecJson: CodecJson[ProductGroupPromotionsUpdateWithRequiredBody] = CodecJson.derive[ProductGroupPromotionsUpdateWithRequiredBody]
  implicit val ProductGroupPromotionsUpdateWithRequiredBodyDecoder: EntityDecoder[ProductGroupPromotionsUpdateWithRequiredBody] = jsonOf[ProductGroupPromotionsUpdateWithRequiredBody]
  implicit val ProductGroupPromotionsUpdateWithRequiredBodyEncoder: EntityEncoder[ProductGroupPromotionsUpdateWithRequiredBody] = jsonEncoderOf[ProductGroupPromotionsUpdateWithRequiredBody]
}
