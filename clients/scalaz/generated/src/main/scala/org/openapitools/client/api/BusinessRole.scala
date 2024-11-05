package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import BusinessRole._

case class BusinessRole (
  
object BusinessRole {
  import DateTimeCodecs._

  implicit val BusinessRoleCodecJson: CodecJson[BusinessRole] = CodecJson.derive[BusinessRole]
  implicit val BusinessRoleDecoder: EntityDecoder[BusinessRole] = jsonOf[BusinessRole]
  implicit val BusinessRoleEncoder: EntityEncoder[BusinessRole] = jsonEncoderOf[BusinessRole]
}
