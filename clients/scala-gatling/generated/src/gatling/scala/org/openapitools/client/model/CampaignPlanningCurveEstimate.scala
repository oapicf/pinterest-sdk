
package org.openapitools.client.model


case class CampaignPlanningCurveEstimate (
    /* Estimation type for campaign planning estimated curve */
    _estimationType: Option[CampaignPlanningEstimationType],
    /* The estimation points that make up the estimated curve. */
    _points: Option[List[CampaignPlanningPointEstimate]]
)
object CampaignPlanningCurveEstimate {
    def toStringBody(var_estimationType: Object, var_points: Object) =
        s"""
        | {
        | "estimationType":$var_estimationType,"points":$var_points
        | }
        """.stripMargin
}
