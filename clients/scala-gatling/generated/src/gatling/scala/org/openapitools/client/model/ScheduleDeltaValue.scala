
package org.openapitools.client.model


case class ScheduleDeltaValue (
    _ageBucketMultipliers: Option[BidOptionsAgeBucketMultipliers],
    _appTypeMultipliers: Option[BidOptionsAppTypeMultipliers],
    _audienceMultipliers: Option[List[BidOptionsAudienceMultipliers]],
    _genderMultipliers: Option[BidOptionsGenderMultipliers],
    _placementMultipliers: Option[BidOptionsPlacementMultipliers]
)
object ScheduleDeltaValue {
    def toStringBody(var_ageBucketMultipliers: Object, var_appTypeMultipliers: Object, var_audienceMultipliers: Object, var_genderMultipliers: Object, var_placementMultipliers: Object) =
        s"""
        | {
        | "ageBucketMultipliers":$var_ageBucketMultipliers,"appTypeMultipliers":$var_appTypeMultipliers,"audienceMultipliers":$var_audienceMultipliers,"genderMultipliers":$var_genderMultipliers,"placementMultipliers":$var_placementMultipliers
        | }
        """.stripMargin
}
