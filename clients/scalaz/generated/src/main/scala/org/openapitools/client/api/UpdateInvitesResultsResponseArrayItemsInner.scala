package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import UpdateInvitesResultsResponseArrayItemsInner._

case class UpdateInvitesResultsResponseArrayItemsInner (
  exception: Option[InviteExceptionResponse],
invite: Option[InviteBusinessRoleBinding])

object UpdateInvitesResultsResponseArrayItemsInner {
  import DateTimeCodecs._

  implicit val UpdateInvitesResultsResponseArrayItemsInnerCodecJson: CodecJson[UpdateInvitesResultsResponseArrayItemsInner] = CodecJson.derive[UpdateInvitesResultsResponseArrayItemsInner]
  implicit val UpdateInvitesResultsResponseArrayItemsInnerDecoder: EntityDecoder[UpdateInvitesResultsResponseArrayItemsInner] = jsonOf[UpdateInvitesResultsResponseArrayItemsInner]
  implicit val UpdateInvitesResultsResponseArrayItemsInnerEncoder: EntityEncoder[UpdateInvitesResultsResponseArrayItemsInner] = jsonEncoderOf[UpdateInvitesResultsResponseArrayItemsInner]
}
