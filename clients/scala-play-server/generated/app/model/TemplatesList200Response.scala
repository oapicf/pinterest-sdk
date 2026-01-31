package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for templates_list_200_response.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-01-26T05:47:41.394513697Z[Etc/UTC]", comments = "Generator version: 7.18.0")
case class TemplatesList200Response(
  items: List[TemplateResponse],
  bookmark: Option[String]
)

object TemplatesList200Response {
  implicit lazy val templatesList200ResponseJsonFormat: Format[TemplatesList200Response] = Json.format[TemplatesList200Response]
}

