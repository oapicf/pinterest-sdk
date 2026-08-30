package model

import play.api.libs.json._

/**
  * The value of the scheduled adjustment.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-08-30T10:17:18.040485445Z[Etc/UTC]", comments = "Generator version: 7.24.0")
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

