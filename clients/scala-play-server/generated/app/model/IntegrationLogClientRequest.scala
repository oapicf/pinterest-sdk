package model

import play.api.libs.json._

/**
  * HTTP request details included in the log sent by the client.
  * @param host HTTP request host from host header.
  * @param path HTTP request path.
  * @param requestHeaders HTTP request headers as key-value pairs.
  * @param responseHeaders HTTP response headers as key-value pairs.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-11-03T06:25:30.649114982Z[Etc/UTC]", comments = "Generator version: 7.26.0")
case class IntegrationLogClientRequest(
  host: String,
  method: HttpMethod,
  path: String,
  requestHeaders: Option[Map[String, String]],
  responseHeaders: Option[Map[String, String]],
  responseStatusCode: Option[Int]
)

object IntegrationLogClientRequest {
  implicit lazy val integrationLogClientRequestJsonFormat: Format[IntegrationLogClientRequest] = Json.format[IntegrationLogClientRequest]
}

