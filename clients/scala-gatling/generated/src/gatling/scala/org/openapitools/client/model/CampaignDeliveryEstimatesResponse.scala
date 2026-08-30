
package org.openapitools.client.model


case class CampaignDeliveryEstimatesResponse (
    /* Estimated curves. Each curve will pertain to a single estimation type. */
    _curves: Option[List[CampaignPlanningCurveEstimate]],
    _derivedMetrics: Option[CampaignDeliveryEstimatesDerivedMetrics],
    /* Maximum potential spend estimate. */
    _maxPotentialSpend: Option[Integer]
)
object CampaignDeliveryEstimatesResponse {
    def toStringBody(var_curves: Object, var_derivedMetrics: Object, var_maxPotentialSpend: Object) =
        s"""
        | {
        | "curves":$var_curves,"derivedMetrics":$var_derivedMetrics,"maxPotentialSpend":$var_maxPotentialSpend
        | }
        """.stripMargin
}
