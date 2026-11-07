package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for ScheduleCommonDeltaValue.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-11-07T02:59:47.831280460Z[Etc/UTC]", comments = "Generator version: 7.26.0")
case class ScheduleCommonDeltaValue(
  ageBucketMultipliers: Option[ScheduleAgeBucketMultipliers],
  appTypeMultipliers: Option[ScheduleAppTypeMultipliers],
  audienceMultipliers: Option[ScheduleAudienceMultipliers],
  genderMultipliers: Option[ScheduleBidOptionsGenderMultipliers],
  placementMultipliers: Option[ScheduleBidOptionsPlacementMultipliers]
)

object ScheduleCommonDeltaValue {
  implicit lazy val scheduleCommonDeltaValueJsonFormat: Format[ScheduleCommonDeltaValue] = Json.format[ScheduleCommonDeltaValue]
}

