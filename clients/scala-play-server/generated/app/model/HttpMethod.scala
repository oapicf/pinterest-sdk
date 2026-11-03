package model

import play.api.libs.json._

/**
  * HTTP request method.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-11-03T06:25:30.649114982Z[Etc/UTC]", comments = "Generator version: 7.26.0")
case class HttpMethod(
)

object HttpMethod {
  implicit lazy val httpMethodJsonFormat: Format[HttpMethod] = Json.format[HttpMethod]
}

