package model

import play.api.libs.json._

/**
  * HTTP request method.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-08-30T10:17:18.040485445Z[Etc/UTC]", comments = "Generator version: 7.24.0")
case class HttpMethod(
)

object HttpMethod {
  implicit lazy val httpMethodJsonFormat: Format[HttpMethod] = Json.format[HttpMethod]
}

