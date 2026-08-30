
package org.openapitools.client.model


case class BulkCampaignDeliveryEstimatesItem (
    /* Range audience sizes for each ad group, in the same order as the ad groups in the request. */
    _adgroupAudienceSizes: Option[List[CampaignPlanningAdGroupAudienceSize]],
    /* Conversion rate estimate. Used to translate impressions into conversions for oCPM ads, adapted based on the input conversion event and attribution windows. */
    _conversionRate: Option[Float],
    /* Conversion rate estimates. Used to translate impressions into conversions for oCPM ads based on different conversion event and attribution windows settings. */
    _conversionRates: Option[List[CampaignPlanningConversionRate]],
    /* Estimated curves. Each curve will pertain to a single estimation type. */
    _curves: Option[List[CampaignPlanningCurveEstimate]],
    _derivedMetrics: Option[CampaignDeliveryEstimatesDerivedMetrics],
    /* Errors encountered during estimation for this campaign. */
    _errors: Option[List[CampaignPlanningResponseError]],
    /* UUID used to track delivery estimates when they are generated as part of a saved campaign. */
    _estimateId: Option[String],
    /* Maximum potential spend estimate. */
    _maxPotentialSpend: Option[Integer]
)
object BulkCampaignDeliveryEstimatesItem {
    def toStringBody(var_adgroupAudienceSizes: Object, var_conversionRate: Object, var_conversionRates: Object, var_curves: Object, var_derivedMetrics: Object, var_errors: Object, var_estimateId: Object, var_maxPotentialSpend: Object) =
        s"""
        | {
        | "adgroupAudienceSizes":$var_adgroupAudienceSizes,"conversionRate":$var_conversionRate,"conversionRates":$var_conversionRates,"curves":$var_curves,"derivedMetrics":$var_derivedMetrics,"errors":$var_errors,"estimateId":$var_estimateId,"maxPotentialSpend":$var_maxPotentialSpend
        | }
        """.stripMargin
}
