
package org.openapitools.client.model


case class CampaignPlanningAdGroupAudienceSize (
    /* Lower bound of the audience size estimate. */
    _countLower: Option[Integer],
    /* Upper bound of the audience size estimate. */
    _countUpper: Option[Integer]
)
object CampaignPlanningAdGroupAudienceSize {
    def toStringBody(var_countLower: Object, var_countUpper: Object) =
        s"""
        | {
        | "countLower":$var_countLower,"countUpper":$var_countUpper
        | }
        """.stripMargin
}
