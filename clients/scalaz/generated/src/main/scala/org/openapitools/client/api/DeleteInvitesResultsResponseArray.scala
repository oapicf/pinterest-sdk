package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import DeleteInvitesResultsResponseArray._

case class DeleteInvitesResultsResponseArray (
  /* List of invite/Request deletion status. If there is an error, an exception object will be returned. If the invite/request was successfully cancelled, an invite object will be returned for the invite that was cancelled. */
  items: Option[List[DeleteInvitesResultsResponseArrayItemsInner]])

object DeleteInvitesResultsResponseArray {
  import DateTimeCodecs._

  implicit val DeleteInvitesResultsResponseArrayCodecJson: CodecJson[DeleteInvitesResultsResponseArray] = CodecJson.derive[DeleteInvitesResultsResponseArray]
  implicit val DeleteInvitesResultsResponseArrayDecoder: EntityDecoder[DeleteInvitesResultsResponseArray] = jsonOf[DeleteInvitesResultsResponseArray]
  implicit val DeleteInvitesResultsResponseArrayEncoder: EntityEncoder[DeleteInvitesResultsResponseArray] = jsonEncoderOf[DeleteInvitesResultsResponseArray]
}
