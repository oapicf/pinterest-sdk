package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for AmazonConnectResponse.
  * @param message Amazon connect response message
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-08-30T10:17:18.040485445Z[Etc/UTC]", comments = "Generator version: 7.24.0")
case class AmazonConnectResponse(
  message: Option[String]
)

object AmazonConnectResponse {
  implicit lazy val amazonConnectResponseJsonFormat: Format[AmazonConnectResponse] = Json.format[AmazonConnectResponse]
}

