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
/* Optimization goals for objective-based performance campaigns. **REQUIRED** when campaign's `objective_type` is set to `\"WEB_CONVERSION\"`. */
  optimizationGoalMetadata: Option[OptimizationGoalMetadata],
budgetType: Option[BudgetType],
/* Ad group start time. Unix timestamp in seconds. Defaults to current time. */
  startTime: Option[Integer],
/* Ad group end time. Unix timestamp in seconds. */
  endTime: Option[Integer],
targetingSpec: Option[TargetingSpec],
/* Set a limit to the number of times a promoted pin from this campaign can be impressed by a pinner within the past rolling 30 days. Only available for CPM (cost per mille (1000 impressions))  ad groups. A CPM ad group has an IMPRESSION <a href=\"/docs/redoc/#section/Billable-event\">billable_event</a> value. This field **REQUIRES** the `end_time` field. */
  lifetimeFrequencyCap: Option[Integer],
/* Third-party tracking URLs.<br> JSON object with the format: {\"<a href=\"/docs/redoc/#section/Tracking-URL-event\">Tracking event enum</a>\":[URL string array],...}<br> For example: {\"impression\": [\"URL1\", \"URL2\"], \"click\": [\"URL1\", \"URL2\", \"URL3\"]}.<br>Up to three tracking URLs are supported for each event type. Tracking URLs set at the ad group or ad level can override those set at the campaign level. May be null. Pass in an empty object - {} - to remove tracking URLs.<br><br> For more information, see <a href=\"https://help.pinterest.com/en/business/article/third-party-and-dynamic-tracking\" target=\"_blank\">Third-party and dynamic tracking</a>. */
  trackingUrls: Option[TrackingUrls],
/* Enable auto-targeting for ad group. Also known as <a href=\"https://help.pinterest.com/en/business/article/expanded-targeting\" target=\"_blank\">\"expanded targeting\"</a>. */
  autoTargetingEnabled: Option[Boolean],
/* <a href=\"/docs/redoc/#section/Placement-group\">Placement group</a>. */
  placementGroup: Option[PlacementGroupType],
pacingDeliveryType: Option[PacingDeliveryType],
/* Campaign ID of the ad group. */
  campaignId: Option[String],
billableEvent: Option[ActionType],
/* Bid strategy type. For Campaigns with Video Completion objectives, the only supported bid strategy type is AUTOMATIC_BID. */
  bidStrategyType: Option[BidStrategyType],
/* Targeting template IDs applied to the ad group. We currently only support 1 targeting template per ad group. To use targeting templates, do not set any other targeting fields: targeting_spec, tracking_urls, auto_targeting_enabled, placement_group. To clear all targeting template IDs, set this field to ['0']. */
  targetingTemplateIds: Option[List[String]])

object AdGroupCommon {
  import DateTimeCodecs._
  sealed trait BidStrategyType
  case object AUTOMATICBID extends BidStrategyType
  case object MAXBID extends BidStrategyType
  case object TARGETAVG extends BidStrategyType

  object BidStrategyType {
    def toBidStrategyType(s: String): Option[BidStrategyType] = s match {
      case "AUTOMATICBID" => Some(AUTOMATICBID)
      case "MAXBID" => Some(MAXBID)
      case "TARGETAVG" => Some(TARGETAVG)
      case _ => None
    }

    def fromBidStrategyType(x: BidStrategyType): String = x match {
      case AUTOMATICBID => "AUTOMATICBID"
      case MAXBID => "MAXBID"
      case TARGETAVG => "TARGETAVG"
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
