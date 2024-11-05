package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import DeleteMemberAccessResult._

case class DeleteMemberAccessResult (
  /* Unique identifier of the business asset. */
  assetId: Option[String],
/* Unique identifier of the business member. */
  memberId: Option[String])

object DeleteMemberAccessResult {
  import DateTimeCodecs._

  implicit val DeleteMemberAccessResultCodecJson: CodecJson[DeleteMemberAccessResult] = CodecJson.derive[DeleteMemberAccessResult]
  implicit val DeleteMemberAccessResultDecoder: EntityDecoder[DeleteMemberAccessResult] = jsonOf[DeleteMemberAccessResult]
  implicit val DeleteMemberAccessResultEncoder: EntityEncoder[DeleteMemberAccessResult] = jsonEncoderOf[DeleteMemberAccessResult]
}
