package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for Exception.
  * @param code Exception error code.
  * @param message Exception message.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2024-03-14T23:15:00.394859410Z[Etc/UTC]", comments = "Generator version: 7.4.0")
case class Exception(
  code: Option[Int],
  message: Option[String]
)

object Exception {
  implicit lazy val exceptionJsonFormat: Format[Exception] = Json.format[Exception]
}

