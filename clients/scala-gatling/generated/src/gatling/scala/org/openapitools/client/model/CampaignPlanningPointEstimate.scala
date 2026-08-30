
package org.openapitools.client.model


case class CampaignPlanningPointEstimate (
    /* The budget value of the point. */
    _budget: Integer,
    /* Y value as a decimal. */
    _doubleY: Double,
    /* The maximum Y value of the point. */
    _maxY: Integer,
    /* The minimum Y value of the point. */
    _minY: Integer,
    /* The expected Y value of the point. */
    _y: Integer
)
object CampaignPlanningPointEstimate {
    def toStringBody(var_budget: Object, var_doubleY: Object, var_maxY: Object, var_minY: Object, var_y: Object) =
        s"""
        | {
        | "budget":$var_budget,"doubleY":$var_doubleY,"maxY":$var_maxY,"minY":$var_minY,"y":$var_y
        | }
        """.stripMargin
}
