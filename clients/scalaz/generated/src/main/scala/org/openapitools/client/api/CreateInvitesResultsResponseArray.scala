package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import CreateInvitesResultsResponseArray._

case class CreateInvitesResultsResponseArray (
  /* List of invite/request creation status. If there is an error, an exception object will be returned. If the action was successfully completed, an invite object will be returned. */
  items: Option[List[CreateInvitesResultsResponseArrayItemsInner]])

object CreateInvitesResultsResponseArray {
  import DateTimeCodecs._

  implicit val CreateInvitesResultsResponseArrayCodecJson: CodecJson[CreateInvitesResultsResponseArray] = CodecJson.derive[CreateInvitesResultsResponseArray]
  implicit val CreateInvitesResultsResponseArrayDecoder: EntityDecoder[CreateInvitesResultsResponseArray] = jsonOf[CreateInvitesResultsResponseArray]
  implicit val CreateInvitesResultsResponseArrayEncoder: EntityEncoder[CreateInvitesResultsResponseArray] = jsonEncoderOf[CreateInvitesResultsResponseArray]
}
