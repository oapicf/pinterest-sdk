package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import NonNullableProductAvailabilityType._

case class NonNullableProductAvailabilityType (
  
object NonNullableProductAvailabilityType {
  import DateTimeCodecs._

  implicit val NonNullableProductAvailabilityTypeCodecJson: CodecJson[NonNullableProductAvailabilityType] = CodecJson.derive[NonNullableProductAvailabilityType]
  implicit val NonNullableProductAvailabilityTypeDecoder: EntityDecoder[NonNullableProductAvailabilityType] = jsonOf[NonNullableProductAvailabilityType]
  implicit val NonNullableProductAvailabilityTypeEncoder: EntityEncoder[NonNullableProductAvailabilityType] = jsonEncoderOf[NonNullableProductAvailabilityType]
}
