package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import GetInvites200Response._

case class GetInvites200Response (
  /* List of invite and request data. */
  items: List[InviteResponse],
bookmark: Option[String])

object GetInvites200Response {
  import DateTimeCodecs._

  implicit val GetInvites200ResponseCodecJson: CodecJson[GetInvites200Response] = CodecJson.derive[GetInvites200Response]
  implicit val GetInvites200ResponseDecoder: EntityDecoder[GetInvites200Response] = jsonOf[GetInvites200Response]
  implicit val GetInvites200ResponseEncoder: EntityEncoder[GetInvites200Response] = jsonEncoderOf[GetInvites200Response]
}
