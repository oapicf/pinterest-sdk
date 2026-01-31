package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for Exception.
  * @param code Exception error code.
  * @param message Exception message.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-01-31T05:12:04.015471536Z[Etc/UTC]", comments = "Generator version: 7.18.0")
case class Exception(
  code: Option[Int],
  message: Option[String]
)

object Exception {
  implicit lazy val exceptionJsonFormat: Format[Exception] = Json.format[Exception]
}

