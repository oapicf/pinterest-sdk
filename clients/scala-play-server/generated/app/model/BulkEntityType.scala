package model

import play.api.libs.json._

/**
  * Refers ads entity type. Schedule enum is only applicable to beta users
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-01-31T05:12:04.015471536Z[Etc/UTC]", comments = "Generator version: 7.18.0")
case class BulkEntityType(
)

object BulkEntityType {
  implicit lazy val bulkEntityTypeJsonFormat: Format[BulkEntityType] = Json.format[BulkEntityType]
}

