package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import BusinessMemberAssetsSummary._

case class BusinessMemberAssetsSummary (
  /* List of ad account IDs and respective permission levels. */
  adAccounts: Option[List[BusinessMemberAssetsSummaryAdAccountsInner]],
/* List of profile IDs and respective permission levels. */
  profiles: Option[List[BusinessMemberAssetsSummaryProfilesInner]])

object BusinessMemberAssetsSummary {
  import DateTimeCodecs._

  implicit val BusinessMemberAssetsSummaryCodecJson: CodecJson[BusinessMemberAssetsSummary] = CodecJson.derive[BusinessMemberAssetsSummary]
  implicit val BusinessMemberAssetsSummaryDecoder: EntityDecoder[BusinessMemberAssetsSummary] = jsonOf[BusinessMemberAssetsSummary]
  implicit val BusinessMemberAssetsSummaryEncoder: EntityEncoder[BusinessMemberAssetsSummary] = jsonEncoderOf[BusinessMemberAssetsSummary]
}
