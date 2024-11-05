package model

import play.api.libs.json._

/**
  * Operation type to share a specific audience or revoke access to a previously shared audience
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2024-11-05T03:04:47.577040925Z[Etc/UTC]", comments = "Generator version: 7.9.0")
case class OperationType(
)

object OperationType {
  implicit lazy val operationTypeJsonFormat: Format[OperationType] = Json.format[OperationType]
}

