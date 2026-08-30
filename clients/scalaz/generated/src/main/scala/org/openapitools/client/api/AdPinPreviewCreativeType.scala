package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import AdPinPreviewCreativeType._

case class AdPinPreviewCreativeType (
  
object AdPinPreviewCreativeType {
  import DateTimeCodecs._

  implicit val AdPinPreviewCreativeTypeCodecJson: CodecJson[AdPinPreviewCreativeType] = CodecJson.derive[AdPinPreviewCreativeType]
  implicit val AdPinPreviewCreativeTypeDecoder: EntityDecoder[AdPinPreviewCreativeType] = jsonOf[AdPinPreviewCreativeType]
  implicit val AdPinPreviewCreativeTypeEncoder: EntityEncoder[AdPinPreviewCreativeType] = jsonEncoderOf[AdPinPreviewCreativeType]
}
