package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import CreateInvitesResultsResponseArrayItemsInnerInvite._

case class CreateInvitesResultsResponseArrayItemsInnerInvite (
  /* Unique identifier of the invite/request. */
  id: Option[String],
/* Metadata for the member/partner that was sent the invite/request. */
  user: Option[BusinessAccessUserSummary])

object CreateInvitesResultsResponseArrayItemsInnerInvite {
  import DateTimeCodecs._

  implicit val CreateInvitesResultsResponseArrayItemsInnerInviteCodecJson: CodecJson[CreateInvitesResultsResponseArrayItemsInnerInvite] = CodecJson.derive[CreateInvitesResultsResponseArrayItemsInnerInvite]
  implicit val CreateInvitesResultsResponseArrayItemsInnerInviteDecoder: EntityDecoder[CreateInvitesResultsResponseArrayItemsInnerInvite] = jsonOf[CreateInvitesResultsResponseArrayItemsInnerInvite]
  implicit val CreateInvitesResultsResponseArrayItemsInnerInviteEncoder: EntityEncoder[CreateInvitesResultsResponseArrayItemsInnerInvite] = jsonEncoderOf[CreateInvitesResultsResponseArrayItemsInnerInvite]
}
