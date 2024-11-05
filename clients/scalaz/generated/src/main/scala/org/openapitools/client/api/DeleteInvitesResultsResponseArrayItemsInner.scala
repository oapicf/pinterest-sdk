package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import DeleteInvitesResultsResponseArrayItemsInner._

case class DeleteInvitesResultsResponseArrayItemsInner (
  exception: Option[DeleteInvitesResultsResponseArrayItemsInnerException],
invite: Option[BaseInviteDataResponse])

object DeleteInvitesResultsResponseArrayItemsInner {
  import DateTimeCodecs._

  implicit val DeleteInvitesResultsResponseArrayItemsInnerCodecJson: CodecJson[DeleteInvitesResultsResponseArrayItemsInner] = CodecJson.derive[DeleteInvitesResultsResponseArrayItemsInner]
  implicit val DeleteInvitesResultsResponseArrayItemsInnerDecoder: EntityDecoder[DeleteInvitesResultsResponseArrayItemsInner] = jsonOf[DeleteInvitesResultsResponseArrayItemsInner]
  implicit val DeleteInvitesResultsResponseArrayItemsInnerEncoder: EntityEncoder[DeleteInvitesResultsResponseArrayItemsInner] = jsonEncoderOf[DeleteInvitesResultsResponseArrayItemsInner]
}
