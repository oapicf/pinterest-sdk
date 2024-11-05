package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import BusinessRoleCheckMode._

case class BusinessRoleCheckMode (
  
object BusinessRoleCheckMode {
  import DateTimeCodecs._

  implicit val BusinessRoleCheckModeCodecJson: CodecJson[BusinessRoleCheckMode] = CodecJson.derive[BusinessRoleCheckMode]
  implicit val BusinessRoleCheckModeDecoder: EntityDecoder[BusinessRoleCheckMode] = jsonOf[BusinessRoleCheckMode]
  implicit val BusinessRoleCheckModeEncoder: EntityEncoder[BusinessRoleCheckMode] = jsonEncoderOf[BusinessRoleCheckMode]
}
