package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for lead_forms_create_200_response_items_inner.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-08-30T10:17:18.040485445Z[Etc/UTC]", comments = "Generator version: 7.24.0")
case class LeadFormsCreate200ResponseItemsInner(
  data: Option[LeadForm],
  exceptions: Option[List[BatchItemException]]
)

object LeadFormsCreate200ResponseItemsInner {
  implicit lazy val leadFormsCreate200ResponseItemsInnerJsonFormat: Format[LeadFormsCreate200ResponseItemsInner] = Json.format[LeadFormsCreate200ResponseItemsInner]
}

