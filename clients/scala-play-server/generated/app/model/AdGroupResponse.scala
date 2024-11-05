package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for AdGroupResponse.
  * @param name Ad group name.
  * @param status Ad group/entity status.
  * @param budgetInMicroCurrency Budget in micro currency. This field is **REQUIRED** for non-CBO (campaign budget optimization) campaigns.  A CBO campaign automatically generates ad group budgets from its campaign budget to maximize campaign outcome. A CBO campaign is limited to 70 or less ad groups.
  * @param bidInMicroCurrency Bid price in micro currency. This field is **REQUIRED** for the following campaign objective_type/billable_event combinations: AWARENESS/IMPRESSION, CONSIDERATION/CLICKTHROUGH, CATALOG_SALES/CLICKTHROUGH, VIDEO_VIEW/VIDEO_V_50_MRC.
  * @param optimizationGoalMetadata Optimization goals for objective-based performance campaigns. **REQUIRED** when campaign's `objective_type` is set to `\"WEB_CONVERSION\"`.
  * @param startTime Ad group start time. Unix timestamp in seconds. Defaults to current time.
  * @param endTime Ad group end time. Unix timestamp in seconds.
  * @param lifetimeFrequencyCap Set a limit to the number of times a promoted pin from this campaign can be impressed by a pinner within the past rolling 30 days. Only available for CPM (cost per mille (1000 impressions))  ad groups. A CPM ad group has an IMPRESSION <a href=\"/docs/redoc/#section/Billable-event\">billable_event</a> value. This field **REQUIRES** the `end_time` field.
  * @param trackingUrls Third-party tracking URLs.<br> JSON object with the format: {\"<a href=\"/docs/redoc/#section/Tracking-URL-event\">Tracking event enum</a>\":[URL string array],...}<br> For example: {\"impression\": [\"URL1\", \"URL2\"], \"click\": [\"URL1\", \"URL2\", \"URL3\"]}.<br>Up to three tracking URLs are supported for each event type. Tracking URLs set at the ad group or ad level can override those set at the campaign level. May be null. Pass in an empty object - {} - to remove tracking URLs.<br><br> For more information, see <a href=\"https://help.pinterest.com/en/business/article/third-party-and-dynamic-tracking\" target=\"_blank\">Third-party and dynamic tracking</a>.
  * @param autoTargetingEnabled Enable auto-targeting for ad group. Also known as <a href=\"https://help.pinterest.com/en/business/article/expanded-targeting\" target=\"_blank\">\"expanded targeting\"</a>.
  * @param placementGroup <a href=\"/docs/redoc/#section/Placement-group\">Placement group</a>.
  * @param campaignId Campaign ID of the ad group.
  * @param bidStrategyType Bid strategy type. For Campaigns with Video Completion objectives, the only supported bid strategy type is AUTOMATIC_BID.
  * @param targetingTemplateIds Targeting template IDs applied to the ad group. We currently only support 1 targeting template per ad group. To use targeting templates, do not set any other targeting fields: targeting_spec, tracking_urls, auto_targeting_enabled, placement_group. To clear all targeting template IDs, set this field to ['0'].
  * @param id Ad group ID.
  * @param adAccountId Advertiser ID.
  * @param createdTime Ad group creation time. Unix timestamp in seconds.
  * @param updatedTime Ad group last update time. Unix timestamp in seconds.
  * @param `type` Always \"adgroup\".
  * @param conversionLearningModeType oCPM learn mode
  * @param summaryStatus Ad group summary status.
  * @param feedProfileId Feed Profile ID associated to the adgroup.
  * @param dcaAssets [DCA] The Dynamic creative assets to use for DCA. Dynamic Creative Assembly (DCA) accepts basic creative assets of an ad (image, video, title, call to action, logo etc). Then it automatically generates optimized ad combinations based on these assets.
  * @param additionalProperties Any additional properties this model may have.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2024-11-05T03:04:47.577040925Z[Etc/UTC]", comments = "Generator version: 7.9.0")
case class AdGroupResponse(
  name: Option[String],
  status: Option[EntityStatus],
  budgetInMicroCurrency: Option[Int],
  bidInMicroCurrency: Option[Int],
  optimizationGoalMetadata: Option[OptimizationGoalMetadata],
  budgetType: Option[BudgetType],
  startTime: Option[Int],
  endTime: Option[Int],
  targetingSpec: Option[TargetingSpec],
  lifetimeFrequencyCap: Option[Int],
  trackingUrls: Option[TrackingUrls],
  autoTargetingEnabled: Option[Boolean],
  placementGroup: Option[PlacementGroupType],
  pacingDeliveryType: Option[PacingDeliveryType],
  campaignId: Option[String],
  billableEvent: Option[ActionType],
  bidStrategyType: Option[AdGroupResponse.BidStrategyType.Value],
  targetingTemplateIds: Option[List[String]],
  id: Option[String],
  adAccountId: Option[String],
  createdTime: Option[Int],
  updatedTime: Option[Int],
  `type`: Option[String],
  conversionLearningModeType: Option[AdGroupResponse.ConversionLearningModeType.Value],
  summaryStatus: Option[AdGroupSummaryStatus],
  feedProfileId: Option[String],
  dcaAssets: Option[OasAnyTypeNotMapped]
  additionalProperties: 
)

object AdGroupResponse {
  implicit lazy val adGroupResponseJsonFormat: Format[AdGroupResponse] = {
    val realJsonFormat = Json.format[AdGroupResponse]
    val declaredPropNames = Set("name", "status", "budgetInMicroCurrency", "bidInMicroCurrency", "optimizationGoalMetadata", "budgetType", "startTime", "endTime", "targetingSpec", "lifetimeFrequencyCap", "trackingUrls", "autoTargetingEnabled", "placementGroup", "pacingDeliveryType", "campaignId", "billableEvent", "bidStrategyType", "targetingTemplateIds", "id", "adAccountId", "createdTime", "updatedTime", "`type`", "conversionLearningModeType", "summaryStatus", "feedProfileId", "dcaAssets")
    
    Format(
      Reads {
        case JsObject(xs) =>
          val declaredProps = xs.filterKeys(declaredPropNames)
          val additionalProps = JsObject(xs -- declaredPropNames)
          val restructuredProps = declaredProps + ("additionalProperties" -> additionalProps)
          val newObj = JsObject(restructuredProps)
          realJsonFormat.reads(newObj)
        case _ =>
          JsError("error.expected.jsobject")
      },
      Writes { adGroupResponse =>
        val jsObj = realJsonFormat.writes(adGroupResponse)
        val additionalProps = jsObj.value("additionalProperties").as[JsObject]
        val declaredProps = jsObj - "additionalProperties"
        val newObj = declaredProps ++ additionalProps
        newObj
      }
    )
  }

  // noinspection TypeAnnotation
  object BidStrategyType extends Enumeration {
    val AUTOMATICBID = Value("AUTOMATIC_BID")
    val MAXBID = Value("MAX_BID")
    val TARGETAVG = Value("TARGET_AVG")

    type BidStrategyType = Value
    implicit lazy val BidStrategyTypeJsonFormat: Format[Value] = Format(Reads.enumNameReads(this), Writes.enumNameWrites[this.type])
  }

  // noinspection TypeAnnotation
  object ConversionLearningModeType extends Enumeration {
    val NOTACTIVE = Value("NOT_ACTIVE")
    val ACTIVE = Value("ACTIVE")

    type ConversionLearningModeType = Value
    implicit lazy val ConversionLearningModeTypeJsonFormat: Format[Value] = Format(Reads.enumNameReads(this), Writes.enumNameWrites[this.type])
  }
}

