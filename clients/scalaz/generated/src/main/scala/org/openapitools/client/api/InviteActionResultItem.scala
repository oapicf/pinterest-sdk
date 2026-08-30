package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import InviteActionResultItem._

case class InviteActionResultItem (
  exception: Option[InviteExceptionResponse],
invite: Option[InviteBusinessRoleBinding])

object InviteActionResultItem {
  import DateTimeCodecs._

  implicit val InviteActionResultItemCodecJson: CodecJson[InviteActionResultItem] = CodecJson.derive[InviteActionResultItem]
  implicit val InviteActionResultItemDecoder: EntityDecoder[InviteActionResultItem] = jsonOf[InviteActionResultItem]
  implicit val InviteActionResultItemEncoder: EntityEncoder[InviteActionResultItem] = jsonEncoderOf[InviteActionResultItem]
}
