package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for integrations_get_list_200_response.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-01-26T05:47:41.394513697Z[Etc/UTC]", comments = "Generator version: 7.18.0")
case class IntegrationsGetList200Response(
  items: List[IntegrationRecord],
  bookmark: Option[String]
)

object IntegrationsGetList200Response {
  implicit lazy val integrationsGetList200ResponseJsonFormat: Format[IntegrationsGetList200Response] = Json.format[IntegrationsGetList200Response]
}

