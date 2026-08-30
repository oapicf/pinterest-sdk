package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for AdGroupUpdate.
  * @param adAccountId Advertiser ID.
  * @param bidInMicroCurrency Bid price in micro currency. This field is **REQUIRED** for the following campaign objective_type/billable_event combinations: AWARENESS/IMPRESSION, CONSIDERATION/CLICKTHROUGH, CATALOG_SALES/CLICKTHROUGH, VIDEO_VIEW/VIDEO_V_50_MRC.
  * @param budgetInMicroCurrency Budget in micro currency. This field is **REQUIRED** for non-CBO (campaign budget optimization) campaigns.  A CBO campaign automatically generates ad group budgets from its campaign budget to maximize campaign outcome. A CBO campaign is limited to 70 or less ad groups.
  * @param campaignId Campaign ID of the ad group.
  * @param conversionLearningModeType oCPM learn mode
  * @param createdTime Ad group creation time. Unix timestamp in seconds.
  * @param customerSegmentId Customer segment ID applied to the ad group. We currently only support 1 customer segment per ad group. To use customer segments, do not set the `targeting_template_ids` field as well as the `AUDIENCE_INCLUDE` field of the `targeting_spec`. To clear the customer segment ID, set this field to '0'.
  * @param dcaAssets [DCA] The Dynamic creative assets to use for DCA. Dynamic Creative Assembly (DCA) accepts basic creative assets of an ad (image, video, title, call to action, logo etc). Then it automatically generates optimized ad combinations based on these assets.
  * @param endTime Timestamp in Unix format for scheduling when ads in the ad group stop appearing. If not specified, ads run indefinitely unless you update the ad group by changing their status to `paused`. Cannot occur after `end_time` for parent campaign (if specified). Learn about [scheduling ads](https://help.pinterest.com/en/business/article/ads-manager-schedule-ads).  For certain organizations ([Closed beta](https://help.pinterest.com/en/business/article/beta-features)): Supported for campaigns with Campaign Budget Optimization (CBO).  For all organizations: Supported for campaigns without CBO.
  * @param feedProfileId Feed Profile ID associated to the adgroup.
  * @param id Ad group ID.
  * @param isCreativeOptimization Enable creative optimization for the ad group, default value is FALSE. When enabled, you allow Pinterest to automatically turn your product Pins into ads in different formats (collections and shopping) and deliver those ads to users at scale.
  * @param isLocalInventory Indicates whether the ad group should use the local inventory.
  * @param lifetimeFrequencyCap Set a limit to the number of times a promoted pin from this campaign can be impressed by a pinner within the past rolling 30 days. Only available for CPM (cost per mille (1000 impressions))  ad groups. A CPM ad group has an IMPRESSION [billable_event](https://help.pinterest.com/en/business/article/billable-events) value. This field **REQUIRES** the `end_time` field.
  * @param localInventoryRadiusInMiles The targeting radius of the local inventory ads in miles.
  * @param name Ad group name.
  * @param optimizationGoalMetadata Optimization goals for objective-based performance campaigns. **REQUIRED** when campaign's `objective_type` is set to `\"WEB_CONVERSION\"`.
  * @param performancePlusCampaignSettings Pinterest Performance+ campaign settings.
  * @param placementGroup [Placement group](https://help.pinterest.com/en/business/article/placement-groups).
  * @param placementTrafficType A targeting option that enables advertisers to choose whether to run ads in fullscreen feed, two column feed, or both
  * @param promotionApplicationLevel Specify if the promotion is applied at ad group or item level
  * @param promotionId Promotion ID. To clear this field, set to null.
  * @param promotionIds Promotion IDs list. To clear this field, set to an empty array [].
  * @param startTime Timestamp in Unix format for scheduling when ads in the ad group start to appear. If not specified, ads appear during parent campaign's `start_time`. Cannot precede `start_time` for parent campaign (if specified). Learn about [scheduling ads](/docs/api-features/managing-ads/#step-2-create-an-ad-group). For certain organizations ([Closed beta](/docs/getting-started/using-beta-and-restricted-features/)): Supported for campaigns with Campaign Budget Optimization (CBO). For all organizations: Supported for campaigns without CBO.
  * @param status Ad group/entity status.
  * @param targetingTemplateIds Targeting template IDs applied to the ad group. We currently only support 1 targeting template per ad group. To use targeting templates, do not set any other targeting fields: targeting_spec, tracking_urls, auto_targeting_enabled, placement_group. To clear all targeting template IDs, set this field to ['0'].
  * @param `type` Always \"adgroup\".
  * @param updatedTime Ad group last update time. Unix timestamp in seconds.
  * @param autoTargetingEnabled Enable auto-targeting for ad group. Default value is True. Also known as [\"Performance+ targeting\"](https://help.pinterest.com/en/business/article/performance-plus-targeting).
  * @param bidMultiplier [Open beta](https://help.pinterest.com/en/business/article/beta-features) Bid multiplier for ad group. This value is a double between 0.1 and 10.0. Enter 0 to remove the bid multiplier. - Not currently supported for [Performance+ campaigns](https://help.pinterest.com/en/business/article/performance-plus-campaigns).
  * @param additionalProperties Any additional properties this model may have.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-08-30T10:17:18.040485445Z[Etc/UTC]", comments = "Generator version: 7.24.0")
case class AdGroupUpdate(
  adAccountId: Option[String],
  bidInMicroCurrency: Option[Int],
  bidStrategyType: Option[BidStrategyType],
  billableEvent: ActionType,
  budgetInMicroCurrency: Option[Int],
  campaignId: String,
  conversionLearningModeType: ConversionLearningModeType,
  createdTime: Int,
  customerSegmentId: Option[String],
  dcaAssets: Option[OasAnyTypeNotMapped],
  endTime: Option[Int],
  extFeatures: Option[AdgroupTrackingFeatures],
  feedProfileId: Option[String],
  id: String,
  isCreativeOptimization: Option[Boolean],
  isLocalInventory: Option[Boolean],
  lifetimeFrequencyCap: Option[Int],
  localInventoryRadiusInMiles: Option[BigDecimal],
  name: String,
  optimizationGoalMetadata: Option[NullableOptimizationGoalMetadata],
  performancePlusCampaignSettings: Option[PerformancePlusCampaignSettings],
  placementGroup: Option[PlacementGroupType],
  placementTrafficType: Option[PlacementTrafficType],
  promotionApplicationLevel: Option[PromotionApplicationLevel],
  promotionId: Option[String],
  promotionIds: Option[List[String]],
  startTime: Option[Int],
  status: Option[EntityStatus],
  summaryStatus: SummaryStatus,
  targetingSpec: Option[TargetingSpecOptimal],
  targetingTemplateIds: Option[List[String]],
  trackingUrls: Option[AdGroupTrackingURLs],
  `type`: String,
  updatedTime: Int,
  autoTargetingEnabled: Option[Boolean],
  bidMultiplier: Option[BigDecimal],
  budgetType: Option[BudgetType],
  pacingDeliveryType: Option[PacingDeliveryType]
  additionalProperties: 
)

object AdGroupUpdate {
  implicit lazy val adGroupUpdateJsonFormat: Format[AdGroupUpdate] = {
    val realJsonFormat = Json.format[AdGroupUpdate]
    val declaredPropNames = Set("adAccountId", "bidInMicroCurrency", "bidStrategyType", "billableEvent", "budgetInMicroCurrency", "campaignId", "conversionLearningModeType", "createdTime", "customerSegmentId", "dcaAssets", "endTime", "extFeatures", "feedProfileId", "id", "isCreativeOptimization", "isLocalInventory", "lifetimeFrequencyCap", "localInventoryRadiusInMiles", "name", "optimizationGoalMetadata", "performancePlusCampaignSettings", "placementGroup", "placementTrafficType", "promotionApplicationLevel", "promotionId", "promotionIds", "startTime", "status", "summaryStatus", "targetingSpec", "targetingTemplateIds", "trackingUrls", "`type`", "updatedTime", "autoTargetingEnabled", "bidMultiplier", "budgetType", "pacingDeliveryType")
    
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
      Writes { adGroupUpdate =>
        val jsObj = realJsonFormat.writes(adGroupUpdate)
        val additionalProps = jsObj.value("additionalProperties").as[JsObject]
        val declaredProps = jsObj - "additionalProperties"
        val newObj = declaredProps ++ additionalProps
        newObj
      }
    )
  }
}

