package model

import play.api.libs.json._

/**
  * The value of the scheduled adjustment.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-11-03T06:25:30.649114982Z[Etc/UTC]", comments = "Generator version: 7.26.0")
case class ScheduleDeltaValue(
  ageBucketMultipliers: Option[BidOptionsAgeBucketMultipliers],
  appTypeMultipliers: Option[BidOptionsAppTypeMultipliers],
  audienceMultipliers: Option[List[BidOptionsAudienceMultipliers]],
  genderMultipliers: Option[BidOptionsGenderMultipliers],
  placementMultipliers: Option[BidOptionsPlacementMultipliers]
)

object ScheduleDeltaValue {
  implicit lazy val scheduleDeltaValueJsonFormat: Format[ScheduleDeltaValue] = Json.format[ScheduleDeltaValue]
}

