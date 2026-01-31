package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for IntegrationLogsInvalidLogResponse_rejected_logs_inner.
  * @param field The field name containing an invalid value.
  * @param logIndex Index of the log in the batch.
  * @param reason The reason the value is invalid.
  * @param value The value that is invalid.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-01-31T05:12:04.015471536Z[Etc/UTC]", comments = "Generator version: 7.18.0")
case class IntegrationLogsInvalidLogResponseRejectedLogsInner(
  field: String,
  logIndex: Option[Int],
  reason: String,
  value: String
)

object IntegrationLogsInvalidLogResponseRejectedLogsInner {
  implicit lazy val integrationLogsInvalidLogResponseRejectedLogsInnerJsonFormat: Format[IntegrationLogsInvalidLogResponseRejectedLogsInner] = Json.format[IntegrationLogsInvalidLogResponseRejectedLogsInner]
}

