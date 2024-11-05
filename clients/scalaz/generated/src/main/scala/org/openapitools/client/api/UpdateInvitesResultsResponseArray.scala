package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import UpdateInvitesResultsResponseArray._

case class UpdateInvitesResultsResponseArray (
  /* List of invite/Request action status. If there is an error, an exception object will be returned. If the action was successfully completed, an invite object will be returned. */
  items: Option[List[UpdateInvitesResultsResponseArrayItemsInner]])

object UpdateInvitesResultsResponseArray {
  import DateTimeCodecs._

  implicit val UpdateInvitesResultsResponseArrayCodecJson: CodecJson[UpdateInvitesResultsResponseArray] = CodecJson.derive[UpdateInvitesResultsResponseArray]
  implicit val UpdateInvitesResultsResponseArrayDecoder: EntityDecoder[UpdateInvitesResultsResponseArray] = jsonOf[UpdateInvitesResultsResponseArray]
  implicit val UpdateInvitesResultsResponseArrayEncoder: EntityEncoder[UpdateInvitesResultsResponseArray] = jsonEncoderOf[UpdateInvitesResultsResponseArray]
}
