
package org.openapitools.client.model


case class ScheduleBidOptions (
    _ageBucketMultipliers: Option[ScheduleAgeBucketMultipliers],
    _appTypeMultipliers: Option[ScheduleAppTypeMultipliers],
    _audienceMultipliers: Option[ScheduleAudienceMultipliers],
    _genderMultipliers: Option[ScheduleBidOptionsGenderMultipliers],
    _placementMultipliers: Option[ScheduleBidOptionsPlacementMultipliers]
)
object ScheduleBidOptions {
    def toStringBody(var_ageBucketMultipliers: Object, var_appTypeMultipliers: Object, var_audienceMultipliers: Object, var_genderMultipliers: Object, var_placementMultipliers: Object) =
        s"""
        | {
        | "ageBucketMultipliers":$var_ageBucketMultipliers,"appTypeMultipliers":$var_appTypeMultipliers,"audienceMultipliers":$var_audienceMultipliers,"genderMultipliers":$var_genderMultipliers,"placementMultipliers":$var_placementMultipliers
        | }
        """.stripMargin
}
