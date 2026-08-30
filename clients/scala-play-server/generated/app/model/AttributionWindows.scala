package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for AttributionWindows.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-08-30T10:17:18.040485445Z[Etc/UTC]", comments = "Generator version: 7.24.0")
case class AttributionWindows(
  clickWindowDays: Option[Int],
  engagementWindowDays: Option[Int],
  viewWindowDays: Option[Int]
)

object AttributionWindows {
  implicit lazy val attributionWindowsJsonFormat: Format[AttributionWindows] = Json.format[AttributionWindows]
}

