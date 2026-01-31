package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import DisclosureType._

case class DisclosureType (
  
object DisclosureType {
  import DateTimeCodecs._

  implicit val DisclosureTypeCodecJson: CodecJson[DisclosureType] = CodecJson.derive[DisclosureType]
  implicit val DisclosureTypeDecoder: EntityDecoder[DisclosureType] = jsonOf[DisclosureType]
  implicit val DisclosureTypeEncoder: EntityEncoder[DisclosureType] = jsonEncoderOf[DisclosureType]
}
