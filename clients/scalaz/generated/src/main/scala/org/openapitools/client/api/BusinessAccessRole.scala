package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import BusinessAccessRole._

case class BusinessAccessRole (
  
object BusinessAccessRole {
  import DateTimeCodecs._

  implicit val BusinessAccessRoleCodecJson: CodecJson[BusinessAccessRole] = CodecJson.derive[BusinessAccessRole]
  implicit val BusinessAccessRoleDecoder: EntityDecoder[BusinessAccessRole] = jsonOf[BusinessAccessRole]
  implicit val BusinessAccessRoleEncoder: EntityEncoder[BusinessAccessRole] = jsonEncoderOf[BusinessAccessRole]
}
