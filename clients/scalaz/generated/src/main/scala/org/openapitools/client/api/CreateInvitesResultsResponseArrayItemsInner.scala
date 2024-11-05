package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import CreateInvitesResultsResponseArrayItemsInner._

case class CreateInvitesResultsResponseArrayItemsInner (
  exception: Option[InviteExceptionResponse],
invite: Option[CreateInvitesResultsResponseArrayItemsInnerInvite])

object CreateInvitesResultsResponseArrayItemsInner {
  import DateTimeCodecs._

  implicit val CreateInvitesResultsResponseArrayItemsInnerCodecJson: CodecJson[CreateInvitesResultsResponseArrayItemsInner] = CodecJson.derive[CreateInvitesResultsResponseArrayItemsInner]
  implicit val CreateInvitesResultsResponseArrayItemsInnerDecoder: EntityDecoder[CreateInvitesResultsResponseArrayItemsInner] = jsonOf[CreateInvitesResultsResponseArrayItemsInner]
  implicit val CreateInvitesResultsResponseArrayItemsInnerEncoder: EntityEncoder[CreateInvitesResultsResponseArrayItemsInner] = jsonEncoderOf[CreateInvitesResultsResponseArrayItemsInner]
}
