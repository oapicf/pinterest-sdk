
package org.openapitools.client.model


case class CampaignBidOptionsUpdate (
    _appTypeMultipliers: Option[AppTypeMultipliers],
    _audienceMultipliers: Option[CampaignAudienceMultipliers],
    _placementMultipliers: Option[PlacementMultipliers],
    /* List of fields to update, only the fields in the list will be updated. */
    _updateMask: List[String]
)
object CampaignBidOptionsUpdate {
    def toStringBody(var_appTypeMultipliers: Object, var_audienceMultipliers: Object, var_placementMultipliers: Object, var_updateMask: Object) =
        s"""
        | {
        | "appTypeMultipliers":$var_appTypeMultipliers,"audienceMultipliers":$var_audienceMultipliers,"placementMultipliers":$var_placementMultipliers,"updateMask":$var_updateMask
        | }
        """.stripMargin
}
