package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for integrations_get_list_200_response.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2024-11-05T03:04:47.577040925Z[Etc/UTC]", comments = "Generator version: 7.9.0")
case class IntegrationsGetList200Response(
  items: List[IntegrationRecord],
  bookmark: Option[String]
)

object IntegrationsGetList200Response {
  implicit lazy val integrationsGetList200ResponseJsonFormat: Format[IntegrationsGetList200Response] = Json.format[IntegrationsGetList200Response]
}

