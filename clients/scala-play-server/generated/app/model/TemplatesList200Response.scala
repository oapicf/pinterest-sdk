package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for templates_list_200_response.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-08-30T10:17:18.040485445Z[Etc/UTC]", comments = "Generator version: 7.24.0")
case class TemplatesList200Response(
  bookmark: Option[String],
  items: List[AccountTemplate]
)

object TemplatesList200Response {
  implicit lazy val templatesList200ResponseJsonFormat: Format[TemplatesList200Response] = Json.format[TemplatesList200Response]
}

