package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import PromotionsResponse._

case class PromotionsResponse (
  promotions: Option[List[PromotionArrayElement]])

object PromotionsResponse {
  import DateTimeCodecs._

  implicit val PromotionsResponseCodecJson: CodecJson[PromotionsResponse] = CodecJson.derive[PromotionsResponse]
  implicit val PromotionsResponseDecoder: EntityDecoder[PromotionsResponse] = jsonOf[PromotionsResponse]
  implicit val PromotionsResponseEncoder: EntityEncoder[PromotionsResponse] = jsonEncoderOf[PromotionsResponse]
}
