package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import ProductAvailabilityType._

case class ProductAvailabilityType (
  
object ProductAvailabilityType {
  import DateTimeCodecs._

  implicit val ProductAvailabilityTypeCodecJson: CodecJson[ProductAvailabilityType] = CodecJson.derive[ProductAvailabilityType]
  implicit val ProductAvailabilityTypeDecoder: EntityDecoder[ProductAvailabilityType] = jsonOf[ProductAvailabilityType]
  implicit val ProductAvailabilityTypeEncoder: EntityEncoder[ProductAvailabilityType] = jsonEncoderOf[ProductAvailabilityType]
}
