package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import DiscountStatus._

case class DiscountStatus (
  
object DiscountStatus {
  import DateTimeCodecs._

  implicit val DiscountStatusCodecJson: CodecJson[DiscountStatus] = CodecJson.derive[DiscountStatus]
  implicit val DiscountStatusDecoder: EntityDecoder[DiscountStatus] = jsonOf[DiscountStatus]
  implicit val DiscountStatusEncoder: EntityEncoder[DiscountStatus] = jsonEncoderOf[DiscountStatus]
}
