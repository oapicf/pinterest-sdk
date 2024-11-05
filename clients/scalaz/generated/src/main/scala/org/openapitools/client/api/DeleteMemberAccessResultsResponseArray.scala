package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import DeleteMemberAccessResultsResponseArray._

case class DeleteMemberAccessResultsResponseArray (
  /* List of member asset permissions that were deleted. */
  items: Option[List[DeleteMemberAccessResult]])

object DeleteMemberAccessResultsResponseArray {
  import DateTimeCodecs._

  implicit val DeleteMemberAccessResultsResponseArrayCodecJson: CodecJson[DeleteMemberAccessResultsResponseArray] = CodecJson.derive[DeleteMemberAccessResultsResponseArray]
  implicit val DeleteMemberAccessResultsResponseArrayDecoder: EntityDecoder[DeleteMemberAccessResultsResponseArray] = jsonOf[DeleteMemberAccessResultsResponseArray]
  implicit val DeleteMemberAccessResultsResponseArrayEncoder: EntityEncoder[DeleteMemberAccessResultsResponseArray] = jsonEncoderOf[DeleteMemberAccessResultsResponseArray]
}
