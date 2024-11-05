package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import BusinessMemberAssetsSummaryAdAccountsInner._

case class BusinessMemberAssetsSummaryAdAccountsInner (
  /* Unique identifier of a business ad account. */
  id: Option[String],
/* Permission levels member or partner has on an asset. */
  permissions: Option[List[String]])

object BusinessMemberAssetsSummaryAdAccountsInner {
  import DateTimeCodecs._

  implicit val BusinessMemberAssetsSummaryAdAccountsInnerCodecJson: CodecJson[BusinessMemberAssetsSummaryAdAccountsInner] = CodecJson.derive[BusinessMemberAssetsSummaryAdAccountsInner]
  implicit val BusinessMemberAssetsSummaryAdAccountsInnerDecoder: EntityDecoder[BusinessMemberAssetsSummaryAdAccountsInner] = jsonOf[BusinessMemberAssetsSummaryAdAccountsInner]
  implicit val BusinessMemberAssetsSummaryAdAccountsInnerEncoder: EntityEncoder[BusinessMemberAssetsSummaryAdAccountsInner] = jsonEncoderOf[BusinessMemberAssetsSummaryAdAccountsInner]
}
