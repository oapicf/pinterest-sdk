package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import PartnerType._

case class PartnerType (
  
object PartnerType {
  import DateTimeCodecs._

  implicit val PartnerTypeCodecJson: CodecJson[PartnerType] = CodecJson.derive[PartnerType]
  implicit val PartnerTypeDecoder: EntityDecoder[PartnerType] = jsonOf[PartnerType]
  implicit val PartnerTypeEncoder: EntityEncoder[PartnerType] = jsonEncoderOf[PartnerType]
}
