package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import GridClickType._

case class GridClickType (
  
object GridClickType {
  import DateTimeCodecs._

  implicit val GridClickTypeCodecJson: CodecJson[GridClickType] = CodecJson.derive[GridClickType]
  implicit val GridClickTypeDecoder: EntityDecoder[GridClickType] = jsonOf[GridClickType]
  implicit val GridClickTypeEncoder: EntityEncoder[GridClickType] = jsonEncoderOf[GridClickType]
}
