package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for lead_forms_list_200_response.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-01-31T05:12:04.015471536Z[Etc/UTC]", comments = "Generator version: 7.18.0")
case class LeadFormsList200Response(
  bookmark: Option[String],
  items: List[LeadFormResponse]
)

object LeadFormsList200Response {
  implicit lazy val leadFormsList200ResponseJsonFormat: Format[LeadFormsList200Response] = Json.format[LeadFormsList200Response]
}

