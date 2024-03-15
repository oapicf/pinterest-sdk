package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for templates_list_200_response.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2024-03-14T23:15:00.394859410Z[Etc/UTC]", comments = "Generator version: 7.4.0")
case class TemplatesList200Response(
  items: List[TemplateResponse],
  bookmark: Option[String]
)

object TemplatesList200Response {
  implicit lazy val templatesList200ResponseJsonFormat: Format[TemplatesList200Response] = Json.format[TemplatesList200Response]
}

