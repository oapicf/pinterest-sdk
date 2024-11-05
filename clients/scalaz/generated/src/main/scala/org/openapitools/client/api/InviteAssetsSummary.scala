package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import InviteAssetsSummary._

case class InviteAssetsSummary (
  /* List of ad account IDs and respective permission levels that will be assigned. */
  adAccounts: Option[List[InviteAssetsSummaryAdAccountsInner]],
/* List of profile IDs and respective permission levels that will be assigned. */
  profiles: Option[List[InviteAssetsSummaryProfilesInner]])

object InviteAssetsSummary {
  import DateTimeCodecs._

  implicit val InviteAssetsSummaryCodecJson: CodecJson[InviteAssetsSummary] = CodecJson.derive[InviteAssetsSummary]
  implicit val InviteAssetsSummaryDecoder: EntityDecoder[InviteAssetsSummary] = jsonOf[InviteAssetsSummary]
  implicit val InviteAssetsSummaryEncoder: EntityEncoder[InviteAssetsSummary] = jsonEncoderOf[InviteAssetsSummary]
}
