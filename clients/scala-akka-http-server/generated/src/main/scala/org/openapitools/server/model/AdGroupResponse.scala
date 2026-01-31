package org.openapitools.server.model


/**
 * @param autoTargetingEnabled Enable auto-targeting for ad group. Default value is True. Also known as <a href=\"https://help.pinterest.com/en/business/article/performance-plus-targeting\" target=\"_blank\">\"Pinterest Performance+ targeting\"</a>. for example: ''true''
 * @param bidInMicroCurrency Bid price in micro currency. This field is **REQUIRED** for the following campaign objective_type/billable_event combinations: AWARENESS/IMPRESSION, CONSIDERATION/CLICKTHROUGH, CATALOG_SALES/CLICKTHROUGH. for example: ''5000000''
 * @param bidStrategyType Bid strategy type. For Campaigns with Video Completion objectives, the only supported bid strategy type is AUTOMATIC_BID, also known as \"Pinterest Performance+ bidding\". for example: ''MAX_BID''
 * @param billableEvent  for example: ''null''
 * @param budgetInMicroCurrency Budget in micro currency. This field is **REQUIRED** for non-CBO (campaign budget optimization) campaigns.  A CBO campaign automatically generates ad group budgets from its campaign budget to maximize campaign outcome. A CBO campaign is limited to 70 or less ad groups. for example: ''5000000''
 * @param budgetType  for example: ''null''
 * @param campaignId Campaign ID of the ad group. for example: ''626736533506''
 * @param endTime Timestamp in Unix format for scheduling when ads in the ad group stop appearing. If not specified, ads run indefinitely unless you update the ad group by changing their status to `paused`. Cannot occur after `end_time` for parent campaign (if specified). Learn about <a href=\"/docs/api-features/managing-ads/#step-2-create-an-ad-group\" target=\"blank\">scheduling ads</a>. For certain organizations (<a href=\"/docs/getting-started/using-beta-and-restricted-features/\" target=\"blank\" target=\"blank\">Closed beta</a>): Supported for campaigns with Campaign Budget Optimization (CBO). For all organizations: Supported for campaigns without CBO. for example: ''5705424000''
 * @param isCreativeOptimization Enable creative optimization for the ad group, default value is FALSE. When enabled, you allow Pinterest to automatically turn your product Pins into ads in different formats (collections and shopping) and deliver those ads to users at scale. for example: ''true''
 * @param lifetimeFrequencyCap Set a limit to the number of times a promoted pin from this campaign can be impressed by a pinner within the past rolling 30 days. Only available for CPM (cost per mille (1000 impressions))  ad groups. A CPM ad group has an IMPRESSION <a href=\"/docs/redoc/#section/Billable-event\">billable_event</a> value. This field **REQUIRES** the `end_time` field. for example: ''100''
 * @param name Ad group name. for example: ''Ad Group For Pin: 687195905986''
 * @param optimizationGoalMetadata Optimization goals for objective-based performance campaigns. **REQUIRED** when campaign's `objective_type` is set to `\"WEB_CONVERSION\"`. for example: ''null''
 * @param pacingDeliveryType  for example: ''null''
 * @param placementGroup <a href=\"/docs/redoc/#section/Placement-group\">Placement group</a>. for example: ''null''
 * @param promotionApplicationLevel Specify if the promotion is applied at ad group or item level for example: ''ITEM''
 * @param promotionId Promotion ID. To clear this field, set to null. for example: ''7834020347906''
 * @param startTime Timestamp in Unix format for scheduling when ads in the ad group start to appear. If not specified, ads appear during parent campaign's `start_time`. Cannot precede `start_time` for parent campaign (if specified). Learn about <a href=\"/docs/api-features/managing-ads/#step-2-create-an-ad-group\" target=\"blank\">scheduling ads</a>. For certain organizations (<a href=\"/docs/getting-started/using-beta-and-restricted-features/\" target=\"blank\" target=\"blank\">Closed beta</a>): Supported for campaigns with Campaign Budget Optimization (CBO). For all organizations: Supported for campaigns without CBO. for example: ''5686848000''
 * @param status Ad group/entity status. for example: ''null''
 * @param targetingSpec  for example: ''null''
 * @param targetingTemplateIds Targeting template IDs applied to the ad group. We currently only support 1 targeting template per ad group. To use targeting templates, do not set any other targeting fields: targeting_spec, tracking_urls, auto_targeting_enabled, placement_group. To clear all targeting template IDs, set this field to ['0']. for example: ''null''
 * @param trackingUrls Third-party tracking URLs.<br> JSON object with the format: {\"<a href=\"/docs/redoc/#section/Tracking-URL-event\">Tracking event enum</a>\":[URL string array],...}<br> For example: {\"impression\": [\"URL1\", \"URL2\"], \"click\": [\"URL1\", \"URL2\", \"URL3\"]}.<br>Up to three tracking URLs are supported for each event type. Tracking URLs set at the ad group or ad level can override those set at the campaign level. May be null. Pass in an empty object - {} - to remove tracking URLs.<br><br> For more information, see <a href=\"https://help.pinterest.com/en/business/article/third-party-and-dynamic-tracking\" target=\"_blank\">Third-party and dynamic tracking</a>. for example: ''null''
 * @param adAccountId Advertiser ID. for example: ''549755885175''
 * @param bidMultiplier <a href=\"/docs/getting-started/using-beta-and-restricted-features/\" target=\"blank>Open beta</a> Bid multiplier for ad group. This value is a double between 0.1 and 10.0. Enter 0 to remove the bid multiplier. - Not currently supported for <a href=\"/docs/api-features/pinterest-performance-plus-setup/\" target=\"blank\">Pinterest Performance+ campaigns</a>. for example: ''1''
 * @param conversionLearningModeType oCPM learn mode for example: ''ACTIVE''
 * @param createdTime Ad group creation time. Unix timestamp in seconds. for example: ''1476477189''
 * @param dcaAssets [DCA] The Dynamic creative assets to use for DCA. Dynamic Creative Assembly (DCA) accepts basic creative assets of an ad (image, video, title, call to action, logo etc). Then it automatically generates optimized ad combinations based on these assets. for example: ''null''
 * @param feedProfileId Feed Profile ID associated to the adgroup. for example: ''626736533506''
 * @param id Ad group ID. for example: ''2680060704746''
 * @param summaryStatus Ad group summary status. for example: ''null''
 * @param `type` Always \"adgroup\". for example: ''null''
 * @param updatedTime Ad group last update time. Unix timestamp in seconds. for example: ''1476477189''
*/
final case class AdGroupResponse (
  autoTargetingEnabled: Option[Boolean] = None,
  bidInMicroCurrency: Option[Int] = None,
  bidStrategyType: Option[String] = None,
  billableEvent: Option[ActionType] = None,
  budgetInMicroCurrency: Option[Int] = None,
  budgetType: Option[BudgetType] = None,
  campaignId: Option[String] = None,
  endTime: Option[Int] = None,
  isCreativeOptimization: Option[Boolean] = None,
  lifetimeFrequencyCap: Option[Int] = None,
  name: Option[String] = None,
  optimizationGoalMetadata: Option[OptimizationGoalMetadata] = None,
  pacingDeliveryType: Option[PacingDeliveryType] = None,
  placementGroup: Option[PlacementGroupType] = None,
  promotionApplicationLevel: Option[String] = None,
  promotionId: Option[String] = None,
  startTime: Option[Int] = None,
  status: Option[EntityStatus] = None,
  targetingSpec: Option[TargetingSpec] = None,
  targetingTemplateIds: Option[Seq[String]] = None,
  trackingUrls: Option[TrackingUrls] = None,
  adAccountId: Option[String] = None,
  bidMultiplier: Option[Double] = None,
  conversionLearningModeType: Option[String] = None,
  createdTime: Option[Int] = None,
  dcaAssets: Option[AnyType] = None,
  feedProfileId: Option[String] = None,
  id: Option[String] = None,
  summaryStatus: Option[AdGroupSummaryStatus] = None,
  `type`: Option[String] = None,
  updatedTime: Option[Int] = None
)

