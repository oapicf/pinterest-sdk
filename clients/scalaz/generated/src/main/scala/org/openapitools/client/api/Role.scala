package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import Role._

case class Role (
  
object Role {
  import DateTimeCodecs._

  implicit val RoleCodecJson: CodecJson[Role] = CodecJson.derive[Role]
  implicit val RoleDecoder: EntityDecoder[Role] = jsonOf[Role]
  implicit val RoleEncoder: EntityEncoder[Role] = jsonEncoderOf[Role]
}
