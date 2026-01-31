
package org.openapitools.client.model


case class CampaignBidOptionsCreate (
    _appTypeMultipliers: Option[AppTypeMultipliers],
    _audienceMultipliers: Option[CampaignAudienceMultipliers],
    _placementMultipliers: Option[PlacementMultipliers]
)
object CampaignBidOptionsCreate {
    def toStringBody(var_appTypeMultipliers: Object, var_audienceMultipliers: Object, var_placementMultipliers: Object) =
        s"""
        | {
        | "appTypeMultipliers":$var_appTypeMultipliers,"audienceMultipliers":$var_audienceMultipliers,"placementMultipliers":$var_placementMultipliers
        | }
        """.stripMargin
}
