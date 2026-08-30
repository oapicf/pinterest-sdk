package model

import play.api.libs.json._

/**
  * The value of the bid changes. This must be provided when the schedule type is CAMPAIGN_BID_MULTIPLIERS.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-08-30T10:17:18.040485445Z[Etc/UTC]", comments = "Generator version: 7.24.0")
case class ScheduleBidMultipliers(
  ageBucketMultipliers: Option[BidOptionsAgeBucketMultipliers],
  appTypeMultipliers: Option[BidOptionsAppTypeMultipliers],
  audienceMultipliers: Option[List[BidOptionsAudienceMultipliers]],
  genderMultipliers: Option[BidOptionsGenderMultipliers],
  placementMultipliers: Option[BidOptionsPlacementMultipliers]
)

object ScheduleBidMultipliers {
  implicit lazy val scheduleBidMultipliersJsonFormat: Format[ScheduleBidMultipliers] = Json.format[ScheduleBidMultipliers]
}

