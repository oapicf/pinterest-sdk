
package org.openapitools.client.model


case class CampaignPlanningConversionRate (
    _attributionWindows: CampaignPlanningConversionAttribution,
    _conversionEvent: CampaignPlanningConversionEvent,
    /* Conversion rate estimate. Used to translate impressions into conversions for oCPM ads. */
    _conversionRate: Float
)
object CampaignPlanningConversionRate {
    def toStringBody(var_attributionWindows: Object, var_conversionEvent: Object, var_conversionRate: Object) =
        s"""
        | {
        | "attributionWindows":$var_attributionWindows,"conversionEvent":$var_conversionEvent,"conversionRate":$var_conversionRate
        | }
        """.stripMargin
}
