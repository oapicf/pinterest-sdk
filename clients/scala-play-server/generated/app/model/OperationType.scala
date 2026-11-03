package model

import play.api.libs.json._

/**
  * Operation type to share a specific audience or revoke access to a previously shared audience
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-11-03T06:25:30.649114982Z[Etc/UTC]", comments = "Generator version: 7.26.0")
case class OperationType(
)

object OperationType {
  implicit lazy val operationTypeJsonFormat: Format[OperationType] = Json.format[OperationType]
}

