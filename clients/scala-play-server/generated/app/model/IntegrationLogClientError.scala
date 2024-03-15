package model

import play.api.libs.json._

/**
  * System error details included in the log sent by the client.
  * @param cause Original cause of the error.
  * @param columnNumber Column number in the line of the file that raised the error.
  * @param fileName Filename where the error happened.
  * @param lineNumber Line number where the error happened.
  * @param message Human-readable description of the error.
  * @param messageDetail More detail about the message.
  * @param name Filename where the error happened.
  * @param number Integer that specifies the error code.
  * @param stackTrace Stack trace of where the error happened.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2024-03-14T23:15:00.394859410Z[Etc/UTC]", comments = "Generator version: 7.4.0")
case class IntegrationLogClientError(
  cause: Option[String],
  columnNumber: Option[Int],
  fileName: Option[String],
  lineNumber: Option[Int],
  message: Option[String],
  messageDetail: Option[String],
  name: Option[String],
  number: Option[Int],
  stackTrace: Option[String]
)

object IntegrationLogClientError {
  implicit lazy val integrationLogClientErrorJsonFormat: Format[IntegrationLogClientError] = Json.format[IntegrationLogClientError]
}

