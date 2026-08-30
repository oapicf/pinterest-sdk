package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import PerformancePlusCampaignSettings._

case class PerformancePlusCampaignSettings (
  /* Whether to boost prospecting ad group bid. */
  boostProspectingAdGroupBid: Option[Boolean],
/* List of campaign-level exclusion pinner list IDs. */
  pinnerListExclusions: Option[List[String]])

object PerformancePlusCampaignSettings {
  import DateTimeCodecs._

  implicit val PerformancePlusCampaignSettingsCodecJson: CodecJson[PerformancePlusCampaignSettings] = CodecJson.derive[PerformancePlusCampaignSettings]
  implicit val PerformancePlusCampaignSettingsDecoder: EntityDecoder[PerformancePlusCampaignSettings] = jsonOf[PerformancePlusCampaignSettings]
  implicit val PerformancePlusCampaignSettingsEncoder: EntityEncoder[PerformancePlusCampaignSettings] = jsonEncoderOf[PerformancePlusCampaignSettings]
}
