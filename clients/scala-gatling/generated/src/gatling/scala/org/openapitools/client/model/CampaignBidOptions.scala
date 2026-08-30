
package org.openapitools.client.model


case class CampaignBidOptions (
    /* Age bucket multipliers for bid adjustments. */
    _ageBucketMultipliers: Option[AgeBucketMultipliers],
    /* App type multipliers for bid adjustments. */
    _appTypeMultipliers: Option[AppTypeMultipliers],
    /* Audience multipliers for bid adjustments. */
    _audienceMultipliers: Option[CampaignAudienceMultipliers],
    /* The time window for frequency bid multipliers. */
    _freqBidMultiplierTimeWindow: Option[FreqBidMultiplierTimeWindow],
    /* Frequency multipliers for bid adjustments. */
    _frequencyMultipliers: Option[FrequencyMultipliers],
    /* Gender multipliers for bid adjustments. */
    _genderMultipliers: Option[GenderMultipliers],
    /* Placement multipliers for bid adjustments. */
    _placementMultipliers: Option[PlacementMultipliers]
)
object CampaignBidOptions {
    def toStringBody(var_ageBucketMultipliers: Object, var_appTypeMultipliers: Object, var_audienceMultipliers: Object, var_freqBidMultiplierTimeWindow: Object, var_frequencyMultipliers: Object, var_genderMultipliers: Object, var_placementMultipliers: Object) =
        s"""
        | {
        | "ageBucketMultipliers":$var_ageBucketMultipliers,"appTypeMultipliers":$var_appTypeMultipliers,"audienceMultipliers":$var_audienceMultipliers,"freqBidMultiplierTimeWindow":$var_freqBidMultiplierTimeWindow,"frequencyMultipliers":$var_frequencyMultipliers,"genderMultipliers":$var_genderMultipliers,"placementMultipliers":$var_placementMultipliers
        | }
        """.stripMargin
}
