package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for targeting_template_list_200_response.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2025-05-10T05:44:38.070631387Z[Etc/UTC]", comments = "Generator version: 7.12.0")
case class TargetingTemplateList200Response(
  items: List[TargetingTemplateResponseData],
  bookmark: Option[String]
)

object TargetingTemplateList200Response {
  implicit lazy val targetingTemplateList200ResponseJsonFormat: Format[TargetingTemplateList200Response] = Json.format[TargetingTemplateList200Response]
}

