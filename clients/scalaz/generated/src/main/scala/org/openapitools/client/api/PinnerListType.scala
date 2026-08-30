package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import PinnerListType._

case class PinnerListType (
  
object PinnerListType {
  import DateTimeCodecs._

  implicit val PinnerListTypeCodecJson: CodecJson[PinnerListType] = CodecJson.derive[PinnerListType]
  implicit val PinnerListTypeDecoder: EntityDecoder[PinnerListType] = jsonOf[PinnerListType]
  implicit val PinnerListTypeEncoder: EntityEncoder[PinnerListType] = jsonEncoderOf[PinnerListType]
}
