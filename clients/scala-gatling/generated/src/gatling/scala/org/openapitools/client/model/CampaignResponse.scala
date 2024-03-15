
package org.openapitools.client.model


case class CampaignResponse (
    /* Campaign ID. */
    _id: Option[String],
    /* Campaign's Advertiser ID. If you want to create a campaign in a Business Account shared account you need to specify the Business Access advertiser ID in both the query path param as well as the request body schema. */
    _adAccountId: Option[String],
    /* Campaign name. */
    _name: Option[String],
    _status: Option[EntityStatus],
    /* Campaign total spending cap. Required for Campaign Budget Optimization (CBO) campaigns. This and \"daily_spend_cap\" cannot be set at the same time. */
    _lifetimeSpendCap: Option[Integer],
    /* Campaign daily spending cap. Required for Campaign Budget Optimization (CBO) campaigns. This and \"lifetime_spend_cap\" cannot be set at the same time. */
    _dailySpendCap: Option[Integer],
    /* Order line ID that appears on the invoice. */
    _orderLineId: Option[String],
    _trackingUrls: Option[AdCommonTrackingUrls],
    /* Campaign start time. Unix timestamp in seconds. Only used for Campaign Budget Optimization (CBO) campaigns. */
    _startTime: Option[Integer],
    /* Campaign end time. Unix timestamp in seconds. Only used for Campaign Budget Optimization (CBO) campaigns. */
    _endTime: Option[Integer],
    _summaryStatus: Option[CampaignSummaryStatus],
    _objectiveType: Option[ObjectiveType],
    /* Campaign creation time. Unix timestamp in seconds. */
    _createdTime: Option[Integer],
    /* UTC timestamp. Last update time. */
    _updatedTime: Option[Integer],
    /* Always \"campaign\". */
    _type: Option[String],
    /* Determines if a campaign has flexible daily budgets setup. */
    _isFlexibleDailyBudgets: Option[Boolean],
    /* Determines if a campaign automatically generate ad-group level budgets given a campaign budget to maximize campaign outcome. When transitioning from non-cbo to cbo, all previous child ad group budget will be cleared. */
    _isCampaignBudgetOptimization: Option[Boolean]
)
object CampaignResponse {
    def toStringBody(var_id: Object, var_adAccountId: Object, var_name: Object, var_status: Object, var_lifetimeSpendCap: Object, var_dailySpendCap: Object, var_orderLineId: Object, var_trackingUrls: Object, var_startTime: Object, var_endTime: Object, var_summaryStatus: Object, var_objectiveType: Object, var_createdTime: Object, var_updatedTime: Object, var_type: Object, var_isFlexibleDailyBudgets: Object, var_isCampaignBudgetOptimization: Object) =
        s"""
        | {
        | "id":$var_id,"adAccountId":$var_adAccountId,"name":$var_name,"status":$var_status,"lifetimeSpendCap":$var_lifetimeSpendCap,"dailySpendCap":$var_dailySpendCap,"orderLineId":$var_orderLineId,"trackingUrls":$var_trackingUrls,"startTime":$var_startTime,"endTime":$var_endTime,"summaryStatus":$var_summaryStatus,"objectiveType":$var_objectiveType,"createdTime":$var_createdTime,"updatedTime":$var_updatedTime,"type":$var_type,"isFlexibleDailyBudgets":$var_isFlexibleDailyBudgets,"isCampaignBudgetOptimization":$var_isCampaignBudgetOptimization
        | }
        """.stripMargin
}
