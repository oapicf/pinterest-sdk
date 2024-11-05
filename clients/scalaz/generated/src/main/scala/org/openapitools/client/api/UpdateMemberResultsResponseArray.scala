package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import UpdateMemberResultsResponseArray._

case class UpdateMemberResultsResponseArray (
  /* List of members with updated business access role. */
  items: Option[List[UpdateMemberResult]])

object UpdateMemberResultsResponseArray {
  import DateTimeCodecs._

  implicit val UpdateMemberResultsResponseArrayCodecJson: CodecJson[UpdateMemberResultsResponseArray] = CodecJson.derive[UpdateMemberResultsResponseArray]
  implicit val UpdateMemberResultsResponseArrayDecoder: EntityDecoder[UpdateMemberResultsResponseArray] = jsonOf[UpdateMemberResultsResponseArray]
  implicit val UpdateMemberResultsResponseArrayEncoder: EntityEncoder[UpdateMemberResultsResponseArray] = jsonEncoderOf[UpdateMemberResultsResponseArray]
}
