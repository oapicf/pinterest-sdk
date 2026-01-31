package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for AudienceDefinitionResponse.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-01-31T05:12:04.015471536Z[Etc/UTC]", comments = "Generator version: 7.18.0")
case class AudienceDefinitionResponse(
  items: Option[List[AudienceDefinition]]
)

object AudienceDefinitionResponse {
  implicit lazy val audienceDefinitionResponseJsonFormat: Format[AudienceDefinitionResponse] = Json.format[AudienceDefinitionResponse]
}

