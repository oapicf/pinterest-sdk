package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.ActionType
import org.openapitools.models.AdGroupResponseAllOf
import org.openapitools.models.AdGroupResponseAllOf1
import org.openapitools.models.AdGroupSummaryStatus
import org.openapitools.models.EntityStatus
import org.openapitools.models.PacingDeliveryType
import org.openapitools.models.PlacementGroupType
import org.openapitools.models.TrackingUrls
import scala.collection.immutable.Seq

/**
 * 
 * @param name Ad group name.
 * @param status Ad group/entity status.
 * @param budgetUnderscoreinUnderscoremicroUnderscorecurrency Budget in micro currency. This field is **REQUIRED** for non-CBO (campaign budget optimization) campaigns.  A CBO campaign automatically generates ad group budgets from its campaign budget to maximize campaign outcome. A CBO campaign is limited to 70 or less ad groups.
 * @param bidUnderscoreinUnderscoremicroUnderscorecurrency Bid price in micro currency. This field is **REQUIRED** for the following campaign objective_type/billable_event combinations: AWARENESS/IMPRESSION, CONSIDERATION/CLICKTHROUGH, CATALOG_SALES/CLICKTHROUGH, VIDEO_VIEW/VIDEO_V_50_MRC.
 * @param budgetUnderscoretype Budget type. If DAILY, an ad group's daily spend will not exceed the budget parameter value. If LIFETIME, the end_time parameter is **REQUIRED**, and the ad group spend is spread evenly between the ad group `start_time` and `end_time` range. A CBO campaign automatically generates ad group budgets from its campaign budget to maximize campaign outcome.
 * @param startUnderscoretime Ad group start time. Unix timestamp in seconds. Defaults to current time.
 * @param endUnderscoretime Ad group end time. Unix timestamp in seconds.
 * @param targetingUnderscorespec Ad group targeting specification defining the ad group target audience. For example, '{\"APPTYPE\":[\"iphone\"], \"GENDER\":[\"male\"], \"LOCALE\":[\"en-US\"], \"LOCATION\":[\"501\"], \"AGE_BUCKET\":[\"25-34\"]}'
 * @param lifetimeUnderscorefrequencyUnderscorecap Set a limit to the number of times a promoted pin from this campaign can be impressed by a pinner within the past rolling 30 days. Only available for CPM (cost per mille (1000 impressions))  ad groups. A CPM ad group has an IMPRESSION <a href=\\\"/docs/redoc/#section/Billable-event\\\">billable_event</a> value. This field **REQUIRES** the `end_time` field.
 * @param trackingUnderscoreurls Third-party tracking URLs.<br> JSON object with the format: {\"<a href=\"https://developers.pinterest.com/docs/redoc/#section/Tracking-URL-event\">Tracking event enum</a>\":[URL string array],...}<br> For example: {\"impression\": [\"URL1\", \"URL2\"], \"click\": [\"URL1\", \"URL2\", \"URL3\"]}.<br>Up to three tracking URLs are supported for each event type. Tracking URLs set at the ad group or ad level can override those set at the campaign level. May be null. Pass in an empty object - {} - to remove tracking URLs.<br><br> For more information, see <a href=\"https://help.pinterest.com/en/business/article/third-party-and-dynamic-tracking\" target=\"_blank\">Third-party and dynamic tracking</a>.
 * @param autoUnderscoretargetingUnderscoreenabled Enable auto-targeting for ad group. Also known as <a href=\"https://help.pinterest.com/en/business/article/expanded-targeting\" target=\"_blank\">\"expanded targeting\"</a>.
 * @param placementUnderscoregroup <a href=\\\"/docs/redoc/#section/Placement-group\\\">Placement group</a>.
 * @param pacingUnderscoredeliveryUnderscoretype Pacing delivery type. With ACCELERATED, an ad group budget is spent as fast as possible. With STANDARD, an ad group budget is spent smoothly over a day.
 * @param conversionUnderscorelearningUnderscoremodeUnderscoretype oCPM learn mode
 * @param summaryUnderscorestatus Ad group summary status.
 * @param feedUnderscoreprofileUnderscoreid Feed Profile ID associated to the adgroup.
 * @param campaignUnderscoreid Campaign ID of the ad group.
 * @param billableUnderscoreevent 
 * @param id Ad group ID.
 * @param _type Always \"adgroup\".
 * @param adUnderscoreaccountUnderscoreid Advertiser ID.
 * @param createdUnderscoretime Ad group creation time. Unix timestamp in seconds.
 * @param updatedUnderscoretime Ad group last update time. Unix timestamp in seconds.
 */
case class AdGroupResponse(name: Option[String],
                status: Option[EntityStatus],
                budgetUnderscoreinUnderscoremicroUnderscorecurrency: Option[Int],
                bidUnderscoreinUnderscoremicroUnderscorecurrency: Option[Int],
                budgetUnderscoretype: Option[String],
                startUnderscoretime: Option[Int],
                endUnderscoretime: Option[Int],
                targetingUnderscorespec: Option[Map[String, Seq[String]]],
                lifetimeUnderscorefrequencyUnderscorecap: Option[Int],
                trackingUnderscoreurls: Option[TrackingUrls],
                autoUnderscoretargetingUnderscoreenabled: Option[Boolean],
                placementUnderscoregroup: Option[PlacementGroupType],
                pacingUnderscoredeliveryUnderscoretype: Option[PacingDeliveryType],
                conversionUnderscorelearningUnderscoremodeUnderscoretype: Option[String],
                summaryUnderscorestatus: Option[AdGroupSummaryStatus],
                feedUnderscoreprofileUnderscoreid: Option[String],
                campaignUnderscoreid: Option[String],
                billableUnderscoreevent: Option[ActionType],
                id: Option[String],
                _type: Option[String],
                adUnderscoreaccountUnderscoreid: Option[String],
                createdUnderscoretime: Option[Int],
                updatedUnderscoretime: Option[Int]
                )

object AdGroupResponse {
    /**
     * Creates the codec for converting AdGroupResponse from and to JSON.
     */
    implicit val decoder: Decoder[AdGroupResponse] = deriveDecoder
    implicit val encoder: ObjectEncoder[AdGroupResponse] = deriveEncoder
}
