package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import BusinessMemberAssetsSummaryProfilesInner._

case class BusinessMemberAssetsSummaryProfilesInner (
  /* Unique identifier of a business profile. */
  id: Option[String],
/* Permission levels member or partner has on an asset. */
  permissions: Option[List[String]])

object BusinessMemberAssetsSummaryProfilesInner {
  import DateTimeCodecs._

  implicit val BusinessMemberAssetsSummaryProfilesInnerCodecJson: CodecJson[BusinessMemberAssetsSummaryProfilesInner] = CodecJson.derive[BusinessMemberAssetsSummaryProfilesInner]
  implicit val BusinessMemberAssetsSummaryProfilesInnerDecoder: EntityDecoder[BusinessMemberAssetsSummaryProfilesInner] = jsonOf[BusinessMemberAssetsSummaryProfilesInner]
  implicit val BusinessMemberAssetsSummaryProfilesInnerEncoder: EntityEncoder[BusinessMemberAssetsSummaryProfilesInner] = jsonEncoderOf[BusinessMemberAssetsSummaryProfilesInner]
}
