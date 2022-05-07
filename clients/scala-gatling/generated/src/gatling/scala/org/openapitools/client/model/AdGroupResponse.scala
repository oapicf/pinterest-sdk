
package org.openapitools.client.model


case class AdGroupResponse (
    /* Ad group name. */
    _name: Option[String],
    /* Ad group/entity status. */
    _status: Option[EntityStatus],
    /* Budget in micro currency. This field is **REQUIRED** for non-CBO (campaign budget optimization) campaigns.  A CBO campaign automatically generates ad group budgets from its campaign budget to maximize campaign outcome. A CBO campaign is limited to 70 or less ad groups. */
    _budgetInMicroCurrency: Option[Integer],
    /* Bid price in micro currency. This field is **REQUIRED** for the following campaign objective_type/billable_event combinations: AWARENESS/IMPRESSION, CONSIDERATION/CLICKTHROUGH, CATALOG_SALES/CLICKTHROUGH, VIDEO_VIEW/VIDEO_V_50_MRC. */
    _bidInMicroCurrency: Option[Integer],
    /* Budget type. If DAILY, an ad group's daily spend will not exceed the budget parameter value. If LIFETIME, the end_time parameter is **REQUIRED**, and the ad group spend is spread evenly between the ad group `start_time` and `end_time` range. A CBO campaign automatically generates ad group budgets from its campaign budget to maximize campaign outcome. */
    _budgetType: Option[String],
    /* Ad group start time. Unix timestamp in seconds. Defaults to current time. */
    _startTime: Option[Integer],
    /* Ad group end time. Unix timestamp in seconds. */
    _endTime: Option[Integer],
    /* Ad group targeting specification defining the ad group target audience. For example, '{\"APPTYPE\":[\"iphone\"], \"GENDER\":[\"male\"], \"LOCALE\":[\"en-US\"], \"LOCATION\":[\"501\"], \"AGE_BUCKET\":[\"25-34\"]}' */
    _targetingSpec: Option[Map[String, List[String]]],
    /* Set a limit to the number of times a promoted pin from this campaign can be impressed by a pinner within the past rolling 30 days. Only available for CPM (cost per mille (1000 impressions))  ad groups. A CPM ad group has an IMPRESSION <a href=\\\"/docs/redoc/#section/Billable-event\\\">billable_event</a> value. This field **REQUIRES** the `end_time` field. */
    _lifetimeFrequencyCap: Option[Integer],
    /* Third-party tracking URLs.<br> JSON object with the format: {\"<a href=\"https://developers.pinterest.com/docs/redoc/#section/Tracking-URL-event\">Tracking event enum</a>\":[URL string array],...}<br> For example: {\"impression\": [\"URL1\", \"URL2\"], \"click\": [\"URL1\", \"URL2\", \"URL3\"]}.<br>Up to three tracking URLs are supported for each event type. Tracking URLs set at the ad group or ad level can override those set at the campaign level. May be null. Pass in an empty object - {} - to remove tracking URLs.<br><br> For more information, see <a href=\"https://help.pinterest.com/en/business/article/third-party-and-dynamic-tracking\" target=\"_blank\">Third-party and dynamic tracking</a>. */
    _trackingUrls: Option[TrackingUrls],
    /* Enable auto-targeting for ad group. Also known as <a href=\"https://help.pinterest.com/en/business/article/expanded-targeting\" target=\"_blank\">\"expanded targeting\"</a>. */
    _autoTargetingEnabled: Option[Boolean],
    /* <a href=\\\"/docs/redoc/#section/Placement-group\\\">Placement group</a>. */
    _placementGroup: Option[PlacementGroupType],
    /* Pacing delivery type. With ACCELERATED, an ad group budget is spent as fast as possible. With STANDARD, an ad group budget is spent smoothly over a day. */
    _pacingDeliveryType: Option[PacingDeliveryType],
    /* oCPM learn mode */
    _conversionLearningModeType: Option[String],
    /* Ad group summary status. */
    _summaryStatus: Option[AdGroupSummaryStatus],
    /* Feed Profile ID associated to the adgroup. */
    _feedProfileId: Option[String],
    /* Campaign ID of the ad group. */
    _campaignId: Option[String],
    _billableEvent: Option[ActionType],
    /* Ad group ID. */
    _id: Option[String],
    /* Always \"adgroup\". */
    _type: Option[String],
    /* Advertiser ID. */
    _adAccountId: Option[String],
    /* Ad group creation time. Unix timestamp in seconds. */
    _createdTime: Option[Integer],
    /* Ad group last update time. Unix timestamp in seconds. */
    _updatedTime: Option[Integer]
)
object AdGroupResponse {
    def toStringBody(var_name: Object, var_status: Object, var_budgetInMicroCurrency: Object, var_bidInMicroCurrency: Object, var_budgetType: Object, var_startTime: Object, var_endTime: Object, var_targetingSpec: Object, var_lifetimeFrequencyCap: Object, var_trackingUrls: Object, var_autoTargetingEnabled: Object, var_placementGroup: Object, var_pacingDeliveryType: Object, var_conversionLearningModeType: Object, var_summaryStatus: Object, var_feedProfileId: Object, var_campaignId: Object, var_billableEvent: Object, var_id: Object, var_type: Object, var_adAccountId: Object, var_createdTime: Object, var_updatedTime: Object) =
        s"""
        | {
        | "name":$var_name,"status":$var_status,"budgetInMicroCurrency":$var_budgetInMicroCurrency,"bidInMicroCurrency":$var_bidInMicroCurrency,"budgetType":$var_budgetType,"startTime":$var_startTime,"endTime":$var_endTime,"targetingSpec":$var_targetingSpec,"lifetimeFrequencyCap":$var_lifetimeFrequencyCap,"trackingUrls":$var_trackingUrls,"autoTargetingEnabled":$var_autoTargetingEnabled,"placementGroup":$var_placementGroup,"pacingDeliveryType":$var_pacingDeliveryType,"conversionLearningModeType":$var_conversionLearningModeType,"summaryStatus":$var_summaryStatus,"feedProfileId":$var_feedProfileId,"campaignId":$var_campaignId,"billableEvent":$var_billableEvent,"id":$var_id,"type":$var_type,"adAccountId":$var_adAccountId,"createdTime":$var_createdTime,"updatedTime":$var_updatedTime
        | }
        """.stripMargin
}
