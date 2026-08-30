
package org.openapitools.client.model


case class CampaignPlanningBudgetRecommendation (
    /* The recommended budget amount. */
    _budgetRecommendation: Option[Integer],
    /* List of experimental budget recommendations. */
    _experimentCampaignBudgetRecommendation: Option[List[CampaignPlanningExperimentBudgetRecommendation]],
    /* Recommended number of days for the campaign lifetime. */
    _lifetimeDaysRecommendation: Option[Integer],
    /* List of point estimations for different budget scenarios. */
    _pointEstimations: Option[List[CampaignPlanningBudgetRecommendationPoint]]
)
object CampaignPlanningBudgetRecommendation {
    def toStringBody(var_budgetRecommendation: Object, var_experimentCampaignBudgetRecommendation: Object, var_lifetimeDaysRecommendation: Object, var_pointEstimations: Object) =
        s"""
        | {
        | "budgetRecommendation":$var_budgetRecommendation,"experimentCampaignBudgetRecommendation":$var_experimentCampaignBudgetRecommendation,"lifetimeDaysRecommendation":$var_lifetimeDaysRecommendation,"pointEstimations":$var_pointEstimations
        | }
        """.stripMargin
}
