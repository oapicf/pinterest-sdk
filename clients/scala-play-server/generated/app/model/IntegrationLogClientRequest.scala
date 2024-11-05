package model

import play.api.libs.json._

/**
  * HTTP request details included in the log sent by the client.
  * @param host HTTP request host from host header.
  * @param path HTTP request path.
  * @param requestHeaders HTTP request headers as key-value pairs.
  * @param responseHeaders HTTP response headers as key-value pairs.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2024-11-05T03:04:47.577040925Z[Etc/UTC]", comments = "Generator version: 7.9.0")
case class IntegrationLogClientRequest(
  method: IntegrationLogClientRequest.Method.Value,
  host: String,
  path: String,
  requestHeaders: Option[Map[String, String]],
  responseHeaders: Option[Map[String, String]],
  responseStatusCode: Option[Int]
)

object IntegrationLogClientRequest {
  implicit lazy val integrationLogClientRequestJsonFormat: Format[IntegrationLogClientRequest] = Json.format[IntegrationLogClientRequest]

  // noinspection TypeAnnotation
  object Method extends Enumeration {
    val GET = Value("GET")
    val HEAD = Value("HEAD")
    val POST = Value("POST")
    val PUT = Value("PUT")
    val DELETE = Value("DELETE")
    val CONNECT = Value("CONNECT")
    val OPTIONS = Value("OPTIONS")
    val TRACE = Value("TRACE")
    val PATCH = Value("PATCH")

    type Method = Value
    implicit lazy val MethodJsonFormat: Format[Value] = Format(Reads.enumNameReads(this), Writes.enumNameWrites[this.type])
  }
}

