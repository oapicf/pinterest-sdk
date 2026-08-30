package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import NullableLabelType._

case class NullableLabelType (
  
object NullableLabelType {
  import DateTimeCodecs._

  implicit val NullableLabelTypeCodecJson: CodecJson[NullableLabelType] = CodecJson.derive[NullableLabelType]
  implicit val NullableLabelTypeDecoder: EntityDecoder[NullableLabelType] = jsonOf[NullableLabelType]
  implicit val NullableLabelTypeEncoder: EntityEncoder[NullableLabelType] = jsonEncoderOf[NullableLabelType]
}
