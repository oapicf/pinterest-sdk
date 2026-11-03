package model

import play.api.libs.json._

/**
  * Object describing the schedule level bid level changes.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-11-03T06:25:30.649114982Z[Etc/UTC]", comments = "Generator version: 7.26.0")
case class ScheduleBidOptions(
  ageBucketMultipliers: Option[ScheduleAgeBucketMultipliers],
  appTypeMultipliers: Option[ScheduleAppTypeMultipliers],
  audienceMultipliers: Option[ScheduleAudienceMultipliers],
  genderMultipliers: Option[ScheduleBidOptionsGenderMultipliers],
  placementMultipliers: Option[ScheduleBidOptionsPlacementMultipliers]
)

object ScheduleBidOptions {
  implicit lazy val scheduleBidOptionsJsonFormat: Format[ScheduleBidOptions] = Json.format[ScheduleBidOptions]
}

