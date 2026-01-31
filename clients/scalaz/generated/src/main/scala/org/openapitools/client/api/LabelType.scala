package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import LabelType._

case class LabelType (
  
object LabelType {
  import DateTimeCodecs._

  implicit val LabelTypeCodecJson: CodecJson[LabelType] = CodecJson.derive[LabelType]
  implicit val LabelTypeDecoder: EntityDecoder[LabelType] = jsonOf[LabelType]
  implicit val LabelTypeEncoder: EntityEncoder[LabelType] = jsonEncoderOf[LabelType]
}
