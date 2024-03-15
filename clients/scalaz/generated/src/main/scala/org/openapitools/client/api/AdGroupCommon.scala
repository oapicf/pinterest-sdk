package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import AdGroupCommon._

case class AdGroupCommon (
  /* Ad group name. */
  name: Option[String],
/* Ad group/entity status. */
  status: Option[EntityStatus],
/* Budget in micro currency. This field is **REQUIRED** for non-CBO (campaign budget optimization) campaigns.  A CBO campaign automatically generates ad group budgets from its campaign budget to maximize campaign outcome. A CBO campaign is limited to 70 or less ad groups. */
  budgetInMicroCurrency: Option[Integer],
/* Bid price in micro currency. This field is **REQUIRED** for the following campaign objective_type/billable_event combinations: AWARENESS/IMPRESSION, CONSIDERATION/CLICKTHROUGH, CATALOG_SALES/CLICKTHROUGH, VIDEO_VIEW/VIDEO_V_50_MRC. */
  bidInMicroCurrency: Option[Integer],
optimizationGoalMetadata: Option[AdGroupCommonOptimizationGoalMetadata],
budgetType: Option[BudgetType],
/* Ad group start time. Unix timestamp in seconds. Defaults to current time. */
  startTime: Option[Integer],
/* Ad group end time. Unix timestamp in seconds. */
  endTime: Option[Integer],
targetingSpec: Option[TargetingSpec],
/* Set a limit to the number of times a promoted pin from this campaign can be impressed by a pinner within the past rolling 30 days. Only available for CPM (cost per mille (1000 impressions))  ad groups. A CPM ad group has an IMPRESSION <a href=\"https://developers.pinterest.com/docs/redoc/#section/Billable-event\">billable_event</a> value. This field **REQUIRES** the `end_time` field. */
  lifetimeFrequencyCap: Option[Integer],
trackingUrls: Option[AdGroupCommonTrackingUrls],
/* Enable auto-targeting for ad group. Also known as <a href=\"https://help.pinterest.com/en/business/article/expanded-targeting\" target=\"_blank\">\"expanded targeting\"</a>. */
  autoTargetingEnabled: Option[Boolean],
/* <a href=\"https://developers.pinterest.com/docs/redoc/#section/Placement-group\">Placement group</a>. */
  placementGroup: Option[PlacementGroupType],
pacingDeliveryType: Option[PacingDeliveryType],
/* Campaign ID of the ad group. */
  campaignId: Option[String],
billableEvent: Option[ActionType],
/* Bid strategy type */
  bidStrategyType: Option[BidStrategyType])

object AdGroupCommon {
  import DateTimeCodecs._
  sealed trait BidStrategyType
  case object AUTOMATICBID extends BidStrategyType
  case object MAXBID extends BidStrategyType
  case object TARGETAVG extends BidStrategyType
  case object `Null` extends BidStrategyType

  object BidStrategyType {
    def toBidStrategyType(s: String): Option[BidStrategyType] = s match {
      case "AUTOMATICBID" => Some(AUTOMATICBID)
      case "MAXBID" => Some(MAXBID)
      case "TARGETAVG" => Some(TARGETAVG)
      case "`Null`" => Some(`Null`)
      case _ => None
    }

    def fromBidStrategyType(x: BidStrategyType): String = x match {
      case AUTOMATICBID => "AUTOMATICBID"
      case MAXBID => "MAXBID"
      case TARGETAVG => "TARGETAVG"
      case `Null` => "`Null`"
    }
  }

  implicit val BidStrategyTypeEnumEncoder: EncodeJson[BidStrategyType] =
    EncodeJson[BidStrategyType](is => StringEncodeJson(BidStrategyType.fromBidStrategyType(is)))

  implicit val BidStrategyTypeEnumDecoder: DecodeJson[BidStrategyType] =
    DecodeJson.optionDecoder[BidStrategyType](n => n.string.flatMap(jStr => BidStrategyType.toBidStrategyType(jStr)), "BidStrategyType failed to de-serialize")

  implicit val AdGroupCommonCodecJson: CodecJson[AdGroupCommon] = CodecJson.derive[AdGroupCommon]
  implicit val AdGroupCommonDecoder: EntityDecoder[AdGroupCommon] = jsonOf[AdGroupCommon]
  implicit val AdGroupCommonEncoder: EntityEncoder[AdGroupCommon] = jsonEncoderOf[AdGroupCommon]
}
