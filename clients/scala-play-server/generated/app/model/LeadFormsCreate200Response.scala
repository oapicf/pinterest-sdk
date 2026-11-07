package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for lead_forms_create_200_response.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-11-07T04:12:42.952922086Z[Etc/UTC]", comments = "Generator version: 7.26.0")
case class LeadFormsCreate200Response(
  items: List[LeadFormsCreate200ResponseItemsInner]
)

object LeadFormsCreate200Response {
  implicit lazy val leadFormsCreate200ResponseJsonFormat: Format[LeadFormsCreate200Response] = Json.format[LeadFormsCreate200Response]
}

