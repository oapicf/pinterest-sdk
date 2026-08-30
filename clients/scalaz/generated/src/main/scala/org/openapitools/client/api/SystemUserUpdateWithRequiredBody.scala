package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import SystemUserUpdateWithRequiredBody._

case class SystemUserUpdateWithRequiredBody (
  /* New system user name */
  name: String)

object SystemUserUpdateWithRequiredBody {
  import DateTimeCodecs._

  implicit val SystemUserUpdateWithRequiredBodyCodecJson: CodecJson[SystemUserUpdateWithRequiredBody] = CodecJson.derive[SystemUserUpdateWithRequiredBody]
  implicit val SystemUserUpdateWithRequiredBodyDecoder: EntityDecoder[SystemUserUpdateWithRequiredBody] = jsonOf[SystemUserUpdateWithRequiredBody]
  implicit val SystemUserUpdateWithRequiredBodyEncoder: EntityEncoder[SystemUserUpdateWithRequiredBody] = jsonEncoderOf[SystemUserUpdateWithRequiredBody]
}
