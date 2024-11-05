package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import UsersForIndividualAssetResponse._

case class UsersForIndividualAssetResponse (
  /* Unique identifier of a business asset. */
  assetId: Option[String],
/* Unique identifier of the business member with asset access. */
  memberId: Option[String],
/* Permission levels member or partner has on an asset. */
  permissions: Option[List[String]])

object UsersForIndividualAssetResponse {
  import DateTimeCodecs._

  implicit val UsersForIndividualAssetResponseCodecJson: CodecJson[UsersForIndividualAssetResponse] = CodecJson.derive[UsersForIndividualAssetResponse]
  implicit val UsersForIndividualAssetResponseDecoder: EntityDecoder[UsersForIndividualAssetResponse] = jsonOf[UsersForIndividualAssetResponse]
  implicit val UsersForIndividualAssetResponseEncoder: EntityEncoder[UsersForIndividualAssetResponse] = jsonEncoderOf[UsersForIndividualAssetResponse]
}
