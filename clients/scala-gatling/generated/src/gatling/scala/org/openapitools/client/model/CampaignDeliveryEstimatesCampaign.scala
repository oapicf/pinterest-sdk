
package org.openapitools.client.model


case class CampaignDeliveryEstimatesCampaign (
    _adGroups: List[AdGroupDeliveryEstimates],
    /* Duration type of the budget */
    _budgetDurationType: BudgetDurationType,
    /* Campaign daily spend cap. When the budget_duration_type is FIXED_DAILY or FLEXIBLE_DAILY, this field is required. */
    _dailySpendCap: Option[Integer],
    /* End date of the date range for an ad campaign, pattern YYYY-MM-DD. Required when budget_duration_type is LIFETIME. */
    _endDate: Option[String],
    /* Campaign total spending cap. When the budget_duration_type is LIFETIME, this field is required. The end date field is also required for lifetime spending. */
    _lifetimeSpendCap: Option[Integer],
    _objectiveType: DeliveryEstimateObjectiveType,
    /* Start date of the date range for an ad campaign, pattern YYYY-MM-DD. */
    _startDate: String
)
object CampaignDeliveryEstimatesCampaign {
    def toStringBody(var_adGroups: Object, var_budgetDurationType: Object, var_dailySpendCap: Object, var_endDate: Object, var_lifetimeSpendCap: Object, var_objectiveType: Object, var_startDate: Object) =
        s"""
        | {
        | "adGroups":$var_adGroups,"budgetDurationType":$var_budgetDurationType,"dailySpendCap":$var_dailySpendCap,"endDate":$var_endDate,"lifetimeSpendCap":$var_lifetimeSpendCap,"objectiveType":$var_objectiveType,"startDate":$var_startDate
        | }
        """.stripMargin
}
