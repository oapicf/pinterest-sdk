
package org.openapitools.client.model


case class CampaignDeliveryEstimatesDerivedMetrics (
    /* Estimated cost per click. */
    _cpc: Option[Float],
    /* Lower estimate of the cost per click. */
    _cpcLower: Option[Float],
    /* Upper estimate of the cost per click. */
    _cpcUpper: Option[Float],
    /* Estimated cost per thousand impressions. */
    _cpm: Option[Float],
    /* Lower estimate of cost per thousand impressions. */
    _cpmLower: Option[Float],
    /* Upper estimate of cost per thousand impressions. */
    _cpmUpper: Option[Float],
    /* Estimated lifetime frequency. */
    _lifetimeFrequency: Option[Float],
    /* Lower estimate of lifetime frequency. */
    _lifetimeFrequencyLower: Option[Float],
    /* Upper estimate of lifetime frequency. */
    _lifetimeFrequencyUpper: Option[Float],
    /* Estimated lifetime impressions. */
    _lifetimeImpression: Option[Float],
    /* Lower estimate of lifetime impressions. */
    _lifetimeImpressionLower: Option[Float],
    /* Upper estimate of lifetime impressions. */
    _lifetimeImpressionUpper: Option[Float],
    /* Estimated lifetime reach. */
    _lifetimeReach: Option[Float],
    /* Lower estimate of lifetime reach. */
    _lifetimeReachLower: Option[Float],
    /* Upper estimate of lifetime reach. */
    _lifetimeReachUpper: Option[Float],
    /* Estimated weekly clicks. */
    _weeklyClick: Option[Float],
    /* Lower estimate of weekly clicks. */
    _weeklyClickLower: Option[Float],
    /* Upper estimate of weekly clicks. */
    _weeklyClickUpper: Option[Float],
    /* Estimated weekly frequency. */
    _weeklyFrequency: Option[Float],
    /* Lower estimate of weekly frequency. */
    _weeklyFrequencyLower: Option[Float],
    /* Upper estimate of weekly frequency. */
    _weeklyFrequencyUpper: Option[Float],
    /* Estimated weekly impressions. */
    _weeklyImpression: Option[Float],
    /* Lower estimate of weekly impressions. */
    _weeklyImpressionLower: Option[Float],
    /* Upper estimate of weekly impressions. */
    _weeklyImpressionUpper: Option[Float],
    /* Estimated weekly reach. */
    _weeklyReach: Option[Float],
    /* Lower estimate of weekly reach. */
    _weeklyReachLower: Option[Float],
    /* Upper estimate of weekly reach. */
    _weeklyReachUpper: Option[Float]
)
object CampaignDeliveryEstimatesDerivedMetrics {
    def toStringBody(var_cpc: Object, var_cpcLower: Object, var_cpcUpper: Object, var_cpm: Object, var_cpmLower: Object, var_cpmUpper: Object, var_lifetimeFrequency: Object, var_lifetimeFrequencyLower: Object, var_lifetimeFrequencyUpper: Object, var_lifetimeImpression: Object, var_lifetimeImpressionLower: Object, var_lifetimeImpressionUpper: Object, var_lifetimeReach: Object, var_lifetimeReachLower: Object, var_lifetimeReachUpper: Object, var_weeklyClick: Object, var_weeklyClickLower: Object, var_weeklyClickUpper: Object, var_weeklyFrequency: Object, var_weeklyFrequencyLower: Object, var_weeklyFrequencyUpper: Object, var_weeklyImpression: Object, var_weeklyImpressionLower: Object, var_weeklyImpressionUpper: Object, var_weeklyReach: Object, var_weeklyReachLower: Object, var_weeklyReachUpper: Object) =
        s"""
        | {
        | "cpc":$var_cpc,"cpcLower":$var_cpcLower,"cpcUpper":$var_cpcUpper,"cpm":$var_cpm,"cpmLower":$var_cpmLower,"cpmUpper":$var_cpmUpper,"lifetimeFrequency":$var_lifetimeFrequency,"lifetimeFrequencyLower":$var_lifetimeFrequencyLower,"lifetimeFrequencyUpper":$var_lifetimeFrequencyUpper,"lifetimeImpression":$var_lifetimeImpression,"lifetimeImpressionLower":$var_lifetimeImpressionLower,"lifetimeImpressionUpper":$var_lifetimeImpressionUpper,"lifetimeReach":$var_lifetimeReach,"lifetimeReachLower":$var_lifetimeReachLower,"lifetimeReachUpper":$var_lifetimeReachUpper,"weeklyClick":$var_weeklyClick,"weeklyClickLower":$var_weeklyClickLower,"weeklyClickUpper":$var_weeklyClickUpper,"weeklyFrequency":$var_weeklyFrequency,"weeklyFrequencyLower":$var_weeklyFrequencyLower,"weeklyFrequencyUpper":$var_weeklyFrequencyUpper,"weeklyImpression":$var_weeklyImpression,"weeklyImpressionLower":$var_weeklyImpressionLower,"weeklyImpressionUpper":$var_weeklyImpressionUpper,"weeklyReach":$var_weeklyReach,"weeklyReachLower":$var_weeklyReachLower,"weeklyReachUpper":$var_weeklyReachUpper
        | }
        """.stripMargin
}
