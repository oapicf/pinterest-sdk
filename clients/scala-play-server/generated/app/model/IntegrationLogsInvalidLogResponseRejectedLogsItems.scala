package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for IntegrationLogsInvalidLogResponseRejectedLogsItems.
  * @param field The field name containing an invalid value.
  * @param logIndex Index of the log in the batch.
  * @param reason The reason the value is invalid.
  * @param value The value that is invalid.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-08-30T10:17:18.040485445Z[Etc/UTC]", comments = "Generator version: 7.24.0")
case class IntegrationLogsInvalidLogResponseRejectedLogsItems(
  field: String,
  logIndex: Option[Int],
  reason: String,
  value: String
)

object IntegrationLogsInvalidLogResponseRejectedLogsItems {
  implicit lazy val integrationLogsInvalidLogResponseRejectedLogsItemsJsonFormat: Format[IntegrationLogsInvalidLogResponseRejectedLogsItems] = Json.format[IntegrationLogsInvalidLogResponseRejectedLogsItems]
}

