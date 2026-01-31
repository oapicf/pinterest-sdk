package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for targeting_template_list_200_response.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-01-31T05:12:04.015471536Z[Etc/UTC]", comments = "Generator version: 7.18.0")
case class TargetingTemplateList200Response(
  bookmark: Option[String],
  items: List[TargetingTemplateGetResponseData]
)

object TargetingTemplateList200Response {
  implicit lazy val targetingTemplateList200ResponseJsonFormat: Format[TargetingTemplateList200Response] = Json.format[TargetingTemplateList200Response]
}

