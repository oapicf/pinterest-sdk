
package org.openapitools.client.model


case class PerformancePlusCampaignSettings (
    /* Whether to boost prospecting ad group bid. */
    _boostProspectingAdGroupBid: Option[Boolean],
    /* List of campaign-level exclusion pinner list IDs. */
    _pinnerListExclusions: Option[List[String]]
)
object PerformancePlusCampaignSettings {
    def toStringBody(var_boostProspectingAdGroupBid: Object, var_pinnerListExclusions: Object) =
        s"""
        | {
        | "boostProspectingAdGroupBid":$var_boostProspectingAdGroupBid,"pinnerListExclusions":$var_pinnerListExclusions
        | }
        """.stripMargin
}
