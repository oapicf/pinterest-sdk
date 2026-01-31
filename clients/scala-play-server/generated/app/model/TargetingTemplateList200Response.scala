package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for targeting_template_list_200_response.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-01-26T05:47:41.394513697Z[Etc/UTC]", comments = "Generator version: 7.18.0")
case class TargetingTemplateList200Response(
  items: List[TargetingTemplateResponseData],
  bookmark: Option[String]
)

object TargetingTemplateList200Response {
  implicit lazy val targetingTemplateList200ResponseJsonFormat: Format[TargetingTemplateList200Response] = Json.format[TargetingTemplateList200Response]
}

