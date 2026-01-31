package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import CampaignBidOptionsUpdate._

case class CampaignBidOptionsUpdate (
  appTypeMultipliers: Option[AppTypeMultipliers],
audienceMultipliers: Option[CampaignAudienceMultipliers],
placementMultipliers: Option[PlacementMultipliers],
/* List of fields to update, only the fields in the list will be updated. */
  updateMask: List[UpdateMask])

object CampaignBidOptionsUpdate {
  import DateTimeCodecs._
  sealed trait List[UpdateMask]

  object List[UpdateMask] {
    def toList[UpdateMask](s: String): Option[List[UpdateMask]] = s match {
      case _ => None
    }

    def fromList[UpdateMask](x: List[UpdateMask]): String = x match {
    }
  }

  implicit val List[UpdateMask]EnumEncoder: EncodeJson[List[UpdateMask]] =
    EncodeJson[List[UpdateMask]](is => StringEncodeJson(List[UpdateMask].fromList[UpdateMask](is)))

  implicit val List[UpdateMask]EnumDecoder: DecodeJson[List[UpdateMask]] =
    DecodeJson.optionDecoder[List[UpdateMask]](n => n.string.flatMap(jStr => List[UpdateMask].toList[UpdateMask](jStr)), "List[UpdateMask] failed to de-serialize")

  implicit val CampaignBidOptionsUpdateCodecJson: CodecJson[CampaignBidOptionsUpdate] = CodecJson.derive[CampaignBidOptionsUpdate]
  implicit val CampaignBidOptionsUpdateDecoder: EntityDecoder[CampaignBidOptionsUpdate] = jsonOf[CampaignBidOptionsUpdate]
  implicit val CampaignBidOptionsUpdateEncoder: EntityEncoder[CampaignBidOptionsUpdate] = jsonEncoderOf[CampaignBidOptionsUpdate]
}
