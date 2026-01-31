package model

import play.api.libs.json._

/**
  * Default error response
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-01-31T05:12:04.015471536Z[Etc/UTC]", comments = "Generator version: 7.18.0")
case class Error(
  code: Int,
  message: String
)

object Error {
  implicit lazy val pinterestLibErrorJsonFormat: Format[Error] = Json.format[Error]
}

