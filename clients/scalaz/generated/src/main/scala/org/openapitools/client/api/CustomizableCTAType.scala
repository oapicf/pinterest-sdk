package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import CustomizableCTAType._

case class CustomizableCTAType (
  
object CustomizableCTAType {
  import DateTimeCodecs._

  implicit val CustomizableCTATypeCodecJson: CodecJson[CustomizableCTAType] = CodecJson.derive[CustomizableCTAType]
  implicit val CustomizableCTATypeDecoder: EntityDecoder[CustomizableCTAType] = jsonOf[CustomizableCTAType]
  implicit val CustomizableCTATypeEncoder: EntityEncoder[CustomizableCTAType] = jsonEncoderOf[CustomizableCTAType]
}
