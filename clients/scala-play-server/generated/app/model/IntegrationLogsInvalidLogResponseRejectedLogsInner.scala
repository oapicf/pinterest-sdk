package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for IntegrationLogsInvalidLogResponse_rejected_logs_inner.
  * @param logIndex Index of the log in the batch.
  * @param field The field name containing an invalid value.
  * @param value The value that is invalid.
  * @param reason The reason the value is invalid.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2024-11-05T03:04:47.577040925Z[Etc/UTC]", comments = "Generator version: 7.9.0")
case class IntegrationLogsInvalidLogResponseRejectedLogsInner(
  logIndex: Option[Int],
  field: String,
  value: String,
  reason: String
)

object IntegrationLogsInvalidLogResponseRejectedLogsInner {
  implicit lazy val integrationLogsInvalidLogResponseRejectedLogsInnerJsonFormat: Format[IntegrationLogsInvalidLogResponseRejectedLogsInner] = Json.format[IntegrationLogsInvalidLogResponseRejectedLogsInner]
}

