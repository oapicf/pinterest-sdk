package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import UpdateMaskFieldType._

case class UpdateMaskFieldType (
  
object UpdateMaskFieldType {
  import DateTimeCodecs._

  implicit val UpdateMaskFieldTypeCodecJson: CodecJson[UpdateMaskFieldType] = CodecJson.derive[UpdateMaskFieldType]
  implicit val UpdateMaskFieldTypeDecoder: EntityDecoder[UpdateMaskFieldType] = jsonOf[UpdateMaskFieldType]
  implicit val UpdateMaskFieldTypeEncoder: EntityEncoder[UpdateMaskFieldType] = jsonEncoderOf[UpdateMaskFieldType]
}
