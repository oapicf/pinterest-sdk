package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import ProductGroupPromotionsList200Response._

case class ProductGroupPromotionsList200Response (
  items: List[ProductGroupPromotionResponseItem],
bookmark: Option[String])

object ProductGroupPromotionsList200Response {
  import DateTimeCodecs._

  implicit val ProductGroupPromotionsList200ResponseCodecJson: CodecJson[ProductGroupPromotionsList200Response] = CodecJson.derive[ProductGroupPromotionsList200Response]
  implicit val ProductGroupPromotionsList200ResponseDecoder: EntityDecoder[ProductGroupPromotionsList200Response] = jsonOf[ProductGroupPromotionsList200Response]
  implicit val ProductGroupPromotionsList200ResponseEncoder: EntityEncoder[ProductGroupPromotionsList200Response] = jsonEncoderOf[ProductGroupPromotionsList200Response]
}
