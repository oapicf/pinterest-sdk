package model

import play.api.libs.json._

/**
  * Daily processing schedule. This field is **OPTIONAL**. Use this to configure the preferred time for processing a feed (otherwise random).
  * @param time A time in format HH:MM with leading 0 (zero)
  * @param timezone The timezone considered for the processing schedule time.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-08-30T10:17:18.040485445Z[Etc/UTC]", comments = "Generator version: 7.24.0")
case class CatalogsFeedProcessingSchedule(
  time: String,
  timezone: CatalogsFeedProcessingScheduleTimezone
)

object CatalogsFeedProcessingSchedule {
  implicit lazy val catalogsFeedProcessingScheduleJsonFormat: Format[CatalogsFeedProcessingSchedule] = Json.format[CatalogsFeedProcessingSchedule]
}

