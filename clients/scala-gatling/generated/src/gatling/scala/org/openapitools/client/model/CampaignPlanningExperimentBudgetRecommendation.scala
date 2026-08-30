
package org.openapitools.client.model


case class CampaignPlanningExperimentBudgetRecommendation (
    /* Recommended budget for this experiment version. */
    _budgetRecommendation: Option[Integer],
    /* Recommended lifetime days for this experiment. */
    _lifetimeDaysRecommendation: Option[Integer],
    /* Point estimations for this experiment version. */
    _pointEstimations: Option[List[CampaignPlanningBudgetRecommendationPoint]],
    /* Version identifier for the experiment. */
    _versionId: Option[String]
)
object CampaignPlanningExperimentBudgetRecommendation {
    def toStringBody(var_budgetRecommendation: Object, var_lifetimeDaysRecommendation: Object, var_pointEstimations: Object, var_versionId: Object) =
        s"""
        | {
        | "budgetRecommendation":$var_budgetRecommendation,"lifetimeDaysRecommendation":$var_lifetimeDaysRecommendation,"pointEstimations":$var_pointEstimations,"versionId":$var_versionId
        | }
        """.stripMargin
}
