package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import InviteAssetsSummaryProfilesInner._

case class InviteAssetsSummaryProfilesInner (
  /* Unique identifier of a business profile. */
  id: Option[String],
/* Permission levels member or partner has on an asset. */
  permissions: Option[List[String]])

object InviteAssetsSummaryProfilesInner {
  import DateTimeCodecs._

  implicit val InviteAssetsSummaryProfilesInnerCodecJson: CodecJson[InviteAssetsSummaryProfilesInner] = CodecJson.derive[InviteAssetsSummaryProfilesInner]
  implicit val InviteAssetsSummaryProfilesInnerDecoder: EntityDecoder[InviteAssetsSummaryProfilesInner] = jsonOf[InviteAssetsSummaryProfilesInner]
  implicit val InviteAssetsSummaryProfilesInnerEncoder: EntityEncoder[InviteAssetsSummaryProfilesInner] = jsonEncoderOf[InviteAssetsSummaryProfilesInner]
}
