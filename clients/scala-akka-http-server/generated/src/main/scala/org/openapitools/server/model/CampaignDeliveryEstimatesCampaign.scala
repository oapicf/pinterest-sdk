package org.openapitools.server.model


/**
 * Campaign configuration for delivery estimates.
 *
 * @param adGroups  for example: ''null''
 * @param budgetDurationType Duration type of the budget for example: ''FIXED_DAILY''
 * @param dailySpendCap Campaign daily spend cap. When the budget_duration_type is FIXED_DAILY or FLEXIBLE_DAILY, this field is required. for example: ''50000000''
 * @param endDate End date of the date range for an ad campaign, pattern YYYY-MM-DD. Required when budget_duration_type is LIFETIME. for example: ''null''
 * @param lifetimeSpendCap Campaign total spending cap. When the budget_duration_type is LIFETIME, this field is required. The end date field is also required for lifetime spending. for example: ''500000000''
 * @param objectiveType  for example: ''null''
 * @param startDate Start date of the date range for an ad campaign, pattern YYYY-MM-DD. for example: ''null''
*/
final case class CampaignDeliveryEstimatesCampaign (
  adGroups: Seq[AdGroupDeliveryEstimates],
  budgetDurationType: BudgetDurationType,
  dailySpendCap: Option[Int] = None,
  endDate: Option[String] = None,
  lifetimeSpendCap: Option[Int] = None,
  objectiveType: DeliveryEstimateObjectiveType,
  startDate: String
)

