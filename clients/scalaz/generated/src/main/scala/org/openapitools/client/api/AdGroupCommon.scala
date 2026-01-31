package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import AdGroupCommon._

case class AdGroupCommon (
  /* Enable auto-targeting for ad group. Default value is True. Also known as <a href=\"https://help.pinterest.com/en/business/article/performance-plus-targeting\" target=\"_blank\">\"Pinterest Performance+ targeting\"</a>. */
  autoTargetingEnabled: Option[Boolean],
/* Bid price in micro currency. This field is **REQUIRED** for the following campaign objective_type/billable_event combinations: AWARENESS/IMPRESSION, CONSIDERATION/CLICKTHROUGH, CATALOG_SALES/CLICKTHROUGH. */
  bidInMicroCurrency: Option[Integer],
/* Bid strategy type. For Campaigns with Video Completion objectives, the only supported bid strategy type is AUTOMATIC_BID, also known as \"Pinterest Performance+ bidding\". */
  bidStrategyType: Option[BidStrategyType],
billableEvent: Option[ActionType],
/* Budget in micro currency. This field is **REQUIRED** for non-CBO (campaign budget optimization) campaigns.  A CBO campaign automatically generates ad group budgets from its campaign budget to maximize campaign outcome. A CBO campaign is limited to 70 or less ad groups. */
  budgetInMicroCurrency: Option[Integer],
budgetType: Option[BudgetType],
/* Campaign ID of the ad group. */
  campaignId: Option[String],
/* Timestamp in Unix format for scheduling when ads in the ad group stop appearing. If not specified, ads run indefinitely unless you update the ad group by changing their status to `paused`. Cannot occur after `end_time` for parent campaign (if specified). Learn about <a href=\"/docs/api-features/managing-ads/#step-2-create-an-ad-group\" target=\"blank\">scheduling ads</a>. For certain organizations (<a href=\"/docs/getting-started/using-beta-and-restricted-features/\" target=\"blank\" target=\"blank\">Closed beta</a>): Supported for campaigns with Campaign Budget Optimization (CBO). For all organizations: Supported for campaigns without CBO. */
  endTime: Option[Integer],
/* Enable creative optimization for the ad group, default value is FALSE. When enabled, you allow Pinterest to automatically turn your product Pins into ads in different formats (collections and shopping) and deliver those ads to users at scale. */
  isCreativeOptimization: Option[Boolean],
/* Set a limit to the number of times a promoted pin from this campaign can be impressed by a pinner within the past rolling 30 days. Only available for CPM (cost per mille (1000 impressions))  ad groups. A CPM ad group has an IMPRESSION <a href=\"/docs/redoc/#section/Billable-event\">billable_event</a> value. This field **REQUIRES** the `end_time` field. */
  lifetimeFrequencyCap: Option[Integer],
/* Ad group name. */
  name: Option[String],
/* Optimization goals for objective-based performance campaigns. **REQUIRED** when campaign's `objective_type` is set to `\"WEB_CONVERSION\"`. */
  optimizationGoalMetadata: Option[OptimizationGoalMetadata],
pacingDeliveryType: Option[PacingDeliveryType],
/* <a href=\"/docs/redoc/#section/Placement-group\">Placement group</a>. */
  placementGroup: Option[PlacementGroupType],
/* Specify if the promotion is applied at ad group or item level */
  promotionApplicationLevel: Option[PromotionApplicationLevel],
/* Promotion ID. To clear this field, set to null. */
  promotionId: Option[String],
/* Timestamp in Unix format for scheduling when ads in the ad group start to appear. If not specified, ads appear during parent campaign's `start_time`. Cannot precede `start_time` for parent campaign (if specified). Learn about <a href=\"/docs/api-features/managing-ads/#step-2-create-an-ad-group\" target=\"blank\">scheduling ads</a>. For certain organizations (<a href=\"/docs/getting-started/using-beta-and-restricted-features/\" target=\"blank\" target=\"blank\">Closed beta</a>): Supported for campaigns with Campaign Budget Optimization (CBO). For all organizations: Supported for campaigns without CBO. */
  startTime: Option[Integer],
/* Ad group/entity status. */
  status: Option[EntityStatus],
targetingSpec: Option[TargetingSpec],
/* Targeting template IDs applied to the ad group. We currently only support 1 targeting template per ad group. To use targeting templates, do not set any other targeting fields: targeting_spec, tracking_urls, auto_targeting_enabled, placement_group. To clear all targeting template IDs, set this field to ['0']. */
  targetingTemplateIds: Option[List[String]],
/* Third-party tracking URLs.<br> JSON object with the format: {\"<a href=\"/docs/redoc/#section/Tracking-URL-event\">Tracking event enum</a>\":[URL string array],...}<br> For example: {\"impression\": [\"URL1\", \"URL2\"], \"click\": [\"URL1\", \"URL2\", \"URL3\"]}.<br>Up to three tracking URLs are supported for each event type. Tracking URLs set at the ad group or ad level can override those set at the campaign level. May be null. Pass in an empty object - {} - to remove tracking URLs.<br><br> For more information, see <a href=\"https://help.pinterest.com/en/business/article/third-party-and-dynamic-tracking\" target=\"_blank\">Third-party and dynamic tracking</a>. */
  trackingUrls: Option[TrackingUrls])

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
  sealed trait PromotionApplicationLevel
  case object NONE extends PromotionApplicationLevel
  case object ITEM extends PromotionApplicationLevel
  case object ADGROUP extends PromotionApplicationLevel

  object PromotionApplicationLevel {
    def toPromotionApplicationLevel(s: String): Option[PromotionApplicationLevel] = s match {
      case "NONE" => Some(NONE)
      case "ITEM" => Some(ITEM)
      case "ADGROUP" => Some(ADGROUP)
      case _ => None
    }

    def fromPromotionApplicationLevel(x: PromotionApplicationLevel): String = x match {
      case NONE => "NONE"
      case ITEM => "ITEM"
      case ADGROUP => "ADGROUP"
    }
  }

  implicit val PromotionApplicationLevelEnumEncoder: EncodeJson[PromotionApplicationLevel] =
    EncodeJson[PromotionApplicationLevel](is => StringEncodeJson(PromotionApplicationLevel.fromPromotionApplicationLevel(is)))

  implicit val PromotionApplicationLevelEnumDecoder: DecodeJson[PromotionApplicationLevel] =
    DecodeJson.optionDecoder[PromotionApplicationLevel](n => n.string.flatMap(jStr => PromotionApplicationLevel.toPromotionApplicationLevel(jStr)), "PromotionApplicationLevel failed to de-serialize")

  implicit val AdGroupCommonCodecJson: CodecJson[AdGroupCommon] = CodecJson.derive[AdGroupCommon]
  implicit val AdGroupCommonDecoder: EntityDecoder[AdGroupCommon] = jsonOf[AdGroupCommon]
  implicit val AdGroupCommonEncoder: EntityEncoder[AdGroupCommon] = jsonEncoderOf[AdGroupCommon]
}
