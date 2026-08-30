
package org.openapitools.client.model


case class CampaignPlanningBudgetRecommendationPoint (
    /* Estimation type for this point. */
    _estimationType: Option[CampaignPlanningEstimationType],
    /* Point estimate data. */
    _pointEstimate: Option[CampaignPlanningPointEstimate]
)
object CampaignPlanningBudgetRecommendationPoint {
    def toStringBody(var_estimationType: Object, var_pointEstimate: Object) =
        s"""
        | {
        | "estimationType":$var_estimationType,"pointEstimate":$var_pointEstimate
        | }
        """.stripMargin
}
