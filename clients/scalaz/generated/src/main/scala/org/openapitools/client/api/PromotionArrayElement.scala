package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import PromotionArrayElement._

case class PromotionArrayElement (
  data: Option[PromotionResponse],
exception: Option[Exception])

object PromotionArrayElement {
  import DateTimeCodecs._

  implicit val PromotionArrayElementCodecJson: CodecJson[PromotionArrayElement] = CodecJson.derive[PromotionArrayElement]
  implicit val PromotionArrayElementDecoder: EntityDecoder[PromotionArrayElement] = jsonOf[PromotionArrayElement]
  implicit val PromotionArrayElementEncoder: EntityEncoder[PromotionArrayElement] = jsonEncoderOf[PromotionArrayElement]
}
