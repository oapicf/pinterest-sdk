package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import PacingDeliveryType._

case class PacingDeliveryType (
  
object PacingDeliveryType {
  import DateTimeCodecs._

  implicit val PacingDeliveryTypeCodecJson: CodecJson[PacingDeliveryType] = CodecJson.derive[PacingDeliveryType]
  implicit val PacingDeliveryTypeDecoder: EntityDecoder[PacingDeliveryType] = jsonOf[PacingDeliveryType]
  implicit val PacingDeliveryTypeEncoder: EntityEncoder[PacingDeliveryType] = jsonEncoderOf[PacingDeliveryType]
}
