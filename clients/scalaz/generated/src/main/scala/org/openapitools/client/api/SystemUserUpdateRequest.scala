package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import SystemUserUpdateRequest._

case class SystemUserUpdateRequest (
  /* New system user name */
  name: String)

object SystemUserUpdateRequest {
  import DateTimeCodecs._

  implicit val SystemUserUpdateRequestCodecJson: CodecJson[SystemUserUpdateRequest] = CodecJson.derive[SystemUserUpdateRequest]
  implicit val SystemUserUpdateRequestDecoder: EntityDecoder[SystemUserUpdateRequest] = jsonOf[SystemUserUpdateRequest]
  implicit val SystemUserUpdateRequestEncoder: EntityEncoder[SystemUserUpdateRequest] = jsonEncoderOf[SystemUserUpdateRequest]
}
