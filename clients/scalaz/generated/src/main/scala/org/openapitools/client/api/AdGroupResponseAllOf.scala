package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import AdGroupResponseAllOf._

case class AdGroupResponseAllOf (
  /* Ad group name. */
  name: Option[String],
/* Ad group/entity status. */
  status: Option[EntityStatus],
/* Budget in micro currency. This field is **REQUIRED** for non-CBO (campaign budget optimization) campaigns.  A CBO campaign automatically generates ad group budgets from its campaign budget to maximize campaign outcome. A CBO campaign is limited to 70 or less ad groups. */
  budgetInMicroCurrency: Option[Integer],
/* Bid price in micro currency. This field is **REQUIRED** for the following campaign objective_type/billable_event combinations: AWARENESS/IMPRESSION, CONSIDERATION/CLICKTHROUGH, CATALOG_SALES/CLICKTHROUGH, VIDEO_VIEW/VIDEO_V_50_MRC. */
  bidInMicroCurrency: Option[Integer],
/* Budget type. If DAILY, an ad group's daily spend will not exceed the budget parameter value. If LIFETIME, the end_time parameter is **REQUIRED**, and the ad group spend is spread evenly between the ad group `start_time` and `end_time` range. A CBO campaign automatically generates ad group budgets from its campaign budget to maximize campaign outcome. */
  budgetType: Option[BudgetType],
/* Ad group start time. Unix timestamp in seconds. Defaults to current time. */
  startTime: Option[Integer],
/* Ad group end time. Unix timestamp in seconds. */
  endTime: Option[Integer],
/* Ad group targeting specification defining the ad group target audience. For example, '{\"APPTYPE\":[\"iphone\"], \"GENDER\":[\"male\"], \"LOCALE\":[\"en-US\"], \"LOCATION\":[\"501\"], \"AGE_BUCKET\":[\"25-34\"]}' */
  targetingSpec: Option[Map[String, List[String]]],
/* Set a limit to the number of times a promoted pin from this campaign can be impressed by a pinner within the past rolling 30 days. Only available for CPM (cost per mille (1000 impressions))  ad groups. A CPM ad group has an IMPRESSION <a href=\\\"/docs/redoc/#section/Billable-event\\\">billable_event</a> value. This field **REQUIRES** the `end_time` field. */
  lifetimeFrequencyCap: Option[Integer],
/* Third-party tracking URLs.<br> JSON object with the format: {\"<a href=\"https://developers.pinterest.com/docs/redoc/#section/Tracking-URL-event\">Tracking event enum</a>\":[URL string array],...}<br> For example: {\"impression\": [\"URL1\", \"URL2\"], \"click\": [\"URL1\", \"URL2\", \"URL3\"]}.<br>Up to three tracking URLs are supported for each event type. Tracking URLs set at the ad group or ad level can override those set at the campaign level. May be null. Pass in an empty object - {} - to remove tracking URLs.<br><br> For more information, see <a href=\"https://help.pinterest.com/en/business/article/third-party-and-dynamic-tracking\" target=\"_blank\">Third-party and dynamic tracking</a>. */
  trackingUrls: Option[TrackingUrls],
/* Enable auto-targeting for ad group. Also known as <a href=\"https://help.pinterest.com/en/business/article/expanded-targeting\" target=\"_blank\">\"expanded targeting\"</a>. */
  autoTargetingEnabled: Option[Boolean],
/* <a href=\\\"/docs/redoc/#section/Placement-group\\\">Placement group</a>. */
  placementGroup: Option[PlacementGroupType],
/* Pacing delivery type. With ACCELERATED, an ad group budget is spent as fast as possible. With STANDARD, an ad group budget is spent smoothly over a day. */
  pacingDeliveryType: Option[PacingDeliveryType],
/* oCPM learn mode */
  conversionLearningModeType: Option[ConversionLearningModeType],
/* Ad group summary status. */
  summaryStatus: Option[AdGroupSummaryStatus],
/* Feed Profile ID associated to the adgroup. */
  feedProfileId: Option[String])

object AdGroupResponseAllOf {
  import DateTimeCodecs._
  sealed trait BudgetType
  case object DAILY extends BudgetType
  case object LIFETIME extends BudgetType
  case object CBOADGROUP extends BudgetType

  object BudgetType {
    def toBudgetType(s: String): Option[BudgetType] = s match {
      case "DAILY" => Some(DAILY)
      case "LIFETIME" => Some(LIFETIME)
      case "CBOADGROUP" => Some(CBOADGROUP)
      case _ => None
    }

    def fromBudgetType(x: BudgetType): String = x match {
      case DAILY => "DAILY"
      case LIFETIME => "LIFETIME"
      case CBOADGROUP => "CBOADGROUP"
    }
  }

  implicit val BudgetTypeEnumEncoder: EncodeJson[BudgetType] =
    EncodeJson[BudgetType](is => StringEncodeJson(BudgetType.fromBudgetType(is)))

  implicit val BudgetTypeEnumDecoder: DecodeJson[BudgetType] =
    DecodeJson.optionDecoder[BudgetType](n => n.string.flatMap(jStr => BudgetType.toBudgetType(jStr)), "BudgetType failed to de-serialize")
  sealed trait ConversionLearningModeType
  case object NOTACTIVE extends ConversionLearningModeType
  case object ACTIVE extends ConversionLearningModeType
  case object `Null` extends ConversionLearningModeType

  object ConversionLearningModeType {
    def toConversionLearningModeType(s: String): Option[ConversionLearningModeType] = s match {
      case "NOTACTIVE" => Some(NOTACTIVE)
      case "ACTIVE" => Some(ACTIVE)
      case "`Null`" => Some(`Null`)
      case _ => None
    }

    def fromConversionLearningModeType(x: ConversionLearningModeType): String = x match {
      case NOTACTIVE => "NOTACTIVE"
      case ACTIVE => "ACTIVE"
      case `Null` => "`Null`"
    }
  }

  implicit val ConversionLearningModeTypeEnumEncoder: EncodeJson[ConversionLearningModeType] =
    EncodeJson[ConversionLearningModeType](is => StringEncodeJson(ConversionLearningModeType.fromConversionLearningModeType(is)))

  implicit val ConversionLearningModeTypeEnumDecoder: DecodeJson[ConversionLearningModeType] =
    DecodeJson.optionDecoder[ConversionLearningModeType](n => n.string.flatMap(jStr => ConversionLearningModeType.toConversionLearningModeType(jStr)), "ConversionLearningModeType failed to de-serialize")

  implicit val AdGroupResponseAllOfCodecJson: CodecJson[AdGroupResponseAllOf] = CodecJson.derive[AdGroupResponseAllOf]
  implicit val AdGroupResponseAllOfDecoder: EntityDecoder[AdGroupResponseAllOf] = jsonOf[AdGroupResponseAllOf]
  implicit val AdGroupResponseAllOfEncoder: EntityEncoder[AdGroupResponseAllOf] = jsonEncoderOf[AdGroupResponseAllOf]
}
