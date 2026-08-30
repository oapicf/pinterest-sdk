package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import CancelInviteResultItem._

case class CancelInviteResultItem (
  exception: Option[CancelInviteException],
invite: Option[CancelInviteResult])

object CancelInviteResultItem {
  import DateTimeCodecs._

  implicit val CancelInviteResultItemCodecJson: CodecJson[CancelInviteResultItem] = CodecJson.derive[CancelInviteResultItem]
  implicit val CancelInviteResultItemDecoder: EntityDecoder[CancelInviteResultItem] = jsonOf[CancelInviteResultItem]
  implicit val CancelInviteResultItemEncoder: EntityEncoder[CancelInviteResultItem] = jsonEncoderOf[CancelInviteResultItem]
}
