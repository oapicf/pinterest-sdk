package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for lead_forms_list_200_response.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2025-05-10T05:44:38.070631387Z[Etc/UTC]", comments = "Generator version: 7.12.0")
case class LeadFormsList200Response(
  items: List[LeadFormResponse],
  bookmark: Option[String]
)

object LeadFormsList200Response {
  implicit lazy val leadFormsList200ResponseJsonFormat: Format[LeadFormsList200Response] = Json.format[LeadFormsList200Response]
}

