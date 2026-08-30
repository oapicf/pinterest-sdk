package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for lead_forms_create_200_response.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-08-30T10:17:18.040485445Z[Etc/UTC]", comments = "Generator version: 7.24.0")
case class LeadFormsCreate200Response(
  items: List[LeadFormsCreate200ResponseItemsInner]
)

object LeadFormsCreate200Response {
  implicit lazy val leadFormsCreate200ResponseJsonFormat: Format[LeadFormsCreate200Response] = Json.format[LeadFormsCreate200Response]
}

