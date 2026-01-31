package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import CampaignIdFilter._

case class CampaignIdFilter (
  /* List of campaign ids */
  campaignIds: Option[List[String]])

object CampaignIdFilter {
  import DateTimeCodecs._

  implicit val CampaignIdFilterCodecJson: CodecJson[CampaignIdFilter] = CodecJson.derive[CampaignIdFilter]
  implicit val CampaignIdFilterDecoder: EntityDecoder[CampaignIdFilter] = jsonOf[CampaignIdFilter]
  implicit val CampaignIdFilterEncoder: EntityEncoder[CampaignIdFilter] = jsonEncoderOf[CampaignIdFilter]
}
