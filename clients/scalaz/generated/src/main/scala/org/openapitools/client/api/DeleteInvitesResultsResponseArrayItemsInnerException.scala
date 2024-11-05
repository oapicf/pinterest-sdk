package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import DeleteInvitesResultsResponseArrayItemsInnerException._

case class DeleteInvitesResultsResponseArrayItemsInnerException (
  /* Unique identifier of an invite. */
  inviteId: Option[String],
/* Error message associated with the error in performing the action on the invite/request. */
  message: Option[String])

object DeleteInvitesResultsResponseArrayItemsInnerException {
  import DateTimeCodecs._

  implicit val DeleteInvitesResultsResponseArrayItemsInnerExceptionCodecJson: CodecJson[DeleteInvitesResultsResponseArrayItemsInnerException] = CodecJson.derive[DeleteInvitesResultsResponseArrayItemsInnerException]
  implicit val DeleteInvitesResultsResponseArrayItemsInnerExceptionDecoder: EntityDecoder[DeleteInvitesResultsResponseArrayItemsInnerException] = jsonOf[DeleteInvitesResultsResponseArrayItemsInnerException]
  implicit val DeleteInvitesResultsResponseArrayItemsInnerExceptionEncoder: EntityEncoder[DeleteInvitesResultsResponseArrayItemsInnerException] = jsonEncoderOf[DeleteInvitesResultsResponseArrayItemsInnerException]
}
