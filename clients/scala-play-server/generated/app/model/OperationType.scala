package model

import play.api.libs.json._

/**
  * Operation type to share a specific audience or revoke access to a previously shared audience
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-01-31T05:12:04.015471536Z[Etc/UTC]", comments = "Generator version: 7.18.0")
case class OperationType(
)

object OperationType {
  implicit lazy val operationTypeJsonFormat: Format[OperationType] = Json.format[OperationType]
}

