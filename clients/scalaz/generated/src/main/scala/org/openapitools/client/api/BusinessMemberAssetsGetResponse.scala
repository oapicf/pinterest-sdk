package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import BusinessMemberAssetsGetResponse._

case class BusinessMemberAssetsGetResponse (
  bookmark: Option[String],
items: List[AssetIdPermissions],
/* Total number of assets matching the query */
  totalDataCount: Integer,
/* Breakdown of asset counts by entity status (ad accounts only) */
  totalDataCountByStatus: Option[TotalCountByEntityStatus])

object BusinessMemberAssetsGetResponse {
  import DateTimeCodecs._

  implicit val BusinessMemberAssetsGetResponseCodecJson: CodecJson[BusinessMemberAssetsGetResponse] = CodecJson.derive[BusinessMemberAssetsGetResponse]
  implicit val BusinessMemberAssetsGetResponseDecoder: EntityDecoder[BusinessMemberAssetsGetResponse] = jsonOf[BusinessMemberAssetsGetResponse]
  implicit val BusinessMemberAssetsGetResponseEncoder: EntityEncoder[BusinessMemberAssetsGetResponse] = jsonEncoderOf[BusinessMemberAssetsGetResponse]
}
