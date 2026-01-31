package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import PromotionsList200Response._

case class PromotionsList200Response (
  bookmark: Option[String],
items: List[PromotionResponse])

object PromotionsList200Response {
  import DateTimeCodecs._

  implicit val PromotionsList200ResponseCodecJson: CodecJson[PromotionsList200Response] = CodecJson.derive[PromotionsList200Response]
  implicit val PromotionsList200ResponseDecoder: EntityDecoder[PromotionsList200Response] = jsonOf[PromotionsList200Response]
  implicit val PromotionsList200ResponseEncoder: EntityEncoder[PromotionsList200Response] = jsonEncoderOf[PromotionsList200Response]
}
