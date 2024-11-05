package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import InviteType._

case class InviteType (
  
object InviteType {
  import DateTimeCodecs._

  implicit val InviteTypeCodecJson: CodecJson[InviteType] = CodecJson.derive[InviteType]
  implicit val InviteTypeDecoder: EntityDecoder[InviteType] = jsonOf[InviteType]
  implicit val InviteTypeEncoder: EntityEncoder[InviteType] = jsonEncoderOf[InviteType]
}
